import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListaDeTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();
    private JFrame frame;
    private DefaultListModel<String> listModel;
    private JList<String> tarefasList;
    private JScrollPane scrollPane;

    public ListaDeTarefas() {
        frame = new JFrame("Aplicativo de Lista de Tarefas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);

        listModel = new DefaultListModel<>();

        JPanel buttonPanel = new JPanel();
        frame.add(buttonPanel, BorderLayout.CENTER);

        JButton incluirButton = new JButton("Incluir");
        JButton listarButton = new JButton("Listar");
        JButton excluirButton = new JButton("Excluir Lista de Tarefas");

        buttonPanel.add(incluirButton);
        buttonPanel.add(listarButton);
        buttonPanel.add(excluirButton);

        incluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeTarefa = JOptionPane.showInputDialog("Digite o nome da tarefa:");
                if (nomeTarefa != null) {
                    Tarefa objTarefa = new Tarefa();
                    objTarefa.setCod_tarefa(tarefas.size());
                    objTarefa.setNome_tarefa(nomeTarefa);
                    adicionarTarefa(objTarefa);
                }
            }
        });

        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarTarefas();
            }
        });

        excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluirListaTarefas();
            }
        });

        frame.setVisible(true);
    }

    private void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        listModel.addElement(tarefa.getNome_tarefa());
        JOptionPane.showMessageDialog(frame, "Tarefa \"" + tarefa.getNome_tarefa() + "\" adicionada.", "Tarefa Adicionada", JOptionPane.INFORMATION_MESSAGE);
    }

    private void listarTarefas() {
        if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Não há tarefas a serem exibidas.", "Lista de Tarefas Vazia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String[] tarefaArray = new String[tarefas.size()];
            for (int i = 0; i < tarefas.size(); i++) {
                tarefaArray[i] = tarefas.get(i).getNome_tarefa();
            }
            tarefasList = new JList<>(tarefaArray);
            scrollPane = new JScrollPane(tarefasList);
            JOptionPane.showMessageDialog(frame, scrollPane, "Tarefas", JOptionPane.PLAIN_MESSAGE);
        }
    }

    private void excluirListaTarefas() {
        if (!tarefas.isEmpty()) {
            String[] nomesTarefas = new String[tarefas.size()];
            for (int i = 0; i < tarefas.size(); i++) {
                nomesTarefas[i] = tarefas.get(i).getNome_tarefa();
            }

            String tarefaSelecionada = (String) JOptionPane.showInputDialog(
                    frame,
                    "Escolha a tarefa a ser excluída:",
                    "Excluir Tarefa",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    nomesTarefas,
                    nomesTarefas[0]
            );

            if (tarefaSelecionada != null) {
                for (int i = 0; i < tarefas.size(); i++) {
                    if (tarefas.get(i).getNome_tarefa().equals(tarefaSelecionada)) {
                        tarefas.remove(i);
                        listModel.remove(i);
                        JOptionPane.showMessageDialog(frame, "Tarefa \"" + tarefaSelecionada + "\" excluída.", "Tarefa Excluída", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(frame, "A lista de tarefas já está vazia.", "Lista de Tarefas Vazia", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListaDeTarefas();
            }
        });
    }
}

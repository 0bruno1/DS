package view;


import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame {

    public Menu() {
        
        this.setSize(800, 600);
        this.setTitle("Exemplo Menu");
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); 
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);

        
        JMenu arq = new JMenu("Arquivo");
        JMenu cad = new JMenu("Cadastrar");
        JMenu aju = new JMenu("Ajuda");

        JMenuItem sair = new JMenuItem("Sair");
        JMenuItem dev = new JMenuItem("Desenvolvedor");
        JMenuItem produto = new JMenuItem("Produto");
        JMenuItem funcionario = new JMenuItem("Funcionário");
        JMenuItem sobre = new JMenuItem("Sobre");

        arq.add(sair);
        cad.add(dev);
        cad.add(produto);
        cad.add(funcionario);
        aju.add(sobre);

        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(arq);
        bar.add(cad);
        bar.add(aju);

        
        dev.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                FormularioDesenvolvedor formDev = new FormularioDesenvolvedor();
                formDev.setVisible(true);
            }
        });

        produto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                FormularioProduto formProduto = new FormularioProduto();
                formProduto.setVisible(true);
            }
        });
        
        funcionario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                FormularioFuncionario formFunc = new FormularioFuncionario();
                formFunc.setVisible(true);
            }
        });

        
        sair.addActionListener(evt -> confirmarSaida());
        
        this.addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) {
                confirmarSaida();
            }
        });
        setVisible(true);
    }


    private void confirmarSaida() {
        int opcao = JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente sair?",
                "Confirmar saída",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (opcao == JOptionPane.YES_OPTION) {
            dispose();
            System.exit(0);
        }
    }
}
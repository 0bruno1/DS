package view;

import javax.swing.*;

public class QuizConhecimentosGerais extends JFrame {

    private JRadioButton pergunta1opcao1, pergunta1opcao2, pergunta1opcao3, pergunta1opcao4;
    private JRadioButton pergunta2opcao1, pergunta2opcao2, pergunta2opcao3, pergunta2opcao4;
    private ButtonGroup grupoPergunta1, grupoPergunta2;

   
    private JCheckBox pergunta3opcao1, pergunta3opcao2, pergunta3opcao3, pergunta3opcao4;
    private JCheckBox pergunta4opcao1, pergunta4opcao2, pergunta4opcao3, pergunta4opcao4;
    private JCheckBox pergunta5opcao1, pergunta5opcao2, pergunta5opcao3, pergunta5opcao4;
    public QuizConhecimentosGerais() {
        setTitle("Quiz De Conhecimentos Gerais"); // título do JFrame
        setBounds(100, 100, 700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        int y = 10;

        // Pergunta 1
        JLabel lblPergunta1 = new JLabel("1) Qual a raiz quadrada de 144?");
        lblPergunta1.setBounds(10, y, 600, 20);
        add(lblPergunta1);
        y += 25;

        pergunta1opcao1 = new JRadioButton("8");
        pergunta1opcao2 = new JRadioButton("12");
        pergunta1opcao3 = new JRadioButton("18");
        pergunta1opcao4 = new JRadioButton("5");

        grupoPergunta1 = new ButtonGroup();
        grupoPergunta1.add(pergunta1opcao1);
        grupoPergunta1.add(pergunta1opcao2);
        grupoPergunta1.add(pergunta1opcao3);
        grupoPergunta1.add(pergunta1opcao4);

        pergunta1opcao1.setBounds(20, y, 200, 20);
        add(pergunta1opcao1);
        y += 20;
        pergunta1opcao2.setBounds(20, y, 200, 20);
        add(pergunta1opcao2);
        y += 20;
        pergunta1opcao3.setBounds(20, y, 200, 20);
        add(pergunta1opcao3);
        y += 20;
        pergunta1opcao4.setBounds(20, y, 200, 20);
        add(pergunta1opcao4);
        y += 30;

        // Pergunta 2
        JLabel lblPergunta2 = new JLabel("2) Qual a montanha mais alta do mundo?");
        lblPergunta2.setBounds(10, y, 600, 20);
        add(lblPergunta2);
        y += 25;

        pergunta2opcao1 = new JRadioButton("Mauna Kea");
        pergunta2opcao2 = new JRadioButton("Dhaulagiri");
        pergunta2opcao3 = new JRadioButton("Monte Fuji");
        pergunta2opcao4 = new JRadioButton("Monte Everest");

        grupoPergunta2 = new ButtonGroup();
        grupoPergunta2.add(pergunta2opcao1);
        grupoPergunta2.add(pergunta2opcao2);
        grupoPergunta2.add(pergunta2opcao3);
        grupoPergunta2.add(pergunta2opcao4);

        pergunta2opcao1.setBounds(20, y, 200, 20);
        add(pergunta2opcao1);
        y += 20;
        pergunta2opcao2.setBounds(20, y, 200, 20);
        add(pergunta2opcao2);
        y += 20;
        pergunta2opcao3.setBounds(20, y, 200, 20);
        add(pergunta2opcao3);
        y += 20;
        pergunta2opcao4.setBounds(20, y, 200, 20);
        add(pergunta2opcao4);
        y += 30;

        // Pergunta 3
        JLabel lblPergunta3 = new JLabel("3) Quais carros são da Volkswagen? (Selecione todas as corretas)");
        lblPergunta3.setBounds(10, y, 600, 20);
        add(lblPergunta3);
        y += 25;

        pergunta3opcao1 = new JCheckBox("Cruze");
        pergunta3opcao2 = new JCheckBox("Nivus");
        pergunta3opcao3 = new JCheckBox("Onix");
        pergunta3opcao4 = new JCheckBox("Arteon");

        pergunta3opcao1.setBounds(20, y, 200, 20);
        add(pergunta3opcao1);
        y += 20;
        pergunta3opcao2.setBounds(20, y, 200, 20);
        add(pergunta3opcao2);
        y += 20;
        pergunta3opcao3.setBounds(20, y, 200, 20);
        add(pergunta3opcao3);
        y += 20;
        pergunta3opcao4.setBounds(20, y, 200, 20);
        add(pergunta3opcao4);
        y += 30;
        
        //pergunta 4
        JLabel lblPergunta4 = new JLabel("4) Quais cores quando misturadas dão roxo? (Selecione todas as corretas)");
        lblPergunta4.setBounds(10, y, 600, 20);
        add(lblPergunta4);
        y += 25;
        
        pergunta4opcao1 = new JCheckBox("Azul");
        pergunta4opcao2 = new JCheckBox("Verde");
        pergunta4opcao3 = new JCheckBox("Vermelho");
        pergunta4opcao4 = new JCheckBox("Roxo");

        pergunta4opcao1.setBounds(20, y, 200, 20); 
        add(pergunta4opcao1); 
        y += 20;
        pergunta4opcao2.setBounds(20, y, 200, 20); 
        add(pergunta4opcao2); 
        y += 20;
        pergunta4opcao3.setBounds(20, y, 200, 20); 
        add(pergunta4opcao3); 
        y += 20;
        pergunta4opcao4.setBounds(20, y, 200, 20); 
        add(pergunta4opcao4); 
        y += 20;
        //pergunta 5
        JLabel lblPergunta5 = new JLabel("5) Determine os valores de x que tornam a equação 4x2 - 16 = 0 verdadeira. (Selecione todas as corretas)");
        lblPergunta5.setBounds(10, y, 600, 20);
        add(lblPergunta5);
        y += 25;

        pergunta5opcao1 = new JCheckBox("-2");
        pergunta5opcao2 = new JCheckBox("1");
        pergunta5opcao3 = new JCheckBox("-1");
        pergunta5opcao4 = new JCheckBox("2");

        pergunta5opcao1.setBounds(20, y, 200, 20); 
        add(pergunta5opcao1); 
        y += 20;
        pergunta5opcao2.setBounds(20, y, 200, 20); 
        add(pergunta5opcao2); 
        y += 20;
        pergunta5opcao3.setBounds(20, y, 200, 20); 
        add(pergunta5opcao3); 
        y += 20;
        pergunta5opcao4.setBounds(20, y, 200, 20);
        add(pergunta5opcao4); 
        y += 20;
        
        y += 10;

        y += 10;
        // Botão enviar
        JButton btnEnviar = new JButton("Enviar Respostas");
        btnEnviar.setBounds(250, y, 200, 30);
        add(btnEnviar);

        btnEnviar.addActionListener(e -> {
            int pontuacao = 0;
            

            if (pergunta1opcao2.isSelected()) {
            	pontuacao++;
            }
            else {
            	
            	JOptionPane.showMessageDialog(null, "Pergunta 1: Resposta errada, alternativa correta: 12 ");
            }
            if (pergunta2opcao4.isSelected()) { 
            	pontuacao++;
            }
            else {
            	JOptionPane.showMessageDialog(null, "Pergunta 2: Resposta errada, alternativa correta: Monte Everest");
            }
            if (pergunta3opcao2.isSelected() && pergunta3opcao4.isSelected() && !pergunta3opcao1.isSelected() && !pergunta3opcao3.isSelected()) {
            	pontuacao++;
            }else {
            	JOptionPane.showMessageDialog(null, "Pergunta 3: Respostas erradas, alternativas corretas: Nivus, Arteon ");
            }
            if(pergunta4opcao1.isSelected() && !pergunta4opcao2.isSelected() && pergunta4opcao3.isSelected() && !pergunta4opcao4.isSelected()) {
            	pontuacao++;
            }
            else {
            	JOptionPane.showMessageDialog(null, "Pergunta 4: Respostas erradas, alternativas corretas: Azul, Vermelho ");
            }
            if(pergunta5opcao1.isSelected() && !pergunta5opcao2.isSelected() && !pergunta5opcao3.isSelected() && pergunta5opcao4.isSelected()) {
            	pontuacao++;
            }
            else {
            	JOptionPane.showMessageDialog(null, "Pergunta 5: Respostas erradas, alternativas corretas: -2, 2");
            }
            JOptionPane.showMessageDialog(null, "Você acertou " + pontuacao + " de 5 perguntas!");
        });

        setVisible(true);
    }
}
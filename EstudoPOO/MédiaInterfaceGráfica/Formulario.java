package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Formulario extends JFrame {
	
	private JLabel lbNome;
	private JTextField txNome;
	
	private JLabel lbNota1;
	private JTextField txNota1;
	
	private JLabel lbNota2;
	private JTextField txNota2;
	
	private JLabel lbNota3;
	private JTextField txNota3;
	
	private JLabel lbNota4;
	private JTextField txNota4;
	
	private double media;
	
	private JButton btSalvar;	
	
	
	public Formulario() {
		setTitle("Título do formulário");
		setSize(800,600); //x y
		setLocationRelativeTo(null); //centralizado
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		//label do nome
		lbNome = new JLabel();
		lbNome.setText("Nome:");
		lbNome.setBounds(50,50,80,30); // x y w h
		add(lbNome);
		
		txNome = new JTextField();
		txNome.setBounds(150,50,150,30);
		add(txNome);
		
		//Label e text area das notas
		lbNota1 = new JLabel();
		lbNota1.setText("Primeira nota: ");
		lbNota1.setBounds(50,100,150,30);
		add(lbNota1);
		
		txNota1 = new JTextField();
		txNota1.setBounds(150,100,150,30);
		add(txNota1);
		
		lbNota2 = new JLabel();
		lbNota2.setText("Segunda nota: ");
		lbNota2.setBounds(50,150,150,30);
		add(lbNota2);
		
		txNota2 = new JTextField();
		txNota2.setBounds(150,150,150,30);
		add(txNota2);
		
		lbNota3 = new JLabel();
		lbNota3.setText("Terceira nota: ");
		lbNota3.setBounds(50,200,150,30);
		add(lbNota3);
		
		txNota3 = new JTextField();
		txNota3.setBounds(150,200,150,30);
		add(txNota3);
		
		lbNota4 = new JLabel();
		lbNota4.setText("Quarta nota: ");
		lbNota4.setBounds(50,250,150,30);
		add(lbNota4);
		
		txNota4 = new JTextField();
		txNota4.setBounds(150,250,150,30);
		add(txNota4);
		
		btSalvar = new JButton();
		btSalvar.setText("Salvar");
		btSalvar.setBounds(173,300,100,30);
		add(btSalvar);
		
		//action que gera o cálculo da média
		btSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double nota1 = Double.parseDouble(txNota1.getText());
				double nota2 = Double.parseDouble(txNota2.getText());
				double nota3 = Double.parseDouble(txNota3.getText());
				double nota4 = Double.parseDouble(txNota4.getText());
				
				media = (nota1 + nota2 + nota3 + nota4)/4;
				JOptionPane.showMessageDialog(null,"Media das notas: "+ media);
			}
		});
		
		setVisible(true);// última linha do construtor		
	}

}
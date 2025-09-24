package view;

import javax.swing.*;
import java.awt.*;

public class FormularioProduto extends JFrame {

    private JTextField txtNomeProduto, txtCodigo, txtPreco, txtQuantidade;
    private JComboBox comboCategoria;
    private JButton btnSalvar, btnLimpar;
    private JTextArea areaResultado; 

    public FormularioProduto() {
    	
        setTitle("Cadastro de Produtos");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal com GridLayout
        JPanel painelPrincipal = new JPanel(new GridLayout(6, 2, 5, 5));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        painelPrincipal.add(new JLabel("Nome do Produto:"));
        txtNomeProduto = new JTextField();
        painelPrincipal.add(txtNomeProduto);

        painelPrincipal.add(new JLabel("Código/SKU:"));
        txtCodigo = new JTextField();
        painelPrincipal.add(txtCodigo);

        painelPrincipal.add(new JLabel("Categoria:"));
        comboCategoria = new JComboBox<>(new String[]{
                "Selecione...", "Alimentos", "Bebidas", "Limpeza", "Higiene", "Eletrônicos"
        });
        painelPrincipal.add(comboCategoria);

        painelPrincipal.add(new JLabel("Preço (R$):"));
        txtPreco = new JTextField();
        painelPrincipal.add(txtPreco);

        painelPrincipal.add(new JLabel("Quantidade em Estoque:"));
        txtQuantidade = new JTextField();
        painelPrincipal.add(txtQuantidade);

        btnSalvar = new JButton("Salvar");
        btnLimpar = new JButton("Limpar");
        painelPrincipal.add(btnSalvar);
        painelPrincipal.add(btnLimpar);

        // Área de texto para exibir resultados
        areaResultado = new JTextArea(6, 40);
        areaResultado.setEditable(false); // só leitura
        JScrollPane scroll = new JScrollPane(areaResultado);

        // Layout principal
        setLayout(new BorderLayout());
        add(painelPrincipal, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);

        // Ações dos botões
        btnSalvar.addActionListener(e -> {
            String nome = txtNomeProduto.getText().trim();
            String codigo = txtCodigo.getText().trim();
            String preco = txtPreco.getText().trim();
            String quantidade = txtQuantidade.getText().trim();
            String categoria = (String) comboCategoria.getSelectedItem();

            if (nome.isEmpty() || codigo.isEmpty() || preco.isEmpty() || quantidade.isEmpty() || categoria.equals("Selecione...")) {
                JOptionPane.showMessageDialog(this,
                        "Preencha todos os campos.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                areaResultado.setText( // Exibe no JTextArea
                        "Produto salvo\n\n" +
                        "Nome: " + nome + "\n" +
                        "Código: " + codigo + "\n" +
                        "Categoria: " + categoria + "\n" +
                        "Preço: R$ " + preco + "\n" +
                        "Quantidade: " + quantidade
                );
            }
        });

        btnLimpar.addActionListener(e -> {
            txtNomeProduto.setText("");
            txtCodigo.setText("");
            txtPreco.setText("");
            txtQuantidade.setText("");
            comboCategoria.setSelectedIndex(0);
            areaResultado.setText(""); 
        });
    }
}
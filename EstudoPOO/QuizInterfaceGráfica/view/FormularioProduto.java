package view;

import javax.swing.*;

public class FormularioProduto extends JFrame {

    private JTextField txtNomeProduto, txtCodigo, txtPreco, txtQuantidade;
    private JComboBox comboCategoria;
    private JButton btnSalvar, btnLimpar;
    private JTextArea areaResultado;

    public FormularioProduto() {
        setTitle("Cadastro de Produtos");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); 

        
        JLabel lblNome = new JLabel("Nome do Produto:");
        lblNome.setBounds(20, 20, 150, 25);
        add(lblNome);

        txtNomeProduto = new JTextField();
        txtNomeProduto.setBounds(170, 20, 200, 25);
        add(txtNomeProduto);

        JLabel lblCodigo = new JLabel("Código/SKU:");
        lblCodigo.setBounds(20, 60, 150, 25);
        add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(170, 60, 200, 25);
        add(txtCodigo);

        JLabel lblCategoria = new JLabel("Categoria:");
        lblCategoria.setBounds(20, 100, 150, 25);
        add(lblCategoria);

        comboCategoria = new JComboBox<>(new String[]{
                "Selecione...", "Alimentos", "Bebidas", "Limpeza", "Higiene", "Eletrônicos"
        });
        comboCategoria.setBounds(170, 100, 200, 25);
        add(comboCategoria);

        JLabel lblPreco = new JLabel("Preço (R$):");
        lblPreco.setBounds(20, 140, 150, 25);
        add(lblPreco);

        txtPreco = new JTextField();
        txtPreco.setBounds(170, 140, 200, 25);
        add(txtPreco);

        JLabel lblQuantidade = new JLabel("Quantidade em Estoque:");
        lblQuantidade.setBounds(20, 180, 150, 25);
        add(lblQuantidade);

        txtQuantidade = new JTextField();
        txtQuantidade.setBounds(170, 180, 200, 25);
        add(txtQuantidade);

        
        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(170, 220, 90, 30);
        add(btnSalvar);

        btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(280, 220, 90, 30);
        add(btnLimpar);

        
        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaResultado);
        scroll.setBounds(20, 270, 440, 180);
        add(scroll);

        
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
                areaResultado.setText(
                        "Produto salvo\n" +
                        "---------------------------\n" +
                        "Nome: " + nome + "\n" +
                        "Código: " + codigo + "\n" +
                        "Categoria: " + categoria + "\n" +
                        "Preço: R$ " + preco + "\n" +
                        "Quantidade: " + quantidade
                );

                
                txtNomeProduto.setText("");
                txtCodigo.setText("");
                txtPreco.setText("");
                txtQuantidade.setText("");
                comboCategoria.setSelectedIndex(0);
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

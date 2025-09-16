package view;

import javax.swing.*;

public class FormularioFuncionario extends JFrame {

    private JTextField txtNome, txtCPF, txtSalario;
    private JComboBox<String> comboSetor;
    private JRadioButton rbAtendente, rbAjudante, rbRepositor, rbGerente;
    private ButtonGroup grupoCargos;
    private JButton btnSalvar, btnLimpar;
    private JTextArea areaResultado;

    public FormularioFuncionario() {
        setTitle("Cadastro de Funcionários");
        setSize(500, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // sem GridLayout

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 100, 25);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(130, 20, 200, 25);
        add(txtNome);

        JLabel lblCPF = new JLabel("CPF:");
        lblCPF.setBounds(20, 60, 100, 25);
        add(lblCPF);

        txtCPF = new JTextField();
        txtCPF.setBounds(130, 60, 200, 25);
        add(txtCPF);

        JLabel lblSetor = new JLabel("Setor:");
        lblSetor.setBounds(20, 100, 100, 25);
        add(lblSetor);

        comboSetor = new JComboBox<>(new String[]{
                "Selecione...", "Caixa", "Estoque", "Limpeza", "Atendimento"
        });
        comboSetor.setBounds(130, 100, 200, 25);
        add(comboSetor);

        JLabel lblCargo = new JLabel("Cargo:");
        lblCargo.setBounds(20, 140, 100, 25);
        add(lblCargo);

        rbAtendente = new JRadioButton("Atendente");
        rbAtendente.setBounds(130, 140, 100, 25);
        rbAjudante = new JRadioButton("Ajudante");
        rbAjudante.setBounds(230, 140, 100, 25);
        rbRepositor = new JRadioButton("Repositor");
        rbRepositor.setBounds(130, 170, 100, 25);
        rbGerente = new JRadioButton("Gerente");
        rbGerente.setBounds(230, 170, 100, 25);

        grupoCargos = new ButtonGroup();
        grupoCargos.add(rbAtendente);
        grupoCargos.add(rbAjudante);
        grupoCargos.add(rbRepositor);
        grupoCargos.add(rbGerente);

        add(rbAtendente);
        add(rbAjudante);
        add(rbRepositor);
        add(rbGerente);

        JLabel lblSalario = new JLabel("Salário:");
        lblSalario.setBounds(20, 210, 100, 25);
        add(lblSalario);

        txtSalario = new JTextField();
        txtSalario.setBounds(130, 210, 200, 25);
        add(txtSalario);

        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(130, 250, 90, 30);
        add(btnSalvar);

        btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(240, 250, 90, 30);
        add(btnLimpar);

        // Área de texto
        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaResultado);
        scroll.setBounds(20, 300, 440, 180);
        add(scroll);

        // Botão Salvar
        btnSalvar.addActionListener(e -> {
            String nome = txtNome.getText().trim();
            String cpf = txtCPF.getText().trim();
            String salario = txtSalario.getText().trim();
            String setor = (String) comboSetor.getSelectedItem();
            String cargo = "";

            if (rbAtendente.isSelected()) cargo = "Atendente";
            else if (rbAjudante.isSelected()) cargo = "Ajudante";
            else if (rbRepositor.isSelected()) cargo = "Repositor";
            else if (rbGerente.isSelected()) cargo = "Gerente";

            if (nome.isEmpty() || cpf.isEmpty() || salario.isEmpty() || cargo.isEmpty() || setor.equals("Selecione...")) {
                JOptionPane.showMessageDialog(this,
                        "Por favor, preencha todos os campos.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                // Mostra apenas o último cadastrado
                areaResultado.setText(
                        "Funcionário salvo\n" +
                        "---------------------------\n" +
                        "Nome: " + nome + "\n" +
                        "CPF: " + cpf + "\n" +
                        "Setor: " + setor + "\n" +
                        "Cargo: " + cargo + "\n" +
                        "Salário: R$ " + salario
                );

                // limpa campos
                txtNome.setText("");
                txtCPF.setText("");
                txtSalario.setText("");
                grupoCargos.clearSelection();
                comboSetor.setSelectedIndex(0);
            }
        });

        // Botão Limpar
        btnLimpar.addActionListener(e -> {
            txtNome.setText("");
            txtCPF.setText("");
            txtSalario.setText("");
            grupoCargos.clearSelection();
            comboSetor.setSelectedIndex(0);
            areaResultado.setText("");
        });
    }
}
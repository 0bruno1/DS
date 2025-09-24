package view;

import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class FormularioDesenvolvedor extends JFrame {

    public FormularioDesenvolvedor() {
        setTitle("Informações dos Desenvolvedores");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painelPrincipal = new JPanel(new GridLayout(0, 1, 10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        painelPrincipal.add(criarPainelDev(
                "Henzo Paiva",
                "./Images/Henzo.jpg",  
                "henzo@gmail.com",
                "linkedin.com/in/henzo",
                "github.com/henzo",
                "Estudante ADS / Dev Java",
                "(11) 99999-9999"
        ));

        painelPrincipal.add(criarPainelDev(
                "Danilo Braga",
                "./Images/Danilo.jpg", 
                "Danilo@email.com",
                "linkedin.com/in/Danilo",
                "github.com/Danilo",
                "Frontend Developer",
                "(11) 98888-8888"
        ));

        painelPrincipal.add(criarPainelDev(
                "Bruno Oliveira",
                "./Images/Bruno.jpg",  
                "Bruno@email.com",
                "linkedin.com/in/BrunoOliveira",
                "github.com/BrunoOliveira",
                "Backend Developer",
                "(11) 97777-7777"
        ));
        
        painelPrincipal.add(criarPainelDev(
                "Vinicius Jesus",
                "./Images/Jesus.jpg",  
                "Vinicius@email.com",
                "linkedin.com/in/Vinicius",
                "github.com/ViniciusJesus",
                "Full Stack Developer",
                "(11) 96666-6666"
        ));
        
        painelPrincipal.add(criarPainelDev(
                "Cesar Augusto",
                "./Images/pato.jpeg",  
                "Cesars@email.com",
                "linkedin.com/in/Cesar",
                "github.com/Cesar",
                "Full Stack Developer",
                "(11) 96666-6666"
        ));

        JScrollPane scroll = new JScrollPane(painelPrincipal);
        add(scroll, BorderLayout.CENTER);
    }

    private JPanel criarPainelDev(String nome, String caminhoFoto, String email, 
                                 String linkedin, String github, String cargo, String telefone) {
        JPanel painelDev = new JPanel(new BorderLayout(10, 10));
        painelDev.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        painelDev.setBackground(new Color(245, 245, 245));

        // Foto do dev - cada desenvolvedor tem sua própria foto
        ImageIcon icon = new ImageIcon(caminhoFoto);
        Image img = icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        JLabel lblFoto = new JLabel(new ImageIcon(img));
        painelDev.add(lblFoto, BorderLayout.WEST);

        
        JPanel painelInfo = new JPanel(new BorderLayout());
        painelInfo.setBackground(new Color(245, 245, 245));
        
        JPanel painelContatos = new JPanel(new GridLayout(6, 1, 5, 5));
        painelContatos.setBackground(new Color(245, 245, 245));
        
      
        JLabel lblNome = new JLabel("Nome: " + nome);
        JLabel lblCargo = new JLabel("Cargo: " + cargo);
       
        JPanel painelEmail = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelEmail.setBackground(new Color(245, 245, 245));
        ImageIcon emailIcon = new ImageIcon("./Images/IconeEmail.png");
        Image emailImg = emailIcon.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
        JLabel lblEmailIcon = new JLabel(new ImageIcon(emailImg));
        painelEmail.add(lblEmailIcon);
        JLabel lblEmail = new JLabel(email);
        painelEmail.add(lblEmail);
        
       
        JPanel painelLinkedIn = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelLinkedIn.setBackground(new Color(245, 245, 245));
        ImageIcon linkedinIcon = new ImageIcon("./Images/IconeLinkedIn.png");
        Image linkedinImg = linkedinIcon.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
        JLabel lblLinkedInIcon = new JLabel(new ImageIcon(linkedinImg));
        painelLinkedIn.add(lblLinkedInIcon);
        JLabel lblLinkedIn = new JLabel(linkedin);
        painelLinkedIn.add(lblLinkedIn);
        
        JPanel painelGitHub = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelGitHub.setBackground(new Color(245, 245, 245));
        ImageIcon githubIcon = new ImageIcon("./Images/IconeGitHub.png");
        Image githubImg = githubIcon.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
        JLabel lblGitHubIcon = new JLabel(new ImageIcon(githubImg));
        painelGitHub.add(lblGitHubIcon);
        JLabel lblGitHub = new JLabel(github);
        painelGitHub.add(lblGitHub);

        JPanel painelTelefone = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelTelefone.setBackground(new Color(245, 245, 245));
        ImageIcon whatsappIcon = new ImageIcon("./Images/IconeWpp.png");
        Image whatsappImg = whatsappIcon.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
        JLabel lblWhatsapp = new JLabel(new ImageIcon(whatsappImg));
        painelTelefone.add(lblWhatsapp);
        JLabel lblTelefone = new JLabel(telefone);
        painelTelefone.add(lblTelefone);
        
        painelContatos.add(lblNome);
        painelContatos.add(lblCargo);
        painelContatos.add(painelEmail);
        painelContatos.add(painelLinkedIn);
        painelContatos.add(painelGitHub);
        painelContatos.add(painelTelefone);
        
        painelInfo.add(painelContatos, BorderLayout.CENTER);
        painelDev.add(painelInfo, BorderLayout.CENTER);

        return painelDev;
    }

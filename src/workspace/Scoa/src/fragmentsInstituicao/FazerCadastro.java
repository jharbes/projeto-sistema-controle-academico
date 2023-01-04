package fragmentsInstituicao;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


@SuppressWarnings("serial")
public class FazerCadastro extends javax.swing.JInternalFrame {
	
	    private javax.swing.JLabel lblTitleCadastro;

		private javax.swing.JSeparator separador;

	    private javax.swing.JLabel lblTelefone;
	    private javax.swing.JFormattedTextField inputTelefone;

	    private javax.swing.JLabel lblEmail;
	    private javax.swing.JFormattedTextField inputEmail;
	
		private javax.swing.JButton btnCadastrar;

	    private Container contentPane = getContentPane();
	
	public FazerCadastro() {
        initComponents();
        events();
    }
	
	private void initComponents() {

        // Definindo o título
        lblTitleCadastro = new javax.swing.JLabel();
        lblTitleCadastro.setText("Cadastro de Pessoa na Bibioteca");
        lblTitleCadastro.setFont(new java.awt.Font("Segoe UI", 0, 30));
        lblTitleCadastro.setBounds(290, 33, 500, 41);

        // Definindo o separador
        separador = new javax.swing.JSeparator();
        separador.setBounds(25, 80, 930, 10);

        // Definindo os campos relacionados à pessoa
        lblTelefone = new javax.swing.JLabel();
        lblTelefone.setText("Telefone (Somente dígitos)");
        lblTelefone.setBounds(25, 120, 160, 16);

        inputTelefone = new javax.swing.JFormattedTextField();
        inputTelefone.setBounds(25, 142, 415, 22);

        lblEmail = new javax.swing.JLabel();
        lblEmail.setText("Email:");
        lblEmail.setBounds(490, 120, 36, 16);

        inputEmail = new javax.swing.JFormattedTextField();
        inputEmail.setBounds(490, 142, 400, 22);

        btnCadastrar = new javax.swing.JButton();
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBounds(807, 480, 152, 31);

        setPreferredSize(new java.awt.Dimension(1000, 538));
        setBackground(Color.WHITE);
        
        // tirando os padrões de efeito que já vêm no JInternalFrame
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setBorder(null);

        contentPane.setLayout(null);
        contentPane.add(lblTitleCadastro);
        contentPane.add(separador);
        contentPane.add(lblTelefone);
        contentPane.add(inputTelefone);
        contentPane.add(lblEmail);
        contentPane.add(inputEmail);

        contentPane.add(btnCadastrar);
        pack();
    }
    private void events() {

        this.btnCadastrar.addActionListener(this::cadastrar);

    }

    private void cadastrar(ActionEvent e) {

        JOptionPane.showMessageDialog(null, "cadastro realizado com sucesso!");

    }

}
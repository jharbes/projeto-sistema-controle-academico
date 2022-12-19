package fragmentsInstituicao;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class CadastrarProfessor extends javax.swing.JInternalFrame {
	
	private javax.swing.JLabel lblTitleCadastro;
	
	private javax.swing.JSeparator separador;
	
	private javax.swing.JLabel lblNome;
	private javax.swing.JFormattedTextField inputNome;
	
	private javax.swing.JLabel lblGenero;
	private javax.swing.ButtonGroup btnGroupGenero = new javax.swing.ButtonGroup();
	private javax.swing.JRadioButton rbM;
	private javax.swing.JRadioButton rbF;
	
	private javax.swing.JLabel lblTelefone;
	private javax.swing.JFormattedTextField inputTelefone;
	
	private javax.swing.JLabel lblEmail;
	private javax.swing.JFormattedTextField inputEmail;
	
	private javax.swing.JLabel lblIdade;
	private javax.swing.JFormattedTextField inputIdade;
	
	private javax.swing.JLabel lblRg;
	private javax.swing.JFormattedTextField inputRg;
	
	private javax.swing.JLabel lblCpf;
	private javax.swing.JFormattedTextField inputCpf;
	
	private javax.swing.JLabel lblLogin;
	private javax.swing.JFormattedTextField inputLogin;
	
	private javax.swing.JLabel lblSenha;
	private javax.swing.JFormattedTextField inputSenha;
	
	private javax.swing.JLabel lblSalario;
	private javax.swing.JFormattedTextField inputSalario;
	
	private javax.swing.JLabel lblRua;
	private javax.swing.JFormattedTextField inputRua;
	
	private javax.swing.JLabel lblCep;
	private javax.swing.JFormattedTextField inputCep;
	
	private javax.swing.JLabel lblNumero;
	private javax.swing.JFormattedTextField inputNumero;
	
	private javax.swing.JLabel lblBairro;
	private javax.swing.JFormattedTextField inputBairro;
	
	private javax.swing.JLabel lblCidade;
	private javax.swing.JFormattedTextField inputCidade;
	
	private javax.swing.JLabel lblEstado;
	private javax.swing.JFormattedTextField inputEstado;
	
	private javax.swing.JButton btnCadastrar;
	
	
	private Container contentPane = getContentPane();
	
	public CadastrarProfessor() {
        initComponents();
        events();
    }
	
	private void initComponents() {		
		
		// Definindo o título
		lblTitleCadastro = new javax.swing.JLabel();
		lblTitleCadastro.setText("Cadastro de professores");
		lblTitleCadastro.setFont(new java.awt.Font("Segoe UI", 0, 30));
		lblTitleCadastro.setBounds(330, 33, 322, 41);
		
		// Definindo o separador
		separador = new javax.swing.JSeparator();
        separador.setBounds(25, 80, 930, 10);
        
        // Definindo os campos relacionados à pessoa
        lblNome = new javax.swing.JLabel();
        lblNome.setText("Nome:");
        lblNome.setBounds(25, 120, 36, 16);
        
        inputNome = new javax.swing.JFormattedTextField();
        inputNome.setBounds(25, 142, 283, 22);
        
        
        lblGenero = new javax.swing.JLabel();
        lblGenero.setText("Gênero:");
        lblGenero.setBounds(331, 120, 60, 16);
        
        rbM = new javax.swing.JRadioButton();
        rbM.setBackground(new java.awt.Color(255, 255, 255));
        rbM.setSelected(true);
        rbM.setText("M");
        rbM.setBounds(331, 143, 50, 21);
        btnGroupGenero.add(rbM);
        
        rbF = new javax.swing.JRadioButton();
        rbF.setBackground(new java.awt.Color(255, 255, 255));
        rbF.setText("F");
        rbF.setBounds(377, 143, 50, 21);
        btnGroupGenero.add(rbF);

        
        lblTelefone = new javax.swing.JLabel();
        lblTelefone.setText("Telefone (Somente digitos):");
        lblTelefone.setBounds(437, 120, 160, 16);
        
        inputTelefone = new javax.swing.JFormattedTextField();
        inputTelefone.setBounds(437, 142, 145, 22);
        
        
        lblEmail = new javax.swing.JLabel();
        lblEmail.setText("E-mail");
        lblEmail.setBounds(632, 120, 37, 16);
        
        inputEmail = new javax.swing.JFormattedTextField();
        inputEmail.setBounds(632, 142, 327, 22);
        
        
        lblIdade = new javax.swing.JLabel();
        lblIdade.setText("Idade:");
        lblIdade.setBounds(25, 196, 45, 16);
        
        inputIdade = new javax.swing.JFormattedTextField();
        inputIdade.setBounds(25, 218, 50, 22);
        
        
        lblRg = new javax.swing.JLabel();
        lblRg.setText("RG (Somente dígitos):");
        lblRg.setBounds(115, 196, 135, 16);
        
        inputRg = new javax.swing.JFormattedTextField();
        inputRg.setBounds(115, 218, 125, 22);
        
        
        lblCpf = new javax.swing.JLabel();
        lblCpf.setText("CPF (Somente dígitos):");
        lblCpf.setBounds(281, 196, 135, 16);
        
        inputCpf = new javax.swing.JFormattedTextField();
        inputCpf.setBounds(281, 218, 125, 22);
        
        
        lblLogin = new javax.swing.JLabel();
        lblLogin.setText("Login:");
        lblLogin.setBounds(437, 196, 50, 16);
        
        inputLogin = new javax.swing.JFormattedTextField();
        inputLogin.setBounds(437, 218, 147, 22);
        
        
        lblSenha = new javax.swing.JLabel();
        lblSenha.setText("Senha:");
        lblSenha.setBounds(632, 196, 50, 16);
        
        inputSenha = new javax.swing.JFormattedTextField();
        inputSenha.setBounds(632, 218, 130, 22);
        
        
        lblSalario = new javax.swing.JLabel();
        lblSalario.setText("Salário:");
        lblSalario.setBounds(817, 196, 50, 16);
        
        inputSalario = new javax.swing.JFormattedTextField();
        inputSalario.setBounds(817, 218, 142, 22);
        
        
        lblRua = new javax.swing.JLabel();
        lblRua.setText("Rua:");
        lblRua.setBounds(25, 305, 40, 16);
        
        inputRua = new javax.swing.JFormattedTextField();
        inputRua.setBounds(25, 327, 557, 22);
        
        
        lblCep = new javax.swing.JLabel();
        lblCep.setText("CEP (Somente dígitos):");
        lblCep.setBounds(632, 305, 140, 16);
        
        inputCep = new javax.swing.JFormattedTextField();
        inputCep.setBounds(632, 327, 130, 22);
        
        
        lblNumero = new javax.swing.JLabel();
        lblNumero.setText("Número:");
        lblNumero.setBounds(817, 305, 55, 16);
        
        inputNumero = new javax.swing.JFormattedTextField();
        inputNumero.setBounds(817, 327, 142, 22);
        
        
        lblBairro = new javax.swing.JLabel();
        lblBairro.setText("Bairro:");
        lblBairro.setBounds(25, 367, 50, 16);
        
        inputBairro = new javax.swing.JFormattedTextField();
        inputBairro.setBounds(25, 389, 243, 22);
        
        
        lblCidade = new javax.swing.JLabel();
        lblCidade.setText("Cidade:");
        lblCidade.setBounds(335, 367, 55, 16);
        
        inputCidade = new javax.swing.JFormattedTextField();
        inputCidade.setBounds(335, 389, 247, 22);
        
        
        lblEstado = new javax.swing.JLabel();
        lblEstado.setText("Estado:");
        lblEstado.setBounds(632, 367, 50, 16);
        
        inputEstado = new javax.swing.JFormattedTextField();
        inputEstado.setBounds(632, 389, 325, 22);
        
        
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
        contentPane.add(lblNome);
        contentPane.add(inputNome);
        contentPane.add(lblTelefone);
        contentPane.add(inputTelefone);
        contentPane.add(lblEmail);
        contentPane.add(inputEmail);
        contentPane.add(lblGenero);
        contentPane.add(rbM);
        contentPane.add(rbF);
        contentPane.add(lblIdade);
        contentPane.add(inputIdade);
        contentPane.add(lblRg);
        contentPane.add(inputRg);
        contentPane.add(lblCpf);
        contentPane.add(inputCpf);
        contentPane.add(lblLogin);
        contentPane.add(inputLogin);
        contentPane.add(lblSenha);
        contentPane.add(inputSenha);
        contentPane.add(lblSalario);
        contentPane.add(inputSalario);
        contentPane.add(lblRua);
        contentPane.add(inputRua);
        contentPane.add(lblCep);
        contentPane.add(inputCep);
        contentPane.add(lblNumero);
        contentPane.add(inputNumero);
        contentPane.add(lblBairro);
        contentPane.add(inputBairro);
        contentPane.add(lblCidade);
        contentPane.add(inputCidade);
        contentPane.add(lblEstado);
        contentPane.add(inputEstado);
        contentPane.add(btnCadastrar);

        pack();
    }

	private void events() {
		this.btnCadastrar.addActionListener(this::cadastrar);
	}
	
	private void cadastrar(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "foi");
	}
}
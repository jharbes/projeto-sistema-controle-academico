package fragmentsInstituicao;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.util.Enumeration;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import model.Obra;

@SuppressWarnings("serial")
public class CadastrarObra extends javax.swing.JInternalFrame {
	
		private javax.swing.JLabel lblTitleCadastro;

		private javax.swing.JSeparator separador;

	    private javax.swing.JLabel lblAutor;
	    private javax.swing.JFormattedTextField inputAutor;

	    private javax.swing.JLabel lblNome;
	    private javax.swing.JFormattedTextField inputNome;

	    private javax.swing.JLabel lblTipo;
	    private javax.swing.JFormattedTextField inputTipo;

	    private javax.swing.JLabel lblDescricao;
	    private javax.swing.JFormattedTextField inputDescricao;
		
		private javax.swing.JButton btnCadastrar;

	    private Container contentPane = getContentPane();
	
	public CadastrarObra() {
        initComponents();
        events();
    }
	
	private void initComponents() {

       
				// Definindo o título
		        lblTitleCadastro = new javax.swing.JLabel();
		        lblTitleCadastro.setText("Cadastro de Obras");
		        lblTitleCadastro.setFont(new java.awt.Font("Segoe UI", 0, 30));
		        lblTitleCadastro.setBounds(330, 33, 322, 41);
		
		        // Definindo o separador
		        separador = new javax.swing.JSeparator();
		        separador.setBounds(25, 80, 930, 10);

		        // Definindo os campos relacionados à pessoa
		        lblAutor = new javax.swing.JLabel();
		        lblAutor.setText("Autor:");
		        lblAutor.setBounds(25, 120, 36, 16);

		        inputAutor = new javax.swing.JFormattedTextField();
		        inputAutor.setBounds(25, 142, 415, 22);

		        lblNome = new javax.swing.JLabel();
		        lblNome.setText("Nome:");
		        lblNome.setBounds(490, 120, 36, 16);

		        inputNome = new javax.swing.JFormattedTextField();
		        inputNome.setBounds(490, 142, 400, 22);

		        lblTipo = new javax.swing.JLabel();
		        lblTipo.setText("Tipo:");
		        lblTipo.setBounds(25, 185, 45, 16);

		        inputTipo = new javax.swing.JFormattedTextField();
		        inputTipo.setBounds(25, 207, 415, 22);

		        lblDescricao = new javax.swing.JLabel();
		        lblDescricao.setText("Descrição:");
		        lblDescricao.setBounds(490, 185, 100, 16);

		        inputDescricao = new javax.swing.JFormattedTextField();
		        inputDescricao.setBounds(490, 207, 400, 22);

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
		        contentPane.add(lblAutor);
		        contentPane.add(inputAutor);
		        contentPane.add(lblNome);
		        contentPane.add(inputNome);
		        contentPane.add(lblTipo);
		        contentPane.add(inputTipo);
		        contentPane.add(lblDescricao);
		        contentPane.add(inputDescricao);

		        contentPane.add(btnCadastrar);
		        pack();
		    }

			private void events() {
				this.btnCadastrar.addActionListener(this::cadastrar);
			}

			private void cadastrar(ActionEvent e) {
				String nome;

       		nome = Obra.CadastrarObra(
				this.inputAutor.getText(),
				this.inputNome.getText(),
				this.inputTipo.getText(),
				this.inputDescricao.getText());

            if (!nome.equals(""))
            JOptionPane.showMessageDialog(null, "" + nome + " foi cadastrado com sucesso.");
        else
            JOptionPane.showMessageDialog(null, "Algo deu errado ao fazer o cadastro de " + nome);
    }
    public static String getTextSelected(ButtonGroup group) {
        for (@SuppressWarnings("rawtypes")
        Enumeration e = group.getElements(); e.hasMoreElements();) {

            JRadioButton rbtn = (JRadioButton) e.nextElement();
            if (rbtn.getModel() == group.getSelection())
                return rbtn.getText();
        }
        return null;
    }
			
}
package fragmentsInstituicao;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


@SuppressWarnings("serial")
public class CadastrarDisciplina extends javax.swing.JInternalFrame {
	
	    private javax.swing.JLabel lblTitleCadastro;

		private javax.swing.JSeparator separador;

	    private javax.swing.JLabel lblNome;
	    private javax.swing.JFormattedTextField inputNome;

	    private javax.swing.JLabel lblCreditos;
	    private javax.swing.JFormattedTextField inputCreditos;

        private javax.swing.JLabel lblCh;
	    private javax.swing.JFormattedTextField inputCh;
	    
	    private javax.swing.JLabel lblCurso;
	    private javax.swing.JFormattedTextField inputCurso;
	
		private javax.swing.JButton btnCadastrar;

	    private Container contentPane = getContentPane();
	
	public CadastrarDisciplina() {
        initComponents();
        events();
    }
	
	private void initComponents() {

        // Definindo o título
        lblTitleCadastro = new javax.swing.JLabel();
        lblTitleCadastro.setText("Cadastro de Disciplina");
        lblTitleCadastro.setFont(new java.awt.Font("Segoe UI", 0, 30));
        lblTitleCadastro.setBounds(330, 33, 322, 41);

        // Definindo o separador
        separador = new javax.swing.JSeparator();
        separador.setBounds(25, 80, 930, 10);
        
        lblNome = new javax.swing.JLabel();
        lblNome.setText("Nome:");
        lblNome.setBounds(25, 120, 36, 16);

        inputNome = new javax.swing.JFormattedTextField();
        inputNome.setBounds(25, 142, 283, 22);

        lblCreditos = new javax.swing.JLabel();
        lblCreditos.setText("Créditos:");
        lblCreditos.setBounds(331, 120, 60, 16);

        inputCreditos = new javax.swing.JFormattedTextField();
        inputCreditos.setBounds(331, 143, 50, 21);

        lblCh = new javax.swing.JLabel();
        lblCh.setText("Carga horária:");
        lblCh.setBounds(405, 120, 160, 16);

        inputCh = new javax.swing.JFormattedTextField();
        inputCh.setBounds(405, 142, 120, 22);
        
        lblCurso = new javax.swing.JLabel();
        lblCurso.setText("Curso:");
        lblCurso.setBounds(560, 120, 160, 16);

        inputCurso = new javax.swing.JFormattedTextField();
        inputCurso.setBounds(560, 142, 120, 22);

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
        contentPane.add(lblCreditos);
        contentPane.add(inputCreditos);
        contentPane.add(lblCh);
        contentPane.add(inputCh);
        contentPane.add(lblCurso);
        contentPane.add(inputCurso);

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
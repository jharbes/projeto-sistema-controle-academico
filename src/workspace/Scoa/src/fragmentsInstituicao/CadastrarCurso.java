package fragmentsInstituicao;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


@SuppressWarnings("serial")
public class CadastrarCurso extends javax.swing.JInternalFrame {
	
	    private javax.swing.JLabel lblTitleCadastro;

		private javax.swing.JSeparator separador;

	    private javax.swing.JLabel lblNome;
	    private javax.swing.JFormattedTextField inputNome;

	    private javax.swing.JLabel lblCoordenador;
	    private javax.swing.JFormattedTextField inputCoordenador;

        private javax.swing.JLabel lblPeriodomin;
        private javax.swing.JFormattedTextField inputPeriodomin;

        private javax.swing.JLabel lblPeriodomax;
        private javax.swing.JFormattedTextField inputPeriodomax;

        private javax.swing.JLabel lblCreditos;
        private javax.swing.JFormattedTextField inputCreditos;

        private javax.swing.JLabel lblCh;
        private javax.swing.JFormattedTextField inputCh;
	
		private javax.swing.JButton btnCadastrar;

	    private Container contentPane = getContentPane();
	
	public CadastrarCurso() {
        initComponents();
        events();
    }
	
	private void initComponents() {

        // Definindo o título
        lblTitleCadastro = new javax.swing.JLabel();
        lblTitleCadastro.setText("Cadastro de Curso");
        lblTitleCadastro.setFont(new java.awt.Font("Segoe UI", 0, 30));
        lblTitleCadastro.setBounds(330, 33, 322, 41);

        // Definindo o separador
        separador = new javax.swing.JSeparator();
        separador.setBounds(25, 80, 930, 10);

        // Definindo os campos relacionados à pessoa
        lblNome = new javax.swing.JLabel();
        lblNome.setText("Nome:");
        lblNome.setBounds(25, 120, 160, 16);

        inputNome = new javax.swing.JFormattedTextField();
        inputNome.setBounds(25, 142, 415, 22);

        lblCoordenador = new javax.swing.JLabel();
        lblCoordenador.setText("Coordenador:");
        lblCoordenador.setBounds(490, 120, 100, 16);

        inputCoordenador = new javax.swing.JFormattedTextField();
        inputCoordenador.setBounds(490, 142, 400, 22);

        lblPeriodomin = new javax.swing.JLabel();
        lblPeriodomin.setText("Período Mínimo:");
        lblPeriodomin.setBounds(25, 196, 120, 16);

        inputPeriodomin = new javax.swing.JFormattedTextField();
        inputPeriodomin.setBounds(25, 218, 95, 22);

        lblPeriodomax = new javax.swing.JLabel();
        lblPeriodomax.setText("Período Máximo:");
        lblPeriodomax.setBounds(170, 196, 135, 16);

        inputPeriodomax = new javax.swing.JFormattedTextField();
        inputPeriodomax.setBounds(170, 218, 95, 22);

        lblCreditos = new javax.swing.JLabel();
        lblCreditos.setText("Créditos:");
        lblCreditos.setBounds(315, 196, 135, 16);

        inputCreditos = new javax.swing.JFormattedTextField();
        inputCreditos.setBounds(315, 218, 125, 22);

        lblCh = new javax.swing.JLabel();
        lblCh.setText("Carga Horária:");
        lblCh.setBounds(490, 196, 100, 16);

        inputCh = new javax.swing.JFormattedTextField();
        inputCh.setBounds(490, 218, 147, 22);

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
        contentPane.add(lblCoordenador);
        contentPane.add(inputCoordenador);
        contentPane.add(lblPeriodomin);
        contentPane.add(inputPeriodomin);
        contentPane.add(lblPeriodomax);
        contentPane.add(inputPeriodomax);
        contentPane.add(lblCreditos);
        contentPane.add(inputCreditos);
        contentPane.add(lblCh);
        contentPane.add(inputCh);

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
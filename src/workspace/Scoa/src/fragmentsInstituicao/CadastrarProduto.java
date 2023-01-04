package fragmentsInstituicao;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


@SuppressWarnings("serial")
public class CadastrarProduto extends javax.swing.JInternalFrame {
	
	    private javax.swing.JLabel lblTitleCadastro;

		private javax.swing.JSeparator separador;

	    private javax.swing.JLabel lblNome;
	    private javax.swing.JFormattedTextField inputNome;

        //No SQl os campos descricao e referencia estão invertidos, descrição vem depois

	    private javax.swing.JLabel lblDescricao;
	    private javax.swing.JFormattedTextField inputDescricao;

        private javax.swing.JLabel lblReferencia;
        private javax.swing.JFormattedTextField inputReferencia;

        private javax.swing.JLabel lblEstoquemin;
        private javax.swing.JFormattedTextField inputEstoquemin;

        private javax.swing.JLabel lblQuantidade;
        private javax.swing.JFormattedTextField inputQuantidade;

        private javax.swing.JLabel lblEstoquemax;
        private javax.swing.JFormattedTextField inputEstoquemax;

        private javax.swing.JLabel lblTipo;
        private javax.swing.JFormattedTextField inputTipo;
	
		private javax.swing.JButton btnCadastrar;

	    private Container contentPane = getContentPane();
	
	public CadastrarProduto() {
        initComponents();
        events();
    }
	
	private void initComponents() {

        // Definindo o título
        lblTitleCadastro = new javax.swing.JLabel();
        lblTitleCadastro.setText("Cadastro de Produto");
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

        lblDescricao = new javax.swing.JLabel();
        lblDescricao.setText("Descrição:");
        lblDescricao.setBounds(490, 120, 100, 16);

        inputDescricao = new javax.swing.JFormattedTextField();
        inputDescricao.setBounds(490, 142, 400, 22);

        lblReferencia = new javax.swing.JLabel();
        lblReferencia.setText("Referência:");
        lblReferencia.setBounds(25, 196, 120, 16);

        inputReferencia = new javax.swing.JFormattedTextField();
        inputReferencia.setBounds(25, 218, 95, 22);

        lblEstoquemin = new javax.swing.JLabel();
        lblEstoquemin.setText("Estoque Mínimo:");
        lblEstoquemin.setBounds(170, 196, 135, 16);

        inputEstoquemin = new javax.swing.JFormattedTextField();
        inputEstoquemin.setBounds(170, 218, 95, 22);

        lblQuantidade = new javax.swing.JLabel();
        lblQuantidade.setText("Quantidade:");
        lblQuantidade.setBounds(315, 196, 135, 16);

        inputQuantidade = new javax.swing.JFormattedTextField();
        inputQuantidade.setBounds(315, 218, 125, 22);

        lblEstoquemax = new javax.swing.JLabel();
        lblEstoquemax.setText("Estoque Máximo:");
        lblEstoquemax.setBounds(490, 196, 100, 16);

        inputEstoquemax = new javax.swing.JFormattedTextField();
        inputEstoquemax.setBounds(490, 218, 147, 22);

        lblTipo = new javax.swing.JLabel();
        lblTipo.setText("Tipo:");
        lblTipo.setBounds(670, 196, 100, 16);

        inputTipo = new javax.swing.JFormattedTextField();
        inputTipo.setBounds(670, 218, 147, 22);

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
        contentPane.add(lblDescricao);
        contentPane.add(inputDescricao);
        contentPane.add(lblReferencia);
        contentPane.add(inputReferencia);
        contentPane.add(lblEstoquemin);
        contentPane.add(inputEstoquemin);
        contentPane.add(lblQuantidade);
        contentPane.add(inputQuantidade);
        contentPane.add(lblEstoquemax);
        contentPane.add(inputEstoquemax);
        contentPane.add(lblTipo);
        contentPane.add(inputTipo);

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
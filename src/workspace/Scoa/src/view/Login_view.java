package view;

import model.Administrador;
import model.Aluno;
import model.Instituicao;
import model.Professor;

import java.awt.event.ActionEvent;
import java.util.Enumeration;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.WindowConstants;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;

@SuppressWarnings("serial")
public class Login_view extends JFrame{
	
    private JButton btnLogar;
    
    private JLabel lblLogin;
    private JFormattedTextField campoLogin;
    
    private JLabel lblSenha;
    private JPasswordField campoSenha;
    
    private ButtonGroup buttonGroup;
    
    private JRadioButton radioButtonInstituicao;
    private JRadioButton radioButtonProfessor;
    private JRadioButton radioButtonAdm;
    private JRadioButton radioButtonAluno;
	
	public Login_view() {
		this.build();
		this.events();
	}

	private void build() {
		
        lblLogin = new JLabel();
        campoLogin = new JFormattedTextField();
        
        lblSenha = new JLabel();
        campoSenha = new JPasswordField();
        
        btnLogar = new JButton();
        
        buttonGroup = new ButtonGroup();
        radioButtonAluno = new JRadioButton();
        radioButtonInstituicao = new JRadioButton();
        radioButtonProfessor = new JRadioButton();
        radioButtonAdm = new JRadioButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de login");

        lblLogin.setText("Login:");
        lblSenha.setText("Senha:");
        btnLogar.setText("Entrar");

        buttonGroup.add(radioButtonAluno);
        radioButtonAluno.setText("Aluno");
        radioButtonAluno.setSelected(true);
        radioButtonAluno.setToolTipText("Aluno");

        buttonGroup.add(radioButtonInstituicao);
        radioButtonInstituicao.setText("Instituição");
        radioButtonInstituicao.setToolTipText("Instituição");

        buttonGroup.add(radioButtonProfessor);
        radioButtonProfessor.setText("Professor");
        radioButtonProfessor.setToolTipText("Professor");

        buttonGroup.add(radioButtonAdm);
        radioButtonAdm.setText("Administração");
        radioButtonAdm.setToolTipText("Administração");
        

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(lblSenha)
                .addComponent(lblLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addComponent(campoLogin)
                .addComponent(campoSenha, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)))
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(radioButtonProfessor)
                .addComponent(radioButtonAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(radioButtonInstituicao)
                .addComponent(radioButtonAdm)))))
                .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btnLogar, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
            	layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(campoLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(lblLogin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(campoSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(lblSenha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(radioButtonAluno)
                .addComponent(radioButtonInstituicao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(radioButtonProfessor)
                .addComponent(radioButtonAdm))
                .addGap(18, 18, 18)
                .addComponent(btnLogar)
                .addContainerGap(58, Short.MAX_VALUE)
             )
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
	}
	
	private void events() {
		this.btnLogar.addActionListener(this::logar);
	}
	
	public String getCampoLogin() {
		return campoLogin.getText();
	}

	public String getCampoSenha() {
		return new String(campoSenha.getPassword());
	}

	private void logar(ActionEvent e) {
		JRadioButton radioButtonSelected = Login_view.getSelected(buttonGroup);
		String login = this.getCampoLogin();
		String senha = this.getCampoSenha();
		
		switch (radioButtonSelected.getText()) {
		
			case "Aluno":
				Aluno aluno = Aluno.Login(login, senha);
				if(aluno != null) {
					this.setVisible(false);
					new Aluno_view(aluno);
				}
				break;
			case "Professor":
				Professor professor = Professor.Login(login, senha);
				if(professor != null) {
					this.setVisible(false);
					new Professor_view(professor);
				}
				break;
			case "Administração":
				Administrador adm = Administrador.Login(login, senha);
				if(adm != null) {
					this.setVisible(false);
					new Adm_view(adm);
				}
				break;
			case "Instituição":
				Instituicao inst = Instituicao.Login(login, senha);
				if(inst != null) {
					this.setVisible(false);
					new Instituicao_view(inst);
				}
				break;
		}
	}
	
	public static JRadioButton getSelected(ButtonGroup group){
	    for (@SuppressWarnings("rawtypes")
			Enumeration e = group.getElements(); e.hasMoreElements(); ){
	    	
	        JRadioButton rbtn = (JRadioButton) e.nextElement();
	        if (rbtn.getModel() == group.getSelection()) return rbtn;
	    }
	    return null;
	}
}
package view;

import java.awt.Color;
import java.awt.event.ActionEvent;

import model.Administrador;

import fragmentsAdm.*;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Adm_view extends JFrame{
	
	private javax.swing.JMenu menuHome;
	
	private javax.swing.JMenuItem minhasInfos;
	private javax.swing.JMenuItem cadInstituicao;
	private javax.swing.JMenuItem exibirInstituicao;
	
	private javax.swing.JMenuBar menuPrincipal;
	
	private javax.swing.JDesktopPane mainContent;
	
	// Gerando um Administrador
	private Administrador adm;

	// Atributos relacionados as telas
	private MinhasInfos telaMinhasInfos = new MinhasInfos();
	private CadInstituicao telaCadInstituicao = new CadInstituicao();
	private ExibirInstituicoes telaExibirInstituicoes = new ExibirInstituicoes();
	//private EditarInstituicao telaEditarInstituicao = new EditarInstituicao();
	
	public Adm_view(Administrador adm) {
		this.adm = adm;
		this.build();
		this.events();
	}

	private void build() {
		
		menuPrincipal = new javax.swing.JMenuBar();
		
        menuHome = new javax.swing.JMenu();
        
        exibirInstituicao = new javax.swing.JMenuItem();
        cadInstituicao = new javax.swing.JMenuItem();
        minhasInfos = new javax.swing.JMenuItem();
        
        mainContent = new javax.swing.JDesktopPane();
        
        menuPrincipal.setBackground(Color.WHITE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portal do administrador - " + adm.getNome());
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        // Construindo o menu Home
        menuHome.setText("Home");
        minhasInfos.setText("Minhas informações");
        menuHome.add(minhasInfos);
        cadInstituicao.setText("Cadastrar instituição");
        menuHome.add(cadInstituicao);
        exibirInstituicao.setText("Exibir instituições");
        menuHome.add(exibirInstituicao);
        
        menuPrincipal.add(menuHome);
        
        // Colocando o menu principal no MenuBar
        setJMenuBar(menuPrincipal);
        
        // Instanciando a tela default que já abre na abertura inicial da tela
        telaMinhasInfos = new MinhasInfos();
        mainContent.add(telaMinhasInfos);
        telaMinhasInfos.show();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addComponent(mainContent)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
            .addComponent(mainContent)
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
	}
	
	private void events() {
		this.minhasInfos.addActionListener(this::editarMinhasInformacoes);
		this.cadInstituicao.addActionListener(this::cadastrarInstituicao);
		this.exibirInstituicao.addActionListener(this::exibirInstituicoes);
	}
	
	private void editarMinhasInformacoes(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaMinhasInfos);
		this.telaMinhasInfos.show();
	}
	
	private void cadastrarInstituicao(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaCadInstituicao);
		this.telaCadInstituicao.show();
	}
	
	private void exibirInstituicoes(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaExibirInstituicoes);
		this.telaExibirInstituicoes.show();
	}
}
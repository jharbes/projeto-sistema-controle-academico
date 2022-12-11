package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.Aluno;

import fragmentsAluno.*;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Aluno_view extends JFrame{
	
	private javax.swing.JMenuItem analiseCurricular;
	private javax.swing.JMenu menuDisciplinas;
	private javax.swing.JMenuItem docsRequeridos;
	private javax.swing.JMenuItem fazerInscricao;
	private javax.swing.JMenuItem verInscricao;
	private javax.swing.JMenuItem fazerReclamacao;
	private javax.swing.JMenuItem fazerSugestao;
	private javax.swing.JMenuItem historico;
	private javax.swing.JMenu menuHome;
	private javax.swing.JMenuItem infoPessoais;
	private javax.swing.JMenuBar menuPrincipal;
	private javax.swing.JMenu menuReclamacao;
	private javax.swing.JMenu menuSugestao;
	private javax.swing.JMenuItem verReclamacao;
	private javax.swing.JMenuItem verSugestao;
	private javax.swing.JDesktopPane mainContent;
	
	// Gerando um aluno
	private Aluno aluno;

	// Atributos relacionados as telas
	private InformacoesPessoais telaInfoPessoais = new InformacoesPessoais();
	private Historico telaHistorico = new Historico();
	private AnaliseCurricular telaAnaliseCurricular = new AnaliseCurricular();
	private DocumentosRequeridos telaDocsRequeridos = new DocumentosRequeridos();
	private FazerInscricao telaFazerInscricao = new FazerInscricao();
	private VerInscricoes telaVerInscricoes = new VerInscricoes();
	private FazerSugestao telaFazerSugestao = new FazerSugestao();
	private VerSugestao telaVerSugestao = new VerSugestao();
	private fazerReclamacao telaFazerReclamacao= new fazerReclamacao();
	private VerReclamacao telaVerReclamacao = new VerReclamacao();
	private Disciplina telaDisciplina;
	
	public Aluno_view(Aluno aluno) {
		this.aluno = aluno;
		this.build();
		this.events();
	}

	private void build() {
		
		menuPrincipal = new javax.swing.JMenuBar();
		
        menuHome = new javax.swing.JMenu();
        menuDisciplinas = new javax.swing.JMenu();
        menuSugestao = new javax.swing.JMenu();
        menuReclamacao = new javax.swing.JMenu();
        
        infoPessoais = new javax.swing.JMenuItem();
        historico = new javax.swing.JMenuItem();
        analiseCurricular = new javax.swing.JMenuItem();
        docsRequeridos = new javax.swing.JMenuItem();
        
        fazerInscricao = new javax.swing.JMenuItem();
        verInscricao = new javax.swing.JMenuItem();
        
        fazerSugestao = new javax.swing.JMenuItem();
        verSugestao = new javax.swing.JMenuItem();
        
        fazerReclamacao = new javax.swing.JMenuItem();
        verReclamacao = new javax.swing.JMenuItem();
        
        mainContent = new javax.swing.JDesktopPane();
        
        menuPrincipal.setBackground(Color.WHITE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portal do aluno - " + aluno.getPessoa().getNome());
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        // Construindo o menu Home
        menuHome.setText("Home");
        infoPessoais.setText("Informações pessoais");
        menuHome.add(infoPessoais);
        historico.setText("Histórico");
        menuHome.add(historico);
        analiseCurricular.setText("Análise Curricular");
        menuHome.add(analiseCurricular);
        docsRequeridos.setText("Docs. requeridos");
        menuHome.add(docsRequeridos);
        menuPrincipal.add(menuHome);
        
        // Construindo o menu disciplinas
        menuDisciplinas.setText("Disciplinas");
        
        fazerInscricao.setText("Fazer inscrição");
        menuDisciplinas.add(fazerInscricao);
        verInscricao.setText("Ver inscrição");
        menuDisciplinas.add(verInscricao);
        
        
        // Busca as disciplinas que este usuário está matriculado no período
        ArrayList<String> disciplinas = aluno.buscarDisciplinas(aluno.getId_aluno());
        for(String disciplina: disciplinas) {
        	
        	javax.swing.JMenuItem menuItem = new javax.swing.JMenuItem();
        	menuItem.setText(disciplina);
        	
        	menuItem.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			telaDisciplina = new Disciplina(menuItem.getText());
        			mainContent.remove(mainContent.getComponent(0));
        			mainContent.add(telaDisciplina);
        			telaDisciplina.show();
        		}  
        	});  
        	
            menuDisciplinas.add(menuItem);
        }
        
        menuPrincipal.add(menuDisciplinas);
        
        
        // Construindo o menu Sugestão 
        menuSugestao.setText("Sugestão");
        fazerSugestao.setText("Fazer sugestão");
        menuSugestao.add(fazerSugestao);
        verSugestao.setText("Ver sugestões");
        menuSugestao.add(verSugestao);
        menuPrincipal.add(menuSugestao);
        
        // Construindo o menu reclamação
        menuReclamacao.setText("Reclamação");
        fazerReclamacao.setText("Fazer reclamação");
        menuReclamacao.add(fazerReclamacao);
        verReclamacao.setText("Ver reclamações");
        menuReclamacao.add(verReclamacao);
        menuPrincipal.add(menuReclamacao);
        
        // Colocando o menu principal no MenuBar
        setJMenuBar(menuPrincipal);
        
        // Instanciando a tela default que já abre na abertura inicial da tela
        telaInfoPessoais = new InformacoesPessoais();
        mainContent.add(telaInfoPessoais);
        telaInfoPessoais.show();

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
		this.infoPessoais.addActionListener(this::buscaInformacoesPessoais);
		this.historico.addActionListener(this::buscaHistorico);
		this.analiseCurricular.addActionListener(this::buscaAnaliseCurricular);
		this.docsRequeridos.addActionListener(this::buscaDocumentosRequeridos);
		this.fazerInscricao.addActionListener(this::fazerInscricao);
		this.verInscricao.addActionListener(this::verInscricoesDisciplinas);
		this.fazerSugestao.addActionListener(this::fazerSugestao);
		this.verSugestao.addActionListener(this::verSugestao);
		this.fazerReclamacao.addActionListener(this::fazerReclamacao);
		this.verReclamacao.addActionListener(this::verReclamacao);
	}
	
	private void buscaInformacoesPessoais(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaInfoPessoais);
		this.telaInfoPessoais.show();
	}
	
	private void buscaHistorico(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
	    this.mainContent.add(this.telaHistorico);
	    this.telaHistorico.show();
	}
	
	private void buscaAnaliseCurricular(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
	    this.mainContent.add(this.telaAnaliseCurricular);
	    this.telaAnaliseCurricular.show();
	}
	
	private void buscaDocumentosRequeridos(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
	    this.mainContent.add(this.telaDocsRequeridos);
	    this.telaDocsRequeridos.show();
	}
	
	private void fazerInscricao(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
	    this.mainContent.add(this.telaFazerInscricao);
	    this.telaFazerInscricao.show();
	}
	
	private void verInscricoesDisciplinas(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
	    this.mainContent.add(this.telaVerInscricoes);
	    this.telaVerInscricoes.show();
	}
	
	private void fazerSugestao(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
	    this.mainContent.add(this.telaFazerSugestao);
	    this.telaFazerSugestao.show();
	}
	
	private void verSugestao(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
	    this.mainContent.add(this.telaVerSugestao);
	    this.telaVerSugestao.show();
	}
	
	private void fazerReclamacao(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
	    this.mainContent.add(this.telaFazerReclamacao);
	    this.telaFazerReclamacao.show();
	}
	
	private void verReclamacao(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
	    this.mainContent.add(this.telaVerReclamacao);
	    this.telaVerReclamacao.show();
	}
}
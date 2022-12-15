package view;

import java.awt.Color;
import java.awt.event.ActionEvent;

import model.Professor;
import fragmentsProfessor.*;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Professor_view extends JFrame{
	
	private javax.swing.JMenu menuHome;
	private javax.swing.JMenuItem minhasInfos;
	private javax.swing.JMenuItem addConteudoProg;
	
	
	private javax.swing.JMenu menuAula;
	private javax.swing.JMenuItem abrirAula;
	private javax.swing.JMenuItem fazerChamada;
	private javax.swing.JMenuItem exibirAulas;
	
	
	private javax.swing.JMenu menuAluno;
	private javax.swing.JMenuItem lancarResultadoFinal;
	private javax.swing.JMenuItem fazerAnaliseCurricular;
	
	
	private javax.swing.JMenu menuAvaliacao;
	private javax.swing.JMenuItem abrirAvaliacao;
	private javax.swing.JMenuItem lancarNotas;
	
	
	private javax.swing.JMenuBar menuPrincipal;
	
	private javax.swing.JDesktopPane mainContent;
	
	// Gerando um Professor
	private Professor professor;

	// Atributos relacionados as telas
	private MinhasInfos telaMinhasInfos = new MinhasInfos();
	private AddConteudoProg telaAddConteudoProg = new AddConteudoProg();
	private AbrirAula telaAbrirAula = new AbrirAula();
	private FazerChamada telaFazerChamada = new FazerChamada();
	private ExibirAulas telaExibirAulas = new ExibirAulas();
	private LancarResultadoFinal telaLancarResultadoFinal = new LancarResultadoFinal();
	private FazerAnaliseCurricular telaFazerAnaliseCurricular = new FazerAnaliseCurricular();
	private AbrirAvaliacao telaAbrirAvaliacao = new AbrirAvaliacao();
	private LancarNotas telaLancarNotas = new LancarNotas();
	
	public Professor_view(Professor professor) {
		this.professor = professor;
		this.build();
		this.events();
	}

	private void build() {
		
		menuPrincipal = new javax.swing.JMenuBar();
		
        menuHome = new javax.swing.JMenu();
        minhasInfos = new javax.swing.JMenuItem();
        addConteudoProg = new javax.swing.JMenuItem();

        menuAula = new javax.swing.JMenu();
        abrirAula = new javax.swing.JMenuItem();
        fazerChamada = new javax.swing.JMenuItem();
        exibirAulas = new javax.swing.JMenuItem();
        
        menuAluno = new javax.swing.JMenu();
        lancarResultadoFinal = new javax.swing.JMenuItem();
        fazerAnaliseCurricular = new javax.swing.JMenuItem();
        
        menuAvaliacao = new javax.swing.JMenu();
        abrirAvaliacao = new javax.swing.JMenuItem();
        lancarNotas = new javax.swing.JMenuItem();
        
        mainContent = new javax.swing.JDesktopPane();
        
        menuPrincipal.setBackground(Color.WHITE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portal do professor - " + professor.getFuncionario().getPessoa().getNome());
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        // Construindo o menu Home
        menuHome.setText("Home");
        minhasInfos.setText("Minhas informações");
        menuHome.add(minhasInfos);
        addConteudoProg.setText("Adicionar conteúdo programático");
        menuHome.add(addConteudoProg);
        
        menuPrincipal.add(menuHome);
        
        // Construindo menu Aula
        menuAula.setText("Aula");
        abrirAula.setText("Abrir aula");
        menuAula.add(abrirAula);
        fazerChamada.setText("Fazer chamada");
        menuAula.add(fazerChamada);
        exibirAulas.setText("Exibir aulas");
        menuAula.add(exibirAulas);
        
        menuPrincipal.add(menuAula);
        
        // Construindo menu Aluno
        menuAluno.setText("Aluno");
        lancarResultadoFinal.setText("Lançar resultado final");
        menuAluno.add(lancarResultadoFinal);
        fazerAnaliseCurricular.setText("Fazer análise curricular");
        menuAluno.add(fazerAnaliseCurricular);
        
        menuPrincipal.add(menuAluno);
        
        // Construindo menu Avaliação
        menuAvaliacao.setText("Avaliação");
        abrirAvaliacao.setText("Abrir avaliação");
        menuAvaliacao.add(abrirAvaliacao);
        lancarNotas.setText("Lançar notas");
        menuAvaliacao.add(lancarNotas);
        
        menuPrincipal.add(menuAvaliacao);
        
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
		this.addConteudoProg.addActionListener(this::addConteudoProg);
		this.abrirAula.addActionListener(this::abrirAula);
		this.fazerChamada.addActionListener(this::fazerChamada);
		this.exibirAulas.addActionListener(this::exibirAulas);
		this.lancarResultadoFinal.addActionListener(this::lancarResultadoFinal);
		this.fazerAnaliseCurricular.addActionListener(this::fazerAnaliseCurricular);
		this.abrirAvaliacao.addActionListener(this::abrirAvaliacao);
		this.lancarNotas.addActionListener(this::lancarNotas);
	}
	
	private void editarMinhasInformacoes(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaMinhasInfos);
		this.telaMinhasInfos.show();
	}
	
	private void addConteudoProg(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaAddConteudoProg);
		this.telaAddConteudoProg.show();
	}
	
	private void fazerChamada(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaFazerChamada);
		this.telaFazerChamada.show();
	}
	
	private void abrirAula(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaAbrirAula);
		this.telaAbrirAula.show();
	}
	
	private void exibirAulas(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaExibirAulas);
		this.telaExibirAulas.show();
	}
	
	private void lancarResultadoFinal(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaLancarResultadoFinal);
		this.telaLancarResultadoFinal.show();
	}
	
	private void fazerAnaliseCurricular(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaFazerAnaliseCurricular);
		this.telaFazerAnaliseCurricular.show();
	}
	
	private void abrirAvaliacao(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaAbrirAvaliacao);
		this.telaAbrirAvaliacao.show();
	}
	
	private void lancarNotas(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaLancarNotas);
		this.telaLancarNotas.show();
	}
}
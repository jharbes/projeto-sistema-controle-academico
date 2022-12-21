package view;

import java.awt.Color;
import java.awt.event.ActionEvent;

import fragmentsInstituicao.*;
import model.Instituicao;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Instituicao_view extends JFrame{
	
	private javax.swing.JMenu menuHome;
	private javax.swing.JMenuItem minhasInfos;
	private javax.swing.JMenuItem cadastrarProduto;
	private javax.swing.JMenuItem mostrarProdutos;
	private javax.swing.JMenuItem emprestarProduto;
	
	
	private javax.swing.JMenu menuCurso;
	private javax.swing.JMenuItem cadastrarCurso;
	private javax.swing.JMenuItem mostrarCursos;
	private javax.swing.JMenuItem cadastrarDisciplina;
	private javax.swing.JMenuItem mostrarDisciplinas;
	private javax.swing.JMenuItem abrirSalaParaDisciplina;
	private javax.swing.JMenuItem mostrarSalas;
	
	
	private javax.swing.JMenu menuTurma;
	private javax.swing.JMenuItem cadastrarTurma;
	private javax.swing.JMenuItem mostrarTurmas;
	
	
	private javax.swing.JMenu menuAluno;
	private javax.swing.JMenuItem cadastrarAluno;
	private javax.swing.JMenuItem mostrarAlunos;
	private javax.swing.JMenuItem documentosAluno;
	
	
	private javax.swing.JMenu menuProfessor;
	private javax.swing.JMenuItem cadastrarProfessor;
	private javax.swing.JMenuItem mostrarProfessores;
	private javax.swing.JMenuItem alocarSalaAoProfessor;
	
	
	private javax.swing.JMenu menuBiblioteca;
	private javax.swing.JMenuItem fazerCadastro;
	private javax.swing.JMenuItem cadastrarObra;
	private javax.swing.JMenuItem mostrarObras;
	private javax.swing.JMenuItem mostrarPendencias;
	private javax.swing.JMenuItem emprestarObra;
	private javax.swing.JMenuItem mostrarEmprestimos;
	
	
	private javax.swing.JMenuBar menuPrincipal;
	
	private javax.swing.JDesktopPane mainContent;
	
	// Gerando uma Instituição
	private Instituicao inst;

	// Atributos relacionados as telas
	private MinhasInfos telaMinhasInfos;
	private CadastrarProduto telaCadastrarProduto;
	private MostrarProdutos telaMostrarProdutos;
	private EmprestarProduto telaEmprestarProduto;
	
	private CadastrarCurso telaCadastrarCurso;
	private MostrarCursos telaMostrarCursos;
	private CadastrarDisciplina telaCadastrarDisciplina;
	private MostrarDisciplinas telaMostrarDisciplinas;
	private AbrirSalaParaDisciplina telaAbrirSalaParaDisciplina;
	private MostrarSalas telaMostrarSalas;
	
	private CadastrarTurma telaCadastrarTurma;
	private MostrarTurmas telaMostrarTurmas;
	
	private CadastrarAluno telaCadastrarAluno;
	private MostrarAlunos telaMostrarAlunos;
	private DocumentosAlunos telaDocumentosAlunos;
	
	private CadastrarProfessor telaCadastrarProfessor;
	private MostrarProfessores telaMostrarProfessores;
	private AlocarSalaAoProfessor telaAlocarSalaAoProfessor;
	
	private FazerCadastro telaFazerCadastro;
	private CadastrarObra telaCadastrarObra;
	private MostrarObras telaMostrarObras;
	private MostrarPendencias telaMostrarPendencias;
	private EmprestarObra telaEmprestarObra;
	private MostrarEmprestimos telaMostrarEmprestimos;
	
	public Instituicao_view(Instituicao inst) {
		this.inst = inst;
		this.build();
		this.events();
	}

	private void build() {
		
		// Instânciando as telas
		telaMinhasInfos = new MinhasInfos();
		telaCadastrarProduto = new CadastrarProduto();
		telaMostrarProdutos = new MostrarProdutos();
		telaEmprestarProduto = new EmprestarProduto();
		
		telaCadastrarCurso = new CadastrarCurso();
		telaMostrarCursos = new MostrarCursos();
		telaCadastrarDisciplina = new CadastrarDisciplina();
		telaMostrarDisciplinas = new MostrarDisciplinas();
		telaAbrirSalaParaDisciplina = new AbrirSalaParaDisciplina();
		telaMostrarSalas = new MostrarSalas();
		
		telaCadastrarTurma = new CadastrarTurma();
		telaMostrarTurmas = new MostrarTurmas();
		
		telaCadastrarAluno = new CadastrarAluno();
		telaMostrarAlunos = new MostrarAlunos();
		telaDocumentosAlunos = new DocumentosAlunos();
		
		telaCadastrarProfessor = new CadastrarProfessor(this.inst);
		telaMostrarProfessores = new MostrarProfessores();
		telaAlocarSalaAoProfessor = new AlocarSalaAoProfessor();
		
		telaFazerCadastro = new FazerCadastro();
		telaCadastrarObra = new CadastrarObra();
		telaMostrarObras = new MostrarObras();
		telaMostrarPendencias = new MostrarPendencias();
		telaEmprestarObra = new EmprestarObra();
		telaMostrarEmprestimos = new MostrarEmprestimos();
		
		// Instanciando componentes de tela
		menuPrincipal = new javax.swing.JMenuBar();
		
        menuHome = new javax.swing.JMenu();
        minhasInfos = new javax.swing.JMenuItem();
        cadastrarProduto = new javax.swing.JMenuItem();
        mostrarProdutos = new javax.swing.JMenuItem();
        emprestarProduto = new javax.swing.JMenuItem();

        
        menuCurso = new javax.swing.JMenu();
        cadastrarCurso = new javax.swing.JMenuItem();
        mostrarCursos = new javax.swing.JMenuItem();
        cadastrarDisciplina = new javax.swing.JMenuItem();
        mostrarDisciplinas = new javax.swing.JMenuItem();
        abrirSalaParaDisciplina = new javax.swing.JMenuItem();
        mostrarSalas = new javax.swing.JMenuItem();
        
        
        menuTurma = new javax.swing.JMenu();
        cadastrarTurma = new javax.swing.JMenuItem();
        mostrarTurmas = new javax.swing.JMenuItem();
        
        
        menuAluno = new javax.swing.JMenu();
        cadastrarAluno = new javax.swing.JMenuItem();
        mostrarAlunos = new javax.swing.JMenuItem();
        documentosAluno = new javax.swing.JMenuItem();
        
        
        menuProfessor = new javax.swing.JMenu();
        cadastrarProfessor = new javax.swing.JMenuItem();
        mostrarProfessores = new javax.swing.JMenuItem();
        alocarSalaAoProfessor = new javax.swing.JMenuItem();
        
        
        menuBiblioteca = new javax.swing.JMenu();
    	fazerCadastro = new javax.swing.JMenuItem();
    	cadastrarObra = new javax.swing.JMenuItem();
    	mostrarObras = new javax.swing.JMenuItem();
    	mostrarPendencias = new javax.swing.JMenuItem();
    	emprestarObra = new javax.swing.JMenuItem();
    	mostrarEmprestimos = new javax.swing.JMenuItem();
       
        
        mainContent = new javax.swing.JDesktopPane();
        
        menuPrincipal.setBackground(Color.WHITE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portal da instituição - " + inst.getNome());
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        // Construindo o menu Home
        menuHome.setText("Home");
        minhasInfos.setText("Minhas informações");
        menuHome.add(minhasInfos);
        cadastrarProduto.setText("Cadastrar produto");
        menuHome.add(cadastrarProduto);
        mostrarProdutos.setText("Mostrar produtos");
        menuHome.add(mostrarProdutos);
        emprestarProduto.setText("Emprestar produto");
        menuHome.add(emprestarProduto);
        
        menuPrincipal.add(menuHome);
        
        // Construindo o menu Curso
        menuCurso.setText("Curso");
        cadastrarCurso.setText("Cadastrar curso");
        menuCurso.add(cadastrarCurso);
        mostrarCursos.setText("Mostrar cursos");
        menuCurso.add(mostrarCursos);
        cadastrarDisciplina.setText("Cadastrar disciplina");
        menuCurso.add(cadastrarDisciplina);
        mostrarDisciplinas.setText("Mostrar disciplinas");
        menuCurso.add(mostrarDisciplinas);
        abrirSalaParaDisciplina.setText("Abrir sala para disciplina");
        menuCurso.add(abrirSalaParaDisciplina);
        mostrarSalas.setText("Mostrar salas");
        menuCurso.add(mostrarSalas);
        
        menuPrincipal.add(menuCurso);
        
        // Construindo menu Turma
        menuTurma.setText("Turma");
        cadastrarTurma.setText("Cadastrar turma");
        menuTurma.add(cadastrarTurma);
        mostrarTurmas.setText("Mostrar turmas");
        menuTurma.add(mostrarTurmas);
        
        menuPrincipal.add(menuAluno);
        
        // Construindo menu Aluno
        menuAluno.setText("Aluno");
        cadastrarAluno.setText("Cadastrar aluno");
        menuAluno.add(cadastrarAluno);
        mostrarAlunos.setText("Mostrar alunos");
        menuAluno.add(mostrarAlunos);
        documentosAluno.setText("Pendência de documentos");
        menuAluno.add(documentosAluno);
        
        menuPrincipal.add(menuAluno);
        
        // Construindo menu Professor
        menuProfessor.setText("Professor");
        cadastrarProfessor.setText("Cadastrar professor");
        menuProfessor.add(cadastrarProfessor);
        mostrarProfessores.setText("Mostrar professores");
        menuProfessor.add(mostrarProfessores);
        alocarSalaAoProfessor.setText("Alocar sala ao professor");
        menuProfessor.add(alocarSalaAoProfessor);
        
        menuPrincipal.add(menuProfessor);
    	
    	// Construindo menu Biblioteca
    	menuBiblioteca.setText("Biblioteca");
    	fazerCadastro.setText("Cadastrar pessoa");
        menuBiblioteca.add(fazerCadastro);
        cadastrarObra.setText("Cadastrar obra");
        menuBiblioteca.add(cadastrarObra);
        mostrarObras.setText("Mostrar obras");
        menuBiblioteca.add(mostrarObras);
        mostrarPendencias.setText("Mostrar pendências");
        menuBiblioteca.add(mostrarPendencias);
        emprestarObra.setText("Emprestar obra");
        menuBiblioteca.add(emprestarObra);
        mostrarEmprestimos.setText("Mostrar emprestimos");
        menuBiblioteca.add(mostrarEmprestimos);
        
        menuPrincipal.add(menuBiblioteca);
        
        
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
		this.cadastrarProduto.addActionListener(this::CadastrarProduto);
		this.mostrarProdutos.addActionListener(this::mostrarProdutos);
		this.emprestarProduto.addActionListener(this::emprestarProduto);
		
		this.cadastrarCurso.addActionListener(this::cadastrarCurso);
		this.mostrarCursos.addActionListener(this::mostrarCursos);
		this.cadastrarDisciplina.addActionListener(this::cadastrarDisciplina);
		this.mostrarDisciplinas.addActionListener(this::mostrarDisciplina);
		this.abrirSalaParaDisciplina.addActionListener(this::abrirSalaParaDisciplina);
		this.mostrarSalas.addActionListener(this::mostrarSalas);
		
		this.cadastrarTurma.addActionListener(this::cadastrarTurma);
		this.mostrarTurmas.addActionListener(this::mostrarTurmas);
		
		this.cadastrarAluno.addActionListener(this::cadastrarAluno);
		this.mostrarAlunos.addActionListener(this::mostrarAlunos);
		this.documentosAluno.addActionListener(this::documentosAlunos);
		
		this.cadastrarProfessor.addActionListener(this::cadastrarProfessor);
		this.mostrarProfessores.addActionListener(this::mostrarProfessores);
		this.alocarSalaAoProfessor.addActionListener(this::alocarSalaAoProfessor);
		
		this.fazerCadastro.addActionListener(this::fazerCadastro);
		this.cadastrarObra.addActionListener(this::cadastrarObra);
		this.mostrarObras.addActionListener(this::mostrarObras);
		this.mostrarPendencias.addActionListener(this::mostrarPendencias);
		this.emprestarObra.addActionListener(this::emprestarObra);
		this.mostrarEmprestimos.addActionListener(this::mostrarEmprestimos);
	}
	
	private void editarMinhasInformacoes(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaMinhasInfos);
		this.telaMinhasInfos.show();
	}
	
	private void CadastrarProduto(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaCadastrarProduto);
		this.telaCadastrarProduto.show();
	}
	
	private void mostrarProdutos(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaMostrarProdutos);
		this.telaMostrarProdutos.show();
	}
	
	private void emprestarProduto(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaEmprestarProduto);
		this.telaEmprestarProduto.show();
	}
	
	private void cadastrarCurso(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaCadastrarCurso);
		this.telaCadastrarCurso.show();
	}
	
	private void mostrarCursos(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaMostrarCursos);
		this.telaMostrarCursos.show();
	}
	
	private void cadastrarDisciplina(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaCadastrarDisciplina);
		this.telaCadastrarDisciplina.show();
	}
	
	private void mostrarDisciplina(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaMostrarDisciplinas);
		this.telaMostrarDisciplinas.show();
	}
	
	private void abrirSalaParaDisciplina(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaAbrirSalaParaDisciplina);
		this.telaAbrirSalaParaDisciplina.show();
	}
	
	private void mostrarSalas(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaMostrarSalas);
		this.telaMostrarSalas.show();
	}
	
	private void cadastrarTurma(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaCadastrarTurma);
		this.telaCadastrarTurma.show();
	}
	
	private void mostrarTurmas(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaMostrarTurmas);
		this.telaMostrarTurmas.show();
	}
	
	private void cadastrarAluno(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaCadastrarAluno);
		this.telaCadastrarAluno.show();
	}
	
	private void mostrarAlunos(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaMostrarAlunos);
		this.telaMostrarAlunos.show();
	}
	
	private void documentosAlunos(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaDocumentosAlunos);
		this.telaDocumentosAlunos.show();
	}
	
	private void cadastrarProfessor(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaCadastrarProfessor);
		this.telaCadastrarProfessor.show();
	}
	
	private void mostrarProfessores(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaMostrarProfessores);
		this.telaMostrarProfessores.show();
	}
	
	private void alocarSalaAoProfessor(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaAlocarSalaAoProfessor);
		this.telaAlocarSalaAoProfessor.show();
	}
	
	private void fazerCadastro(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaFazerCadastro);
		this.telaFazerCadastro.show();
	}
	
	private void cadastrarObra(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaCadastrarObra);
		this.telaCadastrarObra.show();
	}
	
	private void mostrarObras(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaMostrarObras);
		this.telaMostrarObras.show();
	}
	
	private void mostrarPendencias(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaMostrarPendencias);
		this.telaMostrarPendencias.show();
	}
	
	private void emprestarObra(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaEmprestarObra);
		this.telaEmprestarObra.show();
	}
	
	private void mostrarEmprestimos(ActionEvent e) {
		this.mainContent.remove(this.mainContent.getComponent(0));
		
		this.mainContent.add(this.telaMostrarEmprestimos);
		this.telaMostrarEmprestimos.show();
	}
}
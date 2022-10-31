package model;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
	
	private int id_funcionario;
	private String cargo;
	private double salario;
	private Pessoa pessoa;
	
	public Funcionario(int id_pessoa, String nome, String genero, int idade, String rg, String cpf, String telefone,
			String email, String nome_instituicao, Endereco endereco, int id_funcionario, String cargo, double salario,
			Pessoa pessoa) {
		super(id_pessoa, nome, genero, idade, rg, cpf, telefone, email, nome_instituicao, endereco);
		this.id_funcionario = id_funcionario;
		this.cargo = cargo;
		this.salario = salario;
		this.pessoa = pessoa;
	}

	public int getId_funcionario() {
		return id_funcionario;
	}

	public String getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public boolean createFuncionario() {
		return false;
	}
	
	public ArrayList<Funcionario> readFuncionario() {
		ArrayList<Funcionario> retorno = new ArrayList<Funcionario>();
		return retorno;
	}
	
	public boolean updateFuncionario() {
		return false;
	}
	
	public boolean deleteFuncionario() {
		return false;
	}
	
}

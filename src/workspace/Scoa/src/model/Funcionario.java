package model;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
	
	private String cargo;
	private double salario;
	private Pessoa pessoa;
	
	public Funcionario(String cargo, double salario, Pessoa pessoa) {
		super();
		this.cargo = cargo;
		this.salario = salario;
		this.pessoa = pessoa;
	}

	public Funcionario() {
		super();
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

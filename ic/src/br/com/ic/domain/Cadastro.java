package br.com.ic.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tab_cadastro")
@NamedQuery(name = "Cadastro.listar", query = "SELECT c FROM Cadastro c")
public class Cadastro implements Serializable {

	private static final long serialVersionUID = 9040911904730160015L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_int_cadastro")
	private Integer id;

	@Column(name = "dtcadastro_var_cadastro", nullable = false)
	private String dtcadastro;

	@Column(name = "dtnasc_var_cadastro", nullable = false)
	private String dtnascimento;

	@Column(name = "nome_var_cadastro", nullable = false)
	private String nome;

	@Column(name = "cpf_var_cadastro", nullable = false)
	private String cpf;

	@Column(name = "rg_var_cadastro", nullable = false)
	private String rg;

	@Column(name = "sexo_var_cadastro", nullable = false, length = 1)
	private String sexo;

	@Column(name = "matricula_var_cadastro", nullable = false)
	private String matricula;

	@Column(name = "vinculo_var_cadastro", nullable = false, length = 1)
	private String vinculo;

	@Column(name = "email_var__cadastro", nullable = false, length = 100)
	private String email;

	@Column(name = "contato_var__cadastro", nullable = false, length = 100)
	private String contato;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDtcadastro() {
		return dtcadastro;
	}

	public void setDtcadastro(String dtcadastro) {
		this.dtcadastro = dtcadastro;
	}

	public String getDtnascimento() {
		return dtnascimento;
	}

	public void setDtnascimento(String dtnascimento) {
		this.dtnascimento = dtnascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getVinculo() {
		return vinculo;
	}

	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

}

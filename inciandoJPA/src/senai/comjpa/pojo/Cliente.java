package senai.comjpa.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cliente {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String Nome;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Cidade cidade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade joi) {
		this.cidade = joi;
	}
}

package br.com.alura.screenmatch.domain.filme;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="filmes")
@Data
@NoArgsConstructor
public class Filme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Integer duracaoEmMinutos;
	private Integer anoLancamento;
	private String genero;
	
	public Filme(DadosCadastroFilme dados) {
		
		this.nome = dados.nome();
		this.duracaoEmMinutos = dados.duracao();
		this.anoLancamento = dados.ano();
		this.genero = dados.genero();
	}

	public void atualizDados(DadosAlteracaoFilme dados) {
		
		
		this.nome = dados.nome();
		this.duracaoEmMinutos = dados.duracao();
		this.anoLancamento = dados.ano();
		this.genero = dados.genero();
		
	}

}

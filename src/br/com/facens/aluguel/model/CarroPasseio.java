package br.com.facens.aluguel.model;

import javax.persistence.*;

@Entity
//@DiscriminatorValue(value="CarroPasseio")
public class CarroPasseio extends Veiculo {
	
	private int quantidadePassageiros;
	
	public CarroPasseio()
	{
		this.setTipo("CarroPasseio");
	}
	public int getQuantidadePassageiros() {
		return quantidadePassageiros;
	}

	public void setQuantidadePassageiros(int quantidadePassageiros) {
		this.quantidadePassageiros = quantidadePassageiros;
	}

	@Override
	public String toString() {
		return "CarroPasseio [quantidadePassageiros=" + quantidadePassageiros
				+ ", toString()=" + super.toString() + "]";
	}
	
	

	

}

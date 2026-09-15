package com.ifsc.tds;

public class Salario {
	private double liquido, bruto; // os salarios
	private double inss, ir; // os descontos
	private double horas, valorHora, dependentes; // informações do funcionário

	public void folha() {
		this.bruto = this.horas * this.valorHora + (50 * this.dependentes);

		// inss
		if (this.bruto <= 1000)
			this.inss = this.bruto * (8.5 / 100);
		else
			this.inss = bruto * (9.0 / 100);

		// ir
		if (this.bruto <= 500)
			this.ir = 0;
		else if (this.bruto <= 1000)
			this.ir = this.bruto * (5.0 / 100);
		else
			this.ir = this.bruto * (7.0 / 100);

		this.liquido = this.bruto - this.ir - this.inss;

		// saidas
		System.out.println(inss);
		System.out.println(ir);
		System.out.println("Salário líquido.: R$ " + String.format("%.2f", this.liquido));
		System.out.println("Salário bruto...: R$ " + String.format("%.2f", this.bruto));
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getDependentes() {
		return dependentes;
	}

	public void setDependentes(double dependentes) {
		this.dependentes = dependentes;
	}

}

package Empresa.Classes;

public class Terceiro extends Funcionario{
	protected double adicional;

	public Terceiro(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}

	public Terceiro(String matricula, int horasTrabalhadas, double valorHora, String nome, double adicional) {
		super(matricula, horasTrabalhadas, valorHora, nome);
		this.adicional = adicional;
	}
	

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public  double salario() {
		return((super.getHorasTrabalhadas()*super.getValorHora())+getAdicional());
	}
}

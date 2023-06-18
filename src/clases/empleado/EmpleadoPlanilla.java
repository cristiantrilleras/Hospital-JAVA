package clases.empleado;

import javax.swing.JOptionPane;

public class EmpleadoPlanilla extends Empleado{
	
	private double salarioMensual;
	private double porcentajeAdicionalPorHoraExtra;
	
	@Override
	public void registrarDatos() {
	super.registrarDatos();
	
	salarioMensual=Double.parseDouble(JOptionPane.showInputDialog("ingrese el salario mensual"));
	porcentajeAdicionalPorHoraExtra=Double.parseDouble(JOptionPane.showInputDialog("ingrese el porcentaje adicional por hora extra"));
	}
	
	public double getSalarioMensual() {
		return salarioMensual;
	}
	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	public double getPorcentajeAdicionalPorHoraExtra() {
		return porcentajeAdicionalPorHoraExtra;
	}
	public void setPorcentajeAdicionalPorHoraExtra(double porcentajeAdicionalPorHoraExtra) {
		this.porcentajeAdicionalPorHoraExtra = porcentajeAdicionalPorHoraExtra;
	}
	
	
}
 
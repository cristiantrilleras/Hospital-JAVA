package clases.empleado;

import javax.swing.JOptionPane;

public class EmpleadoEventual extends Empleado {

	private double honorariosPorHora;
	private String fechaTerminoConrato;
	
	@Override
	public void registrarDatos() {
	super.registrarDatos();
	
	honorariosPorHora=Double.parseDouble(JOptionPane.showInputDialog("ingrese el salario mensual"));
	fechaTerminoConrato=JOptionPane.showInputDialog("ingrese la fecha de nacimiento (dd/mm/aaaa)");
	
	
	}
	
	
	public double getHonorariosPorHora() {
		return honorariosPorHora;
	}
	public void setHonorariosPorHora(double honorariosPorHora) {
		this.honorariosPorHora = honorariosPorHora;
	}
	public String getFechaTerminoConrato() {
		return fechaTerminoConrato;
	}
	public void setFechaTerminoConrato(String fechaTerminoConrato) {
		this.fechaTerminoConrato = fechaTerminoConrato;
	}
	
	
}

package clases.empleado;

import clases.Persona;

public class Empleado extends Persona{
	
	private String codigoDeEmpleado;
	private int numeroDeHorasExtras;
	private String fechaDeIngreso;
	private String area;
	private String cargo;
	
	
	public String getCodigoDeEmpleado() {
		return codigoDeEmpleado;
	}
	public void setCodigoDeEmpleado(String codigoDeEmpleado) {
		this.codigoDeEmpleado = codigoDeEmpleado;
	}
	public int getNumeroDeHorasExtras() {
		return numeroDeHorasExtras;
	}
	public void setNumeroDeHorasExtras(int numeroDeHorasExtras) {
		this.numeroDeHorasExtras = numeroDeHorasExtras;
	}
	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}
	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

}

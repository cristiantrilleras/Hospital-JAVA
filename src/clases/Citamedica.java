package clases;

import clases.empleado.Medico;

public class Citamedica {
	private Paciente paciente;
	private Medico medico;
	private String servicio;
	private String fechaConsulta;
	private String horaconsulta;
	private String lugar;
	
	public Citamedica(Paciente paciente, Medico medico, String servicio, String fechaConsulta, String horaconsulta,
			String lugar) {
		this.paciente = paciente;
		this.medico = medico;
		this.servicio = servicio;
		this.fechaConsulta = fechaConsulta;
		this.horaconsulta = horaconsulta;
		this.lugar = lugar;
	}
	
	public String informacionCitaMEdica() {
		
		String datosCita="**informacion cita medica**\n";
		datosCita="paciente: "+paciente.getNombre()+"\n";
		datosCita+="medico: "+medico.getNombre()+"\n";
		datosCita+="fecha consulta: "+ fechaConsulta+" -hora "+horaconsulta+"\n";
		datosCita+="lugar: "+lugar+ "n\n\"";
				
				return datosCita;
		
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getFechaConsulta() {
		return fechaConsulta;
	}

	public void setFechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}

	public String getHoraconsulta() {
		return horaconsulta;
	}

	public void setHoraconsulta(String horaconsulta) {
		this.horaconsulta = horaconsulta;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	
	
	

}

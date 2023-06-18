package clases;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Paciente extends Persona {
	
	private int numeroHisoriaClinica;
	private String sexo;
	private String grupoSanguineo;
	private ArrayList<String> listaMedicamentosAlergico;
	
	@Override
	public void registrarDatos() {
		super.registrarDatos();
		
		//lenamos los datos especificos del paciente
		
		listaMedicamentosAlergico=new ArrayList<String>();
		numeroHisoriaClinica=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE LA HISTORIA CLINICA"));
		sexo=JOptionPane.showInputDialog("ingrese el sexo");
		grupoSanguineo=JOptionPane.showInputDialog("ingrese el grupo sanguineo");
		
		String pregunta= JOptionPane.showInputDialog("es alergico a algun medicamento? ingrese si o no");
		
		if (pregunta.equalsIgnoreCase("si")) {
			String medicamento="";
			String continuar="";
			do {
				medicamento=JOptionPane.showInputDialog("ingrese el nombre del medicamento al que es alergico");
				listaMedicamentosAlergico.add(medicamento);
				
				continuar=JOptionPane.showInputDialog("ingresa si, si desea continuar");
				
			} while (continuar.equalsIgnoreCase("si"));
			
		}

	}
	
	public int getNumeroHisoriaClinica() {
		return numeroHisoriaClinica;
	}
	public void setNumeroHisoriaClinica(int numeroHisoriaClinica) {
		this.numeroHisoriaClinica = numeroHisoriaClinica;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}
	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}
	public ArrayList<String> getListaMedicamentosAergico() {
		return listaMedicamentosAlergico;
	}
	public void setListaMedicamentosAergico(ArrayList<String> listaMedicamentosAergico) {
		this.listaMedicamentosAlergico = listaMedicamentosAergico;
	}
	
	
	
	
	

}

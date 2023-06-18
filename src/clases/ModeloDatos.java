package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import clases.empleado.EmpleadoEventual;
import clases.empleado.EmpleadoPlanilla;
import clases.empleado.Medico;

public class ModeloDatos {

	HashMap<String, Paciente> pacientesMap;
	HashMap<String, EmpleadoPlanilla> empleadosPlanillaMap;
	HashMap<String, EmpleadoEventual> empleadosEventualMap;
	HashMap<String, Medico> medicosMap;
	ArrayList<Citamedica> citasList;

	public ModeloDatos() {
		pacientesMap = new HashMap<String, Paciente>();
		empleadosPlanillaMap = new HashMap<String, EmpleadoPlanilla>();
		medicosMap = new HashMap<String, Medico>();
		empleadosEventualMap = new HashMap<String, EmpleadoEventual>();
		citasList = new ArrayList<Citamedica>();

	}

	public void registrarPersona(Paciente miPaciente) {
		pacientesMap.put(miPaciente.getNumeroDeDni(), miPaciente);
		System.out.println("se ha registrado el paciente " + miPaciente.getNombre() + " satisfactoriamente");
	}

	public void registrarPersona(EmpleadoPlanilla miEmpPlanilla) {
		empleadosPlanillaMap.put(miEmpPlanilla.getNumeroDeDni(), miEmpPlanilla);
		System.out.println(
				"se ha registrado el empleado por planilla " + miEmpPlanilla.getNombre() + " satisfactoriamente");
	}

	public void registrarPersona(EmpleadoEventual miEmpEventual) {
		empleadosEventualMap.put(miEmpEventual.getNumeroDeDni(), miEmpEventual);
		System.out.println("se ha registrado el empleado eventual" + miEmpEventual.getNombre() + " satisfactoriamente");
	}

	public void registrarPersona(Medico miMedico) {
		medicosMap.put(miMedico.getNumeroDeDni(), miMedico);
		System.out.println("se ha registrado el medico" + miMedico.getNombre() + " satisfactoriamente");

	}

	public void imprimirPacientes() {
		String msj = "pacientes registrados\n";
		Iterator<String> iterator = pacientesMap.keySet().iterator();

		while (iterator.hasNext()) {

			String clave = iterator.next();
			pacientesMap.get(clave).imprimirDatosPersona(msj);

		}

	}

	public void imprimirEmpleadosEventuales() {
		String msj = "EMPLEADOS EVENTUALES REGISTRADOS\n";

		for (String clave : empleadosEventualMap.keySet()) {
			empleadosEventualMap.get(clave).imprimirDatosPersona(msj);
		}

	}

	public void imprimirEmpleadosPorPlanilla() {
		String msj = "EMPLEADOS POR PLANILLA REGISTRADOS\n";

		for (EmpleadoPlanilla empleadoPlanilla : empleadosPlanillaMap.values()) {
			empleadoPlanilla.imprimirDatosPersona(msj);
		}

	}

	public void imprimirMedicos() {
		String msj = "MEDICOS REGISTRADOS\n";

		for (Map.Entry<String, Medico> elemento : medicosMap.entrySet()) {
			elemento.getValue().imprimirDatosPersona(msj);

		}

	}

	public Paciente consultarPacientePorDocumentos(String documentoPaciente) {
		Paciente miPaciente = null;

		if (pacientesMap.containsKey(documentoPaciente)) {
			miPaciente = pacientesMap.get(documentoPaciente);

		}

		// si el paciente existe lo retorna, si no retorna null
		return miPaciente;
	}

	public Medico consultarMedicoPorNombre(String nombreMedico) {
		for (Medico medico : medicosMap.values()) {

			if (medico.getNombre().equalsIgnoreCase(nombreMedico)) {
				return medico;// al retornar automaticamente termina el ciclo

			}

		}

		// en caso de no encontrar nungun medico retorna null
		return null;
	}

	public void registrarCitaMedica(Citamedica miCita) {
		citasList.add(miCita);
		System.out.println("se ha registrado la cita exitosamente\n");
		System.out.println(miCita.informacionCitaMEdica());
	}

	public void imprimirCitasMedicasProgramadas() {
		String msj = "CITAS MEDICAS PROGRAMADAS";
		Citamedica miCita = null;

		System.out.println(msj + "\n");

		if (citasList.size() > 0) {
			for (int i = 0; i < citasList.size(); i++) {
				miCita = citasList.get(i);
				System.out.println(miCita.informacionCitaMEdica());
			}

		} else {
			System.out.println("no existen citas programadas");
		}

	}
}

import javax.swing.JOptionPane;
import clases.Citamedica;
import clases.ModeloDatos;
import clases.Paciente;
import clases.empleado.EmpleadoEventual;
import clases.empleado.EmpleadoPlanilla;
import clases.empleado.Medico;

public class Procesos {

	ModeloDatos miModeloDatos;

	public Procesos() {
		miModeloDatos = new ModeloDatos();
		presentarMenuOpciones();
	}

	private void presentarMenuOpciones() {

		String menu = "MENU HOSPITAL\n\n";
		menu += "1. Registrar Paciente\n";
		menu += "2. Registrar empleado\n";
		menu += "3. Registrar cita medica\n";
		menu += "4. imprimir informacion\n";
		menu += "5. salir\n\n";
		menu += "Ingresa una opcion\n";

		int opcion = 0;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1:
				registrarPaciente();
				break;
			case 2:
				registrarEmpleado();
				break;
			case 3:
				registrarCitaMedica();
				break;
			case 4:
				imprimirInformacion();
				break;
			case 5:
				System.out.println("el sistema ha terminado");
				break;
			default:
				System.out.println("no existe el codigo, verifique nuevamente");
				break;

			}
		} while (opcion != 5);

	}

	private void imprimirInformacion() {
		String menuImprimir="MENU IMPRESIONES\n";
		menuImprimir+="1. listar pacientes\n";
		menuImprimir+="2. listar empleados eventuales\n";
		menuImprimir+="3. listar empleados por planilla\n";
		menuImprimir+="4. listar medicos\n";
		menuImprimir+="4. listar medicos\n";
		menuImprimir+="5. listar citas medicas programadas\n";
		menuImprimir+="ingresa una opccion\n";
		
		System.out.println("------------------------------------");
		
		int opcion=Integer.parseInt(JOptionPane.showInputDialog(menuImprimir));
		
		switch (opcion) {
		case 1: miModeloDatos.imprimirPacientes(); break;
		case 2: miModeloDatos.imprimirEmpleadosEventuales(); break;
		case 3: miModeloDatos.imprimirEmpleadosPorPlanilla(); break;
		case 4: miModeloDatos.imprimirMedicos(); break;
		case 5: miModeloDatos.imprimirCitasMedicasProgramadas();
		
		default: System.out.println("no existe esa opcion");
			break;
		}
	}

	private void registrarCitaMedica() {
		String documentoPaciente=JOptionPane.showInputDialog("ingrese el documento del paciente");
		
		Paciente pacienteEncontrado=miModeloDatos.consultarPacientePorDocumentos(documentoPaciente);
		
		if (pacienteEncontrado!=null ) {
			String nombreMedico=JOptionPane.showInputDialog("ingrese el nombre del medico");
			Medico medicoEncontrado=miModeloDatos.consultarMedicoPorNombre(nombreMedico);
			
			if (medicoEncontrado!=null) {
				String servicio=JOptionPane.showInputDialog("ingrese el servicio motivo de la consulta");
				String fechaConsulta=JOptionPane.showInputDialog("ingrese la fecha de la consulta");
				String horaConsulta=JOptionPane.showInputDialog("ingresa la hora de la consulta");
				
				String lugar="la cita sera el consultorio "+medicoEncontrado.getNumeroDeConsultorio();
				Citamedica miCita=new Citamedica(pacienteEncontrado, medicoEncontrado, servicio, fechaConsulta, horaConsulta, lugar);
				miModeloDatos.registrarCitaMedica(miCita);
			}else {
				System.out.println("el medico no esta registrado en el sistema");
			}
		}else {
			System.out.println("el paciente no esta registrado en el sistema");
		}
	}

	private void registrarEmpleado() {
		String menuTipoEmpleado = "registro de empleado\n";
		menuTipoEmpleado += "1. empleado eventual\n";
		menuTipoEmpleado += "2. empleado por planilla\n";
		menuTipoEmpleado += " Seleccione el tipo de empleado a registrar\n";

		int tipoEmpleado = Integer.parseInt(JOptionPane.showInputDialog(menuTipoEmpleado));

		switch (tipoEmpleado) {
		case 1: // registro empleado eventual
			EmpleadoEventual miEmpleadoEventual = new EmpleadoEventual();
			miEmpleadoEventual.registrarDatos();
			miModeloDatos.registrarPersona(miEmpleadoEventual);

			break;
		case 2:
			String resp = JOptionPane
					.showInputDialog("ingrese si, si es un medico, de lo contrario es otro tipo de empleado");
			if (resp.equalsIgnoreCase("si")) {
				// registro medico
				Medico miMedico = new Medico();
				miMedico.registrarDatos();
				miModeloDatos.registrarPersona(miMedico);
			} else {
				// registrar empleado planilla
				EmpleadoPlanilla miEmpleadoPlanilla = new EmpleadoPlanilla();
				miEmpleadoPlanilla.registrarDatos();
				miModeloDatos.registrarPersona(miEmpleadoPlanilla);
			}

			break;

		default:
			System.out.println("el tipo de empleado no es valido, intentelo nuevamente");
			break;
		}

	}

	private void registrarPaciente() {
		Paciente miPaciente = new Paciente();
		miPaciente.registrarDatos();

		miModeloDatos.registrarPersona(miPaciente);

	}

}

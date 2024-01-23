package Servicios;

import java.util.List;
import java.util.Scanner;

import Dtos.EsclavoDto;
import Dtos.PacienteDto;

public class OperativaImplementacion implements OperativaInterfaz {

	@Override
	public void aniadirCliente(List<PacienteDto> listaPaciente, List<EsclavoDto> listaEsclavo) {
		// TODO Auto-generated method stub
		
		PacienteDto paciente = implementarCliente(); 
		
		EsclavoDto esclavo = new EsclavoDto();
		
				
		listaPaciente.add(paciente);
		
		for(PacienteDto elemento : listaPaciente) {
			
			System.out.println(listaPaciente);
		}
		
		for(PacienteDto elemento : listaPaciente) {
			
			if(paciente.getIdEsclavo() == esclavo.getIdEsclavo() ) {
				
				System.out.println("######################################");
				System.out.println("El esclavo existe");
				System.out.println("######################################");
				
				for(EsclavoDto escl : listaEsclavo) {
					
					System.out.println("######################################");
					System.out.println(listaEsclavo);
					System.out.println("######################################");
				}
				
			}
			
			else {
				System.out.println("######################################");
				System.out.println("El esclavo no existe añadelo:");
				System.out.println("######################################");
				
				EsclavoDto esclavo1 = implementarEsclavo();
				listaEsclavo.add(esclavo1);
				
				
				
				for(EsclavoDto escl : listaEsclavo) {
				
					System.out.println(listaEsclavo);
				}
			}
		}
		
		
	}
	
	private PacienteDto implementarCliente(){
		
		Scanner sc = new Scanner(System.in);
		
		PacienteDto paciente = new PacienteDto();
		
		System.out.println("Introduzca el id");
		paciente.setIdPaciente(sc.nextLong());
		
		System.out.println("Introduzca el nombre");
		paciente.setNombrePaciente(sc.next());
		
		System.out.println("Introduzca la edad");
		paciente.setEdadPaciente(sc.nextInt());
		
		System.out.println("Introduzca la fecha");
		paciente.setFechaNacimiento(sc.next());
		
		System.out.println("Introduzca el sexo");
		paciente.setSexoBiologico(sc.next().charAt(0));
		
		System.out.println("Introduzca la especie");
		paciente.setEspeciePaciente(sc.next());;
		
		System.out.println("Introduzca el id del esclavo");
		paciente.setIdEsclavo(sc.nextLong());
		return paciente;
		
		
		
		
		
		
	}

	private EsclavoDto implementarEsclavo() {
		
		Scanner sc = new Scanner(System.in);
		
		EsclavoDto esclavo = new EsclavoDto();
		
		System.out.println("Introduzca el id");
		esclavo.setIdEsclavo(sc.nextLong());
		
		System.out.println("Introduzca el nombre");
		esclavo.setNombreEsclavo(sc.next());
		
		System.out.println("Introduzca el apellido");
		esclavo.setApellidosEsclavo(sc.next());
		
		System.out.println("Introduzca el dni");
		esclavo.setDniEsclavo(sc.next());
		
		System.out.println("Introduzca el telefono");
		esclavo.setTelefonoEsclavo(sc.next());
		
		
		return esclavo;
		
	}
}

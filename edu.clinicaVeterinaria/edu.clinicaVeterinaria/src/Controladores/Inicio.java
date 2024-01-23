package Controladores;

import java.util.ArrayList;
import java.util.List;

import Dtos.EsclavoDto;
import Dtos.PacienteDto;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperativaInterfaz oi = new OperativaImplementacion();
		List<PacienteDto> listaPaciente = new ArrayList<PacienteDto>();
		List<EsclavoDto> listaEsclavo = new ArrayList<EsclavoDto>();
		
		oi.aniadirCliente(listaPaciente, listaEsclavo);
		
		
		
		
		
		
	}

}

package Servicios;

import java.util.List;

import Dtos.EsclavoDto;
import Dtos.PacienteDto;

public interface OperativaInterfaz {

	
	public void aniadirCliente(List<PacienteDto> listaPaciente, List<EsclavoDto> listaEsclavo);
}

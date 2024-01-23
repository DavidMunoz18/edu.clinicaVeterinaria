package Dtos;

public class PacienteDto {

	
	long idPaciente;
	String nombrePaciente = "aaaaa";
	int edadPaciente = 11111;
	String fechaNacimiento = "9999/12/31";
	char sexoBiologico = 'a';
	String especiePaciente = "aaaaa";
	long idEsclavo;
	
	
	public long getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	public int getEdadPaciente() {
		return edadPaciente;
	}
	public void setEdadPaciente(int edadPaciente) {
		this.edadPaciente = edadPaciente;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public char getSexoBiologico() {
		return sexoBiologico;
	}
	public void setSexoBiologico(char sexoBiologico) {
		this.sexoBiologico = sexoBiologico;
	}
	public String getEspeciePaciente() {
		return especiePaciente;
	}
	public void setEspeciePaciente(String especiePaciente) {
		this.especiePaciente = especiePaciente;
	}
	public long getIdEsclavo() {
		return idEsclavo;
	}
	public void setIdEsclavo(long idEsclavo) {
		this.idEsclavo = idEsclavo;
	}
	
	
	//Constructores 
	public PacienteDto() {
		super();
	}
	
	public PacienteDto(long idPaciente, String nombrePaciente, int edadPaciente, String fechaNacimiento,
			char sexoBiologico, String especiePaciente, long idEsclavo) {
		super();
		this.idPaciente = idPaciente;
		this.nombrePaciente = nombrePaciente;
		this.edadPaciente = edadPaciente;
		this.fechaNacimiento = fechaNacimiento;
		this.sexoBiologico = sexoBiologico;
		this.especiePaciente = especiePaciente;
		this.idEsclavo = idEsclavo;
	}
	
	@Override
	public String toString() {
		return "PacienteDto [idPaciente=" + idPaciente + ", nombrePaciente=" + nombrePaciente + ", edadPaciente="
				+ edadPaciente + ", fechaNacimiento=" + fechaNacimiento + ", sexoBiologico=" + sexoBiologico
				+ ", especiePaciente=" + especiePaciente + ", idEsclavo=" + idEsclavo + "]";
	}
	
	
	
	
	
	
	
}

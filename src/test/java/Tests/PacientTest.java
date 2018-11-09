package Tests;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

import whenDoc.whenDOc.entity.Alergia;
import whenDoc.whenDOc.entity.Consulta;
import whenDoc.whenDOc.entity.Diagnostico;
import whenDoc.whenDOc.entity.Endereco;
import whenDoc.whenDOc.entity.Medication;
import whenDoc.whenDOc.entity.Medico;
import whenDoc.whenDOc.entity.Paciente;
import org.junit.Before;

public class PacientTest {

	Paciente pacient1;
	
	Medico medico1;
	
	Alergia alergia1;
	
	Medication medication1;
	
	Endereco endereco1;
	
	Consulta consulta1;
	
	Diagnostico diagnostico1;
	
	Set<Medico> setMedico1;
	Set<Alergia> setAlergia1;
	Set<Medication> setMedication1;
	Set<Consulta> setConsulta1;	
	
	Set<Medication> setMedReceitados1;
	
	@Before
	public void createPacient() {
		pacient1 = new Paciente("Edson Pelé", 1L, "pelezinhobranco@gmail.com", 
				"madonaehlixo@gmail.com", "pelemarreta", "888888", "777777", "africano", true);
	}
	
	@Before
	public void createMedico() {
		medico1 = new Medico("Dr Damião", 1L, "hemorroida e aids", 1L, "drdamiao@ig.com.br", "hehenaogostodopovo", "9999999");
	}
	
	@Before 
	public void createMedicamento() {
		medication1 = new Medication("varicel", "30g", "10:00", "08:00", "01/11/2018", "09/11/2018", "1g");
	}
	
	@Before
	public void createEndereco() {
		endereco1 = new Endereco("Rua dos Bobos", "Bairro bairroso", "0", null, "Rio de Janeiro", "Rio de Janeiro", "Brasil", "58400300");
	}
	
	@Before
	public void createConsulta() {
		consulta1 = new Consulta("01/11/2018", diagnostico1, pacient1);
		
	}
	
	@Before
	public void createDiagnostico() {
		diagnostico1 = new Diagnostico(1L, "bipolaridade", "o paciente, Edson Pelé, diz se chamar, Jo Soares", "01/11/2018", consulta1);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
}

package Tests;

import static org.junit.Assert.*;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.Set;

import org.junit.Test;

import whenDoc.whenDOc.entity.Alergia;
import whenDoc.whenDOc.entity.Consulta;
import whenDoc.whenDOc.entity.Diagnostico;
import whenDoc.whenDOc.entity.Endereco;
import whenDoc.whenDOc.entity.Medication;
import whenDoc.whenDOc.entity.Medico;
import whenDoc.whenDOc.entity.Paciente;
import whenDoc.whenDOc.repository.AllergysRepository;
import whenDoc.whenDOc.repository.PatientRepository;
import whenDoc.whenDOc.service.PacienteService;

import org.junit.Before;

public class PacientTest {

	Paciente patient1;
	
	PacienteService patientService1;
	
	PatientRepository patientRepository1;
	
	Medico medico1;
	
	Alergia allergy1;
		
	AllergysRepository allergyRepository1;
	
	Medication medication1;
	
	Endereco endereco1;
	
	Consulta consulta1;
	
	Diagnostico diagnostico1;
	
	Set<Alergia> setAllergy1;
	
	@Before
	public void createPacient() {
		patient1 = new Paciente("Edson Pelé", 1L, "pelezinhobranco@gmail.com", 
				"maradonaehlixo@gmail.com", "pelemarreta", "888888", "777777", "africano", true);
		patient1.setEndereco(endereco1);
		patientService1.save(patient1);
		patientService1.addAllergy(allergy1.getNome_Alergia(), patient1.getCpf());
	}
	
	@Before
	public void createAllergy() {
		allergy1.setNome_Alergia("À comunistas");
		allergy1.setPaciente(patient1);
		allergyRepository1.save(allergy1);

	}
	
	@Before
	public void createMedico() {
		medico1 = new Medico("Dr Damião", 1L, "hemorroida e aids", 1L, "drdamiao@ig.com.br", "hehenaogostodopovo", "9999999");
	}
	
	@Before
	public void createEndereco() {
		endereco1 = new Endereco("Rua dos Bobos", "Bairro bairroso", "0", null, "Rio de Janeiro", "Rio de Janeiro", "Brasil", "58400300");
	}

	@Test
	public void testSavePacient() {
		assertEquals(patientRepository1.findOptionalByEmailAndSenha(patient1.getEmail(), patient1.getSenha()), patient1);
	}
	
	@Test 
	public void testEditPacient() {
		patientService1.editName("Edson Arantes vulgo Pelé", patient1.getCpf());
		assertEquals(patientRepository1.findOptionalByEmailAndSenha(patient1.getEmail(), patient1.getSenha()), patient1);
		
		patientService1.editPassword("pele>maradona", patient1.getCpf());
		assertEquals(patientRepository1.findOptionalByEmailAndSenha(patient1.getEmail(), patient1.getSenha()), patient1);
		
		patientService1.editEmail("pelemoreno@gmail.com", patient1.getCpf());
		assertEquals(patientRepository1.findOptionalByEmailAndSenha(patient1.getEmail(), patient1.getSenha()), patient1);
		
		patientService1.editEmailSec("maratonainferior@gmail.com", patient1.getCpf());
		assertEquals(patientRepository1.findOptionalByEmailAndSenha(patient1.getEmail(), patient1.getSenha()), patient1);
		
		patientService1.editTelefone("777", patient1.getCpf());
		assertEquals(patientRepository1.findOptionalByEmailAndSenha(patient1.getEmail(), patient1.getSenha()), patient1);
		
		patientService1.editTelefoneSec("619", patient1.getCpf());
		assertEquals(patientRepository1.findOptionalByEmailAndSenha(patient1.getEmail(), patient1.getSenha()), patient1);
		
		patientService1.editTipoSanguineo("o+", patient1.getCpf());
		assertEquals(patientRepository1.findOptionalByEmailAndSenha(patient1.getEmail(), patient1.getSenha()), patient1);
	}

}

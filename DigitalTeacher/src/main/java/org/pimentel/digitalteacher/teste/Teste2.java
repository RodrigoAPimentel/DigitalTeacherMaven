package org.pimentel.digitalteacher.teste;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import org.pimentel.digitalteacher.dao.AlunoDAO;
import org.pimentel.digitalteacher.dao.FuncionarioDAO;
import org.pimentel.digitalteacher.dao.ProfessorDAO;
import org.pimentel.digitalteacher.dao.TurmaDAO;
import org.pimentel.digitalteacher.model.Aluno;
import org.pimentel.digitalteacher.model.Funcionario;
import org.pimentel.digitalteacher.model.Professor;
import org.pimentel.digitalteacher.model.Turma;
import org.pimentel.digitalteacher.util.DAOFactory;
import org.pimentel.digitalteacher.util.Documento;
import org.pimentel.digitalteacher.util.Endereco;

public class Teste2 {

	public static void main(String[] args) throws IOException, ParseException {

		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		Date d0 = new Date();
		d0 = formatoData.parse("00/00/0000");
/*******************************************************************************************************************************************/
		Date d1 = new Date();
		d1 = formatoData.parse("01/01/2001");
/*******************************************************************************************************************************************/		
		Date d2 = new Date();
		d2 = formatoData.parse("16/08/1986");	
/*******************************************************************************************************************************************/		
		Date d3 = new Date();
		d3 = formatoData.parse("31/01/2018");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List<String> disciplinas = new ArrayList();
		disciplinas.add("Matematica Basica");
		disciplinas.add("matematica Aplicada");
/*******************************************************************************************************************************************/		
		List<String> disciplinas2 = new ArrayList();
		disciplinas2.add("Portugues Basico");
		disciplinas2.add("Portugues Aplicado");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		BufferedImage imagem = ImageIO.read(new File("C:\\RODRIGO\\PROGRAMAÇÃO\\TEXTURA\\foto.jpg"));
		byte[] im = Util.getImgBytes(imagem);
/*******************************************************************************************************************************************/
		BufferedImage imagem2 = ImageIO.read(new File("C:\\RODRIGO\\PROGRAMAÇÃO\\ICONE\\usuario2.png"));
		byte[] im2 = Util.getImgBytes(imagem2);		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Documento doc1 = new Documento();
		doc1.setCpf("061.754.474-88");
		doc1.setIdentidade("2915851");
		doc1.setCertificadoReservista("12423424");
		doc1.setIdentidade2Via(false);
		doc1.setIdentidadeOrgaoEmissor("SSP/PB");
		doc1.setTituloEleitor("4564646567");
/*******************************************************************************************************************************************/
		Documento doc2 = new Documento();
		doc2.setCpf("697.531.187-08");
		doc2.setIdentidade("098765");
		doc2.setCertificadoReservista("0000000");
		doc2.setIdentidade2Via(true);
		doc2.setIdentidadeOrgaoEmissor("SSDS/PB");
		doc2.setTituloEleitor("55555557");		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Endereco end1 = new Endereco();
		end1.setBairro("Dinamerica");
		end1.setCaixaPostal("345353");
		end1.setCep("58432-888");
		end1.setCidade("Campina Grande");
		end1.setComplemento("Bl S, Ap 302");
		end1.setEmail1("pimentelmsn@hotmail.com");
		end1.setEmail2("");
		end1.setEstado("Paraiba");
		end1.setNumero("115");
		end1.setPais("Brasil");
		end1.setRua("Antonio Jose Santiago");
		end1.setTelefone1("98866-4318");
		end1.setTelefone2("3063-1021");
		end1.setTelefone3("");
/*******************************************************************************************************************************************/
		Endereco end2 = new Endereco();
		end2.setBairro("Bela Vista");
		end2.setCaixaPostal("");
		end2.setCep("58100-000");
		end2.setCidade("Gurjão");
		end2.setComplemento("");
		end2.setEmail1("pimentelmsn@hotmail.com");
		end2.setEmail2("");
		end2.setEstado("Paraiba");
		end2.setNumero("423");
		end2.setPais("Brasil");
		end2.setRua("Genuina Pessoa");
		end2.setTelefone1("3386-1051");
		end2.setTelefone2("");
		end2.setTelefone3("");
/*******************************************************************************************************************************************/
		Endereco end3 = new Endereco();
		end3.setBairro("Donatelo");
		end3.setCaixaPostal(null);
		end3.setCep("60123-567");
		end3.setCidade("Coisa Linda");
		end3.setComplemento("");
		end3.setEmail1("testeemail@algumacoisa.com");
		end3.setEmail2("teste2email@qqcoisa.com");
		end3.setEstado("Estado da Guanabara");
		end3.setNumero("123");
		end3.setPais("Ilusao");
		end3.setRua("Da Laje");
		end3.setTelefone1("8888-0000");
		end3.setTelefone2("7777-9999");
		end3.setTelefone3("1234-5678");
/*******************************************************************************************************************************************/
		List<Endereco> listEnd1 = new ArrayList();
		listEnd1.add(end1);
/*******************************************************************************************************************************************/
		List<Endereco> listEnd2 = new ArrayList();
		listEnd2.add(end2);
/*******************************************************************************************************************************************/
		List<Endereco> listEnd3 = new ArrayList();
		listEnd3.add(end1);
		listEnd3.add(end2);
		listEnd3.add(end3);
/*******************************************************************************************************************************************/
		List<Endereco> listEnd4 = new ArrayList();
/*******************************************************************************************************************************************/
		List<Endereco> listEnd5 = new ArrayList();
		listEnd5.add(end3);
/*******************************************************************************************************************************************/
		List<Endereco> listEnd6 = new ArrayList();
		listEnd6.add(end1);
		listEnd6.add(end2);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		PessoaBean p1 = new PessoaBean();
//		p1.setDataNascimento(d2);
//		p1.setDocumentos(doc1);
//		p1.setEndereco(listEnd6);
//		p1.setEscolaridade("Superior Completo");
//		p1.setEstadoCivil("Casado");
//		p1.setFiliacaoMae("Maria de Lourde A A Pimentel");
//		p1.setFiliacaoPai("Sebatiao Porto Pimentel");
//		p1.setFoto(im);
//		p1.setNaturalidade("Campina Grande");
//		p1.setNome("Rodrigo de Almeida Pimentel");
//		p1.setOutro("");
//		p1.setProfissao("Gerente Comercial");
//		p1.setSexo('M');
//		p1.setStatus(true);
//		p1.setTipoSanguineo("B+");
///*******************************************************************************************************************************************/
//		PessoaBean p2 = new PessoaBean();
//		p2.setDataNascimento(d1);
//		p2.setDocumentos(doc2);
//		p2.setEndereco(listEnd5);
//		p2.setEscolaridade("Ensino Medio");
//		p2.setEstadoCivil("Solteiro");
//		p2.setFiliacaoMae("Joaninha Silva");
//		p2.setFiliacaoPai("Ze das Uvas");
//		p2.setFoto(im2);
//		p2.setNaturalidade("Coxixola");
//		p2.setNome("Zezinho das Uvas Filho");
//		p2.setOutro("");
//		p2.setProfissao("Carpinteiro");
//		p2.setSexo('M');
//		p2.setStatus(true);
//		p2.setTipoSanguineo("AB+");
/*******************************************************************************************************************************************/
//		PessoaBeanDAO p1DAO = new PessoaBeanDAO();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Funcionario f1 = new Funcionario();
		f1.setAlocacao("Administração");
		f1.setDataAdmissao(d1);
		f1.setDataDemisao(null);
		f1.setFuncao("Diretor");
		f1.setMatricula("0123");
//		f1.setPessoa(p1);
		f1.setSalario(1.500);
		
//		f1.setIdPessoa(1);
		f1.setDataNascimento(d2);
		f1.setDocumentos(doc1);
		f1.setEndereco(listEnd6);
		f1.setEscolaridade("Superior Completo");
		f1.setEstadoCivil("Casado");
		f1.setFiliacaoMae("Maria de Lourde A A Pimentel");
		f1.setFiliacaoPai("Sebatiao Porto Pimentel");
		f1.setFoto(im);
		f1.setNaturalidade("Campina Grande");
		f1.setNome("Rodrigo de Almeida Pimentel");
		f1.setOutro("");
		f1.setProfissao("Gerente Comercial");
		f1.setSexo('M');
		f1.setStatus(true);
		f1.setTipoSanguineo("B+");
/*******************************************************************************************************************************************/
		Funcionario f2 = new Funcionario();
		f2.setAlocacao("Professores");
		f2.setDataAdmissao(d3);
		f2.setDataDemisao(null);
		f2.setFuncao("Professor Matematica");
		f2.setMatricula("5678");
//		f2.setPessoa(p2);
		f2.setSalario(1.050);
		
		f2.setDataNascimento(d1);
		f2.setDocumentos(doc2);
		f2.setEndereco(listEnd5);
		f2.setEscolaridade("Ensino Medio");
		f2.setEstadoCivil("Solteiro");
		f2.setFiliacaoMae("Joaninha Silva");
		f2.setFiliacaoPai("Ze das Uvas");
		f2.setFoto(im2);
		f2.setNaturalidade("Coxixola");
		f2.setNome("Zezinho das Uvas Filho");
		f2.setOutro("");
		f2.setProfissao("Carpinteiro");
		f2.setSexo('M');
		f2.setStatus(true);
		f2.setTipoSanguineo("AB+");
/*******************************************************************************************************************************************/
		FuncionarioDAO f1DAO = DAOFactory.funcionarioInstance();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Professor pro1 = new Professor();
		pro1.setDedicacaoExclusiva(true);
		pro1.setDisciplinas(disciplinas);
//		pro1.setFuncionario(f2);
		pro1.setTurmas(null);
		
		pro1.setAlocacao("Administração");
		pro1.setDataAdmissao(d1);
		pro1.setDataDemisao(null);
		pro1.setFuncao("Diretor");
		pro1.setMatricula("01343");
//		pro1.setPessoa(p1);
		pro1.setSalario(1.500);
		
//		pro1.setIdPessoa(1);
		pro1.setDataNascimento(d2);
		pro1.setDocumentos(doc1);
		pro1.setEndereco(listEnd6);
		pro1.setEscolaridade("Superior Completo");
		pro1.setEstadoCivil("Casado");
		pro1.setFiliacaoMae("Maria de Lourde A A Pimentel");
		pro1.setFiliacaoPai("Sebatiao Porto Pimentel");
		pro1.setFoto(im);
		pro1.setNaturalidade("Campina Grande");
		pro1.setNome("Rodrigo de Almeida Pimentel");
		pro1.setOutro("");
		pro1.setProfissao("Gerente Comercial");
		pro1.setSexo('M');
		pro1.setStatus(true);
		pro1.setTipoSanguineo("B+");
/*******************************************************************************************************************************************/
		Professor pro2 = new Professor();
		pro2.setDedicacaoExclusiva(false);
		pro2.setDisciplinas(disciplinas2);
//		pro2.setFuncionario(f2);
		pro2.setTurmas(null);
		
		pro2.setAlocacao("Professores");
		pro2.setDataAdmissao(d3);
		pro2.setDataDemisao(null);
		pro2.setFuncao("Professor Matematica");
		pro2.setMatricula("5678");
//		pro2.setPessoa(p2);
		pro2.setSalario(1.050);
		
		pro2.setDataNascimento(d1);
		pro2.setDocumentos(doc2);
		pro2.setEndereco(listEnd5);
		pro2.setEscolaridade("Ensino Medio");
		pro2.setEstadoCivil("Solteiro");
		pro2.setFiliacaoMae("Joaninha Silva");
		pro2.setFiliacaoPai("Ze das Uvas");
		pro2.setFoto(im2);
		pro2.setNaturalidade("Coxixola");
		pro2.setNome("Zezinho das Uvas Filho");
		pro2.setOutro("");
		pro2.setProfissao("Carpinteiro");
		pro2.setSexo('M');
		pro2.setStatus(true);
		pro2.setTipoSanguineo("AB+");
/*******************************************************************************************************************************************/
		ProfessorDAO pro1DAO = new ProfessorDAO();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Aluno al1 = new Aluno();
		al1.setDataDesligamento(null);
		al1.setDataMatricula(d1);
		al1.setMatricula("503");
		al1.setNotas(null);
		al1.setSerie("7");
		al1.setStatusMatricula(true);
		al1.setTurno("noite");
//		al1.setTurma(null);
		
		al1.setDataNascimento(d1);
		al1.setDocumentos(doc2);
		al1.setEndereco(listEnd5);
		al1.setEscolaridade("Ensino Medio");
		al1.setEstadoCivil("Solteiro");
		al1.setFiliacaoMae("Joaninha Silva");
		al1.setFiliacaoPai("Ze das Uvas");
		al1.setFoto(im2);
		al1.setNaturalidade("Coxixola");
		al1.setNome("Zezinho das Uvas Filho");
		al1.setOutro("");
		al1.setProfissao("Carpinteiro");
		al1.setSexo('M');
		al1.setStatus(true);
		al1.setTipoSanguineo("AB+");
/*******************************************************************************************************************************************/
		AlunoDAO alDAO = DAOFactory.alunoDaoInstance();
		
		
/*
 * ******************************************************************************************************************************************
 * ******************************************************************************************************************************************
 * ******************************************************************************************************************************************
 */

//		p1DAO.save(p1);

		
		
//		f1DAO.save(f1);

//		pro1DAO.save(pro1);
//		pro1DAO.save(pro2);

//		System.out.println(f1DAO.findById(3).toString());

//		p1.setIdPessoa(1);

//		p1DAO.update(p1);

//f1DAO.deleteForPK(3);

		Professor pa1 = new Professor();
		pa1.setIdPessoa(1);
		Professor pa2 = new Professor();
		pa2.setIdPessoa(2);
		
		List<Professor> proList1 = new ArrayList();
		proList1.add(pa1);
		proList1.add(pa2);
		
		Turma tur1 = new Turma();
		tur1.setNomeTurma("Turma A");
//		tur1.setProfessores(proList1);
		tur1.setSala("56");
		tur1.setSerie("7");
		tur1.setTurno("Manhã");


		TurmaDAO turDAO = DAOFactory.turmaDaoInstance();
		
//		turDAO.save(tur1);


//		System.out.println(turDAO.findById(1).toString());

		al1.setTurma(tur1);

		alDAO.save(al1);


	}

}

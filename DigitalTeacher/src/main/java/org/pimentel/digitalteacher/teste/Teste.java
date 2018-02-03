//package org.pimentel.digitalteacher.teste;
//
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import javax.imageio.ImageIO;
//
//import org.hibernate.Criteria;
//import org.hibernate.criterion.Restrictions;
//import org.pimentel.digitalteacher.daos.FuncionarioDAO;
//import org.pimentel.digitalteacher.daos.PessoaDAO;
//import org.pimentel.digitalteacher.daos.ProfessorDAO;
//import org.pimentel.digitalteacher.daos.TurmaDAO;
//import org.pimentel.digitalteacher.models.Funcionario;
//import org.pimentel.digitalteacher.models.Pessoa;
//import org.pimentel.digitalteacher.models.Professor;
//import org.pimentel.digitalteacher.utils.DAOFactory;
//import org.pimentel.digitalteacher.utils.DAOGeneric;
//import org.pimentel.digitalteacher.utils.DocumentoBean;
//import org.pimentel.digitalteacher.utils.EnderecoBean;
//
//public class Teste {
//	
//	public static void main(String[] args) throws ParseException, IOException {
//		
//		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//		
//		Date d1 = new Date();
//		d1 = formato.parse("01/01/2001");
//		
//		BufferedImage imagem = ImageIO.read(new File("C:\\RODRIGO\\PROGRAMAÇÃO\\TEXTURA\\foto.jpg"));
//		byte[] im = Util.getImgBytes(imagem);
//		BufferedImage imagem2 = ImageIO.read(new File("C:\\RODRIGO\\PROGRAMAÇÃO\\ICONE\\usuario2.png"));
//		byte[] im2 = Util.getImgBytes(imagem2);
//		
//		DocumentoBean doc1 = new DocumentoBean();
//		doc1.setCpf("061.754.474-88");
//		doc1.setIdentidade("2915851");
//		doc1.setCertificadoReservista("12423424");
//		doc1.setIdentidade2Via(false);
//		doc1.setIdentidadeOrgaoEmissor("SSP/PB");
//		doc1.setTituloEleitor("4564646567");
///*******************************************************************************************************************************************/
//		DocumentoBean doc2 = new DocumentoBean();
//		doc2.setCpf("697.531.187-08");
//		doc2.setIdentidade("098765");
//		doc2.setCertificadoReservista("0000000");
//		doc2.setIdentidade2Via(true);
//		doc2.setIdentidadeOrgaoEmissor("SSDS/PB");
//		doc2.setTituloEleitor("55555557");		
//		EnderecoBean end1 = new EnderecoBean();
//		end1.setBairro("Dinamerica");
//		end1.setCaixaPostal("345353");
//		end1.setCep("58432-888");
//		end1.setCidade("Campina Grande");
//		end1.setComplemento("Bl S, Ap 302");
//		end1.setEmail1("pimentelmsn@hotmail.com");
//		end1.setEmail2("");
//		end1.setEstado("Paraiba");
//		end1.setNumero("115");
//		end1.setPais("Brasil");
//		end1.setRua("Antonio Jose Santiago");
//		end1.setTelefone1("98866-4318");
//		end1.setTelefone2("3063-1021");
//		end1.setTelefone3("");
///*******************************************************************************************************************************************/
//		EnderecoBean end2 = new EnderecoBean();
//		end2.setBairro("Bela Vista");
//		end2.setCaixaPostal("");
//		end2.setCep("58100-000");
//		end2.setCidade("Gurjão");
//		end2.setComplemento("");
//		end2.setEmail1("pimentelmsn@hotmail.com");
//		end2.setEmail2("");
//		end2.setEstado("Paraiba");
//		end2.setNumero("423");
//		end2.setPais("Brasil");
//		end2.setRua("Genuina Pessoa");
//		end2.setTelefone1("3386-1051");
//		end2.setTelefone2("");
//		end2.setTelefone3("");
//		
//		List<EnderecoBean> listEnd = new ArrayList();
//		listEnd.add(end1);
//		listEnd.add(end2);
//		
//		Pessoa p1 = new Pessoa(null,"Rodrigo de A P", d1, "Campina Grande", im, 'M', "B+", "Superior Incompleto", "Gerente", 
//				true, "Maria de Lourde A A Pimentel", "Sebatiao Porto Pimentel", "Casado", "", listEnd, doc1);
//		
//		
//		
//		Pessoa p4 = new Pessoa();
////		p4.setCpf("676.151.596-36");
//		p4.setNome("Joaozinho");
//		
//		PessoaDAO p1DAO = new PessoaDAO();
//		p1DAO.save(p1);
////		p1DAO.save(p2);
////		p1DAO.save(p3);
////		p1DAO.save(p4);
////		p1DAO.deleteForPK(1);
////		p1DAO.delete(p1);
////		p1DAO.findById("0675447433");
////		System.out.println(p1DAO.findById(3).toString());
////		p1DAO.update(p1);
//		
//		
//		
////		List<Pessoa> lp = p1DAO.findStatus(true);		
////		for (Pessoa pessoa : lp) {
////			System.out.println(pessoa.toString());
////		}
//		
////		List<Pessoa> lp = p1DAO.findAll();		
////		for (Pessoa pessoa : lp) {
////			System.out.println(pessoa.toString());
////		}
//		
//		
//		
//		
////		Empresa2 e1 = new Empresa2(null, p1, "Empresa Campinende de Ensino", "Escola ABC", "000.311.222/333-44", "123456", 
////				"7890", d1, "Rua das algarobas", "100", "Floresta", "João Pessoa", "Paraiba", "", im2, "833333-4444", 
////				"escolaabc@asdf.ghj.kl", "", "Joaozinho", true);
////		Empresa2 e2 = new Empresa2(null, p1, "Empresa Campinende de Ensino", "Escola ABC", "010.311.222/333-44", "123456", 
////				"7890", d1, "Rua das algarobas", "100", "Floresta", "João Pessoa", "Paraiba", "", im2, "833333-4444", 
////				"escolaabc@asdf.ghj.kl", "", "Joaozinho", true);
//		
//		
//		FuncionarioDAO f1DAO = new FuncionarioDAO();
//		
//		Funcionario f1 = new Funcionario("01234", "Secretario", 1998.00, d1, null, "Secretaria", p1);
////		Funcionario f2 = new Funcionario("012345", "Auxiliar", 998.00, d1, null, "Cantina", p2);
////		f1DAO.save(f1);
////		f1DAO.save(f2);
////		f2.setCpf("49858586507");
////		f2.setNome("Manezinho");
////		f1DAO.save(f2);
////		f1.setCpf("033.880.338-62");
////		f1DAO.save(f3);
////		System.out.println(f1DAO.findById(9).toString());
////		f1DAO.deleteForPK("06175447433");
//		
////		f1.setCpf("01234567890");
////		f1.setNome("Joazinho");
////		f1.setMatricula("012345");
////		f1.setSalario(998.00);
////		f1.setFuncao("Secreatrio");
////		f1.getCpf();
////		f1.setDataNascimento(d1);
////		f1DAO.save(f1);
////		f1DAO.delete(f1);
////		List<Funcionario> fa = f1DAO.findAll();
////		
////		for (int i = 0; i < fa.size(); i++) {
////			System.out.println(fa.toString());
////		}
//		
//		
//		ProfessorDAO proDao = new ProfessorDAO();
//		
//		List<Professor> professores = null;
//		List<Turma> turmas;
//		List<Turma> turmas2;
//		Professor pro1;
//		Professor pro2;
//		Turma tur1 = null;
//		Turma tur2 = null;
//		
//		List<String> disciplinas = new ArrayList();
//		disciplinas.add("Matematica Basica");
//		disciplinas.add("matematica Aplicada");
//
//		List<String> disciplinas2 = new ArrayList();
//		disciplinas2.add("Portugues Basico");
//		disciplinas2.add("Portugues Aplicado");
//		
//		tur1 = new Turma("turma A", professores, "7", "noite", "45");
//		tur2 = new Turma("Turma B", professores, "5", "manha", "AB");
//		
//		turmas = new ArrayList();
//		turmas.add(tur1);
//		turmas.add(tur2);
//		
//		turmas2 = new ArrayList();
//		turmas2.add(tur1);
//		turmas2.add(tur2);
//
//		pro1 = new Professor(turmas, disciplinas, true, f1);
//		pro2 = new Professor(turmas2, disciplinas2, true, f1);
//		
//		professores = new ArrayList();
//		professores.add(pro1);
//		professores.add(pro2);
//	
//		
//		
//		
//		
//
//		TurmaDAO turDAO = new TurmaDAO();
////		turDAO.save(tur1);
//		
////		proDao.save(pro1);
//		
//		
//		
//		
//		
//		
//
//		
////		proDao.save(pro1);
//		
////		System.out.println(proDao.findById(3).toString());
//		
//		
//		
////		DaoFactory.entityManagerFactorInstance();
//		
//		
//		
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//
//}

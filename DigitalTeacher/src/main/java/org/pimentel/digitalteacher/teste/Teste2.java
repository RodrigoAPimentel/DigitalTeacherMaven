package org.pimentel.digitalteacher.teste;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import javax.imageio.ImageIO;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import org.pimentel.digitalteacher.controller.UsuarioController;
import org.pimentel.digitalteacher.dao.AlunoDAO;
import org.pimentel.digitalteacher.dao.DAOFactory;
import org.pimentel.digitalteacher.model.Aluno;
import org.pimentel.digitalteacher.util.Documento;
import org.pimentel.digitalteacher.util.Endereco;
import org.pimentel.digitalteacher.util.Util;



public class Teste2 {

	
	ArrayList<String> hy = new ArrayList();
	
	
	public static void main(String[] args) throws IOException, ParseException, DocumentException, ClassNotFoundException, SQLException {

		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//		Date d0 = new Date();
//		d0 = formatoData.parse("00/00/0000");
///*******************************************************************************************************************************************/
		Date d1 = new Date();
		d1 = formatoData.parse("01/01/2001");
///*******************************************************************************************************************************************/		
//		Date d2 = new Date();
//		d2 = formatoData.parse("16/08/1986");	
///*******************************************************************************************************************************************/		
//		Date d3 = new Date();
//		d3 = formatoData.parse("31/01/2018");
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		List<String> disciplinas = new ArrayList();
//		disciplinas.add("Matematica Basica");
//		disciplinas.add("matematica Aplicada");
///*******************************************************************************************************************************************/		
//		List<String> disciplinas2 = new ArrayList();
//		disciplinas2.add("Portugues Basico");
//		disciplinas2.add("Portugues Aplicado");
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		BufferedImage imagem = ImageIO.read(new File("C:\\RODRIGO\\PROGRAMAÇÃO\\TEXTURA\\foto.jpg"));
//		byte[] im = Util.getImgBytes(imagem);
///*******************************************************************************************************************************************/
		BufferedImage imagem2 = ImageIO.read(new File("C:\\RODRIGO\\PROGRAMAÇÃO\\ICONE\\usuario2.png"));
		byte[] im2 = Util.getImgBytes(imagem2);		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		Documento doc1 = new Documento();
//		doc1.setCpf("061.754.474-88");
//		doc1.setIdentidade("2915851");
//		doc1.setCertificadoReservista("12423424");
//		doc1.setIdentidade2Via(false);
//		doc1.setIdentidadeOrgaoEmissor("SSP/PB");
//		doc1.setTituloEleitor("4564646567");
///*******************************************************************************************************************************************/
		Documento doc2 = new Documento();
		doc2.setCpf("697.531.187-08");
		doc2.setIdentidade("098765");
		doc2.setCertificadoReservista("0000000");
		doc2.setIdentidade2Via(true);
		doc2.setIdentidadeOrgaoEmissor("SSDS/PB");
		doc2.setTituloEleitor("55555557");		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		Endereco end1 = new Endereco();
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
//		Endereco end2 = new Endereco();
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
///*******************************************************************************************************************************************/
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
///*******************************************************************************************************************************************/
//		List<Endereco> listEnd1 = new ArrayList();
//		listEnd1.add(end1);
///*******************************************************************************************************************************************/
//		List<Endereco> listEnd2 = new ArrayList();
//		listEnd2.add(end2);
///*******************************************************************************************************************************************/
//		List<Endereco> listEnd3 = new ArrayList();
//		listEnd3.add(end1);
//		listEnd3.add(end2);
//		listEnd3.add(end3);
///*******************************************************************************************************************************************/
//		List<Endereco> listEnd4 = new ArrayList();
///*******************************************************************************************************************************************/
		List<Endereco> listEnd5 = new ArrayList();
		listEnd5.add(end3);
///*******************************************************************************************************************************************/
//		List<Endereco> listEnd6 = new ArrayList();
//		listEnd6.add(end1);
//		listEnd6.add(end2);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////		PessoaBean p1 = new PessoaBean();
////		p1.setDataNascimento(d2);
////		p1.setDocumentos(doc1);
////		p1.setEndereco(listEnd6);
////		p1.setEscolaridade("Superior Completo");
////		p1.setEstadoCivil("Casado");
////		p1.setFiliacaoMae("Maria de Lourde A A Pimentel");
////		p1.setFiliacaoPai("Sebatiao Porto Pimentel");
////		p1.setFoto(im);
////		p1.setNaturalidade("Campina Grande");
////		p1.setNome("Rodrigo de Almeida Pimentel");
////		p1.setOutro("");
////		p1.setProfissao("Gerente Comercial");
////		p1.setSexo('M');
////		p1.setStatus(true);
////		p1.setTipoSanguineo("B+");
/////*******************************************************************************************************************************************/
////		PessoaBean p2 = new PessoaBean();
////		p2.setDataNascimento(d1);
////		p2.setDocumentos(doc2);
////		p2.setEndereco(listEnd5);
////		p2.setEscolaridade("Ensino Medio");
////		p2.setEstadoCivil("Solteiro");
////		p2.setFiliacaoMae("Joaninha Silva");
////		p2.setFiliacaoPai("Ze das Uvas");
////		p2.setFoto(im2);
////		p2.setNaturalidade("Coxixola");
////		p2.setNome("Zezinho das Uvas Filho");
////		p2.setOutro("");
////		p2.setProfissao("Carpinteiro");
////		p2.setSexo('M');
////		p2.setStatus(true);
////		p2.setTipoSanguineo("AB+");
///*******************************************************************************************************************************************/
////		PessoaBeanDAO p1DAO = new PessoaBeanDAO();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		Funcionario f1 = new Funcionario();
//		f1.setAlocacao("Administração");
//		f1.setDataAdmissao(d1);
//		f1.setDataDemisao(null);
//		f1.setFuncao("Diretor");
//		f1.setMatricula("0123");
////		f1.setPessoa(p1);
//		f1.setSalario(1.500);
//		
////		f1.setIdPessoa(1);
//		f1.setDataNascimento(d2);
//		f1.setDocumentos(doc1);
//		f1.setEndereco(listEnd6);
//		f1.setEscolaridade("Superior Completo");
//		f1.setEstadoCivil("Casado");
//		f1.setFiliacaoMae("Maria de Lourde A A Pimentel");
//		f1.setFiliacaoPai("Sebatiao Porto Pimentel");
//		f1.setFoto(im);
//		f1.setNaturalidade("Campina Grande");
//		f1.setNome("Rodrigo de Almeida Pimentel");
//		f1.setOutro("");
//		f1.setProfissao("Gerente Comercial");
//		f1.setSexo('M');
//		f1.setStatus(true);
//		f1.setTipoSanguineo("B+");
///*******************************************************************************************************************************************/
//		Funcionario f2 = new Funcionario();
//		f2.setAlocacao("Professores");
//		f2.setDataAdmissao(d3);
//		f2.setDataDemisao(null);
//		f2.setFuncao("Professor Matematica");
//		f2.setMatricula("5678");
////		f2.setPessoa(p2);
//		f2.setSalario(1.050);
//		
//		f2.setDataNascimento(d1);
//		f2.setDocumentos(doc2);
//		f2.setEndereco(listEnd5);
//		f2.setEscolaridade("Ensino Medio");
//		f2.setEstadoCivil("Solteiro");
//		f2.setFiliacaoMae("Joaninha Silva");
//		f2.setFiliacaoPai("Ze das Uvas");
//		f2.setFoto(im2);
//		f2.setNaturalidade("Coxixola");
//		f2.setNome("Zezinho das Uvas Filho");
//		f2.setOutro("");
//		f2.setProfissao("Carpinteiro");
//		f2.setSexo('M');
//		f2.setStatus(true);
//		f2.setTipoSanguineo("AB+");
///*******************************************************************************************************************************************/
//		FuncionarioDAO f1DAO = DAOFactory.funcionarioInstance();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		Professor pro1 = new Professor();
//		pro1.setDedicacaoExclusiva(true);
//		pro1.setDisciplinas(disciplinas);
////		pro1.setFuncionario(f2);
//		pro1.setTurmas(null);
//		
//		pro1.setAlocacao("Administração");
//		pro1.setDataAdmissao(d1);
//		pro1.setDataDemisao(null);
//		pro1.setFuncao("Diretor");
//		pro1.setMatricula("01343");
////		pro1.setPessoa(p1);
//		pro1.setSalario(1.500);
//		
////		pro1.setIdPessoa(1);
//		pro1.setDataNascimento(d2);
//		pro1.setDocumentos(doc1);
//		pro1.setEndereco(listEnd6);
//		pro1.setEscolaridade("Superior Completo");
//		pro1.setEstadoCivil("Casado");
//		pro1.setFiliacaoMae("Maria de Lourde A A Pimentel");
//		pro1.setFiliacaoPai("Sebatiao Porto Pimentel");
//		pro1.setFoto(im);
//		pro1.setNaturalidade("Campina Grande");
//		pro1.setNome("Rodrigo de Almeida Pimentel");
//		pro1.setOutro("");
//		pro1.setProfissao("Gerente Comercial");
//		pro1.setSexo('M');
//		pro1.setStatus(true);
//		pro1.setTipoSanguineo("B+");
///*******************************************************************************************************************************************/
//		Professor pro2 = new Professor();
//		pro2.setDedicacaoExclusiva(false);
//		pro2.setDisciplinas(disciplinas2);
////		pro2.setFuncionario(f2);
//		pro2.setTurmas(null);
//		
//		pro2.setAlocacao("Professores");
//		pro2.setDataAdmissao(d3);
//		pro2.setDataDemisao(null);
//		pro2.setFuncao("Professor Matematica");
//		pro2.setMatricula("5678");
////		pro2.setPessoa(p2);
//		pro2.setSalario(1.050);
//		
//		pro2.setDataNascimento(d1);
//		pro2.setDocumentos(doc2);
//		pro2.setEndereco(listEnd5);
//		pro2.setEscolaridade("Ensino Medio");
//		pro2.setEstadoCivil("Solteiro");
//		pro2.setFiliacaoMae("Joaninha Silva");
//		pro2.setFiliacaoPai("Ze das Uvas");
//		pro2.setFoto(im2);
//		pro2.setNaturalidade("Coxixola");
//		pro2.setNome("Zezinho das Uvas Filho");
//		pro2.setOutro("");
//		pro2.setProfissao("Carpinteiro");
//		pro2.setSexo('M');
//		pro2.setStatus(true);
//		pro2.setTipoSanguineo("AB+");
///*******************************************************************************************************************************************/
//		ProfessorDAO pro1DAO = new ProfessorDAO();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
		al1.setNome("mané");
		al1.setOutro("");
		al1.setProfissao("Carpinteiro");
		al1.setSexo('M');
		al1.setStatus(true);
		al1.setTipoSanguineo("AB+");
///*******************************************************************************************************************************************/
		AlunoDAO alDAO = DAOFactory.alunoDaoInstance();
//		
//		
///*
// * ******************************************************************************************************************************************
// * ******************************************************************************************************************************************
// * ******************************************************************************************************************************************
// */
//
////		p1DAO.save(p1);
//
//		
//		
////		f1DAO.save(f1);
//
////		pro1DAO.save(pro1);
////		pro1DAO.save(pro2);
//
////		System.out.println(f1DAO.findById(3).toString());
//
////		p1.setIdPessoa(1);
//
////		p1DAO.update(p1);
//
////f1DAO.deleteForPK(3);
//
//		Professor pa1 = new Professor();
//		pa1.setIdPessoa(1);
//		Professor pa2 = new Professor();
//		pa2.setIdPessoa(2);
//		
//		List<Professor> proList1 = new ArrayList();
//		proList1.add(pa1);
//		proList1.add(pa2);
//		
//		Turma tur1 = new Turma();
//		tur1.setNomeTurma("Turma A");
////		tur1.setProfessores(proList1);
//		tur1.setSala("56");
//		tur1.setSerie("7");
//		tur1.setTurno("Manhã");
//
//
////		TurmaDAO turDAO = DAOFactory.turmaDaoInstance();
//		
////		turDAO.save(tur1);
//
//
////		System.out.println(turDAO.findById(1).toString());
//
//		al1.setTurma(tur1);
////
//		alDAO.save(al1);
//		
////		System.out.println(DAOFactory.entityManagerFactorInstance());
//		
//		SAXReader reader = new SAXReader();
////		Document doc = reader.read(Teste2.class.getResource("/FXML/teste.xml"));
//		Document doc = reader.read(Teste2.class.getResource("/META-INF/persistence.xml"));
//		
//		Element root = doc.getRootElement();
//		
//		Teste2 t = new Teste2();
//		ArrayList<String> pl = new ArrayList();
//		
//		pl = t.treeWalk(root);
//		
//		for (String string : pl) {
//			System.out.println("090 || " + string.toString());
//		}
		
//		Element root2 = root.element("url");
//		Element root3 = root2.element("loc");
		
//		List list = root.elements();
//		Element j = (Element) list.get(0);
//		String name = j.element("provider").getText();
		
//		System.out.println(name);
		
//		for (Iterator<Attribute> it = root.attributeIterator(); it.hasNext();) {
//			Attribute element = it.next();
//	        System.out.println(element);
//	    }
		
		
		
		
		
//		for (Iterator i = root.elementIterator(); i.hasNext();) {
//	        Element element = (Element) i.next();
//	        
//	        System.out.println("1 = " + element.getName());
//	        
//	        for (Iterator y = element.attributeIterator(); y.hasNext();) {
//		        Attribute attribute = (Attribute) y.next();
//		        System.out.println("2 = " + attribute.getName() + " {} " + attribute.getValue());
//		    }
//	        
//	    }

	  	    
		
		
		
//		Node f = root.node(4);
		
//		System.out.println(f.getPath());
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(root3.getNamespace());
		
//		for ( Object studentObj : root.elements()) {
//		    Element studentElement = (Element) studentObj;
//		    System.out.println("---------");
//		    System.out.println("Nome: "+studentElement.element("nome").getText());
//		   
//		    System.out.println("Nota 3: "+studentElement.element("casa").getText());
//		}
		
//		
//		List<Node> list = doc.selectNodes("//foo/bar");
//
//	    Node node = doc.selectSingleNode("/url");

//	    String name = node.valueOf("@name");
		
		
//		System.out.println(node.);

//		System.out.println(testaConexao());
		
		
		
		
		
//		Element mm = Util.auxiliarLerPersistenceXML();
//		
//		Util.lerPersistenceXML(mm);
		
//		ArrayList<String> w = Util.dadosPersistenceXML();
//		
//		
//		for (String string : w) {
//			System.out.println("090 || " + string.toString());
//		}
//		
//		String[] auxDriver = w.get(1).split("=");
//		String driver = auxDriver[1];
//		
//		System.out.println("@@" + driver);
		
		
		
//		System.out.println(Util.testaConexaoBD());
		
		
		
//		Enumeration<NetworkInterface> n = NetworkInterface.getNetworkInterfaces();
//        for (; n.hasMoreElements();)
//        {
//                        NetworkInterface e = n.nextElement();
//                        System.out.println("Interface: " + e.getName());
//                        System.out.println("Interface: " + e.getDisplayName());
//                        System.out.println("Interface: " + e.getIndex());
//                        System.out.println("Interface: " + e.isVirtual());
//                        
//                        Enumeration<InetAddress> a = e.getInetAddresses();
//
//                        String ipLocal = e.getName();
//
//
//                        for (; a.hasMoreElements();)
//                        {
//                                InetAddress addr = a.nextElement();
//                                System.out.println(" 1 " + addr.getHostAddress());
//                                System.out.println(" 2 " + addr.getCanonicalHostName());
//                                System.out.println(" 3 " + addr.getHostName());
//                                System.out.println(" 4 " + addr.isLinkLocalAddress());
//                                System.out.println(" 5 " + addr.getLocalHost());
//                                System.out.println(" 6 " + addr.getLoopbackAddress());
//
//                                
//
//                        }
//
//                        System.out.println("====================================================");
//
//        }
		
//        Prop_Rede();
		
	
//		InetAddress localHost = Inet4Address.getLocalHost();
//		NetworkInterface networkInterface = NetworkInterface.getByInetAddress(localHost);
//		
//		String tipoConexao = null;
//		
//		if (networkInterface.getName().contains("w")) {
//			tipoConexao= "sem fio";
//		}else {
//			
//		}
//		
//		System.out.println("Tipo de conexão: " + tipoConexao);
//		System.out.println("Interface: " + networkInterface.getDisplayName());
//		
//		java.util.List<InterfaceAddress> lista = networkInterface.getInterfaceAddresses();
//		System.out.println("IP: " + lista.get(0).getAddress().getHostAddress());
//		System.out.println("IP: " + lista.get(0).getAddress().getLocalHost().getHostName());
		
		
	
		
		
//		for (int i = 0; i < 20; i++) {
//		    if (InetAddress.getByName("192.168.10." + i).isReachable(1000)){
//		        System.out.println("192.168.10." + i + " - " + true + " == " + InetAddress.getByName("192.168.10." + i).isSiteLocalAddress());
//		    }else {
//		    	System.out.println("192.168.10." + i + " - " + false );
//		    }
//		}
		
		
//		ArrayList<String> bv = Util.getInformacoesRede();
//		
//		for(String inf : bv) {
//			System.out.println(inf);
//		}
		
	
		
//		ConfiguracaoInicial config = new ConfiguracaoInicial();
//		
//		config.setIconeURL("/IMAGENS/ICONES/iconeDT.png");
//		config.setBannerURL("/IMAGENS/ICONES/bannerDT.png");
//		config.setNome("Digital Teacher");
//		config.setPlanoFundoURL("/IMAGENS/TEXTURAS/textura_17.png");
//		config.setSerial("0987654321");
//		config.setVersao("SnapShot");
//		
//		ConfiguracaoInicialDAO configDAO = new ConfiguracaoInicialDAO();
//		configDAO.save(config);
		
//		List<ConfiguracaoInicial> configList = configDAO.findAll();
//		
//		for(ConfiguracaoInicial c : configList) {
//			System.out.println(c.getNome());
//		}
//		
//		ConfiguracaoInicial o = configList.get(configList.size()-2);
//		
//		System.out.println("### " + o.getNome());
		
		
//		Usuario user = new Usuario();
//		UsuarioDAO userDAO = new UsuarioDAO();
//		
//		user.setGrupoAcesso("Diretor");
//		user.setLogin("rodrigo");
//		user.setNivelAcesso(1);
//		user.setSenha("12345");
//		user.setStatus(true);
//		user.setPessoa(al1);
//		
//		userDAO.save(user);
		
		
		UsuarioController userController = new UsuarioController();
		
		System.out.println(userController.logar("guest", "guests"));
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
	
	public static void Prop_Rede()
		    throws UnknownHostException, SocketException
		  {
		    List list = new ArrayList();
		    System.out.println("Obtendo Informacões da Rede:");
		    InetAddress addr = InetAddress.getLocalHost();
		    byte[] ipAddr = addr.getAddress();
		    String hostname = addr.getHostName();
		    System.out.println("Nome do Computador completo: " + hostname);
		    InetAddress localHost = InetAddress.getLocalHost();
		    NetworkInterface networkInterface = NetworkInterface.getByInetAddress(localHost);
		    System.out.println("Placa: " + networkInterface.getDisplayName());
		    try
		    {
		      System.out.println("Rede: " + NetworkInterface.getNetworkInterfaces().nextElement());
		    } catch (SocketException ex) {
//		      Logger.getLogger(Propriedade_sistema.class.getName()).log(Level.SEVERE, null, ex);
		    }
		    try
		    {
		      Enumeration ifaces = NetworkInterface.getNetworkInterfaces();
		      while (ifaces.hasMoreElements()) {
		        NetworkInterface iface = (NetworkInterface)ifaces.nextElement();
		        System.out.println("Obtendo Informacões da interface: " + iface.getName());
		        for (InterfaceAddress address : iface.getInterfaceAddresses())
		        {
		          System.out.println("IP........: " + address.getAddress().toString());
		          Object bc = address.getBroadcast();
		          System.out.println("Broadcast.: " + bc);
		          System.out.println("Máscara...: " + address.getNetworkPrefixLength());
		        }
		      }
		    }
		    catch (SocketException ifaces)
		    {
//		      ex.printStackTrace();
		    }
		  }
	
	
	
public static boolean testaConexao() throws ClassNotFoundException, SQLException, IOException {
 
	
	Connection connection;
    try {
        
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_teacher", "root", "toor"); 
        return true;
    } catch (ClassNotFoundException ex) {
    	ex.getMessage(); 
    } catch (SQLException ex) {
    	ex.getMessage();
    }
    
    return false;
}

@Test
public void tst() throws DocumentException {
	SAXReader reader = new SAXReader();
//	Document doc = reader.read(Teste2.class.getResource("/FXML/teste.xml"));
	Document doc = reader.read(Teste2.class.getResource("/META-INF/persistence.xml"));
	
	Element root = doc.getRootElement();
	treeWalk(root);
}

public ArrayList<String> treeWalk(Element element) {
//	System.out.println(element.getName());
	
    for (int i = 0, size = element.nodeCount(); i < size; i++) {
        Node node = element.node(i);
        
        if (node.valueOf("@value").length() >3) {
        	hy.add(node.valueOf("@name") + " = " + node.valueOf("@value"));
//        	System.out.println(node.valueOf("@name") + " = " + node.valueOf("@value"));
		}
        if (node instanceof Element) {
            treeWalk((Element) node);
            
        }
        else {
            // do something…
        }
    }
    return hy;
}

@Test
public void lerPersistence() throws DocumentException {
	SAXReader reader = new SAXReader();
	Document doc = reader.read(Teste2.class.getResource("/META-INF/persistence.xml"));	
	Element root = doc.getRootElement();
	
	for (int i = 0, size = root.nodeCount(); i < size; i++) {
        Node node = root.node(i);
//        System.out.println(node.valueOf("@name") + " {" + node.valueOf("@value") + "}");
        if (node instanceof Element) {
            treeWalk((Element) node);
            
        }
        else {
            // do something…
        }
    }
	
	for (String string : hy) {
		System.out.println("00 || " + string.toString());
	}
	
}

@Test
public void rt() throws DocumentException {
	SAXReader reader = new SAXReader();
	Document doc = reader.read(Teste2.class.getResource("/META-INF/persistence.xml"));

	List<Node> listas = doc.selectNodes( "//persistence/persistence-unit" );
	for(Node n : listas) {
		System.out.println(n.getName() + "\n" + n.valueOf("@version"));
	}
	System.out.println(listas.size());
	
}




}

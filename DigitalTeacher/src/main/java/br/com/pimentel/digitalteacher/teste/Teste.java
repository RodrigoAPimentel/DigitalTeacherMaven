package br.com.pimentel.digitalteacher.teste;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.xml.crypto.Data;

import br.com.pimentel.digitalteacher.daos.EmpresaDao;
import br.com.pimentel.digitalteacher.daos.PessoaDao;
import br.com.pimentel.digitalteacher.models.Empresa;
import br.com.pimentel.digitalteacher.models.Pessoa;

public class Teste {
	
	public static void main(String[] args) throws ParseException, IOException {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d1 = new Date();
		d1 = formato.parse("16/08/1986");
		
		BufferedImage imagem = ImageIO.read(new File("C:\\RODRIGO\\PROGRAMAÇÃO\\TEXTURA\\foto.jpg"));
		byte[] im = Util.getImgBytes(imagem);
		BufferedImage imagem2 = ImageIO.read(new File("C:\\RODRIGO\\PROGRAMAÇÃO\\ICONE\\usuario2.png"));
		byte[] im2 = Util.getImgBytes(imagem2);
		
		Pessoa p1 = new Pessoa(null, "Rodrigo Pimentel", "067.754.474-33", "2915851", "SSP/PB", false, "Rua Antonio Jose Santiago", 
				"115", "Dinamerica", "Campina Grande", "Paraiba", "Bloco S, Apt 302", d1, "Campina Grande-PB", 
				im, "83988664318", "pimentelmsn@hotmail.com", 'M', "B+", "Superior Incompleto", "Gerente Comercial", true,
				"M. de Lourdes a de A Pimentel", "Sebastião Porto Pimentel", "Casado", "");
		Pessoa p2 = new Pessoa(null, "Rodrigo Pimentel", "077.754.474-33", "2915851", "SSP/PB", false, "Rua Antonio Jose Santiago", 
				"115", "Dinamerica", "Campina Grande", "Paraiba", "Bloco S, Apt 302", d1, "Campina Grande-PB", 
				im, "83988664318", "pimentelmsn@hotmail.com", 'M', "B+", "Superior Incompleto", "Gerente Comercial", true,
				"M. de Lourdes a de A Pimentel", "Sebastião Porto Pimentel", "Casado", "");
		
		Pessoa p3 = new Pessoa(null, "Rodrigo Pimentel", "977.754.474-33", "2915851", "SSP/PB", false, "Rua Antonio Jose Santiago", 
				"115", "Dinamerica", "Campina Grande", "Paraiba", "Bloco S, Apt 302", d1, "Campina Grande-PB", 
				im, "83988664318", "pimentelmsn@hotmail.com", 'M', "B+", "Superior Incompleto", "Gerente Comercial", true,
				"M. de Lourdes a de A Pimentel", "Sebastião Porto Pimentel", "Casado", "");
		
		Pessoa[] pp = {p1};
		
		
		Empresa e1 = new Empresa(null, p1, "Empresa Campinende de Ensino", "Escola ABC", "000.311.222/333-44", "123456", 
				"7890", d1, "Rua das algarobas", "100", "Floresta", "João Pessoa", "Paraiba", "", im2, "833333-4444", 
				"escolaabc@asdf.ghj.kl", "", "Joaozinho", true);
		Empresa e2 = new Empresa(null, p1, "Empresa Campinende de Ensino", "Escola ABC", "010.311.222/333-44", "123456", 
				"7890", d1, "Rua das algarobas", "100", "Floresta", "João Pessoa", "Paraiba", "", im2, "833333-4444", 
				"escolaabc@asdf.ghj.kl", "", "Joaozinho", true);
		
		
		PessoaDao p1DAO = new PessoaDao();
//		p1DAO.save(p3);
		
		EmpresaDao e1DAO = new EmpresaDao();
		e1DAO.save(e1);
		
//		e1DAO.delete(e1);
		
		
//		System.out.println(p1DAO.save(p1));
		
		
		
		
		
		
	}

}

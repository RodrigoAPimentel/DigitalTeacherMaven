package org.pimentel.digitalteacher.teste;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.MaskFormatter;

public class Util {

	public static MaskFormatter mascaraDeTextoCPF() throws ParseException {
		MaskFormatter cpf = new MaskFormatter("##/##/####");
		return cpf;
	}

	public static String procuraArquivo(JPanel container, String extensaoArquivo) {
		String pathArquivo = null;
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("." + extensaoArquivo, extensaoArquivo);
		chooser.setFileFilter(filter);
		chooser.setApproveButtonText("Selecionar");
		int returnVal = chooser.showOpenDialog(container);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			pathArquivo = chooser.getSelectedFile().getAbsolutePath();
		}
		return pathArquivo;
	}

	public static boolean verificarExistenciaAquivo(String caminhoArquivo) {
		File arquivo = new File(caminhoArquivo);
		if (arquivo.exists()) {
			return true;
		}
		return false;
	}

	public static void imprimeErro(String msg, String msgErro) {
		JOptionPane.showMessageDialog(null, msg, "Erro cr�tico", 0);
		System.err.println(msg);
		System.out.println(msgErro);
		System.exit(0);
	}

	public static BufferedImage setImagemDimensao(String caminhoImg, Integer imgLargura, Integer imgAltura) {
		Double novaImgLargura = null;
		Double novaImgAltura = null;
		Double imgProporcao = null;
		Graphics2D g2d = null;
		BufferedImage imagem = null, novaImagem = null;
		try {
			imagem = ImageIO.read(new File(caminhoImg));
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			// Logger.getLogger(ManipularImagem.class.getName()).log(Level.SEVERE, null,
			// ex);
		}
		novaImgLargura = (double) imagem.getWidth();
		novaImgAltura = (double) imagem.getHeight();
		if (novaImgLargura >= imgLargura) {
			imgProporcao = (novaImgAltura / novaImgLargura);
			novaImgLargura = (double) imgLargura;
			novaImgAltura = (novaImgLargura * imgProporcao);
			while (novaImgAltura > imgAltura) {
				novaImgLargura = (double) (--imgLargura);
				novaImgAltura = (novaImgLargura * imgProporcao);
			}
		} else if (novaImgAltura >= imgAltura) {
			imgProporcao = (novaImgLargura / novaImgAltura);
			novaImgAltura = (double) imgAltura;
			while (novaImgLargura > imgLargura) {
				novaImgAltura = (double) (--imgAltura);
				novaImgLargura = (novaImgAltura * imgProporcao);
			}
		}
		novaImagem = new BufferedImage(novaImgLargura.intValue(), novaImgAltura.intValue(), BufferedImage.TYPE_INT_RGB);
		g2d = novaImagem.createGraphics();
		g2d.drawImage(imagem, 0, 0, novaImgLargura.intValue(), novaImgAltura.intValue(), null);

		return novaImagem;
	}

	public static BufferedImage setImagemDimensao(BufferedImage imagem, Integer imgLargura, Integer imgAltura) {
		Double novaImgLargura = null;
		Double novaImgAltura = null;
		Double imgProporcao = null;
		Graphics2D g2d = null;
		BufferedImage novaImagem = null;

		novaImgLargura = (double) imagem.getWidth();
		novaImgAltura = (double) imagem.getHeight();
		if (novaImgLargura >= imgLargura) {
			imgProporcao = (novaImgAltura / novaImgLargura);
			novaImgLargura = (double) imgLargura;
			novaImgAltura = (novaImgLargura * imgProporcao);
			while (novaImgAltura > imgAltura) {
				novaImgLargura = (double) (--imgLargura);
				novaImgAltura = (novaImgLargura * imgProporcao);
			}
		} else if (novaImgAltura >= imgAltura) {
			imgProporcao = (novaImgLargura / novaImgAltura);
			novaImgAltura = (double) imgAltura;
			while (novaImgLargura > imgLargura) {
				novaImgAltura = (double) (--imgAltura);
				novaImgLargura = (novaImgAltura * imgProporcao);
			}
		}
		novaImagem = new BufferedImage(novaImgLargura.intValue(), novaImgAltura.intValue(), BufferedImage.TYPE_INT_RGB);
		g2d = novaImagem.createGraphics();
		g2d.drawImage(imagem, 0, 0, novaImgLargura.intValue(), novaImgAltura.intValue(), null);

		return novaImagem;
	}

	public static byte[] getImgBytes(BufferedImage image) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			ImageIO.write(image, "JPEG", baos);
		} catch (IOException ex) {
		}
		return baos.toByteArray();
	}

	public static BufferedImage getImgBuffered(byte[] image) {

		InputStream input = new ByteArrayInputStream(image);
		try {
			BufferedImage imagem = ImageIO.read(input);
			return imagem;
		} catch (IOException ex) {
		}
		return null;
	}

	public static void exibiImagemLabel(byte[] minhaimagem, javax.swing.JLabel label) {
		if (minhaimagem != null) {
			InputStream input = new ByteArrayInputStream(minhaimagem);
			try {
				BufferedImage imagem = ImageIO.read(input);
				label.setIcon(new ImageIcon(imagem));
			} catch (IOException ex) {
			}
		} else {
			label.setIcon(null);
		}
	}

	public static void relogio(final JLabel label) {
		new Thread() {
			@Override
			public void run() {
				while (true) {
					java.util.Date d = new Date();
					String data = java.text.DateFormat.getDateInstance(DateFormat.FULL).format(d);
					String hora = new SimpleDateFormat("HH:mm:ss").format(new Date());
					label.setText(data + "  [" + hora + "]");
					try {
						sleep(1000);
					} catch (Exception e) {
					}
				}
			}
		}.start();
	}

	public static String getHostIP() throws UnknownHostException {
		String a = InetAddress.getLocalHost().getHostName() + " [" + InetAddress.getLocalHost().getHostAddress() + "]";
		return a;
	}

//	public static String getServidorIP() throws IOException {
//		String url = ConfiguracaoBD.getURL();
//		String ip = url.substring(url.indexOf("/") + 2, url.lastIndexOf(":"));
//		String porta = url.substring(url.lastIndexOf(":") + 1, url.lastIndexOf("/"));
//		return ip + ":" + porta;
//	}
//
//	public static String getServidorStatus() throws ClassNotFoundException, SQLException, IOException {
//		Boolean status = ConexaoBD.testaConexao();
//		if (status) {
//			return "ON";
//		}
//		return "OFF";
//	}

}

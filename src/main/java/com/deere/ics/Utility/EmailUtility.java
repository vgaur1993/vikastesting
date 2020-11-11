package com.deere.ics.Utility;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailUtility {
	public static void sendPDFReportByJohndeere(String from, String pass, String to, String subject, String body) {
        
		Properties props = System.getProperties();

		String host = "mail.dx.deere.com";

		props.put("mail.smtp.starttls.enable", "true");

		props.put("mail.smtp.host", host);

		props.put("mail.smtp.user", "GaurVikas@johndeere.com");

		props.put("mail.smtp.password", "Matoshreem39");

		props.put("mail.smtp.port", "25");

		props.put("mail.smtp.auth", "true");
		try {
		
		Session session = Session.getDefaultInstance(props);

		MimeMessage message = new MimeMessage(session);

		

		  //Set from address

		message.setFrom(new InternetAddress(from));
 
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

		//Set subject

		message.setSubject("ICS Automation Report");

		message.setText("Please Find The Attached Report File for ICS_Decommision functionality Testcases");

		BodyPart objMessageBodyPart = new MimeBodyPart();

		objMessageBodyPart.setText("Please Find The Attached Report File");

		Multipart multipart = new MimeMultipart();

		multipart.addBodyPart(objMessageBodyPart);

		objMessageBodyPart = new MimeBodyPart();

		//Set path to the html report file

		//String filename = System.getProperty("user.dir")+"\\index.html";
		String filename = "testReport.html";		
		//Create data source to attach the file in mail

		FileDataSource source = new FileDataSource(filename);

		objMessageBodyPart.setDataHandler(new DataHandler(source));

		objMessageBodyPart.setFileName(filename);

		multipart.addBodyPart(objMessageBodyPart);

		message.setContent(multipart);

		Transport transport = session.getTransport("smtp");

		transport.connect(host, from, pass);

		transport.sendMessage(message, message.getAllRecipients());
        System.out.println("done!");
		transport.close();

		}

		catch (AddressException ae) {

		ae.printStackTrace();

		}

		catch (MessagingException me) {

		me.printStackTrace();

		}

	 
	} 


  } 




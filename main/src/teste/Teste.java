/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.jdom2.Element;
import org.jdom2.Document;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author j-vit
 */
public class Teste {

    public static void main(String[] args) {
        Element agenda = new Element("Agenda");
        Document myDocument = new Document(agenda);
        //atribuindo os valores a tag contato
        Element contato = new Element("Contato");
        contato.setAttribute("id", "123");
        Element nome = new Element("nome");
        nome.setText("joovit");
        Element fone = new Element("fone");
        fone.setText("123-456");
        Element endereco = new Element("endereco");
        endereco.setText("Av. Boa Vista");
        Element email = new Element("email");
        email.setText("email@teste.com.br");
        //adicionando os elementos pertencentes a tag contato
        contato.addContent(nome);
        contato.addContent(fone);
        contato.addContent(endereco);
        contato.addContent(email);

        //adicionando a tag contato na agenda
        agenda.addContent(contato);

        //imprimindo o arquivo criado 
        XMLOutputter xout = new XMLOutputter();
        try {
            FileWriter arquivo = new FileWriter(new File("C://Users//j-vit//agenda.xml"));
            xout.output(myDocument, arquivo);
        } catch (IOException e) {

        }

    }

}

package ru.vladislav;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class XMLParser {
    private static final String UNSUCCESSFUL_QUERY = "false";
    private static final String EXCEPTION_MESSAGE = "exception";


    public static String main(String[] args) {
        try {
            String string = "<?xml version=\"1.0\" encoding=\"utf-8\"?><recognitionResults success=\"1\"> " +
                    "<variant confidence=\"0.13\">пошел &lt;censored&gt;</variant>" +
                    " <variant confidence=\"0.15\">пошел на &lt;censored&gt;</variant></recognitionResults>";

            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new InputSource(new ByteArrayInputStream(string.getBytes("utf-8"))));
            doc.getDocumentElement().normalize();

            int successResult = Integer.parseInt(doc.getDocumentElement().getAttribute("success"));

            NodeList nList = doc.getElementsByTagName("variant");
            String outputQuery;
            if (successResult == 1) {
                Node nNode = nList.item(0);
                outputQuery = nNode.getTextContent();
                System.out.println(outputQuery);
            } else {
                return UNSUCCESSFUL_QUERY;
            }

            return outputQuery;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return EXCEPTION_MESSAGE;
    }
}

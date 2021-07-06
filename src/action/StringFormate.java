package action;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
//import com.sun.org.apache.xml.internal.serialize.OutputFormat;
//import com.sun.org.apache.xml.internal.serialize.XMLSerializer;

import org.apache.xml.serialize.OutputFormat; //xerces-1.4.4.jar
import org.apache.xml.serialize.XMLSerializer;

import java.lang.Object.*;
//import org.apache.xml.serialize.OutputFormat;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public class StringFormate {

//    ------------------------------------------------ XML --------------------------------------------------
    public String format(String unformattedXml) {
        try {
            final Document document = parseXmlFile(unformattedXml);

            OutputFormat format = new OutputFormat(document);
            format.setLineWidth(65);
            format.setIndenting(true);
            format.setIndent(2);
            Writer out = new StringWriter();
            XMLSerializer serializer = new XMLSerializer(out, format);
            serializer.serialize(document);

            return out.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Document parseXmlFile(String in) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(in));
            return db.parse(is);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String XMLFormate(String textStr){  // main function for XML || Send String to Here
    	String xmlResult = new StringFormate().format(textStr);
    	return xmlResult;
    }

//    ------------------------------------------------ JSON -------------------------------------------------
    
    public static String JSONFormate(Object textStr) {	
    	String jsonResult = ""; 
    	
    	if (textStr.getClass().getName().equals("org.json.JSONObject")){    // JSON Obj to Beauty formate
    		Gson gson = new GsonBuilder().setPrettyPrinting().create();
			JsonParser jp = new JsonParser();
			jsonResult = gson.toJson(jp.parse(String.valueOf(textStr)));
			
    	} else {		// Obj from stub to Beauty formate
    		Gson gson = new Gson();
    		String jsonReq = gson.toJson(textStr); 
    		
    		gson = new GsonBuilder().setPrettyPrinting().create();
    		JsonParser jp = new JsonParser();
    		JsonElement je = jp.parse(jsonReq);
    		jsonResult = gson.toJson(je);
    	}
    	
    	return jsonResult;
    }
}
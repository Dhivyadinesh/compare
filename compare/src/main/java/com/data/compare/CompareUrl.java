package com.data.compare;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

public class CompareUrl extends HttpServlet {
	
	public void service(ServletRequest req,ServletResponse res) throws IOException {
		res.setContentType("text/html");
		String our=req.getParameter("oursiteurl");
		String gsm=req.getParameter("gsmsiteurl");
		res.getWriter().print(our+"---"+gsm);

		Document doc = Jsoup.connect(gsm).get();
        Elements elements = doc.getElementsByClass("specs-phone-name-title");
        for (Element element : elements) {
            String data = element.text();
            System.out.println(data);
			res.getWriter().print(data);
        }
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp;

import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nitroman
 */
@WebServlet(urlPatterns = "/catalog", description = "SampleText", displayName = "displayName")
public class MyServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        //PrintWriter pw = resp.getWriter();


        Connection c1 = null;
        Statement s1 = null;
        ResultSet r1 = null;

        try {

            ArrayList<ObjectDetail> items = new ArrayList<>();

            Class.forName("org.h2.Driver");

            c1 = DriverManager.getConnection("jdbc:h2:~\\test", "sa", "");

            s1 = c1.createStatement();

            r1 = s1.executeQuery("select * from CATALOG");

            while (r1.next()) {
                ObjectDetail e = new ObjectDetail();
                e.setId_object(r1.getInt("ID_OBJECT"));
                e.setType(r1.getString("type"));
                e.setName(r1.getString("name"));
                e.setAuthor(r1.getString("author"));
                e.setPublish(r1.getString("publish"));
                e.setDate(r1.getString("date"));
                e.setPages(r1.getString("pages"));
                items.add(e);

            }

            req.getSession().setAttribute("items", items);

            RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.htm");
            rd.forward(req, resp);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyServlet.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (c1 != null) {
                    c1.close();
                }
                if (s1 != null) {
                    s1.close();
                }
                if (r1 != null) {
                    r1.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(MyServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

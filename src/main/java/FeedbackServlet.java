import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.*;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String subject = request.getParameter("subject");
        int rating = Integer.parseInt(request.getParameter("rating"));
        String message = request.getParameter("message");

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO feedback(name, subject, rating, message) VALUES (?, ?, ?, ?)"
            );
            ps.setString(1, name);
            ps.setString(2, subject);
            ps.setInt(3, rating);
            ps.setString(4, message);
            ps.executeUpdate();

            response.sendRedirect("Success.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

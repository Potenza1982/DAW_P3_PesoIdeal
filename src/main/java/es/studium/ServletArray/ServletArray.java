package es.studium.ServletArray;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletArray")
public class ServletArray extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Modelo modelo = new Modelo();

    public ServletArray() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener los valores de altura y peso desde los parámetros
        String alturaStr = request.getParameter("altura");
        String pesoStr = request.getParameter("peso");

        // Convertir los valores a números 
        double altura = Double.parseDouble(alturaStr);
        double peso = Double.parseDouble(pesoStr);

        // Calcular el IMC y obtener el resultado interpretado
        double imc = modelo.calcularIMC(peso, altura);
        String mensajeIMC = modelo.interpretarIMC(imc);

     // Mostrar los resultados en la página web
        response.getWriter().append("<html><head><title>Resultados IMC</title></head><body>");
        response.getWriter().append("<h1>Resultados del Índice de Masa Corporal (IMC)</h1>");
        response.getWriter().append("<p>Su Índice de Masa Corporal (IMC) es: " + String.format("%.2f", imc) + "</p>");
        response.getWriter().append("<p>" + mensajeIMC + "</p>");

        // Añadir el botón de volver
        response.getWriter().append("<form action=\"index.html\"><input type=\"submit\" value=\"Volver\"></form>");

        response.getWriter().append("</body></html>");

    }
}

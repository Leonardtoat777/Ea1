package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import dao.CineDAO;


public class SvlCine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SvlCine() {
        super();

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;chartset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		dao.CineDAO cine = new dao.CineDAO();
		
		Object idCine = request.getParameter("idCine");
		if ( idCine == null ) {
			String [][] mcines = cine.getCines();
			session.setAttribute("id", mcines == null ? null : "4");
			session.setAttribute("mcines",mcines);
		}
		response.sendRedirect("index.jsp");
		
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package mvc;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Servlet implementation class test
 */
@RequestMapping("/Check.jsp")
public class test extends HttpServlet {
	private String teacher = "张三";
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public test() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // 设置编码
		response.setCharacterEncoding("utf-8"); // 设置编码
		String name = request.getParameter("username"); // 得到前面的值
		String username = URLDecoder.decode(name, "utf-8"); // 对URL进行编码
		String url = "";
		if (teacher.equals(username.trim())) {
			url = "image/false.png";
		} else {
			url = "image/true.png";
		}
		// 返回路径
		response.getWriter().println(url);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}



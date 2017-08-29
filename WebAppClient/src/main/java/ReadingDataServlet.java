import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imcs.bonus.dao.EmployeeDAOImpl;
import com.imcs.bonus.pojo.Employee;

@WebServlet("/readingDataServlet")
public class ReadingDataServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// read form fields
		Integer empNo = Integer.parseInt(request.getParameter("empNo"));
		EmployeeDAOImpl daoObject = new EmployeeDAOImpl();
		Employee employee = daoObject.getEmployeeByNo(empNo);		
		System.out.println("emploee :" + employee.toString());

		// do some processing here...

		//
		request.setAttribute("employee", employee);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("EmpInfo.jsp");
		requestDispatcher.forward(request, response);

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer deptNo = Integer.parseInt(request.getParameter("deptNo"));
		List<Employee> empList = new ArrayList<Employee>();
		EmployeeDAOImpl daoObject = new EmployeeDAOImpl();
		empList = daoObject.getEmployeesByJoining(deptNo);		
		System.out.println("emploee in DEP:" + empList.toString());
		
		//
		request.setAttribute("listEmps", empList);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("DeptEmpInfo.jsp");
		requestDispatcher.forward(request, response);
	}

}

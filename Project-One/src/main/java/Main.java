import com.models.Employee_Info;
import com.persistence.EmployeeInfoDAO;
import com.utils.ConnectionManager;

public class Main {
    public static void main(String[] args) {
        // This creates the connection
        //ConnectionManager.getConnection();

EmployeeInfoDAO employeeInfoDAO = new EmployeeInfoDAO();
Employee_Info employeeInfo = employeeInfoDAO.read(1);
        System.out.println(employeeInfo.getEmail());


    }
}

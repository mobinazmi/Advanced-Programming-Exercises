public class EmployeeService {
    private EmployeeService(){}
    private static EmployeeService employeeService=new EmployeeService();
    public static EmployeeService getInstance(){
        return employeeService;
    }
    public void save(EmployeeEntityBuilder employeeEntityBuilder) throws Exception{
        try (EmployeeRepository employeeRepository=new EmployeeRepository()){
            employeeRepository.insert(employeeEntityBuilder);
        }
    }
}

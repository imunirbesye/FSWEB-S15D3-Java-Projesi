package tr.com.workintech.company;

import java.util.*;

public class Main {
    private static List<Employee> employees = new LinkedList<>();

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Münir", "BESYE");
        Employee e2 = new Employee(2, "Münir", "BESYE");
        Employee e3 = new Employee(3, "Münir", "BESYE");
        Employee e4 = new Employee(1, "Münir", "BESYE");
        Employee e5 = new Employee(3, "Münir", "BESYE");
        Employee e6 = new Employee(4, "Münir", "BESYE");
        Employee e7 = new Employee(4, "Münir", "BESYE");
        Employee e8 = new Employee(2, "Münir", "BESYE");
        Employee e9 = new Employee(5, "Münir", "BESYE");
        Employee e10 = new Employee(7, "Münir", "BESYE");
        Employee e11 = new Employee(8, "Münir", "BESYE");

        employees.addAll(List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11));

        System.out.println(uniqueEmployees());

        System.out.println("-----------------------------");
        System.out.println(employees);
        System.out.println(sameEmployees());
        System.out.println(employees);


    }

    public static List<Employee> sameEmployees() {
        List<Employee> result = new LinkedList<>();

        Iterator<Employee> i1 = employees.iterator();

        while(i1.hasNext()){
            Employee e = i1.next();
            int index = employees.indexOf(e);

            for(int i = 0; i < employees.size(); i++) {
                if(e.getId() == employees.get(i).getId() && i != index){
                    result.add(e);
                    i1.remove();
                }
            }
        }

        return result;
    }

    public static Map<Long, Employee> uniqueEmployees() {
        Map<Long, Employee> result = new HashMap<>();

        Iterator<Employee> i1 = employees.iterator();

        while(i1.hasNext()){
            Employee e = i1.next();
            int index = employees.indexOf(e);
            boolean r = false;

            for(int i = 0; i < employees.size(); i++) {
                if(e.getId() == employees.get(i).getId() && i != index){
                    r = true;
                }
            }

            if(!r) result.put(e.getId(), e);
        }

        return result;
    }

}

package com.example;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab {

    private List<Employee> employees = Arrays.asList(
            new Employee("Bezos, Jeff", LocalDate.of(2004, 4, 2), 68_109.00, "Male"),
            new Employee("Sheryl Sandberg", LocalDate.of(2014, 7, 1), 87_846.00,"Female"),
            new Employee("Buffet, Warren", LocalDate.of(2011, 7, 23), 95_035.00, "Male"),
            new Employee("Susan Wojcick", LocalDate.of(2015, 6, 1), 37_210.00, "Female"),
            new Employee("Zuckerberg, Mark", LocalDate.of(2016, 5, 12), 48_450.00, "Male"),
            new Employee("Brin, Sergey", LocalDate.of(2016, 8, 5), 74_416.00, "Male")
    );

    private <T> void printList(List<T> list) {

        employees.forEach(System.out::print);
    }

    @Test
    public void getEmployeesOver50k() {
        List<Employee> employeesOver50k =
                employees.stream()
                        .filter(e -> e.getSalary() >= 50_000)
                        .collect(Collectors.toList());

//        printList(employeesOver50k);
        System.out.println(employeesOver50k);
    }

    @Test
    public void getEmployeeNamesHiredAfter2012() {
        LocalDate ddate = LocalDate.of(2012, Month.JANUARY, 1);


        List<String> employees = ;
//        printList(employees);


//        LocalDate d = LocalDate.of(2000, Month.JANUARY, 1);
//
//
//
//        System.out.println(d);
    }


    @Test
    public void getMaxSalary() {
        double max = 0;
        System.out.println("Max:" + max);

    }

    @Test
    public void getMinSalary() {
        double min = 0;
        System.out.println("Min:" + min);
    }

    @Test
    public void getAverageSalaries() {
        double averageMale = 0;
        double averageFemale = 0;

        System.out.println("Averages: Male:" + averageMale + " Female:" + averageFemale);
        System.out.println("Averages: Male:" + averageMale + " Female:" + averageFemale);
    }

    @Test
    public void getMaximumPaidEmployee() {
        Employee highest = null;
        System.out.println(highest);
    }
}

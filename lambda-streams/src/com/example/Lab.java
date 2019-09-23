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

        System.out.println(employeesOver50k);
    }

    @Test
    public void getEmployeeNamesHiredAfter2012() {
        LocalDate startDate = LocalDate.of(2012, Month.JANUARY, 1);
        List<Employee> employeesAfter2012 = employees.stream()
                .filter(e -> e.getHireDate().isAfter(startDate) || e.getHireDate().equals(startDate))
                .collect(Collectors.toList());

        System.out.println("Employees hired after 2012:");
        System.out.println(employeesAfter2012);

    }


    @Test
    public void getMaxSalary() {
        double max = employees.stream().mapToDouble(Employee::getSalary).max().orElse(0);


        System.out.println("Max:" + max);

    }

    @Test
    public void getMinSalary() {
        double min = employees.stream().mapToDouble(Employee::getSalary).min().orElse(0);
        System.out.println("Min:" + min);
    }

    @Test
    public void getAverageSalaries() {
        double averageMale = employees.stream().filter(e -> e.getGender() == "Male").mapToDouble(Employee::getSalary).average().orElse(0);
        double averageFemale = employees.stream().filter(e -> e.getGender() == "Female").mapToDouble(Employee::getSalary).average().orElse(0);

        System.out.println("Averages: Male:" + averageMale + " Female:" + averageFemale);
    }

    @Test
    public void getMaximumPaidEmployee() {
        Employee highest = employees.stream().reduce((a,b) -> a.getSalary() > b.getSalary() ? a : b).get();
        System.out.println(highest);
    }
}

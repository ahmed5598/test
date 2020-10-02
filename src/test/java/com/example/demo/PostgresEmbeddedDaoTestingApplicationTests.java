//package com.example.demo;
//import java.util.Random;
//
//import com.example.demo.model.Employee;
//import com.example.demo.repository.EmployeeRepository;
//import org.junit.Assert;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.jdbc.Sql;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//
//@ExtendWith(SpringExtension.class)
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {DbConfig.class})
//@ActiveProfiles("DaoTest")
//@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:dao/TestData.sql")
//public class PostgresEmbeddedDaoTestingApplicationTests {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Test
//    public void contextLoads() {
//
//        employeeRepository.save(new Employee("ahmed", "mo", "d"
//        ));
//
//        Assert.assertTrue(employeeRepository.findByFirstNameStartingWith("ah") != null);
//    }
//
//
//}
package com.pfa.app.model.dto;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.pfa.app.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EmployeeDto_getSalary_129927487117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7606;

    public EmployeeDto_getSalary_129927487117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7606 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term7606, term7606.getClass(), "employeeId", "UimMMORkzd");
        setField(term7606, term7606.getClass(), "firstName", "huVIXUWLtI");
        setField(term7606, term7606.getClass(), "lastName", "vhKzFyKPOT");
        setField(term7606, term7606.getClass(), "email", "nQhIgWXdRc");
        setField(term7606, term7606.getClass(), "phone", "EusenEbIoF");
        setField(term7606, term7606.getClass(), "hiredate", "SScVQYSvWH");
        setField(term7606, term7606.getClass(), "job", "MnovcqFhCl");
        setField(term7606, term7606.getClass(), "salary", "qYtAeLzOhW");
        setField(term7606, term7606.getClass(), "managerId", "tJzmOfcUnY");
        setField(term7606, term7606.getClass(), "username", "TKlccZUpjz");
        setField(term7606, term7606.getClass(), "password", "GGzwMoHZXC");
        setField(term7606, term7606.getClass(), "role", "IpmgwHTgnG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSalary", argTypes, term7606, args);
    }

};



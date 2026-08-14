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

public class EmployeeDto_setEmail_204031272110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5663;

    public EmployeeDto_setEmail_204031272110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5663 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term5663, term5663.getClass(), "employeeId", "hePqROaplw");
        setField(term5663, term5663.getClass(), "firstName", "PJcSNDruWd");
        setField(term5663, term5663.getClass(), "lastName", "VVNNlAePXF");
        setField(term5663, term5663.getClass(), "email", "jnwVnmKAFv");
        setField(term5663, term5663.getClass(), "phone", "TXyHhqeCjR");
        setField(term5663, term5663.getClass(), "hiredate", "lZIgPZPgTu");
        setField(term5663, term5663.getClass(), "job", "iuCxnHGMoW");
        setField(term5663, term5663.getClass(), "salary", "GPSEWEDSTo");
        setField(term5663, term5663.getClass(), "managerId", "RCOqfVsRHt");
        setField(term5663, term5663.getClass(), "username", "TSyCeEZPaT");
        setField(term5663, term5663.getClass(), "password", "JeZFtaqkzW");
        setField(term5663, term5663.getClass(), "role", "vOVuNSCCLe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fzeqPnzpnt";
        callMethod(klass, "setEmail", argTypes, term5663, args);
    }

};



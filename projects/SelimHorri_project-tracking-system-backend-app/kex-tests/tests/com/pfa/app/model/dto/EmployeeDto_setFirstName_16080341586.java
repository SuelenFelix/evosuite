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

public class EmployeeDto_setFirstName_16080341586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4559;

    public EmployeeDto_setFirstName_16080341586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4559 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term4559, term4559.getClass(), "employeeId", "uPuCVuZYOI");
        setField(term4559, term4559.getClass(), "firstName", "TweMFhxNdj");
        setField(term4559, term4559.getClass(), "lastName", "NBrvVzvQHe");
        setField(term4559, term4559.getClass(), "email", "FjOiNAfBOc");
        setField(term4559, term4559.getClass(), "phone", "iCCsaLHohG");
        setField(term4559, term4559.getClass(), "hiredate", "NJhGgctbdj");
        setField(term4559, term4559.getClass(), "job", "MYWYUeLGOp");
        setField(term4559, term4559.getClass(), "salary", "tsTGdgQYUL");
        setField(term4559, term4559.getClass(), "managerId", "TtGbVmKcnX");
        setField(term4559, term4559.getClass(), "username", "GJVkUrCVdD");
        setField(term4559, term4559.getClass(), "password", "zNdorvdUgu");
        setField(term4559, term4559.getClass(), "role", "oPxuZbkYio");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vKitydDVnM";
        callMethod(klass, "setFirstName", argTypes, term4559, args);
    }

};



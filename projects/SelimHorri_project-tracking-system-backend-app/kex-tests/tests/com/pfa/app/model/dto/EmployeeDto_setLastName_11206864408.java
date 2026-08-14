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

public class EmployeeDto_setLastName_11206864408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5111;

    public EmployeeDto_setLastName_11206864408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5111 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term5111, term5111.getClass(), "employeeId", "DzHVBMqWtE");
        setField(term5111, term5111.getClass(), "firstName", "THZSpzBRYP");
        setField(term5111, term5111.getClass(), "lastName", "ZfBIVGBQOE");
        setField(term5111, term5111.getClass(), "email", "QSrDQfEsTR");
        setField(term5111, term5111.getClass(), "phone", "PsqusYmejD");
        setField(term5111, term5111.getClass(), "hiredate", "NTWMiBEaDF");
        setField(term5111, term5111.getClass(), "job", "SPBstwKFVr");
        setField(term5111, term5111.getClass(), "salary", "WxYUTuqmIq");
        setField(term5111, term5111.getClass(), "managerId", "OeQLvhVERT");
        setField(term5111, term5111.getClass(), "username", "IlvgFINwIa");
        setField(term5111, term5111.getClass(), "password", "GEJABPlHSI");
        setField(term5111, term5111.getClass(), "role", "aQFUvuaYxd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zNFLXMifnS";
        callMethod(klass, "setLastName", argTypes, term5111, args);
    }

};



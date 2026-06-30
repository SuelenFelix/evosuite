package com.hamitmizrak.business.dto;

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
import static com.hamitmizrak.business.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class EmployeeDto_EmployeeDtoBuilder_id_10006203321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;
     Object term178;

    public EmployeeDto_EmployeeDtoBuilder_id_10006203321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term140 = new Long(-8257434502486459194L);
        term139 = newInstance(Class.forName("com.hamitmizrak.business.dto.EmployeeDto$EmployeeDtoBuilder"));
        setField(term139, term139.getClass(), "id", term140);
        setField(term139, term139.getClass(), "firstName", "SzjVpOQTyS");
        setField(term139, term139.getClass(), "lastName", "MjGYSRKTNF");
        setField(term139, term139.getClass(), "emailId", "hRNSzYYIrc");
        term178 = new Long(-8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.business.dto.EmployeeDto$EmployeeDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term178;
        callMethod(klass, "id", argTypes, term139, args);
    }

};



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

public class EmployeeDto_getJob_94163291215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7054;

    public EmployeeDto_getJob_94163291215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7054 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term7054, term7054.getClass(), "employeeId", "dkZFDZxcde");
        setField(term7054, term7054.getClass(), "firstName", "WXcZEtUKlI");
        setField(term7054, term7054.getClass(), "lastName", "IkpjUOuWQU");
        setField(term7054, term7054.getClass(), "email", "boSSpezHeU");
        setField(term7054, term7054.getClass(), "phone", "OUeBWNTQDh");
        setField(term7054, term7054.getClass(), "hiredate", "gltJarNuUk");
        setField(term7054, term7054.getClass(), "job", "ZwZIDwYcSW");
        setField(term7054, term7054.getClass(), "salary", "sOdkipUKRu");
        setField(term7054, term7054.getClass(), "managerId", "oKwCDqywym");
        setField(term7054, term7054.getClass(), "username", "zjZYTddemL");
        setField(term7054, term7054.getClass(), "password", "QtrylgCLiF");
        setField(term7054, term7054.getClass(), "role", "orEuhCStGM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJob", argTypes, term7054, args);
    }

};



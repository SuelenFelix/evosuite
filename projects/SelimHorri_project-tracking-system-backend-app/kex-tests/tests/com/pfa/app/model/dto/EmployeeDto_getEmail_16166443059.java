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

public class EmployeeDto_getEmail_16166443059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5398;

    public EmployeeDto_getEmail_16166443059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5398 = newInstance(Class.forName("com.pfa.app.model.dto.EmployeeDto"));
        setField(term5398, term5398.getClass(), "employeeId", "HHQcYMSBVc");
        setField(term5398, term5398.getClass(), "firstName", "wdoqITnaAP");
        setField(term5398, term5398.getClass(), "lastName", "rIPMBcrNqB");
        setField(term5398, term5398.getClass(), "email", "UDaboHZHhz");
        setField(term5398, term5398.getClass(), "phone", "nRvKihUSPj");
        setField(term5398, term5398.getClass(), "hiredate", "BbNeQJpYPr");
        setField(term5398, term5398.getClass(), "job", "riMtzCoxNj");
        setField(term5398, term5398.getClass(), "salary", "YAXkVjQZcV");
        setField(term5398, term5398.getClass(), "managerId", "pumvwBWvpy");
        setField(term5398, term5398.getClass(), "username", "HwLHeGLyhe");
        setField(term5398, term5398.getClass(), "password", "RDnkgWkcbz");
        setField(term5398, term5398.getClass(), "role", "IBpaxltauX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.dto.EmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term5398, args);
    }

};



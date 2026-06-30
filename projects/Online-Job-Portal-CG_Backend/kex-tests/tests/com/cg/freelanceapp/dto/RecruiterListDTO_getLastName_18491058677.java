package com.cg.freelanceapp.dto;

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
import static com.cg.freelanceapp.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class RecruiterListDTO_getLastName_18491058677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3537;

    public RecruiterListDTO_getLastName_18491058677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3538 = new Long(-2585684163342970173L);
        term3537 = newInstance(Class.forName("com.cg.freelanceapp.dto.RecruiterListDTO"));
        setField(term3537, term3537.getClass(), "id", term3538);
        setField(term3537, term3537.getClass(), "userName", "aNWLJdrZMq");
        setField(term3537, term3537.getClass(), "firstName", "HHmNoYxIGj");
        setField(term3537, term3537.getClass(), "lastName", "PtirvZmsGt");
        setField(term3537, term3537.getClass(), "password", "HWkpTmtlrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.RecruiterListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term3537, args);
    }

};



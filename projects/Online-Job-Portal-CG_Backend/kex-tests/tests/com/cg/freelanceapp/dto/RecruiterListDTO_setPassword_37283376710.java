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

public class RecruiterListDTO_setPassword_37283376710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3832;

    public RecruiterListDTO_setPassword_37283376710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3833 = new Long(2486810210675247493L);
        term3832 = newInstance(Class.forName("com.cg.freelanceapp.dto.RecruiterListDTO"));
        setField(term3832, term3832.getClass(), "id", term3833);
        setField(term3832, term3832.getClass(), "userName", "OYbzXylRWW");
        setField(term3832, term3832.getClass(), "firstName", "DSNsTGYXDF");
        setField(term3832, term3832.getClass(), "lastName", "sQvGcVjdEx");
        setField(term3832, term3832.getClass(), "password", "rLHAoqXgPh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.RecruiterListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zUlRdimJtU";
        callMethod(klass, "setPassword", argTypes, term3832, args);
    }

};



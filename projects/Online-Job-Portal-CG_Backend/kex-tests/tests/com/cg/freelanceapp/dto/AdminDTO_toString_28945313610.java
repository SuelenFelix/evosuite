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

public class AdminDTO_toString_28945313610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7367;

    public AdminDTO_toString_28945313610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7367 = newInstance(Class.forName("com.cg.freelanceapp.dto.AdminDTO"));
        setField(term7367, term7367.getClass(), "userName", "IlvgFINwIa");
        setField(term7367, term7367.getClass(), "firstName", "GEJABPlHSI");
        setField(term7367, term7367.getClass(), "lastName", "aQFUvuaYxd");
        setField(term7367, term7367.getClass(), "password", "zNFLXMifnS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.AdminDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7367, args);
    }

};



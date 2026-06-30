package com.alkemy.ong.infrastructure.rest.response.common;

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
import static com.alkemy.ong.infrastructure.rest.response.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PaginationResponse_setTotalPages_4351733125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1065;
     Object term1069;

    public PaginationResponse_setTotalPages_4351733125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1065 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.PaginationResponse"));
        setIntField(term1065, term1065.getClass(), "page", -117576464);
        setIntField(term1065, term1065.getClass(), "size", -1007160944);
        setIntField(term1065, term1065.getClass(), "totalPages", 1135664017);
        term1069 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.common.PaginationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1069;
        callMethod(klass, "setTotalPages", argTypes, term1065, args);
    }

};



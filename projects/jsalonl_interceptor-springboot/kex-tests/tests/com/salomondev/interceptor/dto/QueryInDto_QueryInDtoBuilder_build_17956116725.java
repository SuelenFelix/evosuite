package com.salomondev.interceptor.dto;

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
import static com.salomondev.interceptor.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class QueryInDto_QueryInDtoBuilder_build_17956116725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term631;

    public QueryInDto_QueryInDtoBuilder_build_17956116725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term632 = new Long(8428634514691209827L);
        Long term658 = new Long(-2585684163342970173L);
        term631 = newInstance(Class.forName("com.salomondev.interceptor.dto.QueryInDto$QueryInDtoBuilder"));
        setField(term631, term631.getClass(), "id", term632);
        setField(term631, term631.getClass(), "name", "flxyYxBRtu");
        setField(term631, term631.getClass(), "lastName", "OclPbYPkcH");
        setField(term631, term631.getClass(), "documentNumber", term658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.dto.QueryInDto$QueryInDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term631, args);
    }

};



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

public class QueryInDto_getDocumentNumber_15580051424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285;

    public QueryInDto_getDocumentNumber_15580051424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term286 = new Long(4872422362414183754L);
        Long term312 = new Long(6811161968424632369L);
        term285 = newInstance(Class.forName("com.salomondev.interceptor.dto.QueryInDto"));
        setField(term285, term285.getClass(), "id", term286);
        setField(term285, term285.getClass(), "name", "MxlszYVzRf");
        setField(term285, term285.getClass(), "lastName", "LQFpaHEwXR");
        setField(term285, term285.getClass(), "documentNumber", term312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.dto.QueryInDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDocumentNumber", argTypes, term285, args);
    }

};



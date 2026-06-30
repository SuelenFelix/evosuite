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

public class QueryInDto_getLastName_14833186323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236;

    public QueryInDto_getLastName_14833186323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term237 = new Long(5270370404989704783L);
        Long term263 = new Long(7411271909051562686L);
        term236 = newInstance(Class.forName("com.salomondev.interceptor.dto.QueryInDto"));
        setField(term236, term236.getClass(), "id", term237);
        setField(term236, term236.getClass(), "name", "NRdvgJlhkX");
        setField(term236, term236.getClass(), "lastName", "uuaPigETmJ");
        setField(term236, term236.getClass(), "documentNumber", term263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.dto.QueryInDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term236, args);
    }

};



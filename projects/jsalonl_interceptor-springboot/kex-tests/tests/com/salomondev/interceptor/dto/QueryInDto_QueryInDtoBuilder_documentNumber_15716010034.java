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

public class QueryInDto_QueryInDtoBuilder_documentNumber_15716010034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term580;
     Object term609;

    public QueryInDto_QueryInDtoBuilder_documentNumber_15716010034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term581 = new Long(5127676408959197577L);
        Long term607 = new Long(-6573104506744284592L);
        term580 = newInstance(Class.forName("com.salomondev.interceptor.dto.QueryInDto$QueryInDtoBuilder"));
        setField(term580, term580.getClass(), "id", term581);
        setField(term580, term580.getClass(), "name", "BYqFIqCKAV");
        setField(term580, term580.getClass(), "lastName", "vrQLuWIDJX");
        setField(term580, term580.getClass(), "documentNumber", term607);
        term609 = new Long(-4920224193275732920L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.dto.QueryInDto$QueryInDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term609;
        callMethod(klass, "documentNumber", argTypes, term580, args);
    }

};



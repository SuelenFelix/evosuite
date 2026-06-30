package com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.response;

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
import static com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ProductResponse_ProductResponseBuilder_name_10537684872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;

    public ProductResponse_ProductResponseBuilder_name_10537684872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term51 = new Long(-8257434502486459194L);
        term50 = newInstance(Class.forName("com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.response.ProductResponse$ProductResponseBuilder"));
        setField(term50, term50.getClass(), "id", term51);
        setField(term50, term50.getClass(), "name", "MuLcgQHgqz");
        setField(term50, term50.getClass(), "description", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.response.ProductResponse$ProductResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "name", argTypes, term50, args);
    }

};



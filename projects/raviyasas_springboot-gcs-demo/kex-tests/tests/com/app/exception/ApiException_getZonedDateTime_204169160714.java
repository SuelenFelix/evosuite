package com.app.exception;

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
import static com.app.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ApiException_getZonedDateTime_204169160714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1790;

    public ApiException_getZonedDateTime_204169160714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1790 = newInstance(Class.forName("com.app.exception.ApiException"));
        setField(term1790, term1790.getClass(), "errorMessage", null);
        setField(term1790, term1790.getClass(), "statusCode", null);
        setField(term1790, term1790.getClass(), "zonedDateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.ApiException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZonedDateTime", argTypes, term1790, args);
    }

};



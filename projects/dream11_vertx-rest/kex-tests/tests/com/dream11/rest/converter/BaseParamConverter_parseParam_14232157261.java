package com.dream11.rest.converter;

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
import static com.dream11.rest.converter.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BaseParamConverter_parseParam_14232157261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;

    public BaseParamConverter_parseParam_14232157261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27 = new Integer(568599855);
        term2 = newInstance(Class.forName("com.dream11.rest.converter.BaseParamConverter"));
        setField(term2, term2.getClass(), "errorMessage", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "errorCode", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "httpStatusCode", term27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dream11.rest.converter.BaseParamConverter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.function.Function");
        Object[] args = new Object[2];
        args[0] = "MuLcgQHgqz";
        args[1] = null;
        callMethod(klass, "parseParam", argTypes, term2, args);
    }

};



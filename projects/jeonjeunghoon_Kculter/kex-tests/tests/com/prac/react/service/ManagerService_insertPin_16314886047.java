package com.prac.react.service;

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
import static com.prac.react.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ManagerService_insertPin_16314886047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2146;
     Object term2147;

    public ManagerService_insertPin_16314886047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2146 = newInstance(Class.forName("com.prac.react.service.ManagerService"));
        setField(term2146, term2146.getClass(), "md", null);
        setField(term2146, term2146.getClass(), "logger", null);
        term2147 = newInstance(Class.forName("com.prac.react.model.dto.Pin"));
        setIntField(term2147, term2147.getClass(), "pinNum", -157887805);
        setField(term2147, term2147.getClass(), "pinHash", "wGmYcqUkgE");
        setIntField(term2147, term2147.getClass(), "pinType", 1876565163);
        setIntField(term2147, term2147.getClass(), "pinKeyNum", -817164822);
        setField(term2147, term2147.getClass(), "pinKeyHash", "idgaQsnJpQ");
        setField(term2147, term2147.getClass(), "imageUrl", "VgZnGoIFwQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.ManagerService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.prac.react.model.dto.Pin");
        Object[] args = new Object[1];
        args[0] = term2147;
        callMethod(klass, "insertPin", argTypes, term2146, args);
    }

};



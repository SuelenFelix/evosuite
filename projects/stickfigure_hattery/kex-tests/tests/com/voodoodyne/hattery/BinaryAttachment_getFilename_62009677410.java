package com.voodoodyne.hattery;

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
import static com.voodoodyne.hattery.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BinaryAttachment_getFilename_62009677410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8478;

    public BinaryAttachment_getFilename_62009677410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8478 = newInstance(Class.forName("com.voodoodyne.hattery.BinaryAttachment"));
        setField(term8478, term8478.getClass(), "data", null);
        setField(term8478, term8478.getClass(), "contentType", null);
        setField(term8478, term8478.getClass(), "filename", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.BinaryAttachment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilename", argTypes, term8478, args);
    }

};



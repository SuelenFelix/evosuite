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

public class BinaryAttachment_getData_20312769988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8476;

    public BinaryAttachment_getData_20312769988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8476 = newInstance(Class.forName("com.voodoodyne.hattery.BinaryAttachment"));
        setField(term8476, term8476.getClass(), "data", null);
        setField(term8476, term8476.getClass(), "contentType", null);
        setField(term8476, term8476.getClass(), "filename", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.BinaryAttachment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term8476, args);
    }

};



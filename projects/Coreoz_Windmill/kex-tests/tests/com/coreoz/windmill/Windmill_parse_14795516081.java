package com.coreoz.windmill;

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
import static com.coreoz.windmill.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Windmill_parse_14795516081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term697;

    public Windmill_parse_14795516081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term697 = newInstance(Class.forName("com.coreoz.windmill.files.FileSource"));
        Object term698 = newInstance(Class.forName("java.io.PushbackInputStream"));
        byte[] term699 = (byte[]) newByteArray(0);
        setField(term698, term698.getClass(), "buf", term699);
        setIntField(term698, term698.getClass(), "pos", -1955890973);
        setField(term698, term698.getClass(), "in", null);
        setField(term697, term697.getClass(), "bufferedStream", term698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.Windmill");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.coreoz.windmill.files.FileSource");
        Object[] args = new Object[1];
        args[0] = term697;
        callMethod(klass, "parse", argTypes, null, args);
    }

};



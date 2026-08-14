package com.github.bhlangonijr.chesslib.util;

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
import static com.github.bhlangonijr.chesslib.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StringUtil_replaceAll_2301726177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312242;

    public StringUtil_replaceAll_2301726177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312242 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term312243 = (byte[]) newByteArray(16);
        setField(term312242, term312242.getClass(), "value", term312243);
        setByteField(term312242, term312242.getClass(), "coder", (byte) -119);
        setIntField(term312242, term312242.getClass(), "count", 515182546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.util.StringUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term312242;
        args[1] = "QZBHZqZope";
        args[2] = "VBUahCvyxC";
        callMethod(klass, "replaceAll", argTypes, null, args);
    }

};



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

public class StringUtil_translate_11650500348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312322;
     Object term312342;

    public StringUtil_translate_11650500348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312322 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term312323 = (byte[]) newByteArray(16);
        setField(term312322, term312322.getClass(), "value", term312323);
        setByteField(term312322, term312322.getClass(), "coder", (byte) -66);
        setIntField(term312322, term312322.getClass(), "count", -936895502);
        term312342 = (char[]) newCharArray(5);
        setCharElement(term312342, 0, 'z');
        setCharElement(term312342, 1, 'Y');
        setCharElement(term312342, 2, 'Y');
        setCharElement(term312342, 3, 'I');
        setCharElement(term312342, 4, 'r');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.util.StringUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term312322;
        args[1] = term312342;
        callMethod(klass, "translate", argTypes, null, args);
    }

};



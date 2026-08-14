package com.voodoodyne.hattery.util;

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
import static com.voodoodyne.hattery.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultipartWriter_writeParam_18433196972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;
     Object term61;
     Object term88;

    public MultipartWriter_writeParam_18433196972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60 = newInstance(Class.forName("com.voodoodyne.hattery.util.MultipartWriter"));
        setField(term60, term60.getClass(), "out", null);
        term61 = newInstance(Class.forName("com.voodoodyne.hattery.util.LineWriter"));
        char[] term62 = (char[]) newCharArray(9);
        char[] term74 = (char[]) newCharArray(0);
        Object term75 = newInstance(Class.forName("java.lang.Object"));
        setField(term61, term61.getClass(), "out", null);
        setCharElement(term62, 0, 'P');
        setCharElement(term62, 1, 'A');
        setCharElement(term62, 2, 'E');
        setCharElement(term62, 3, 'B');
        setCharElement(term62, 4, 't');
        setCharElement(term62, 5, 'n');
        setCharElement(term62, 6, 'Z');
        setCharElement(term62, 7, 't');
        setCharElement(term62, 8, 'T');
        setField(term61, term61.getClass(), "cb", term62);
        setIntField(term61, term61.getClass(), "nChars", 568599855);
        setIntField(term61, term61.getClass(), "nextChar", 1162663216);
        setField(term61, term61.getClass(), "writeBuffer", term74);
        setField(term61, term61.getClass(), "lock", term75);
        term88 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.util.MultipartWriter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.voodoodyne.hattery.util.LineWriter");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term61;
        args[1] = "EGtDIRbSSb";
        args[2] = term88;
        callMethod(klass, "writeParam", argTypes, term60, args);
    }

};



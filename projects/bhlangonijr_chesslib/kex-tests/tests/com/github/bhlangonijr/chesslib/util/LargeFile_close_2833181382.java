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
import java.lang.Object;

public class LargeFile_close_2833181382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public LargeFile_close_2833181382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.util.LargeFile"));
        Object term24 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term25 = (char[]) newCharArray(5);
        Object term37 = newInstance(Class.forName("java.lang.Object"));
        char[] term38 = (char[]) newCharArray(4);
        setField(term24, term24.getClass(), "in", null);
        setCharElement(term25, 0, 'P');
        setCharElement(term25, 1, 'A');
        setCharElement(term25, 2, 'E');
        setCharElement(term25, 3, 'B');
        setCharElement(term25, 4, 't');
        setField(term24, term24.getClass(), "cb", term25);
        setIntField(term24, term24.getClass(), "nChars", 568599855);
        setIntField(term24, term24.getClass(), "nextChar", 1162663216);
        setIntField(term24, term24.getClass(), "markedChar", 1484323161);
        setIntField(term24, term24.getClass(), "readAheadLimit", 391863371);
        setBooleanField(term24, term24.getClass(), "skipLF", false);
        setBooleanField(term24, term24.getClass(), "markedSkipLF", false);
        setField(term24, term24.getClass(), "lock", term37);
        setCharElement(term38, 0, 'n');
        setCharElement(term38, 1, 'Z');
        setCharElement(term38, 2, 't');
        setCharElement(term38, 3, 'T');
        setField(term24, term24.getClass(), "skipBuffer", term38);
        setField(term23, term23.getClass(), "reader", term24);
        setField(term23, term23.getClass(), "nextLine", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.util.LargeFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term23, args);
    }

};



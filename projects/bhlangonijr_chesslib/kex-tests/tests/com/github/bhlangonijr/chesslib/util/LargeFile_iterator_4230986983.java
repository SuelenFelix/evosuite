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

public class LargeFile_iterator_4230986983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74;

    public LargeFile_iterator_4230986983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.util.LargeFile"));
        Object term75 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term76 = (char[]) newCharArray(3);
        Object term86 = newInstance(Class.forName("java.lang.Object"));
        char[] term87 = (char[]) newCharArray(4);
        setField(term75, term75.getClass(), "in", null);
        setCharElement(term76, 0, 'D');
        setCharElement(term76, 1, 's');
        setCharElement(term76, 2, 'j');
        setField(term75, term75.getClass(), "cb", term76);
        setIntField(term75, term75.getClass(), "nChars", -1922583790);
        setIntField(term75, term75.getClass(), "nextChar", -616727354);
        setIntField(term75, term75.getClass(), "markedChar", -1955890973);
        setIntField(term75, term75.getClass(), "readAheadLimit", -2038273078);
        setBooleanField(term75, term75.getClass(), "skipLF", false);
        setBooleanField(term75, term75.getClass(), "markedSkipLF", false);
        setField(term75, term75.getClass(), "lock", term86);
        setCharElement(term87, 0, 'l');
        setCharElement(term87, 1, 'J');
        setCharElement(term87, 2, 'A');
        setCharElement(term87, 3, 'E');
        setField(term75, term75.getClass(), "skipBuffer", term87);
        setField(term74, term74.getClass(), "reader", term75);
        setField(term74, term74.getClass(), "nextLine", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.util.LargeFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "iterator", argTypes, term74, args);
    }

};



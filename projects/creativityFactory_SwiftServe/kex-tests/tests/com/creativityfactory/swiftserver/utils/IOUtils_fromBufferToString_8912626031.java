package com.creativityfactory.swiftserver.utils;

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
import static com.creativityfactory.swiftserver.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IOUtils_fromBufferToString_8912626031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191;

    public IOUtils_fromBufferToString_8912626031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term192 = (char[]) newCharArray(5);
        Object term204 = newInstance(Class.forName("java.lang.Object"));
        char[] term205 = (char[]) newCharArray(4);
        setField(term191, term191.getClass(), "in", null);
        setCharElement(term192, 0, 'P');
        setCharElement(term192, 1, 'A');
        setCharElement(term192, 2, 'E');
        setCharElement(term192, 3, 'B');
        setCharElement(term192, 4, 't');
        setField(term191, term191.getClass(), "cb", term192);
        setIntField(term191, term191.getClass(), "nChars", 568599855);
        setIntField(term191, term191.getClass(), "nextChar", 1162663216);
        setIntField(term191, term191.getClass(), "markedChar", 1484323161);
        setIntField(term191, term191.getClass(), "readAheadLimit", 391863371);
        setBooleanField(term191, term191.getClass(), "skipLF", false);
        setBooleanField(term191, term191.getClass(), "markedSkipLF", false);
        setField(term191, term191.getClass(), "lock", term204);
        setCharElement(term205, 0, 'n');
        setCharElement(term205, 1, 'Z');
        setCharElement(term205, 2, 't');
        setCharElement(term205, 3, 'T');
        setField(term191, term191.getClass(), "skipBuffer", term205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.utils.IOUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.BufferedReader");
        Object[] args = new Object[1];
        args[0] = term191;
        callMethod(klass, "fromBufferToString", argTypes, null, args);
    }

};



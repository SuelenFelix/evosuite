package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Tools_shuffle_57949640713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185090;

    public Tools_shuffle_57949640713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185090 = (Object[]) newArray("java.lang.Object", 9);
        Object term185091 = newInstance(Class.forName("java.lang.Object"));
        Object term185092 = newInstance(Class.forName("java.lang.Object"));
        Object term185093 = newInstance(Class.forName("java.lang.Object"));
        Object term185094 = newInstance(Class.forName("java.lang.Object"));
        Object term185095 = newInstance(Class.forName("java.lang.Object"));
        Object term185096 = newInstance(Class.forName("java.lang.Object"));
        Object term185097 = newInstance(Class.forName("java.lang.Object"));
        Object term185098 = newInstance(Class.forName("java.lang.Object"));
        Object term185099 = newInstance(Class.forName("java.lang.Object"));
        setElement(term185090, 0, term185091);
        setElement(term185090, 1, term185092);
        setElement(term185090, 2, term185093);
        setElement(term185090, 3, term185094);
        setElement(term185090, 4, term185095);
        setElement(term185090, 5, term185096);
        setElement(term185090, 6, term185097);
        setElement(term185090, 7, term185098);
        setElement(term185090, 8, term185099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term185090;
        callMethod(klass, "shuffle", argTypes, null, args);
    }

};



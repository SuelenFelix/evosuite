package org.mozilla.universalchardet;

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
import static org.mozilla.universalchardet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ReaderFactory_createBufferedReader_16107734552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406018;

    public ReaderFactory_createBufferedReader_16107734552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term406054 = Class.forName((String) "java.io.File$PathStatus");
        Field term406053 = ((Class) term406054).getDeclaredField((String) "INVALID");
        ((Field) term406053).setAccessible(true);
        Object enum102 = ((Field) term406053).get((Object) null);
        term406018 = newInstance(Class.forName("java.io.File"));
        setField(term406018, term406018.getClass(), "path", "nGKItKLYNC");
        setField(term406018, term406018.getClass(), "status", enum102);
        setIntField(term406018, term406018.getClass(), "prefixLength", -1618206977);
        setField(term406018, term406018.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.ReaderFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term406018;
        callMethod(klass, "createBufferedReader", argTypes, null, args);
    }

};



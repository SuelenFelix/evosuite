package com.usantatecla.ustumlserver.domain.services.reverseEngineering;

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
import static com.usantatecla.ustumlserver.domain.services.reverseEngineering.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Directory_getFile_9248167486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1555;

    public Directory_getFile_9248167486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1592 = Class.forName((String) "java.io.File$PathStatus");
        Field term1591 = ((Class) term1592).getDeclaredField((String) "INVALID");
        ((Field) term1591).setAccessible(true);
        Object enum7 = ((Field) term1591).get((Object) null);
        term1555 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.Directory"));
        Object term1556 = newInstance(Class.forName("java.io.File"));
        setField(term1556, term1556.getClass(), "path", "vKQukfbJUd");
        setField(term1556, term1556.getClass(), "status", enum7);
        setIntField(term1556, term1556.getClass(), "prefixLength", 1134449235);
        setField(term1556, term1556.getClass(), "filePath", null);
        setField(term1555, term1555.getClass(), "file", term1556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.Directory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFile", argTypes, term1555, args);
    }

};



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

public class Directory_listFiles_18892504695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1376;

    public Directory_listFiles_18892504695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1413 = Class.forName((String) "java.io.File$PathStatus");
        Field term1412 = ((Class) term1413).getDeclaredField((String) "CHECKED");
        ((Field) term1412).setAccessible(true);
        Object enum6 = ((Field) term1412).get((Object) null);
        term1376 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.Directory"));
        Object term1377 = newInstance(Class.forName("java.io.File"));
        setField(term1377, term1377.getClass(), "path", "kNqaJKIATy");
        setField(term1377, term1377.getClass(), "status", enum6);
        setIntField(term1377, term1377.getClass(), "prefixLength", -522618178);
        setField(term1377, term1377.getClass(), "filePath", null);
        setField(term1376, term1376.getClass(), "file", term1377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.Directory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "listFiles", argTypes, term1376, args);
    }

};



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

public class Directory_getName_19298644323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1018;

    public Directory_getName_19298644323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1055 = Class.forName((String) "java.io.File$PathStatus");
        Field term1054 = ((Class) term1055).getDeclaredField((String) "CHECKED");
        ((Field) term1054).setAccessible(true);
        Object enum4 = ((Field) term1054).get((Object) null);
        term1018 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.Directory"));
        Object term1019 = newInstance(Class.forName("java.io.File"));
        setField(term1019, term1019.getClass(), "path", "JppkknKVOw");
        setField(term1019, term1019.getClass(), "status", enum4);
        setIntField(term1019, term1019.getClass(), "prefixLength", -1339778481);
        setField(term1019, term1019.getClass(), "filePath", null);
        setField(term1018, term1018.getClass(), "file", term1019);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.Directory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1018, args);
    }

};



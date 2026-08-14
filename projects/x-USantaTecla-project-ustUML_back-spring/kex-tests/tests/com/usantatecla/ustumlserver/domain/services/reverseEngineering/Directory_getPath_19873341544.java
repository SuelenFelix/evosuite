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

public class Directory_getPath_19873341544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1197;

    public Directory_getPath_19873341544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1234 = Class.forName((String) "java.io.File$PathStatus");
        Field term1233 = ((Class) term1234).getDeclaredField((String) "INVALID");
        ((Field) term1233).setAccessible(true);
        Object enum5 = ((Field) term1233).get((Object) null);
        term1197 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.Directory"));
        Object term1198 = newInstance(Class.forName("java.io.File"));
        setField(term1198, term1198.getClass(), "path", "iljANwuEjk");
        setField(term1198, term1198.getClass(), "status", enum5);
        setIntField(term1198, term1198.getClass(), "prefixLength", 1725571209);
        setField(term1198, term1198.getClass(), "filePath", null);
        setField(term1197, term1197.getClass(), "file", term1198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.Directory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term1197, args);
    }

};



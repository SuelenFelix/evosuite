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

public class Directory_delete_1018266472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839;

    public Directory_delete_1018266472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term876 = Class.forName((String) "java.io.File$PathStatus");
        Field term875 = ((Class) term876).getDeclaredField((String) "INVALID");
        ((Field) term875).setAccessible(true);
        Object enum3 = ((Field) term875).get((Object) null);
        term839 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.Directory"));
        Object term840 = newInstance(Class.forName("java.io.File"));
        setField(term840, term840.getClass(), "path", "YpJbIgJWWv");
        setField(term840, term840.getClass(), "status", enum3);
        setIntField(term840, term840.getClass(), "prefixLength", 1227103734);
        setField(term840, term840.getClass(), "filePath", null);
        setField(term839, term839.getClass(), "file", term840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.Directory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "delete", argTypes, term839, args);
    }

};



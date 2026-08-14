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
import java.lang.String;
import java.lang.Object;

public class Directory_init_19498722941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term661;

    public Directory_init_19498722941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term697 = Class.forName((String) "java.io.File$PathStatus");
        Field term696 = ((Class) term697).getDeclaredField((String) "CHECKED");
        ((Field) term696).setAccessible(true);
        Object enum2 = ((Field) term696).get((Object) null);
        term661 = newInstance(Class.forName("java.io.File"));
        setField(term661, term661.getClass(), "path", "RbVQXSpxXy");
        setField(term661, term661.getClass(), "status", enum2);
        setIntField(term661, term661.getClass(), "prefixLength", -2038273078);
        setField(term661, term661.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.Directory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term661;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



package com.gin.mergegfassets.entity;

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
import static com.gin.mergegfassets.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class AssetFile_setHe_53911653025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7263;
     Object term7343;

    public AssetFile_setHe_53911653025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7356 = Class.forName((String) "java.io.File$PathStatus");
        Field term7355 = ((Class) term7356).getDeclaredField((String) "CHECKED");
        ((Field) term7355).setAccessible(true);
        Object enum26 = ((Field) term7355).get((Object) null);
        term7263 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term7264 = newInstance(Class.forName("java.io.File"));
        setField(term7264, term7264.getClass(), "path", "wfaXBpWAUH");
        setField(term7264, term7264.getClass(), "status", enum26);
        setIntField(term7264, term7264.getClass(), "prefixLength", -1275173084);
        setField(term7264, term7264.getClass(), "filePath", null);
        setField(term7263, term7263.getClass(), "file", term7264);
        setField(term7263, term7263.getClass(), "parentPath", "VMeAzAHwZj");
        setField(term7263, term7263.getClass(), "character", "PznxWXsZME");
        setField(term7263, term7263.getClass(), "version", "ZzIujlwVsw");
        setField(term7263, term7263.getClass(), "extensions", "LWyEaeIyAo");
        setBooleanField(term7263, term7263.getClass(), "alpha", false);
        setBooleanField(term7263, term7263.getClass(), "damaged", false);
        setBooleanField(term7263, term7263.getClass(), "hd", true);
        setBooleanField(term7263, term7263.getClass(), "he", false);
        setBooleanField(term7263, term7263.getClass(), "difference", false);
        setBooleanField(term7263, term7263.getClass(), "skin", true);
        term7343 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7343;
        callMethod(klass, "setHe", argTypes, term7263, args);
    }

};



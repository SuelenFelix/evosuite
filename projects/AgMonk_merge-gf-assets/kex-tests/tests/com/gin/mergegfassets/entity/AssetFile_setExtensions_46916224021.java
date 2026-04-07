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

public class AssetFile_setExtensions_46916224021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6143;

    public AssetFile_setExtensions_46916224021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6246 = Class.forName((String) "java.io.File$PathStatus");
        Field term6245 = ((Class) term6246).getDeclaredField((String) "CHECKED");
        ((Field) term6245).setAccessible(true);
        Object enum22 = ((Field) term6245).get((Object) null);
        term6143 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term6144 = newInstance(Class.forName("java.io.File"));
        setField(term6144, term6144.getClass(), "path", "MvRIxilFMJ");
        setField(term6144, term6144.getClass(), "status", enum22);
        setIntField(term6144, term6144.getClass(), "prefixLength", -1007160944);
        setField(term6144, term6144.getClass(), "filePath", null);
        setField(term6143, term6143.getClass(), "file", term6144);
        setField(term6143, term6143.getClass(), "parentPath", "iNwOJRBEjp");
        setField(term6143, term6143.getClass(), "character", "XylxrMBraH");
        setField(term6143, term6143.getClass(), "version", "pORebkoRdD");
        setField(term6143, term6143.getClass(), "extensions", "mXGCWJDOqA");
        setBooleanField(term6143, term6143.getClass(), "alpha", false);
        setBooleanField(term6143, term6143.getClass(), "damaged", true);
        setBooleanField(term6143, term6143.getClass(), "hd", false);
        setBooleanField(term6143, term6143.getClass(), "he", true);
        setBooleanField(term6143, term6143.getClass(), "difference", false);
        setBooleanField(term6143, term6143.getClass(), "skin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dpNsDgfPso";
        callMethod(klass, "setExtensions", argTypes, term6143, args);
    }

};



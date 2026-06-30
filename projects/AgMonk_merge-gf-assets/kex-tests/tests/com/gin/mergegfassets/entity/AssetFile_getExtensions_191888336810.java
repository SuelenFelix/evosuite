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

public class AssetFile_getExtensions_191888336810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2896;

    public AssetFile_getExtensions_191888336810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2987 = Class.forName((String) "java.io.File$PathStatus");
        Field term2986 = ((Class) term2987).getDeclaredField((String) "INVALID");
        ((Field) term2986).setAccessible(true);
        Object enum10 = ((Field) term2986).get((Object) null);
        term2896 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term2897 = newInstance(Class.forName("java.io.File"));
        setField(term2897, term2897.getClass(), "path", "ffYhPOzlUs");
        setField(term2897, term2897.getClass(), "status", enum10);
        setIntField(term2897, term2897.getClass(), "prefixLength", 1134449235);
        setField(term2897, term2897.getClass(), "filePath", null);
        setField(term2896, term2896.getClass(), "file", term2897);
        setField(term2896, term2896.getClass(), "parentPath", "MLqYREekMl");
        setField(term2896, term2896.getClass(), "character", "ytSBIKXogI");
        setField(term2896, term2896.getClass(), "version", "nHXjMycHlU");
        setField(term2896, term2896.getClass(), "extensions", "ieCtQFdkii");
        setBooleanField(term2896, term2896.getClass(), "alpha", true);
        setBooleanField(term2896, term2896.getClass(), "damaged", true);
        setBooleanField(term2896, term2896.getClass(), "hd", true);
        setBooleanField(term2896, term2896.getClass(), "he", false);
        setBooleanField(term2896, term2896.getClass(), "difference", false);
        setBooleanField(term2896, term2896.getClass(), "skin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtensions", argTypes, term2896, args);
    }

};



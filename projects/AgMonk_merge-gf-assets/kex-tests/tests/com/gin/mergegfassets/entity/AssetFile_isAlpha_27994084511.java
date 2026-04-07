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

public class AssetFile_isAlpha_27994084511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3169;

    public AssetFile_isAlpha_27994084511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3260 = Class.forName((String) "java.io.File$PathStatus");
        Field term3259 = ((Class) term3260).getDeclaredField((String) "CHECKED");
        ((Field) term3259).setAccessible(true);
        Object enum11 = ((Field) term3259).get((Object) null);
        term3169 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term3170 = newInstance(Class.forName("java.io.File"));
        setField(term3170, term3170.getClass(), "path", "dEnhdmILtU");
        setField(term3170, term3170.getClass(), "status", enum11);
        setIntField(term3170, term3170.getClass(), "prefixLength", -883034806);
        setField(term3170, term3170.getClass(), "filePath", null);
        setField(term3169, term3169.getClass(), "file", term3170);
        setField(term3169, term3169.getClass(), "parentPath", "hoicvmsovO");
        setField(term3169, term3169.getClass(), "character", "eqJfYWRaEL");
        setField(term3169, term3169.getClass(), "version", "fhkbdRViHi");
        setField(term3169, term3169.getClass(), "extensions", "uWHnvSvaPl");
        setBooleanField(term3169, term3169.getClass(), "alpha", false);
        setBooleanField(term3169, term3169.getClass(), "damaged", false);
        setBooleanField(term3169, term3169.getClass(), "hd", false);
        setBooleanField(term3169, term3169.getClass(), "he", false);
        setBooleanField(term3169, term3169.getClass(), "difference", true);
        setBooleanField(term3169, term3169.getClass(), "skin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAlpha", argTypes, term3169, args);
    }

};



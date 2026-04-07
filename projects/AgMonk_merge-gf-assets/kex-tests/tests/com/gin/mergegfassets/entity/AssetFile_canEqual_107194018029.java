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

public class AssetFile_canEqual_107194018029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8362;
     Object term8442;

    public AssetFile_canEqual_107194018029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8454 = Class.forName((String) "java.io.File$PathStatus");
        Field term8453 = ((Class) term8454).getDeclaredField((String) "CHECKED");
        ((Field) term8453).setAccessible(true);
        Object enum30 = ((Field) term8453).get((Object) null);
        term8362 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term8363 = newInstance(Class.forName("java.io.File"));
        setField(term8363, term8363.getClass(), "path", "HHmNoYxIGj");
        setField(term8363, term8363.getClass(), "status", enum30);
        setIntField(term8363, term8363.getClass(), "prefixLength", -73683645);
        setField(term8363, term8363.getClass(), "filePath", null);
        setField(term8362, term8362.getClass(), "file", term8363);
        setField(term8362, term8362.getClass(), "parentPath", "PtirvZmsGt");
        setField(term8362, term8362.getClass(), "character", "HWkpTmtlrc");
        setField(term8362, term8362.getClass(), "version", "hMmaoREuCK");
        setField(term8362, term8362.getClass(), "extensions", "VeDtgDzGAN");
        setBooleanField(term8362, term8362.getClass(), "alpha", true);
        setBooleanField(term8362, term8362.getClass(), "damaged", true);
        setBooleanField(term8362, term8362.getClass(), "hd", false);
        setBooleanField(term8362, term8362.getClass(), "he", false);
        setBooleanField(term8362, term8362.getClass(), "difference", false);
        setBooleanField(term8362, term8362.getClass(), "skin", false);
        term8442 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8442;
        callMethod(klass, "canEqual", argTypes, term8362, args);
    }

};



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

public class AssetFile_equals_187610280928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8088;
     Object term8168;

    public AssetFile_equals_187610280928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8180 = Class.forName((String) "java.io.File$PathStatus");
        Field term8179 = ((Class) term8180).getDeclaredField((String) "CHECKED");
        ((Field) term8179).setAccessible(true);
        Object enum29 = ((Field) term8179).get((Object) null);
        term8088 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term8089 = newInstance(Class.forName("java.io.File"));
        setField(term8089, term8089.getClass(), "path", "ZfdXfCCFDf");
        setField(term8089, term8089.getClass(), "status", enum29);
        setIntField(term8089, term8089.getClass(), "prefixLength", -1179120542);
        setField(term8089, term8089.getClass(), "filePath", null);
        setField(term8088, term8088.getClass(), "file", term8089);
        setField(term8088, term8088.getClass(), "parentPath", "MwwjNtdOFT");
        setField(term8088, term8088.getClass(), "character", "VYkqXKVlAJ");
        setField(term8088, term8088.getClass(), "version", "XkIoWJRNwN");
        setField(term8088, term8088.getClass(), "extensions", "aNWLJdrZMq");
        setBooleanField(term8088, term8088.getClass(), "alpha", false);
        setBooleanField(term8088, term8088.getClass(), "damaged", true);
        setBooleanField(term8088, term8088.getClass(), "hd", false);
        setBooleanField(term8088, term8088.getClass(), "he", false);
        setBooleanField(term8088, term8088.getClass(), "difference", true);
        setBooleanField(term8088, term8088.getClass(), "skin", true);
        term8168 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8168;
        callMethod(klass, "equals", argTypes, term8088, args);
    }

};



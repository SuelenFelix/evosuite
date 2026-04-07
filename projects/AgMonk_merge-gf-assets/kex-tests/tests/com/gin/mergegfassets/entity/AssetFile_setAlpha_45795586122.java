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

public class AssetFile_setAlpha_45795586122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6438;
     Object term6518;

    public AssetFile_setAlpha_45795586122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6531 = Class.forName((String) "java.io.File$PathStatus");
        Field term6530 = ((Class) term6531).getDeclaredField((String) "INVALID");
        ((Field) term6530).setAccessible(true);
        Object enum23 = ((Field) term6530).get((Object) null);
        term6438 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term6439 = newInstance(Class.forName("java.io.File"));
        setField(term6439, term6439.getClass(), "path", "hCWPJQKpdc");
        setField(term6439, term6439.getClass(), "status", enum23);
        setIntField(term6439, term6439.getClass(), "prefixLength", 1135664017);
        setField(term6439, term6439.getClass(), "filePath", null);
        setField(term6438, term6438.getClass(), "file", term6439);
        setField(term6438, term6438.getClass(), "parentPath", "WzMEhMXkKx");
        setField(term6438, term6438.getClass(), "character", "XOiDvlDhdc");
        setField(term6438, term6438.getClass(), "version", "AdxvLJhNLe");
        setField(term6438, term6438.getClass(), "extensions", "lHfTrWKMPk");
        setBooleanField(term6438, term6438.getClass(), "alpha", true);
        setBooleanField(term6438, term6438.getClass(), "damaged", true);
        setBooleanField(term6438, term6438.getClass(), "hd", true);
        setBooleanField(term6438, term6438.getClass(), "he", false);
        setBooleanField(term6438, term6438.getClass(), "difference", true);
        setBooleanField(term6438, term6438.getClass(), "skin", false);
        term6518 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6518;
        callMethod(klass, "setAlpha", argTypes, term6438, args);
    }

};



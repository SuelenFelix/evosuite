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

public class AssetFile_setSkin_194290584227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7813;
     Object term7893;

    public AssetFile_setSkin_194290584227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7906 = Class.forName((String) "java.io.File$PathStatus");
        Field term7905 = ((Class) term7906).getDeclaredField((String) "CHECKED");
        ((Field) term7905).setAccessible(true);
        Object enum28 = ((Field) term7905).get((Object) null);
        term7813 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term7814 = newInstance(Class.forName("java.io.File"));
        setField(term7814, term7814.getClass(), "path", "UfQtPRyWRC");
        setField(term7814, term7814.getClass(), "status", enum28);
        setIntField(term7814, term7814.getClass(), "prefixLength", -203030934);
        setField(term7814, term7814.getClass(), "filePath", null);
        setField(term7813, term7813.getClass(), "file", term7814);
        setField(term7813, term7813.getClass(), "parentPath", "FPvxVzzSvD");
        setField(term7813, term7813.getClass(), "character", "WHcwFgsGFC");
        setField(term7813, term7813.getClass(), "version", "HzqpegHiRq");
        setField(term7813, term7813.getClass(), "extensions", "jwsfVjMoJT");
        setBooleanField(term7813, term7813.getClass(), "alpha", true);
        setBooleanField(term7813, term7813.getClass(), "damaged", false);
        setBooleanField(term7813, term7813.getClass(), "hd", true);
        setBooleanField(term7813, term7813.getClass(), "he", true);
        setBooleanField(term7813, term7813.getClass(), "difference", true);
        setBooleanField(term7813, term7813.getClass(), "skin", false);
        term7893 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7893;
        callMethod(klass, "setSkin", argTypes, term7813, args);
    }

};



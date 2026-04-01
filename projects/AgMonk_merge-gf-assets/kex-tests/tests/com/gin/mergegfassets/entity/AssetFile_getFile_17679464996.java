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

public class AssetFile_getFile_17679464996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1804;

    public AssetFile_getFile_17679464996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1895 = Class.forName((String) "java.io.File$PathStatus");
        Field term1894 = ((Class) term1895).getDeclaredField((String) "INVALID");
        ((Field) term1894).setAccessible(true);
        Object enum6 = ((Field) term1894).get((Object) null);
        term1804 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term1805 = newInstance(Class.forName("java.io.File"));
        setField(term1805, term1805.getClass(), "path", "xrwlQZdwCp");
        setField(term1805, term1805.getClass(), "status", enum6);
        setIntField(term1805, term1805.getClass(), "prefixLength", 1227103734);
        setField(term1805, term1805.getClass(), "filePath", null);
        setField(term1804, term1804.getClass(), "file", term1805);
        setField(term1804, term1804.getClass(), "parentPath", "IDCWpPLRkE");
        setField(term1804, term1804.getClass(), "character", "nyiiPDVjAc");
        setField(term1804, term1804.getClass(), "version", "aKnKipADSo");
        setField(term1804, term1804.getClass(), "extensions", "wSQxaModmm");
        setBooleanField(term1804, term1804.getClass(), "alpha", true);
        setBooleanField(term1804, term1804.getClass(), "damaged", true);
        setBooleanField(term1804, term1804.getClass(), "hd", false);
        setBooleanField(term1804, term1804.getClass(), "he", true);
        setBooleanField(term1804, term1804.getClass(), "difference", true);
        setBooleanField(term1804, term1804.getClass(), "skin", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFile", argTypes, term1804, args);
    }

};



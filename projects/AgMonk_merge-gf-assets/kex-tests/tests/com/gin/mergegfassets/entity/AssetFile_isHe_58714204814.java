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

public class AssetFile_isHe_58714204814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3988;

    public AssetFile_isHe_58714204814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4079 = Class.forName((String) "java.io.File$PathStatus");
        Field term4078 = ((Class) term4079).getDeclaredField((String) "CHECKED");
        ((Field) term4078).setAccessible(true);
        Object enum14 = ((Field) term4078).get((Object) null);
        term3988 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term3989 = newInstance(Class.forName("java.io.File"));
        setField(term3989, term3989.getClass(), "path", "oVgzLbrsFr");
        setField(term3989, term3989.getClass(), "status", enum14);
        setIntField(term3989, term3989.getClass(), "prefixLength", -1685132342);
        setField(term3989, term3989.getClass(), "filePath", null);
        setField(term3988, term3988.getClass(), "file", term3989);
        setField(term3988, term3988.getClass(), "parentPath", "vQVyKLdtaz");
        setField(term3988, term3988.getClass(), "character", "OWKQODBLzb");
        setField(term3988, term3988.getClass(), "version", "wGmYcqUkgE");
        setField(term3988, term3988.getClass(), "extensions", "idgaQsnJpQ");
        setBooleanField(term3988, term3988.getClass(), "alpha", true);
        setBooleanField(term3988, term3988.getClass(), "damaged", true);
        setBooleanField(term3988, term3988.getClass(), "hd", true);
        setBooleanField(term3988, term3988.getClass(), "he", true);
        setBooleanField(term3988, term3988.getClass(), "difference", false);
        setBooleanField(term3988, term3988.getClass(), "skin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isHe", argTypes, term3988, args);
    }

};



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

public class AssetFile_hashCode_197017781230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8636;

    public AssetFile_hashCode_197017781230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8727 = Class.forName((String) "java.io.File$PathStatus");
        Field term8726 = ((Class) term8727).getDeclaredField((String) "CHECKED");
        ((Field) term8726).setAccessible(true);
        Object enum31 = ((Field) term8726).get((Object) null);
        term8636 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term8637 = newInstance(Class.forName("java.io.File"));
        setField(term8637, term8637.getClass(), "path", "aWYOWZFyaX");
        setField(term8637, term8637.getClass(), "status", enum31);
        setIntField(term8637, term8637.getClass(), "prefixLength", -226514366);
        setField(term8637, term8637.getClass(), "filePath", null);
        setField(term8636, term8636.getClass(), "file", term8637);
        setField(term8636, term8636.getClass(), "parentPath", "BRIVNtfUWU");
        setField(term8636, term8636.getClass(), "character", "DbiCVtPPCT");
        setField(term8636, term8636.getClass(), "version", "WzFopsaDuG");
        setField(term8636, term8636.getClass(), "extensions", "PapWxkhEWe");
        setBooleanField(term8636, term8636.getClass(), "alpha", false);
        setBooleanField(term8636, term8636.getClass(), "damaged", true);
        setBooleanField(term8636, term8636.getClass(), "hd", true);
        setBooleanField(term8636, term8636.getClass(), "he", true);
        setBooleanField(term8636, term8636.getClass(), "difference", false);
        setBooleanField(term8636, term8636.getClass(), "skin", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term8636, args);
    }

};



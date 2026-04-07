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

public class AssetFile_setFile_180704392517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4807;
     Object term4887;

    public AssetFile_setFile_180704392517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4923 = Class.forName((String) "java.io.File$PathStatus");
        Field term4922 = ((Class) term4923).getDeclaredField((String) "INVALID");
        ((Field) term4922).setAccessible(true);
        Object enum17 = ((Field) term4922).get((Object) null);
        term4807 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term4808 = newInstance(Class.forName("java.io.File"));
        setField(term4808, term4808.getClass(), "path", "xOcJIiQQDu");
        setField(term4808, term4808.getClass(), "status", enum17);
        setIntField(term4808, term4808.getClass(), "prefixLength", 1048535127);
        setField(term4808, term4808.getClass(), "filePath", null);
        setField(term4807, term4807.getClass(), "file", term4808);
        setField(term4807, term4807.getClass(), "parentPath", "GVizqqzXpy");
        setField(term4807, term4807.getClass(), "character", "JqXGgAhZPl");
        setField(term4807, term4807.getClass(), "version", "jiKYgYHqIS");
        setField(term4807, term4807.getClass(), "extensions", "DfISiziTgG");
        setBooleanField(term4807, term4807.getClass(), "alpha", true);
        setBooleanField(term4807, term4807.getClass(), "damaged", true);
        setBooleanField(term4807, term4807.getClass(), "hd", true);
        setBooleanField(term4807, term4807.getClass(), "he", false);
        setBooleanField(term4807, term4807.getClass(), "difference", true);
        setBooleanField(term4807, term4807.getClass(), "skin", false);
        Class<? extends Object> term5116 = Class.forName((String) "java.io.File$PathStatus");
        Field term5115 = ((Class) term5116).getDeclaredField((String) "CHECKED");
        ((Field) term5115).setAccessible(true);
        Object enum18 = ((Field) term5115).get((Object) null);
        term4887 = newInstance(Class.forName("java.io.File"));
        setField(term4887, term4887.getClass(), "path", "XqgfKFvPSD");
        setField(term4887, term4887.getClass(), "status", enum18);
        setIntField(term4887, term4887.getClass(), "prefixLength", -655067527);
        setField(term4887, term4887.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term4887;
        callMethod(klass, "setFile", argTypes, term4807, args);
    }

};



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

public class AssetFile_getParentPath_20239249257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2077;

    public AssetFile_getParentPath_20239249257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2168 = Class.forName((String) "java.io.File$PathStatus");
        Field term2167 = ((Class) term2168).getDeclaredField((String) "CHECKED");
        ((Field) term2167).setAccessible(true);
        Object enum7 = ((Field) term2167).get((Object) null);
        term2077 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term2078 = newInstance(Class.forName("java.io.File"));
        setField(term2078, term2078.getClass(), "path", "UlajhuVLaP");
        setField(term2078, term2078.getClass(), "status", enum7);
        setIntField(term2078, term2078.getClass(), "prefixLength", -1339778481);
        setField(term2078, term2078.getClass(), "filePath", null);
        setField(term2077, term2077.getClass(), "file", term2078);
        setField(term2077, term2077.getClass(), "parentPath", "gGSMzuGICf");
        setField(term2077, term2077.getClass(), "character", "hxCBltsObl");
        setField(term2077, term2077.getClass(), "version", "BndsHwAFMv");
        setField(term2077, term2077.getClass(), "extensions", "GzFkzHGYFt");
        setBooleanField(term2077, term2077.getClass(), "alpha", false);
        setBooleanField(term2077, term2077.getClass(), "damaged", true);
        setBooleanField(term2077, term2077.getClass(), "hd", false);
        setBooleanField(term2077, term2077.getClass(), "he", false);
        setBooleanField(term2077, term2077.getClass(), "difference", true);
        setBooleanField(term2077, term2077.getClass(), "skin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParentPath", argTypes, term2077, args);
    }

};



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

public class AssetFile_getVersion_17322299529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2623;

    public AssetFile_getVersion_17322299529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2714 = Class.forName((String) "java.io.File$PathStatus");
        Field term2713 = ((Class) term2714).getDeclaredField((String) "CHECKED");
        ((Field) term2713).setAccessible(true);
        Object enum9 = ((Field) term2713).get((Object) null);
        term2623 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term2624 = newInstance(Class.forName("java.io.File"));
        setField(term2624, term2624.getClass(), "path", "UiUYnPrcCi");
        setField(term2624, term2624.getClass(), "status", enum9);
        setIntField(term2624, term2624.getClass(), "prefixLength", -522618178);
        setField(term2624, term2624.getClass(), "filePath", null);
        setField(term2623, term2623.getClass(), "file", term2624);
        setField(term2623, term2623.getClass(), "parentPath", "UoYtihxVaS");
        setField(term2623, term2623.getClass(), "character", "JDswTTCZHV");
        setField(term2623, term2623.getClass(), "version", "onpbIeEKoi");
        setField(term2623, term2623.getClass(), "extensions", "YRHGsAkhxb");
        setBooleanField(term2623, term2623.getClass(), "alpha", false);
        setBooleanField(term2623, term2623.getClass(), "damaged", false);
        setBooleanField(term2623, term2623.getClass(), "hd", true);
        setBooleanField(term2623, term2623.getClass(), "he", true);
        setBooleanField(term2623, term2623.getClass(), "difference", false);
        setBooleanField(term2623, term2623.getClass(), "skin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term2623, args);
    }

};



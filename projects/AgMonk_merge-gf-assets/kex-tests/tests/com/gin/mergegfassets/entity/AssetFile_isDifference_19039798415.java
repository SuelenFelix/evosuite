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

public class AssetFile_isDifference_19039798415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4261;

    public AssetFile_isDifference_19039798415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4352 = Class.forName((String) "java.io.File$PathStatus");
        Field term4351 = ((Class) term4352).getDeclaredField((String) "CHECKED");
        ((Field) term4351).setAccessible(true);
        Object enum15 = ((Field) term4351).get((Object) null);
        term4261 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term4262 = newInstance(Class.forName("java.io.File"));
        setField(term4262, term4262.getClass(), "path", "VgZnGoIFwQ");
        setField(term4262, term4262.getClass(), "status", enum15);
        setIntField(term4262, term4262.getClass(), "prefixLength", -1456670397);
        setField(term4262, term4262.getClass(), "filePath", null);
        setField(term4261, term4261.getClass(), "file", term4262);
        setField(term4261, term4261.getClass(), "parentPath", "jUbSRrkrYZ");
        setField(term4261, term4261.getClass(), "character", "bWWfajKbEX");
        setField(term4261, term4261.getClass(), "version", "cAPeiZHKGJ");
        setField(term4261, term4261.getClass(), "extensions", "LvJFtLBaxj");
        setBooleanField(term4261, term4261.getClass(), "alpha", true);
        setBooleanField(term4261, term4261.getClass(), "damaged", true);
        setBooleanField(term4261, term4261.getClass(), "hd", true);
        setBooleanField(term4261, term4261.getClass(), "he", false);
        setBooleanField(term4261, term4261.getClass(), "difference", true);
        setBooleanField(term4261, term4261.getClass(), "skin", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDifference", argTypes, term4261, args);
    }

};



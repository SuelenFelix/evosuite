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

public class AssetFile_isHd_58714108713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3715;

    public AssetFile_isHd_58714108713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3806 = Class.forName((String) "java.io.File$PathStatus");
        Field term3805 = ((Class) term3806).getDeclaredField((String) "INVALID");
        ((Field) term3805).setAccessible(true);
        Object enum13 = ((Field) term3805).get((Object) null);
        term3715 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term3716 = newInstance(Class.forName("java.io.File"));
        setField(term3716, term3716.getClass(), "path", "IgRJUzaCwW");
        setField(term3716, term3716.getClass(), "status", enum13);
        setIntField(term3716, term3716.getClass(), "prefixLength", 597278769);
        setField(term3716, term3716.getClass(), "filePath", null);
        setField(term3715, term3715.getClass(), "file", term3716);
        setField(term3715, term3715.getClass(), "parentPath", "JUmudUmaaV");
        setField(term3715, term3715.getClass(), "character", "KoyGrUJeJW");
        setField(term3715, term3715.getClass(), "version", "HqBOwkVqjD");
        setField(term3715, term3715.getClass(), "extensions", "MAcUBcBckh");
        setBooleanField(term3715, term3715.getClass(), "alpha", true);
        setBooleanField(term3715, term3715.getClass(), "damaged", false);
        setBooleanField(term3715, term3715.getClass(), "hd", true);
        setBooleanField(term3715, term3715.getClass(), "he", false);
        setBooleanField(term3715, term3715.getClass(), "difference", false);
        setBooleanField(term3715, term3715.getClass(), "skin", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isHd", argTypes, term3715, args);
    }

};



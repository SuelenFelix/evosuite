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

public class AssetFile_setDifference_118314129826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7538;
     Object term7618;

    public AssetFile_setDifference_118314129826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7631 = Class.forName((String) "java.io.File$PathStatus");
        Field term7630 = ((Class) term7631).getDeclaredField((String) "CHECKED");
        ((Field) term7630).setAccessible(true);
        Object enum27 = ((Field) term7630).get((Object) null);
        term7538 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term7539 = newInstance(Class.forName("java.io.File"));
        setField(term7539, term7539.getClass(), "path", "yVMkkQhvmN");
        setField(term7539, term7539.getClass(), "status", enum27);
        setIntField(term7539, term7539.getClass(), "prefixLength", -244121226);
        setField(term7539, term7539.getClass(), "filePath", null);
        setField(term7538, term7538.getClass(), "file", term7539);
        setField(term7538, term7538.getClass(), "parentPath", "mvrkADEgpp");
        setField(term7538, term7538.getClass(), "character", "pXOkjyeIRb");
        setField(term7538, term7538.getClass(), "version", "GgZWSjxjyE");
        setField(term7538, term7538.getClass(), "extensions", "EeBVbzjcCI");
        setBooleanField(term7538, term7538.getClass(), "alpha", false);
        setBooleanField(term7538, term7538.getClass(), "damaged", true);
        setBooleanField(term7538, term7538.getClass(), "hd", true);
        setBooleanField(term7538, term7538.getClass(), "he", false);
        setBooleanField(term7538, term7538.getClass(), "difference", false);
        setBooleanField(term7538, term7538.getClass(), "skin", true);
        term7618 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7618;
        callMethod(klass, "setDifference", argTypes, term7538, args);
    }

};



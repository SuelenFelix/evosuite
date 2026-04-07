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

public class AssetFile_equals_187610280960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9383;

    public AssetFile_equals_187610280960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9383 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        setField(term9383, term9383.getClass(), "file", null);
        setField(term9383, term9383.getClass(), "parentPath", null);
        setField(term9383, term9383.getClass(), "character", null);
        setField(term9383, term9383.getClass(), "version", null);
        setField(term9383, term9383.getClass(), "extensions", null);
        setBooleanField(term9383, term9383.getClass(), "alpha", false);
        setBooleanField(term9383, term9383.getClass(), "damaged", false);
        setBooleanField(term9383, term9383.getClass(), "hd", false);
        setBooleanField(term9383, term9383.getClass(), "he", false);
        setBooleanField(term9383, term9383.getClass(), "difference", false);
        setBooleanField(term9383, term9383.getClass(), "skin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term9383, args);
    }

};



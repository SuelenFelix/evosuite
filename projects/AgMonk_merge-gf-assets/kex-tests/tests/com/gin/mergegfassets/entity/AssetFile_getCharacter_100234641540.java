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

public class AssetFile_getCharacter_100234641540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9231;

    public AssetFile_getCharacter_100234641540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9231 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        setField(term9231, term9231.getClass(), "file", null);
        setField(term9231, term9231.getClass(), "parentPath", null);
        setField(term9231, term9231.getClass(), "character", null);
        setField(term9231, term9231.getClass(), "version", null);
        setField(term9231, term9231.getClass(), "extensions", null);
        setBooleanField(term9231, term9231.getClass(), "alpha", false);
        setBooleanField(term9231, term9231.getClass(), "damaged", false);
        setBooleanField(term9231, term9231.getClass(), "hd", false);
        setBooleanField(term9231, term9231.getClass(), "he", false);
        setBooleanField(term9231, term9231.getClass(), "difference", false);
        setBooleanField(term9231, term9231.getClass(), "skin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacter", argTypes, term9231, args);
    }

};



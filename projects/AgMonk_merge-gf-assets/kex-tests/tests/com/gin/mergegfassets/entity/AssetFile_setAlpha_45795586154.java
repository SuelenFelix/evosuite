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
import java.lang.Boolean;

public class AssetFile_setAlpha_45795586154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9329;
     Object term9336;

    public AssetFile_setAlpha_45795586154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9329 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        setField(term9329, term9329.getClass(), "file", null);
        setField(term9329, term9329.getClass(), "parentPath", null);
        setField(term9329, term9329.getClass(), "character", null);
        setField(term9329, term9329.getClass(), "version", null);
        setField(term9329, term9329.getClass(), "extensions", null);
        setBooleanField(term9329, term9329.getClass(), "alpha", false);
        setBooleanField(term9329, term9329.getClass(), "damaged", false);
        setBooleanField(term9329, term9329.getClass(), "hd", false);
        setBooleanField(term9329, term9329.getClass(), "he", false);
        setBooleanField(term9329, term9329.getClass(), "difference", false);
        setBooleanField(term9329, term9329.getClass(), "skin", false);
        term9336 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9336;
        callMethod(klass, "setAlpha", argTypes, term9329, args);
    }

};



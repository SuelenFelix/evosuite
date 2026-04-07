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

public class AssetFile_setDifference_118314129858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9365;
     Object term9372;

    public AssetFile_setDifference_118314129858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9365 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        setField(term9365, term9365.getClass(), "file", null);
        setField(term9365, term9365.getClass(), "parentPath", null);
        setField(term9365, term9365.getClass(), "character", null);
        setField(term9365, term9365.getClass(), "version", null);
        setField(term9365, term9365.getClass(), "extensions", null);
        setBooleanField(term9365, term9365.getClass(), "alpha", false);
        setBooleanField(term9365, term9365.getClass(), "damaged", false);
        setBooleanField(term9365, term9365.getClass(), "hd", false);
        setBooleanField(term9365, term9365.getClass(), "he", false);
        setBooleanField(term9365, term9365.getClass(), "difference", false);
        setBooleanField(term9365, term9365.getClass(), "skin", false);
        term9372 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9372;
        callMethod(klass, "setDifference", argTypes, term9365, args);
    }

};



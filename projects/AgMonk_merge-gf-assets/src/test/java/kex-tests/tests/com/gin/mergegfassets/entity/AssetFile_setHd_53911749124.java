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

public class AssetFile_setHd_53911749124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6988;
     Object term7068;

    public AssetFile_setHd_53911749124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7081 = Class.forName((String) "java.io.File$PathStatus");
        Field term7080 = ((Class) term7081).getDeclaredField((String) "INVALID");
        ((Field) term7080).setAccessible(true);
        Object enum25 = ((Field) term7080).get((Object) null);
        term6988 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term6989 = newInstance(Class.forName("java.io.File"));
        setField(term6989, term6989.getClass(), "path", "AKNapTAfmD");
        setField(term6989, term6989.getClass(), "status", enum25);
        setIntField(term6989, term6989.getClass(), "prefixLength", 865208305);
        setField(term6989, term6989.getClass(), "filePath", null);
        setField(term6988, term6988.getClass(), "file", term6989);
        setField(term6988, term6988.getClass(), "parentPath", "xJgPlLxpgC");
        setField(term6988, term6988.getClass(), "character", "EYtfuJaxiM");
        setField(term6988, term6988.getClass(), "version", "gCWtLVKVVe");
        setField(term6988, term6988.getClass(), "extensions", "fWKJoSoCwE");
        setBooleanField(term6988, term6988.getClass(), "alpha", true);
        setBooleanField(term6988, term6988.getClass(), "damaged", true);
        setBooleanField(term6988, term6988.getClass(), "hd", false);
        setBooleanField(term6988, term6988.getClass(), "he", false);
        setBooleanField(term6988, term6988.getClass(), "difference", false);
        setBooleanField(term6988, term6988.getClass(), "skin", true);
        term7068 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7068;
        callMethod(klass, "setHd", argTypes, term6988, args);
    }

};



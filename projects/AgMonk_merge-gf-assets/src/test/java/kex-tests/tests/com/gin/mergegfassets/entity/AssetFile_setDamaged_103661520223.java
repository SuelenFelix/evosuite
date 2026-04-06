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

public class AssetFile_setDamaged_103661520223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6713;
     Object term6793;

    public AssetFile_setDamaged_103661520223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6806 = Class.forName((String) "java.io.File$PathStatus");
        Field term6805 = ((Class) term6806).getDeclaredField((String) "INVALID");
        ((Field) term6805).setAccessible(true);
        Object enum24 = ((Field) term6805).get((Object) null);
        term6713 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term6714 = newInstance(Class.forName("java.io.File"));
        setField(term6714, term6714.getClass(), "path", "JDaAnsVTGV");
        setField(term6714, term6714.getClass(), "status", enum24);
        setIntField(term6714, term6714.getClass(), "prefixLength", 590364439);
        setField(term6714, term6714.getClass(), "filePath", null);
        setField(term6713, term6713.getClass(), "file", term6714);
        setField(term6713, term6713.getClass(), "parentPath", "mLUZFTfjle");
        setField(term6713, term6713.getClass(), "character", "xIeFjkHkOe");
        setField(term6713, term6713.getClass(), "version", "SdCKLMIYnX");
        setField(term6713, term6713.getClass(), "extensions", "OJJtVNPyKZ");
        setBooleanField(term6713, term6713.getClass(), "alpha", true);
        setBooleanField(term6713, term6713.getClass(), "damaged", false);
        setBooleanField(term6713, term6713.getClass(), "hd", false);
        setBooleanField(term6713, term6713.getClass(), "he", false);
        setBooleanField(term6713, term6713.getClass(), "difference", true);
        setBooleanField(term6713, term6713.getClass(), "skin", true);
        term6793 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6793;
        callMethod(klass, "setDamaged", argTypes, term6713, args);
    }

};



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

public class AssetFile_setVersion_175125632020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5848;

    public AssetFile_setVersion_175125632020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5951 = Class.forName((String) "java.io.File$PathStatus");
        Field term5950 = ((Class) term5951).getDeclaredField((String) "CHECKED");
        ((Field) term5950).setAccessible(true);
        Object enum21 = ((Field) term5950).get((Object) null);
        term5848 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term5849 = newInstance(Class.forName("java.io.File"));
        setField(term5849, term5849.getClass(), "path", "fztQhjqwdP");
        setField(term5849, term5849.getClass(), "status", enum21);
        setIntField(term5849, term5849.getClass(), "prefixLength", -117576464);
        setField(term5849, term5849.getClass(), "filePath", null);
        setField(term5848, term5848.getClass(), "file", term5849);
        setField(term5848, term5848.getClass(), "parentPath", "eVpkWxjuki");
        setField(term5848, term5848.getClass(), "character", "SJiQaLvSKv");
        setField(term5848, term5848.getClass(), "version", "OEXDRUKcFl");
        setField(term5848, term5848.getClass(), "extensions", "RYdKCNNMBR");
        setBooleanField(term5848, term5848.getClass(), "alpha", true);
        setBooleanField(term5848, term5848.getClass(), "damaged", false);
        setBooleanField(term5848, term5848.getClass(), "hd", false);
        setBooleanField(term5848, term5848.getClass(), "he", true);
        setBooleanField(term5848, term5848.getClass(), "difference", true);
        setBooleanField(term5848, term5848.getClass(), "skin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yGtHPyvYiQ";
        callMethod(klass, "setVersion", argTypes, term5848, args);
    }

};



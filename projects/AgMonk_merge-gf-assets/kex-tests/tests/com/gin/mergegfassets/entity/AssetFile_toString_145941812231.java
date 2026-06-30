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

public class AssetFile_toString_145941812231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8909;

    public AssetFile_toString_145941812231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9000 = Class.forName((String) "java.io.File$PathStatus");
        Field term8999 = ((Class) term9000).getDeclaredField((String) "INVALID");
        ((Field) term8999).setAccessible(true);
        Object enum32 = ((Field) term8999).get((Object) null);
        term8909 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term8910 = newInstance(Class.forName("java.io.File"));
        setField(term8910, term8910.getClass(), "path", "smnHEqRFRx");
        setField(term8910, term8910.getClass(), "status", enum32);
        setIntField(term8910, term8910.getClass(), "prefixLength", 1193880199);
        setField(term8910, term8910.getClass(), "filePath", null);
        setField(term8909, term8909.getClass(), "file", term8910);
        setField(term8909, term8909.getClass(), "parentPath", "XYtryyobou");
        setField(term8909, term8909.getClass(), "character", "OYbzXylRWW");
        setField(term8909, term8909.getClass(), "version", "DSNsTGYXDF");
        setField(term8909, term8909.getClass(), "extensions", "sQvGcVjdEx");
        setBooleanField(term8909, term8909.getClass(), "alpha", false);
        setBooleanField(term8909, term8909.getClass(), "damaged", true);
        setBooleanField(term8909, term8909.getClass(), "hd", true);
        setBooleanField(term8909, term8909.getClass(), "he", false);
        setBooleanField(term8909, term8909.getClass(), "difference", true);
        setBooleanField(term8909, term8909.getClass(), "skin", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8909, args);
    }

};



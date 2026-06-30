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

public class AssetFile_isDamaged_67202077212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3442;

    public AssetFile_isDamaged_67202077212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3533 = Class.forName((String) "java.io.File$PathStatus");
        Field term3532 = ((Class) term3533).getDeclaredField((String) "INVALID");
        ((Field) term3532).setAccessible(true);
        Object enum12 = ((Field) term3532).get((Object) null);
        term3442 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term3443 = newInstance(Class.forName("java.io.File"));
        setField(term3443, term3443.getClass(), "path", "kBdSllIBVz");
        setField(term3443, term3443.getClass(), "status", enum12);
        setIntField(term3443, term3443.getClass(), "prefixLength", 1585847225);
        setField(term3443, term3443.getClass(), "filePath", null);
        setField(term3442, term3442.getClass(), "file", term3443);
        setField(term3442, term3442.getClass(), "parentPath", "TJmVBGfTML");
        setField(term3442, term3442.getClass(), "character", "tPlsykYBqO");
        setField(term3442, term3442.getClass(), "version", "bLPjGVBhlX");
        setField(term3442, term3442.getClass(), "extensions", "whBvTVIIlC");
        setBooleanField(term3442, term3442.getClass(), "alpha", false);
        setBooleanField(term3442, term3442.getClass(), "damaged", true);
        setBooleanField(term3442, term3442.getClass(), "hd", false);
        setBooleanField(term3442, term3442.getClass(), "he", false);
        setBooleanField(term3442, term3442.getClass(), "difference", true);
        setBooleanField(term3442, term3442.getClass(), "skin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDamaged", argTypes, term3442, args);
    }

};



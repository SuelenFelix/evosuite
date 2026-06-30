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

public class AssetFile_toFilename_1355135364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258;

    public AssetFile_toFilename_1355135364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1349 = Class.forName((String) "java.io.File$PathStatus");
        Field term1348 = ((Class) term1349).getDeclaredField((String) "CHECKED");
        ((Field) term1348).setAccessible(true);
        Object enum4 = ((Field) term1348).get((Object) null);
        term1258 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term1259 = newInstance(Class.forName("java.io.File"));
        setField(term1259, term1259.getClass(), "path", "flxyYxBRtu");
        setField(term1259, term1259.getClass(), "status", enum4);
        setIntField(term1259, term1259.getClass(), "prefixLength", -1955890973);
        setField(term1259, term1259.getClass(), "filePath", null);
        setField(term1258, term1258.getClass(), "file", term1259);
        setField(term1258, term1258.getClass(), "parentPath", "OclPbYPkcH");
        setField(term1258, term1258.getClass(), "character", "IoAlmYsBwc");
        setField(term1258, term1258.getClass(), "version", "TEParAifyi");
        setField(term1258, term1258.getClass(), "extensions", "OWDIEULEFu");
        setBooleanField(term1258, term1258.getClass(), "alpha", true);
        setBooleanField(term1258, term1258.getClass(), "damaged", true);
        setBooleanField(term1258, term1258.getClass(), "hd", true);
        setBooleanField(term1258, term1258.getClass(), "he", true);
        setBooleanField(term1258, term1258.getClass(), "difference", false);
        setBooleanField(term1258, term1258.getClass(), "skin", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toFilename", argTypes, term1258, args);
    }

};



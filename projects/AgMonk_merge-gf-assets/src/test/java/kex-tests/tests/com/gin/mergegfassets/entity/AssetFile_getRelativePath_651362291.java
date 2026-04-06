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

public class AssetFile_getRelativePath_651362291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201;

    public AssetFile_getRelativePath_651362291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term292 = Class.forName((String) "java.io.File$PathStatus");
        Field term291 = ((Class) term292).getDeclaredField((String) "INVALID");
        ((Field) term291).setAccessible(true);
        Object enum1 = ((Field) term291).get((Object) null);
        term201 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term202 = newInstance(Class.forName("java.io.File"));
        setField(term202, term202.getClass(), "path", "sjlJAEtRrb");
        setField(term202, term202.getClass(), "status", enum1);
        setIntField(term202, term202.getClass(), "prefixLength", 1162663216);
        setField(term202, term202.getClass(), "filePath", null);
        setField(term201, term201.getClass(), "file", term202);
        setField(term201, term201.getClass(), "parentPath", "MuLcgQHgqz");
        setField(term201, term201.getClass(), "character", "xxtlPwDYFs");
        setField(term201, term201.getClass(), "version", "jJCZpVmanW");
        setField(term201, term201.getClass(), "extensions", "EGtDIRbSSb");
        setBooleanField(term201, term201.getClass(), "alpha", false);
        setBooleanField(term201, term201.getClass(), "damaged", false);
        setBooleanField(term201, term201.getClass(), "hd", false);
        setBooleanField(term201, term201.getClass(), "he", false);
        setBooleanField(term201, term201.getClass(), "difference", true);
        setBooleanField(term201, term201.getClass(), "skin", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePath", argTypes, term201, args);
    }

};



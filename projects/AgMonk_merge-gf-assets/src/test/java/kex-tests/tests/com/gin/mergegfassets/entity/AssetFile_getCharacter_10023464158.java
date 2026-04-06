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

public class AssetFile_getCharacter_10023464158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2350;

    public AssetFile_getCharacter_10023464158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2441 = Class.forName((String) "java.io.File$PathStatus");
        Field term2440 = ((Class) term2441).getDeclaredField((String) "INVALID");
        ((Field) term2440).setAccessible(true);
        Object enum8 = ((Field) term2440).get((Object) null);
        term2350 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term2351 = newInstance(Class.forName("java.io.File"));
        setField(term2351, term2351.getClass(), "path", "tShwQLRGNe");
        setField(term2351, term2351.getClass(), "status", enum8);
        setIntField(term2351, term2351.getClass(), "prefixLength", 1725571209);
        setField(term2351, term2351.getClass(), "filePath", null);
        setField(term2350, term2350.getClass(), "file", term2351);
        setField(term2350, term2350.getClass(), "parentPath", "LvtrsXUliU");
        setField(term2350, term2350.getClass(), "character", "xLbjWUgOIL");
        setField(term2350, term2350.getClass(), "version", "jDtqGUpnZN");
        setField(term2350, term2350.getClass(), "extensions", "nGKItKLYNC");
        setBooleanField(term2350, term2350.getClass(), "alpha", true);
        setBooleanField(term2350, term2350.getClass(), "damaged", false);
        setBooleanField(term2350, term2350.getClass(), "hd", false);
        setBooleanField(term2350, term2350.getClass(), "he", true);
        setBooleanField(term2350, term2350.getClass(), "difference", false);
        setBooleanField(term2350, term2350.getClass(), "skin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacter", argTypes, term2350, args);
    }

};



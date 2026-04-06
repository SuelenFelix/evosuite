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

public class AssetFile_setParentPath_82132124318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5258;

    public AssetFile_setParentPath_82132124318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5361 = Class.forName((String) "java.io.File$PathStatus");
        Field term5360 = ((Class) term5361).getDeclaredField((String) "CHECKED");
        ((Field) term5360).setAccessible(true);
        Object enum19 = ((Field) term5360).get((Object) null);
        term5258 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term5259 = newInstance(Class.forName("java.io.File"));
        setField(term5259, term5259.getClass(), "path", "JiVRgTZvKc");
        setField(term5259, term5259.getClass(), "status", enum19);
        setIntField(term5259, term5259.getClass(), "prefixLength", -6029667);
        setField(term5259, term5259.getClass(), "filePath", null);
        setField(term5258, term5258.getClass(), "file", term5259);
        setField(term5258, term5258.getClass(), "parentPath", "XPKmummaqg");
        setField(term5258, term5258.getClass(), "character", "BKLfkLiZTH");
        setField(term5258, term5258.getClass(), "version", "SPpkrGcPRr");
        setField(term5258, term5258.getClass(), "extensions", "sEccwbJKYE");
        setBooleanField(term5258, term5258.getClass(), "alpha", false);
        setBooleanField(term5258, term5258.getClass(), "damaged", false);
        setBooleanField(term5258, term5258.getClass(), "hd", true);
        setBooleanField(term5258, term5258.getClass(), "he", true);
        setBooleanField(term5258, term5258.getClass(), "difference", false);
        setBooleanField(term5258, term5258.getClass(), "skin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AWRooQKkdW";
        callMethod(klass, "setParentPath", argTypes, term5258, args);
    }

};



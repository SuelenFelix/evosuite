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

public class AssetFile_isSkin_154107126416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4534;

    public AssetFile_isSkin_154107126416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4625 = Class.forName((String) "java.io.File$PathStatus");
        Field term4624 = ((Class) term4625).getDeclaredField((String) "INVALID");
        ((Field) term4624).setAccessible(true);
        Object enum16 = ((Field) term4624).get((Object) null);
        term4534 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term4535 = newInstance(Class.forName("java.io.File"));
        setField(term4535, term4535.getClass(), "path", "PHvxnGHptP");
        setField(term4535, term4535.getClass(), "status", enum16);
        setIntField(term4535, term4535.getClass(), "prefixLength", 1622346318);
        setField(term4535, term4535.getClass(), "filePath", null);
        setField(term4534, term4534.getClass(), "file", term4535);
        setField(term4534, term4534.getClass(), "parentPath", "TimdotUuNC");
        setField(term4534, term4534.getClass(), "character", "PkWMRdJcBb");
        setField(term4534, term4534.getClass(), "version", "jSpAteRute");
        setField(term4534, term4534.getClass(), "extensions", "swZVeJAxjt");
        setBooleanField(term4534, term4534.getClass(), "alpha", false);
        setBooleanField(term4534, term4534.getClass(), "damaged", false);
        setBooleanField(term4534, term4534.getClass(), "hd", true);
        setBooleanField(term4534, term4534.getClass(), "he", true);
        setBooleanField(term4534, term4534.getClass(), "difference", true);
        setBooleanField(term4534, term4534.getClass(), "skin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSkin", argTypes, term4534, args);
    }

};



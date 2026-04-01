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

public class AssetFile_similar_12103162563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term866;
     Object term946;

    public AssetFile_similar_12103162563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1026 = Class.forName((String) "java.io.File$PathStatus");
        Field term1025 = ((Class) term1026).getDeclaredField((String) "CHECKED");
        ((Field) term1025).setAccessible(true);
        Object enum3 = ((Field) term1025).get((Object) null);
        term866 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term867 = newInstance(Class.forName("java.io.File"));
        setField(term867, term867.getClass(), "path", "ZiaGIbnzTs");
        setField(term867, term867.getClass(), "status", enum3);
        setIntField(term867, term867.getClass(), "prefixLength", -1922583790);
        setField(term867, term867.getClass(), "filePath", null);
        setField(term866, term866.getClass(), "file", term867);
        setField(term866, term866.getClass(), "parentPath", "tbcdzjIfER");
        setField(term866, term866.getClass(), "character", "HyxfbSQYBe");
        setField(term866, term866.getClass(), "version", "pCTimMblYc");
        setField(term866, term866.getClass(), "extensions", "hNxWaHcfhY");
        setBooleanField(term866, term866.getClass(), "alpha", false);
        setBooleanField(term866, term866.getClass(), "damaged", false);
        setBooleanField(term866, term866.getClass(), "hd", true);
        setBooleanField(term866, term866.getClass(), "he", true);
        setBooleanField(term866, term866.getClass(), "difference", true);
        setBooleanField(term866, term866.getClass(), "skin", true);
        term946 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term947 = newInstance(Class.forName("java.io.File"));
        setField(term947, term947.getClass(), "path", "RkybSrpybU");
        setField(term947, term947.getClass(), "status", enum3);
        setIntField(term947, term947.getClass(), "prefixLength", -616727354);
        setField(term947, term947.getClass(), "filePath", null);
        setField(term946, term946.getClass(), "file", term947);
        setField(term946, term946.getClass(), "parentPath", "xOEqzGAmDU");
        setField(term946, term946.getClass(), "character", "eZFUvlxvGV");
        setField(term946, term946.getClass(), "version", "BYqFIqCKAV");
        setField(term946, term946.getClass(), "extensions", "vrQLuWIDJX");
        setBooleanField(term946, term946.getClass(), "alpha", true);
        setBooleanField(term946, term946.getClass(), "damaged", false);
        setBooleanField(term946, term946.getClass(), "hd", false);
        setBooleanField(term946, term946.getClass(), "he", false);
        setBooleanField(term946, term946.getClass(), "difference", true);
        setBooleanField(term946, term946.getClass(), "skin", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Object[] args = new Object[1];
        args[0] = term946;
        callMethod(klass, "similar", argTypes, term866, args);
    }

};



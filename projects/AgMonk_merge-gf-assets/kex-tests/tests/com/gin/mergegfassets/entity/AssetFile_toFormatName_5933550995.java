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

public class AssetFile_toFormatName_5933550995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1531;

    public AssetFile_toFormatName_5933550995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1622 = Class.forName((String) "java.io.File$PathStatus");
        Field term1621 = ((Class) term1622).getDeclaredField((String) "CHECKED");
        ((Field) term1621).setAccessible(true);
        Object enum5 = ((Field) term1621).get((Object) null);
        term1531 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term1532 = newInstance(Class.forName("java.io.File"));
        setField(term1532, term1532.getClass(), "path", "dWRymuLBtr");
        setField(term1532, term1532.getClass(), "status", enum5);
        setIntField(term1532, term1532.getClass(), "prefixLength", -2038273078);
        setField(term1532, term1532.getClass(), "filePath", null);
        setField(term1531, term1531.getClass(), "file", term1532);
        setField(term1531, term1531.getClass(), "parentPath", "AijpHYOFuy");
        setField(term1531, term1531.getClass(), "character", "SbAoxhfrkn");
        setField(term1531, term1531.getClass(), "version", "kuTXqwMtDB");
        setField(term1531, term1531.getClass(), "extensions", "Ghbwtircqb");
        setBooleanField(term1531, term1531.getClass(), "alpha", true);
        setBooleanField(term1531, term1531.getClass(), "damaged", true);
        setBooleanField(term1531, term1531.getClass(), "hd", true);
        setBooleanField(term1531, term1531.getClass(), "he", false);
        setBooleanField(term1531, term1531.getClass(), "difference", false);
        setBooleanField(term1531, term1531.getClass(), "skin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toFormatName", argTypes, term1531, args);
    }

};



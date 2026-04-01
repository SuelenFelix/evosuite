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
import java.util.LinkedList;

public class AssetFilePair_init_15990689730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9940;
     Object term10020;

    public AssetFilePair_init_15990689730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10177 = Class.forName((String) "java.io.File$PathStatus");
        Field term10176 = ((Class) term10177).getDeclaredField((String) "CHECKED");
        ((Field) term10176).setAccessible(true);
        Object enum33 = ((Field) term10176).get((Object) null);
        term9940 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term9941 = newInstance(Class.forName("java.io.File"));
        setField(term9941, term9941.getClass(), "path", "tRxZafjqIx");
        setField(term9941, term9941.getClass(), "status", enum33);
        setIntField(term9941, term9941.getClass(), "prefixLength", -1087774327);
        setField(term9941, term9941.getClass(), "filePath", null);
        setField(term9940, term9940.getClass(), "file", term9941);
        setField(term9940, term9940.getClass(), "parentPath", "DhjNLmRMCu");
        setField(term9940, term9940.getClass(), "character", "PgPzMSEjjX");
        setField(term9940, term9940.getClass(), "version", "wzsPSPcRdj");
        setField(term9940, term9940.getClass(), "extensions", "kGMQdqJYyB");
        setBooleanField(term9940, term9940.getClass(), "alpha", true);
        setBooleanField(term9940, term9940.getClass(), "damaged", true);
        setBooleanField(term9940, term9940.getClass(), "hd", true);
        setBooleanField(term9940, term9940.getClass(), "he", true);
        setBooleanField(term9940, term9940.getClass(), "difference", false);
        setBooleanField(term9940, term9940.getClass(), "skin", true);
        Object term10023 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term10024 = newInstance(Class.forName("java.io.File"));
        setField(term10024, term10024.getClass(), "path", "");
        setField(term10024, term10024.getClass(), "status", enum33);
        setIntField(term10024, term10024.getClass(), "prefixLength", -1530420153);
        setField(term10024, term10024.getClass(), "filePath", null);
        setField(term10023, term10023.getClass(), "file", term10024);
        setField(term10023, term10023.getClass(), "parentPath", "HDaezxQfQR");
        setField(term10023, term10023.getClass(), "character", "iikZEapDlu");
        setField(term10023, term10023.getClass(), "version", "nhoHrZfnIN");
        setField(term10023, term10023.getClass(), "extensions", "ZkMALXpEAZ");
        setBooleanField(term10023, term10023.getClass(), "alpha", true);
        setBooleanField(term10023, term10023.getClass(), "damaged", false);
        setBooleanField(term10023, term10023.getClass(), "hd", false);
        setBooleanField(term10023, term10023.getClass(), "he", true);
        setBooleanField(term10023, term10023.getClass(), "difference", false);
        setBooleanField(term10023, term10023.getClass(), "skin", false);
        Object term10082 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term10083 = newInstance(Class.forName("java.io.File"));
        setField(term10083, term10083.getClass(), "path", null);
        setField(term10083, term10083.getClass(), "status", enum33);
        setIntField(term10083, term10083.getClass(), "prefixLength", -469968304);
        setField(term10083, term10083.getClass(), "filePath", null);
        setField(term10082, term10082.getClass(), "file", term10083);
        setField(term10082, term10082.getClass(), "parentPath", "");
        setField(term10082, term10082.getClass(), "character", "");
        setField(term10082, term10082.getClass(), "version", "");
        setField(term10082, term10082.getClass(), "extensions", "");
        setBooleanField(term10082, term10082.getClass(), "alpha", true);
        setBooleanField(term10082, term10082.getClass(), "damaged", true);
        setBooleanField(term10082, term10082.getClass(), "hd", false);
        setBooleanField(term10082, term10082.getClass(), "he", false);
        setBooleanField(term10082, term10082.getClass(), "difference", false);
        setBooleanField(term10082, term10082.getClass(), "skin", false);
        Object term10096 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        setField(term10096, term10096.getClass(), "file", null);
        setField(term10096, term10096.getClass(), "parentPath", null);
        setField(term10096, term10096.getClass(), "character", null);
        setField(term10096, term10096.getClass(), "version", null);
        setField(term10096, term10096.getClass(), "extensions", null);
        setBooleanField(term10096, term10096.getClass(), "alpha", true);
        setBooleanField(term10096, term10096.getClass(), "damaged", true);
        setBooleanField(term10096, term10096.getClass(), "hd", true);
        setBooleanField(term10096, term10096.getClass(), "he", true);
        setBooleanField(term10096, term10096.getClass(), "difference", false);
        setBooleanField(term10096, term10096.getClass(), "skin", false);
        term10020 = new LinkedList();
        ((LinkedList) term10020).add(term10023);
        ((LinkedList) term10020).add(term10082);
        ((LinkedList) term10020).add(term10096);
        ((LinkedList) term10020).add((Object)null);
        ((LinkedList) term10020).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFilePair");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term9940;
        args[1] = term10020;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



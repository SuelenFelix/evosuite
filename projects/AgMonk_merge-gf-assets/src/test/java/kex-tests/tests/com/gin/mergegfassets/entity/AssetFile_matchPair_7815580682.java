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

public class AssetFile_matchPair_7815580682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474;
     Object term554;

    public AssetFile_matchPair_7815580682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term634 = Class.forName((String) "java.io.File$PathStatus");
        Field term633 = ((Class) term634).getDeclaredField((String) "INVALID");
        ((Field) term633).setAccessible(true);
        Object enum2 = ((Field) term633).get((Object) null);
        term474 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term475 = newInstance(Class.forName("java.io.File"));
        setField(term475, term475.getClass(), "path", "SzjVpOQTyS");
        setField(term475, term475.getClass(), "status", enum2);
        setIntField(term475, term475.getClass(), "prefixLength", 1484323161);
        setField(term475, term475.getClass(), "filePath", null);
        setField(term474, term474.getClass(), "file", term475);
        setField(term474, term474.getClass(), "parentPath", "MjGYSRKTNF");
        setField(term474, term474.getClass(), "character", "hRNSzYYIrc");
        setField(term474, term474.getClass(), "version", "RMFIsYGgne");
        setField(term474, term474.getClass(), "extensions", "NRdvgJlhkX");
        setBooleanField(term474, term474.getClass(), "alpha", true);
        setBooleanField(term474, term474.getClass(), "damaged", true);
        setBooleanField(term474, term474.getClass(), "hd", false);
        setBooleanField(term474, term474.getClass(), "he", true);
        setBooleanField(term474, term474.getClass(), "difference", false);
        setBooleanField(term474, term474.getClass(), "skin", true);
        term554 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term555 = newInstance(Class.forName("java.io.File"));
        setField(term555, term555.getClass(), "path", "uuaPigETmJ");
        setField(term555, term555.getClass(), "status", enum2);
        setIntField(term555, term555.getClass(), "prefixLength", 391863371);
        setField(term555, term555.getClass(), "filePath", null);
        setField(term554, term554.getClass(), "file", term555);
        setField(term554, term554.getClass(), "parentPath", "MxlszYVzRf");
        setField(term554, term554.getClass(), "character", "LQFpaHEwXR");
        setField(term554, term554.getClass(), "version", "oVcInYnLWB");
        setField(term554, term554.getClass(), "extensions", "aJlieCFVtF");
        setBooleanField(term554, term554.getClass(), "alpha", false);
        setBooleanField(term554, term554.getClass(), "damaged", true);
        setBooleanField(term554, term554.getClass(), "hd", false);
        setBooleanField(term554, term554.getClass(), "he", false);
        setBooleanField(term554, term554.getClass(), "difference", true);
        setBooleanField(term554, term554.getClass(), "skin", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Object[] args = new Object[1];
        args[0] = term554;
        callMethod(klass, "matchPair", argTypes, term474, args);
    }

};



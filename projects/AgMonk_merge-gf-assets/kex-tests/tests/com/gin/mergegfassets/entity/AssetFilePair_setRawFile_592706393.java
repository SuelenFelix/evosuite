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
import java.util.ArrayList;

public class AssetFilePair_setRawFile_592706393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11095;
     Object term11237;

    public AssetFilePair_setRawFile_592706393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11317 = Class.forName((String) "java.io.File$PathStatus");
        Field term11316 = ((Class) term11317).getDeclaredField((String) "CHECKED");
        ((Field) term11316).setAccessible(true);
        Object enum36 = ((Field) term11316).get((Object) null);
        Object term11170 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term11171 = newInstance(Class.forName("java.io.File"));
        setField(term11171, term11171.getClass(), "path", null);
        setField(term11171, term11171.getClass(), "status", null);
        setIntField(term11171, term11171.getClass(), "prefixLength", -1048298087);
        setField(term11171, term11171.getClass(), "filePath", null);
        setField(term11170, term11170.getClass(), "file", term11171);
        setField(term11170, term11170.getClass(), "parentPath", "");
        setField(term11170, term11170.getClass(), "character", "");
        setField(term11170, term11170.getClass(), "version", "");
        setField(term11170, term11170.getClass(), "extensions", "");
        setBooleanField(term11170, term11170.getClass(), "alpha", false);
        setBooleanField(term11170, term11170.getClass(), "damaged", true);
        setBooleanField(term11170, term11170.getClass(), "hd", true);
        setBooleanField(term11170, term11170.getClass(), "he", false);
        setBooleanField(term11170, term11170.getClass(), "difference", true);
        setBooleanField(term11170, term11170.getClass(), "skin", false);
        Object term11183 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term11184 = newInstance(Class.forName("java.io.File"));
        setField(term11184, term11184.getClass(), "path", null);
        setField(term11184, term11184.getClass(), "status", enum36);
        setIntField(term11184, term11184.getClass(), "prefixLength", 292681826);
        setField(term11184, term11184.getClass(), "filePath", null);
        setField(term11183, term11183.getClass(), "file", term11184);
        setField(term11183, term11183.getClass(), "parentPath", "");
        setField(term11183, term11183.getClass(), "character", "");
        setField(term11183, term11183.getClass(), "version", "");
        setField(term11183, term11183.getClass(), "extensions", "");
        setBooleanField(term11183, term11183.getClass(), "alpha", true);
        setBooleanField(term11183, term11183.getClass(), "damaged", true);
        setBooleanField(term11183, term11183.getClass(), "hd", false);
        setBooleanField(term11183, term11183.getClass(), "he", true);
        setBooleanField(term11183, term11183.getClass(), "difference", false);
        setBooleanField(term11183, term11183.getClass(), "skin", false);
        Object term11196 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term11197 = newInstance(Class.forName("java.io.File"));
        setField(term11197, term11197.getClass(), "path", null);
        setField(term11197, term11197.getClass(), "status", enum36);
        setIntField(term11197, term11197.getClass(), "prefixLength", 458147407);
        setField(term11197, term11197.getClass(), "filePath", null);
        setField(term11196, term11196.getClass(), "file", term11197);
        setField(term11196, term11196.getClass(), "parentPath", "");
        setField(term11196, term11196.getClass(), "character", "");
        setField(term11196, term11196.getClass(), "version", "");
        setField(term11196, term11196.getClass(), "extensions", "");
        setBooleanField(term11196, term11196.getClass(), "alpha", false);
        setBooleanField(term11196, term11196.getClass(), "damaged", true);
        setBooleanField(term11196, term11196.getClass(), "hd", true);
        setBooleanField(term11196, term11196.getClass(), "he", false);
        setBooleanField(term11196, term11196.getClass(), "difference", true);
        setBooleanField(term11196, term11196.getClass(), "skin", true);
        Object term11209 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term11210 = newInstance(Class.forName("java.io.File"));
        setField(term11210, term11210.getClass(), "path", null);
        setField(term11210, term11210.getClass(), "status", null);
        setIntField(term11210, term11210.getClass(), "prefixLength", -184153539);
        setField(term11210, term11210.getClass(), "filePath", null);
        setField(term11209, term11209.getClass(), "file", term11210);
        setField(term11209, term11209.getClass(), "parentPath", "");
        setField(term11209, term11209.getClass(), "character", "");
        setField(term11209, term11209.getClass(), "version", "");
        setField(term11209, term11209.getClass(), "extensions", "");
        setBooleanField(term11209, term11209.getClass(), "alpha", true);
        setBooleanField(term11209, term11209.getClass(), "damaged", false);
        setBooleanField(term11209, term11209.getClass(), "hd", true);
        setBooleanField(term11209, term11209.getClass(), "he", false);
        setBooleanField(term11209, term11209.getClass(), "difference", true);
        setBooleanField(term11209, term11209.getClass(), "skin", true);
        Object term11222 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term11223 = newInstance(Class.forName("java.io.File"));
        setField(term11223, term11223.getClass(), "path", null);
        setField(term11223, term11223.getClass(), "status", enum36);
        setIntField(term11223, term11223.getClass(), "prefixLength", 493620644);
        setField(term11223, term11223.getClass(), "filePath", null);
        setField(term11222, term11222.getClass(), "file", term11223);
        setField(term11222, term11222.getClass(), "parentPath", "");
        setField(term11222, term11222.getClass(), "character", "");
        setField(term11222, term11222.getClass(), "version", "");
        setField(term11222, term11222.getClass(), "extensions", "");
        setBooleanField(term11222, term11222.getClass(), "alpha", false);
        setBooleanField(term11222, term11222.getClass(), "damaged", false);
        setBooleanField(term11222, term11222.getClass(), "hd", false);
        setBooleanField(term11222, term11222.getClass(), "he", false);
        setBooleanField(term11222, term11222.getClass(), "difference", true);
        setBooleanField(term11222, term11222.getClass(), "skin", true);
        ArrayList term11168 = new ArrayList();
        ((ArrayList) term11168).add(term11170);
        ((ArrayList) term11168).add(term11183);
        ((ArrayList) term11168).add(term11196);
        ((ArrayList) term11168).add(term11209);
        ((ArrayList) term11168).add(term11222);
        term11095 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFilePair"));
        Object term11096 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term11097 = newInstance(Class.forName("java.io.File"));
        setField(term11097, term11097.getClass(), "path", "urCiQnUFBM");
        setField(term11097, term11097.getClass(), "status", enum36);
        setIntField(term11097, term11097.getClass(), "prefixLength", 2055867847);
        setField(term11097, term11097.getClass(), "filePath", null);
        setField(term11096, term11096.getClass(), "file", term11097);
        setField(term11096, term11096.getClass(), "parentPath", "EKjQdtKxAM");
        setField(term11096, term11096.getClass(), "character", "TXZAIPQJHt");
        setField(term11096, term11096.getClass(), "version", "DIbeDHICho");
        setField(term11096, term11096.getClass(), "extensions", "dJGPlmSRnz");
        setBooleanField(term11096, term11096.getClass(), "alpha", false);
        setBooleanField(term11096, term11096.getClass(), "damaged", true);
        setBooleanField(term11096, term11096.getClass(), "hd", true);
        setBooleanField(term11096, term11096.getClass(), "he", false);
        setBooleanField(term11096, term11096.getClass(), "difference", true);
        setBooleanField(term11096, term11096.getClass(), "skin", true);
        setField(term11095, term11095.getClass(), "rawFile", term11096);
        setField(term11095, term11095.getClass(), "alphaFiles", term11168);
        term11237 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term11238 = newInstance(Class.forName("java.io.File"));
        setField(term11238, term11238.getClass(), "path", "BbNeQJpYPr");
        setField(term11238, term11238.getClass(), "status", enum36);
        setIntField(term11238, term11238.getClass(), "prefixLength", 1328271830);
        setField(term11238, term11238.getClass(), "filePath", null);
        setField(term11237, term11237.getClass(), "file", term11238);
        setField(term11237, term11237.getClass(), "parentPath", "riMtzCoxNj");
        setField(term11237, term11237.getClass(), "character", "YAXkVjQZcV");
        setField(term11237, term11237.getClass(), "version", "pumvwBWvpy");
        setField(term11237, term11237.getClass(), "extensions", "HwLHeGLyhe");
        setBooleanField(term11237, term11237.getClass(), "alpha", false);
        setBooleanField(term11237, term11237.getClass(), "damaged", true);
        setBooleanField(term11237, term11237.getClass(), "hd", true);
        setBooleanField(term11237, term11237.getClass(), "he", true);
        setBooleanField(term11237, term11237.getClass(), "difference", false);
        setBooleanField(term11237, term11237.getClass(), "skin", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFilePair");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Object[] args = new Object[1];
        args[0] = term11237;
        callMethod(klass, "setRawFile", argTypes, term11095, args);
    }

};



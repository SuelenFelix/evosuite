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

public class AssetFile_setCharacter_83958897519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5553;

    public AssetFile_setCharacter_83958897519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5656 = Class.forName((String) "java.io.File$PathStatus");
        Field term5655 = ((Class) term5656).getDeclaredField((String) "CHECKED");
        ((Field) term5655).setAccessible(true);
        Object enum20 = ((Field) term5655).get((Object) null);
        term5553 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term5554 = newInstance(Class.forName("java.io.File"));
        setField(term5554, term5554.getClass(), "path", "vjxIhXHxGR");
        setField(term5554, term5554.getClass(), "status", enum20);
        setIntField(term5554, term5554.getClass(), "prefixLength", -2068769794);
        setField(term5554, term5554.getClass(), "filePath", null);
        setField(term5553, term5553.getClass(), "file", term5554);
        setField(term5553, term5553.getClass(), "parentPath", "QXzGXbEXMu");
        setField(term5553, term5553.getClass(), "character", "qxSDVejjiY");
        setField(term5553, term5553.getClass(), "version", "xBsXSDjXYK");
        setField(term5553, term5553.getClass(), "extensions", "sEnIVFtZuQ");
        setBooleanField(term5553, term5553.getClass(), "alpha", false);
        setBooleanField(term5553, term5553.getClass(), "damaged", false);
        setBooleanField(term5553, term5553.getClass(), "hd", false);
        setBooleanField(term5553, term5553.getClass(), "he", false);
        setBooleanField(term5553, term5553.getClass(), "difference", false);
        setBooleanField(term5553, term5553.getClass(), "skin", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZVecLZMLHF";
        callMethod(klass, "setCharacter", argTypes, term5553, args);
    }

};



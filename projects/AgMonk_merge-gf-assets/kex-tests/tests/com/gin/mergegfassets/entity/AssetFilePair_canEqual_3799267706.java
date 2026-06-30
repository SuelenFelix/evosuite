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

public class AssetFilePair_canEqual_3799267706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12614;
     Object term12704;

    public AssetFilePair_canEqual_3799267706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12716 = Class.forName((String) "java.io.File$PathStatus");
        Field term12715 = ((Class) term12716).getDeclaredField((String) "CHECKED");
        ((Field) term12715).setAccessible(true);
        Object enum40 = ((Field) term12715).get((Object) null);
        Object term12689 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term12690 = newInstance(Class.forName("java.io.File"));
        setField(term12690, term12690.getClass(), "path", null);
        setField(term12690, term12690.getClass(), "status", enum40);
        setIntField(term12690, term12690.getClass(), "prefixLength", 1655935355);
        setField(term12690, term12690.getClass(), "filePath", null);
        setField(term12689, term12689.getClass(), "file", term12690);
        setField(term12689, term12689.getClass(), "parentPath", "");
        setField(term12689, term12689.getClass(), "character", "");
        setField(term12689, term12689.getClass(), "version", "");
        setField(term12689, term12689.getClass(), "extensions", "");
        setBooleanField(term12689, term12689.getClass(), "alpha", false);
        setBooleanField(term12689, term12689.getClass(), "damaged", true);
        setBooleanField(term12689, term12689.getClass(), "hd", true);
        setBooleanField(term12689, term12689.getClass(), "he", true);
        setBooleanField(term12689, term12689.getClass(), "difference", false);
        setBooleanField(term12689, term12689.getClass(), "skin", true);
        ArrayList term12687 = new ArrayList();
        ((ArrayList) term12687).add(term12689);
        term12614 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFilePair"));
        Object term12615 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term12616 = newInstance(Class.forName("java.io.File"));
        setField(term12616, term12616.getClass(), "path", "YsUtbngnRO");
        setField(term12616, term12616.getClass(), "status", enum40);
        setIntField(term12616, term12616.getClass(), "prefixLength", 972867650);
        setField(term12616, term12616.getClass(), "filePath", null);
        setField(term12615, term12615.getClass(), "file", term12616);
        setField(term12615, term12615.getClass(), "parentPath", "JisaWUxcNb");
        setField(term12615, term12615.getClass(), "character", "NxgmYPzWCI");
        setField(term12615, term12615.getClass(), "version", "SqjyKmayBx");
        setField(term12615, term12615.getClass(), "extensions", "XjDhvToxJy");
        setBooleanField(term12615, term12615.getClass(), "alpha", false);
        setBooleanField(term12615, term12615.getClass(), "damaged", false);
        setBooleanField(term12615, term12615.getClass(), "hd", true);
        setBooleanField(term12615, term12615.getClass(), "he", false);
        setBooleanField(term12615, term12615.getClass(), "difference", true);
        setBooleanField(term12615, term12615.getClass(), "skin", false);
        setField(term12614, term12614.getClass(), "rawFile", term12615);
        setField(term12614, term12614.getClass(), "alphaFiles", term12687);
        term12704 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFilePair");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12704;
        callMethod(klass, "canEqual", argTypes, term12614, args);
    }

};



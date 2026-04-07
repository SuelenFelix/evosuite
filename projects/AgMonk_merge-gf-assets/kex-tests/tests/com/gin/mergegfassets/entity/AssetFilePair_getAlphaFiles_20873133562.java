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

public class AssetFilePair_getAlphaFiles_20873133562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10786;

    public AssetFilePair_getAlphaFiles_20873133562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10913 = Class.forName((String) "java.io.File$PathStatus");
        Field term10912 = ((Class) term10913).getDeclaredField((String) "CHECKED");
        ((Field) term10912).setAccessible(true);
        Object enum35 = ((Field) term10912).get((Object) null);
        Object term10861 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term10862 = newInstance(Class.forName("java.io.File"));
        setField(term10862, term10862.getClass(), "path", null);
        setField(term10862, term10862.getClass(), "status", null);
        setIntField(term10862, term10862.getClass(), "prefixLength", 1632125673);
        setField(term10862, term10862.getClass(), "filePath", null);
        setField(term10861, term10861.getClass(), "file", term10862);
        setField(term10861, term10861.getClass(), "parentPath", "");
        setField(term10861, term10861.getClass(), "character", "");
        setField(term10861, term10861.getClass(), "version", "");
        setField(term10861, term10861.getClass(), "extensions", "");
        setBooleanField(term10861, term10861.getClass(), "alpha", false);
        setBooleanField(term10861, term10861.getClass(), "damaged", false);
        setBooleanField(term10861, term10861.getClass(), "hd", true);
        setBooleanField(term10861, term10861.getClass(), "he", true);
        setBooleanField(term10861, term10861.getClass(), "difference", true);
        setBooleanField(term10861, term10861.getClass(), "skin", true);
        Object term10874 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term10875 = newInstance(Class.forName("java.io.File"));
        setField(term10875, term10875.getClass(), "path", null);
        setField(term10875, term10875.getClass(), "status", null);
        setIntField(term10875, term10875.getClass(), "prefixLength", 454281060);
        setField(term10875, term10875.getClass(), "filePath", null);
        setField(term10874, term10874.getClass(), "file", term10875);
        setField(term10874, term10874.getClass(), "parentPath", "");
        setField(term10874, term10874.getClass(), "character", "");
        setField(term10874, term10874.getClass(), "version", "");
        setField(term10874, term10874.getClass(), "extensions", "");
        setBooleanField(term10874, term10874.getClass(), "alpha", true);
        setBooleanField(term10874, term10874.getClass(), "damaged", false);
        setBooleanField(term10874, term10874.getClass(), "hd", true);
        setBooleanField(term10874, term10874.getClass(), "he", false);
        setBooleanField(term10874, term10874.getClass(), "difference", true);
        setBooleanField(term10874, term10874.getClass(), "skin", false);
        Object term10887 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term10888 = newInstance(Class.forName("java.io.File"));
        setField(term10888, term10888.getClass(), "path", null);
        setField(term10888, term10888.getClass(), "status", enum35);
        setIntField(term10888, term10888.getClass(), "prefixLength", -1786399638);
        setField(term10888, term10888.getClass(), "filePath", null);
        setField(term10887, term10887.getClass(), "file", term10888);
        setField(term10887, term10887.getClass(), "parentPath", "");
        setField(term10887, term10887.getClass(), "character", "");
        setField(term10887, term10887.getClass(), "version", "");
        setField(term10887, term10887.getClass(), "extensions", "");
        setBooleanField(term10887, term10887.getClass(), "alpha", false);
        setBooleanField(term10887, term10887.getClass(), "damaged", true);
        setBooleanField(term10887, term10887.getClass(), "hd", false);
        setBooleanField(term10887, term10887.getClass(), "he", true);
        setBooleanField(term10887, term10887.getClass(), "difference", true);
        setBooleanField(term10887, term10887.getClass(), "skin", false);
        ArrayList term10859 = new ArrayList();
        ((ArrayList) term10859).add(term10861);
        ((ArrayList) term10859).add(term10874);
        ((ArrayList) term10859).add(term10887);
        term10786 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFilePair"));
        Object term10787 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term10788 = newInstance(Class.forName("java.io.File"));
        setField(term10788, term10788.getClass(), "path", "ywmcuThdfL");
        setField(term10788, term10788.getClass(), "status", enum35);
        setIntField(term10788, term10788.getClass(), "prefixLength", -14890619);
        setField(term10788, term10788.getClass(), "filePath", null);
        setField(term10787, term10787.getClass(), "file", term10788);
        setField(term10787, term10787.getClass(), "parentPath", "GBOEuByOfr");
        setField(term10787, term10787.getClass(), "character", "NHbOFFjyVK");
        setField(term10787, term10787.getClass(), "version", "zaloBqlrSo");
        setField(term10787, term10787.getClass(), "extensions", "vvoLrMGCoN");
        setBooleanField(term10787, term10787.getClass(), "alpha", true);
        setBooleanField(term10787, term10787.getClass(), "damaged", true);
        setBooleanField(term10787, term10787.getClass(), "hd", true);
        setBooleanField(term10787, term10787.getClass(), "he", true);
        setBooleanField(term10787, term10787.getClass(), "difference", false);
        setBooleanField(term10787, term10787.getClass(), "skin", true);
        setField(term10786, term10786.getClass(), "rawFile", term10787);
        setField(term10786, term10786.getClass(), "alphaFiles", term10859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFilePair");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAlphaFiles", argTypes, term10786, args);
    }

};



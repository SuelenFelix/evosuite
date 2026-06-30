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

public class AssetFilePair_toString_13836822248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13259;

    public AssetFilePair_toString_13836822248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13412 = Class.forName((String) "java.io.File$PathStatus");
        Field term13411 = ((Class) term13412).getDeclaredField((String) "INVALID");
        ((Field) term13411).setAccessible(true);
        Object enum42 = ((Field) term13411).get((Object) null);
        Object term13334 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term13335 = newInstance(Class.forName("java.io.File"));
        setField(term13335, term13335.getClass(), "path", null);
        setField(term13335, term13335.getClass(), "status", enum42);
        setIntField(term13335, term13335.getClass(), "prefixLength", -1845499264);
        setField(term13335, term13335.getClass(), "filePath", null);
        setField(term13334, term13334.getClass(), "file", term13335);
        setField(term13334, term13334.getClass(), "parentPath", "");
        setField(term13334, term13334.getClass(), "character", "");
        setField(term13334, term13334.getClass(), "version", "");
        setField(term13334, term13334.getClass(), "extensions", "");
        setBooleanField(term13334, term13334.getClass(), "alpha", false);
        setBooleanField(term13334, term13334.getClass(), "damaged", true);
        setBooleanField(term13334, term13334.getClass(), "hd", true);
        setBooleanField(term13334, term13334.getClass(), "he", false);
        setBooleanField(term13334, term13334.getClass(), "difference", false);
        setBooleanField(term13334, term13334.getClass(), "skin", true);
        Object term13347 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term13348 = newInstance(Class.forName("java.io.File"));
        setField(term13348, term13348.getClass(), "path", null);
        setField(term13348, term13348.getClass(), "status", enum42);
        setIntField(term13348, term13348.getClass(), "prefixLength", -505439934);
        setField(term13348, term13348.getClass(), "filePath", null);
        setField(term13347, term13347.getClass(), "file", term13348);
        setField(term13347, term13347.getClass(), "parentPath", "");
        setField(term13347, term13347.getClass(), "character", "");
        setField(term13347, term13347.getClass(), "version", "");
        setField(term13347, term13347.getClass(), "extensions", "");
        setBooleanField(term13347, term13347.getClass(), "alpha", true);
        setBooleanField(term13347, term13347.getClass(), "damaged", true);
        setBooleanField(term13347, term13347.getClass(), "hd", true);
        setBooleanField(term13347, term13347.getClass(), "he", false);
        setBooleanField(term13347, term13347.getClass(), "difference", false);
        setBooleanField(term13347, term13347.getClass(), "skin", false);
        Object term13360 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term13361 = newInstance(Class.forName("java.io.File"));
        setField(term13361, term13361.getClass(), "path", null);
        setField(term13361, term13361.getClass(), "status", enum42);
        setIntField(term13361, term13361.getClass(), "prefixLength", -344842608);
        setField(term13361, term13361.getClass(), "filePath", null);
        setField(term13360, term13360.getClass(), "file", term13361);
        setField(term13360, term13360.getClass(), "parentPath", "");
        setField(term13360, term13360.getClass(), "character", "");
        setField(term13360, term13360.getClass(), "version", "");
        setField(term13360, term13360.getClass(), "extensions", "");
        setBooleanField(term13360, term13360.getClass(), "alpha", true);
        setBooleanField(term13360, term13360.getClass(), "damaged", false);
        setBooleanField(term13360, term13360.getClass(), "hd", true);
        setBooleanField(term13360, term13360.getClass(), "he", false);
        setBooleanField(term13360, term13360.getClass(), "difference", true);
        setBooleanField(term13360, term13360.getClass(), "skin", true);
        Object term13373 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term13374 = newInstance(Class.forName("java.io.File"));
        setField(term13374, term13374.getClass(), "path", null);
        setField(term13374, term13374.getClass(), "status", null);
        setIntField(term13374, term13374.getClass(), "prefixLength", 941650513);
        setField(term13374, term13374.getClass(), "filePath", null);
        setField(term13373, term13373.getClass(), "file", term13374);
        setField(term13373, term13373.getClass(), "parentPath", "");
        setField(term13373, term13373.getClass(), "character", "");
        setField(term13373, term13373.getClass(), "version", "");
        setField(term13373, term13373.getClass(), "extensions", "");
        setBooleanField(term13373, term13373.getClass(), "alpha", false);
        setBooleanField(term13373, term13373.getClass(), "damaged", true);
        setBooleanField(term13373, term13373.getClass(), "hd", false);
        setBooleanField(term13373, term13373.getClass(), "he", true);
        setBooleanField(term13373, term13373.getClass(), "difference", false);
        setBooleanField(term13373, term13373.getClass(), "skin", false);
        Object term13386 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term13387 = newInstance(Class.forName("java.io.File"));
        setField(term13387, term13387.getClass(), "path", null);
        setField(term13387, term13387.getClass(), "status", null);
        setIntField(term13387, term13387.getClass(), "prefixLength", 444029505);
        setField(term13387, term13387.getClass(), "filePath", null);
        setField(term13386, term13386.getClass(), "file", term13387);
        setField(term13386, term13386.getClass(), "parentPath", "");
        setField(term13386, term13386.getClass(), "character", "");
        setField(term13386, term13386.getClass(), "version", "");
        setField(term13386, term13386.getClass(), "extensions", "");
        setBooleanField(term13386, term13386.getClass(), "alpha", true);
        setBooleanField(term13386, term13386.getClass(), "damaged", false);
        setBooleanField(term13386, term13386.getClass(), "hd", false);
        setBooleanField(term13386, term13386.getClass(), "he", false);
        setBooleanField(term13386, term13386.getClass(), "difference", false);
        setBooleanField(term13386, term13386.getClass(), "skin", false);
        ArrayList term13332 = new ArrayList();
        ((ArrayList) term13332).add(term13334);
        ((ArrayList) term13332).add(term13347);
        ((ArrayList) term13332).add(term13360);
        ((ArrayList) term13332).add(term13373);
        ((ArrayList) term13332).add(term13386);
        term13259 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFilePair"));
        Object term13260 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term13261 = newInstance(Class.forName("java.io.File"));
        setField(term13261, term13261.getClass(), "path", "goAoCMhKBu");
        setField(term13261, term13261.getClass(), "status", enum42);
        setIntField(term13261, term13261.getClass(), "prefixLength", -1772434990);
        setField(term13261, term13261.getClass(), "filePath", null);
        setField(term13260, term13260.getClass(), "file", term13261);
        setField(term13260, term13260.getClass(), "parentPath", "BWxJSgKHRT");
        setField(term13260, term13260.getClass(), "character", "AGXoIndFnm");
        setField(term13260, term13260.getClass(), "version", "mwmFMNEzkK");
        setField(term13260, term13260.getClass(), "extensions", "kVAmKknVln");
        setBooleanField(term13260, term13260.getClass(), "alpha", false);
        setBooleanField(term13260, term13260.getClass(), "damaged", false);
        setBooleanField(term13260, term13260.getClass(), "hd", true);
        setBooleanField(term13260, term13260.getClass(), "he", false);
        setBooleanField(term13260, term13260.getClass(), "difference", false);
        setBooleanField(term13260, term13260.getClass(), "skin", false);
        setField(term13259, term13259.getClass(), "rawFile", term13260);
        setField(term13259, term13259.getClass(), "alphaFiles", term13332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFilePair");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13259, args);
    }

};



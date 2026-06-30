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

public class AssetFilePair_hashCode_8729225347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12898;

    public AssetFilePair_hashCode_8729225347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13077 = Class.forName((String) "java.io.File$PathStatus");
        Field term13076 = ((Class) term13077).getDeclaredField((String) "CHECKED");
        ((Field) term13076).setAccessible(true);
        Object enum41 = ((Field) term13076).get((Object) null);
        Object term12973 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term12974 = newInstance(Class.forName("java.io.File"));
        setField(term12974, term12974.getClass(), "path", null);
        setField(term12974, term12974.getClass(), "status", null);
        setIntField(term12974, term12974.getClass(), "prefixLength", 1240914516);
        setField(term12974, term12974.getClass(), "filePath", null);
        setField(term12973, term12973.getClass(), "file", term12974);
        setField(term12973, term12973.getClass(), "parentPath", "");
        setField(term12973, term12973.getClass(), "character", "");
        setField(term12973, term12973.getClass(), "version", "");
        setField(term12973, term12973.getClass(), "extensions", "");
        setBooleanField(term12973, term12973.getClass(), "alpha", false);
        setBooleanField(term12973, term12973.getClass(), "damaged", false);
        setBooleanField(term12973, term12973.getClass(), "hd", true);
        setBooleanField(term12973, term12973.getClass(), "he", true);
        setBooleanField(term12973, term12973.getClass(), "difference", false);
        setBooleanField(term12973, term12973.getClass(), "skin", true);
        Object term12986 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term12987 = newInstance(Class.forName("java.io.File"));
        setField(term12987, term12987.getClass(), "path", null);
        setField(term12987, term12987.getClass(), "status", enum41);
        setIntField(term12987, term12987.getClass(), "prefixLength", -1465035361);
        setField(term12987, term12987.getClass(), "filePath", null);
        setField(term12986, term12986.getClass(), "file", term12987);
        setField(term12986, term12986.getClass(), "parentPath", "");
        setField(term12986, term12986.getClass(), "character", "");
        setField(term12986, term12986.getClass(), "version", "");
        setField(term12986, term12986.getClass(), "extensions", "");
        setBooleanField(term12986, term12986.getClass(), "alpha", true);
        setBooleanField(term12986, term12986.getClass(), "damaged", false);
        setBooleanField(term12986, term12986.getClass(), "hd", false);
        setBooleanField(term12986, term12986.getClass(), "he", false);
        setBooleanField(term12986, term12986.getClass(), "difference", false);
        setBooleanField(term12986, term12986.getClass(), "skin", true);
        Object term12999 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term13000 = newInstance(Class.forName("java.io.File"));
        setField(term13000, term13000.getClass(), "path", null);
        setField(term13000, term13000.getClass(), "status", null);
        setIntField(term13000, term13000.getClass(), "prefixLength", 1090617576);
        setField(term13000, term13000.getClass(), "filePath", null);
        setField(term12999, term12999.getClass(), "file", term13000);
        setField(term12999, term12999.getClass(), "parentPath", "");
        setField(term12999, term12999.getClass(), "character", "");
        setField(term12999, term12999.getClass(), "version", "");
        setField(term12999, term12999.getClass(), "extensions", "");
        setBooleanField(term12999, term12999.getClass(), "alpha", false);
        setBooleanField(term12999, term12999.getClass(), "damaged", false);
        setBooleanField(term12999, term12999.getClass(), "hd", false);
        setBooleanField(term12999, term12999.getClass(), "he", false);
        setBooleanField(term12999, term12999.getClass(), "difference", true);
        setBooleanField(term12999, term12999.getClass(), "skin", false);
        Object term13012 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term13013 = newInstance(Class.forName("java.io.File"));
        setField(term13013, term13013.getClass(), "path", null);
        setField(term13013, term13013.getClass(), "status", enum41);
        setIntField(term13013, term13013.getClass(), "prefixLength", -1547384488);
        setField(term13013, term13013.getClass(), "filePath", null);
        setField(term13012, term13012.getClass(), "file", term13013);
        setField(term13012, term13012.getClass(), "parentPath", "");
        setField(term13012, term13012.getClass(), "character", "");
        setField(term13012, term13012.getClass(), "version", "");
        setField(term13012, term13012.getClass(), "extensions", "");
        setBooleanField(term13012, term13012.getClass(), "alpha", false);
        setBooleanField(term13012, term13012.getClass(), "damaged", true);
        setBooleanField(term13012, term13012.getClass(), "hd", true);
        setBooleanField(term13012, term13012.getClass(), "he", false);
        setBooleanField(term13012, term13012.getClass(), "difference", false);
        setBooleanField(term13012, term13012.getClass(), "skin", true);
        Object term13025 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term13026 = newInstance(Class.forName("java.io.File"));
        setField(term13026, term13026.getClass(), "path", null);
        setField(term13026, term13026.getClass(), "status", null);
        setIntField(term13026, term13026.getClass(), "prefixLength", 1442160736);
        setField(term13026, term13026.getClass(), "filePath", null);
        setField(term13025, term13025.getClass(), "file", term13026);
        setField(term13025, term13025.getClass(), "parentPath", "");
        setField(term13025, term13025.getClass(), "character", "");
        setField(term13025, term13025.getClass(), "version", "");
        setField(term13025, term13025.getClass(), "extensions", "");
        setBooleanField(term13025, term13025.getClass(), "alpha", true);
        setBooleanField(term13025, term13025.getClass(), "damaged", false);
        setBooleanField(term13025, term13025.getClass(), "hd", true);
        setBooleanField(term13025, term13025.getClass(), "he", false);
        setBooleanField(term13025, term13025.getClass(), "difference", true);
        setBooleanField(term13025, term13025.getClass(), "skin", true);
        Object term13038 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term13039 = newInstance(Class.forName("java.io.File"));
        setField(term13039, term13039.getClass(), "path", null);
        setField(term13039, term13039.getClass(), "status", null);
        setIntField(term13039, term13039.getClass(), "prefixLength", 1114000454);
        setField(term13039, term13039.getClass(), "filePath", null);
        setField(term13038, term13038.getClass(), "file", term13039);
        setField(term13038, term13038.getClass(), "parentPath", "");
        setField(term13038, term13038.getClass(), "character", "");
        setField(term13038, term13038.getClass(), "version", "");
        setField(term13038, term13038.getClass(), "extensions", "");
        setBooleanField(term13038, term13038.getClass(), "alpha", true);
        setBooleanField(term13038, term13038.getClass(), "damaged", false);
        setBooleanField(term13038, term13038.getClass(), "hd", true);
        setBooleanField(term13038, term13038.getClass(), "he", true);
        setBooleanField(term13038, term13038.getClass(), "difference", true);
        setBooleanField(term13038, term13038.getClass(), "skin", false);
        Object term13051 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term13052 = newInstance(Class.forName("java.io.File"));
        setField(term13052, term13052.getClass(), "path", null);
        setField(term13052, term13052.getClass(), "status", enum41);
        setIntField(term13052, term13052.getClass(), "prefixLength", -556405712);
        setField(term13052, term13052.getClass(), "filePath", null);
        setField(term13051, term13051.getClass(), "file", term13052);
        setField(term13051, term13051.getClass(), "parentPath", "");
        setField(term13051, term13051.getClass(), "character", "");
        setField(term13051, term13051.getClass(), "version", "");
        setField(term13051, term13051.getClass(), "extensions", "");
        setBooleanField(term13051, term13051.getClass(), "alpha", false);
        setBooleanField(term13051, term13051.getClass(), "damaged", false);
        setBooleanField(term13051, term13051.getClass(), "hd", false);
        setBooleanField(term13051, term13051.getClass(), "he", false);
        setBooleanField(term13051, term13051.getClass(), "difference", false);
        setBooleanField(term13051, term13051.getClass(), "skin", true);
        ArrayList term12971 = new ArrayList();
        ((ArrayList) term12971).add(term12973);
        ((ArrayList) term12971).add(term12986);
        ((ArrayList) term12971).add(term12999);
        ((ArrayList) term12971).add(term13012);
        ((ArrayList) term12971).add(term13025);
        ((ArrayList) term12971).add(term13038);
        ((ArrayList) term12971).add(term13051);
        term12898 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFilePair"));
        Object term12899 = newInstance(Class.forName("com.gin.mergegfassets.entity.AssetFile"));
        Object term12900 = newInstance(Class.forName("java.io.File"));
        setField(term12900, term12900.getClass(), "path", "weddIktxOA");
        setField(term12900, term12900.getClass(), "status", enum41);
        setIntField(term12900, term12900.getClass(), "prefixLength", -481533957);
        setField(term12900, term12900.getClass(), "filePath", null);
        setField(term12899, term12899.getClass(), "file", term12900);
        setField(term12899, term12899.getClass(), "parentPath", "uSlMeISsDD");
        setField(term12899, term12899.getClass(), "character", "WdCiTDUKqn");
        setField(term12899, term12899.getClass(), "version", "PSizQDoxxe");
        setField(term12899, term12899.getClass(), "extensions", "mKaHyMybrK");
        setBooleanField(term12899, term12899.getClass(), "alpha", true);
        setBooleanField(term12899, term12899.getClass(), "damaged", false);
        setBooleanField(term12899, term12899.getClass(), "hd", false);
        setBooleanField(term12899, term12899.getClass(), "he", true);
        setBooleanField(term12899, term12899.getClass(), "difference", false);
        setBooleanField(term12899, term12899.getClass(), "skin", true);
        setField(term12898, term12898.getClass(), "rawFile", term12899);
        setField(term12898, term12898.getClass(), "alphaFiles", term12971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.AssetFilePair");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12898, args);
    }

};



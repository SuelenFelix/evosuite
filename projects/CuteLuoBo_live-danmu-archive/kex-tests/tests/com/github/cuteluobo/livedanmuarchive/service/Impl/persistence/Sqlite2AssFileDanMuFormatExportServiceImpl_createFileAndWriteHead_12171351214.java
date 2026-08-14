package com.github.cuteluobo.livedanmuarchive.service.Impl.persistence;

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
import static com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;

public class Sqlite2AssFileDanMuFormatExportServiceImpl_createFileAndWriteHead_12171351214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2861;
     Object term3012;

    public Sqlite2AssFileDanMuFormatExportServiceImpl_createFileAndWriteHead_12171351214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3047 = Class.forName((String) "java.io.File$PathStatus");
        Field term3046 = ((Class) term3047).getDeclaredField((String) "CHECKED");
        ((Field) term3046).setAccessible(true);
        Object enum10 = ((Field) term3046).get((Object) null);
        Class<? extends Object> term3200 = Class.forName((String) "java.io.File$PathStatus");
        Field term3199 = ((Class) term3200).getDeclaredField((String) "CHECKED");
        ((Field) term3199).setAccessible(true);
        Object enum11 = ((Field) term3199).get((Object) null);
        Object term2913 = newInstance(Class.forName("java.io.File"));
        setField(term2913, term2913.getClass(), "path", "");
        setField(term2913, term2913.getClass(), "status", enum11);
        setIntField(term2913, term2913.getClass(), "prefixLength", 962840079);
        setField(term2913, term2913.getClass(), "filePath", null);
        Object term2918 = newInstance(Class.forName("java.io.File"));
        setField(term2918, term2918.getClass(), "path", "");
        setField(term2918, term2918.getClass(), "status", enum11);
        setIntField(term2918, term2918.getClass(), "prefixLength", 1540719661);
        setField(term2918, term2918.getClass(), "filePath", null);
        Object term2921 = newInstance(Class.forName("java.io.File"));
        setField(term2921, term2921.getClass(), "path", "");
        setField(term2921, term2921.getClass(), "status", enum11);
        setIntField(term2921, term2921.getClass(), "prefixLength", 1265463001);
        setField(term2921, term2921.getClass(), "filePath", null);
        Object term2924 = newInstance(Class.forName("java.io.File"));
        setField(term2924, term2924.getClass(), "path", "");
        setField(term2924, term2924.getClass(), "status", enum10);
        setIntField(term2924, term2924.getClass(), "prefixLength", 335112684);
        setField(term2924, term2924.getClass(), "filePath", null);
        Object term2927 = newInstance(Class.forName("java.io.File"));
        setField(term2927, term2927.getClass(), "path", "");
        setField(term2927, term2927.getClass(), "status", enum10);
        setIntField(term2927, term2927.getClass(), "prefixLength", 1551099402);
        setField(term2927, term2927.getClass(), "filePath", null);
        Object term2930 = newInstance(Class.forName("java.io.File"));
        setField(term2930, term2930.getClass(), "path", "");
        setField(term2930, term2930.getClass(), "status", enum10);
        setIntField(term2930, term2930.getClass(), "prefixLength", -2027534003);
        setField(term2930, term2930.getClass(), "filePath", null);
        Object term2933 = newInstance(Class.forName("java.io.File"));
        setField(term2933, term2933.getClass(), "path", "");
        setField(term2933, term2933.getClass(), "status", enum10);
        setIntField(term2933, term2933.getClass(), "prefixLength", 1063420942);
        setField(term2933, term2933.getClass(), "filePath", null);
        Object term2936 = newInstance(Class.forName("java.io.File"));
        setField(term2936, term2936.getClass(), "path", "");
        setField(term2936, term2936.getClass(), "status", enum10);
        setIntField(term2936, term2936.getClass(), "prefixLength", 1375330971);
        setField(term2936, term2936.getClass(), "filePath", null);
        Object term2939 = newInstance(Class.forName("java.io.File"));
        setField(term2939, term2939.getClass(), "path", null);
        setField(term2939, term2939.getClass(), "status", null);
        setIntField(term2939, term2939.getClass(), "prefixLength", 0);
        setField(term2939, term2939.getClass(), "filePath", null);
        ArrayList term2911 = new ArrayList();
        ((ArrayList) term2911).add(term2913);
        ((ArrayList) term2911).add(term2918);
        ((ArrayList) term2911).add(term2921);
        ((ArrayList) term2911).add(term2924);
        ((ArrayList) term2911).add(term2927);
        ((ArrayList) term2911).add(term2930);
        ((ArrayList) term2911).add(term2933);
        ((ArrayList) term2911).add(term2936);
        ((ArrayList) term2911).add(term2939);
        HashMap term2987 = new HashMap();
        HashMap term3002 = new HashMap();
        term2861 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl"));
        Object term2874 = newInstance(Class.forName("java.io.File"));
        setField(term2861, term2861.getClass(), "liveName", "wGmYcqUkgE");
        setField(term2874, term2874.getClass(), "path", "idgaQsnJpQ");
        setField(term2874, term2874.getClass(), "status", enum10);
        setIntField(term2874, term2874.getClass(), "prefixLength", 287287233);
        setField(term2874, term2874.getClass(), "filePath", null);
        setField(term2861, term2861.getClass(), "saveFilePath", term2874);
        setField(term2861, term2861.getClass(), "saveFileSuffix", "VgZnGoIFwQ");
        setField(term2861, term2861.getClass(), "sqliteFileList", term2911);
        setField(term2861, term2861.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term2861, term2861.getClass(), "maxFontSize", -478195677);
        setIntField(term2861, term2861.getClass(), "mixFontSize", 972867650);
        setBooleanField(term2861, term2861.getClass(), "showSenderName", true);
        setIntField(term2861, term2861.getClass(), "videoWidth", 1655935355);
        setIntField(term2861, term2861.getClass(), "videoHeight", -481533957);
        setField(term2861, term2861.getClass(), "NORMAL_STYLE_FONT", "swZVeJAxjt");
        setField(term2861, term2861.getClass(), "NORMAL_STYLE_NAME", "xOcJIiQQDu");
        setFloatField(term2861, term2861.getClass(), "NORMAL_FONT_SIZE", 0.6880585F);
        setField(term2861, term2861.getClass(), "fileNameTimeFormat", "GVizqqzXpy");
        setFloatField(term2861, term2861.getClass(), "screenProp", 0.40176582F);
        setIntField(term2861, term2861.getClass(), "showTime", 1240914516);
        setField(term2861, term2861.getClass(), "danMuFormatIndexMap", term2987);
        setField(term2861, term2861.getClass(), "danMuUserInfoModelHashMap", term3002);
        term3012 = newInstance(Class.forName("java.io.File"));
        setField(term3012, term3012.getClass(), "path", "DfISiziTgG");
        setField(term3012, term3012.getClass(), "status", enum10);
        setIntField(term3012, term3012.getClass(), "prefixLength", -1465035361);
        setField(term3012, term3012.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term3012;
        callMethod(klass, "createFileAndWriteHead", argTypes, term2861, args);
    }

};



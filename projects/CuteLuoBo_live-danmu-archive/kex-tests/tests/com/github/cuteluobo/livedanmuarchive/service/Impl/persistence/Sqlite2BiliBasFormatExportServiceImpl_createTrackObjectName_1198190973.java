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
import java.lang.Integer;

public class Sqlite2BiliBasFormatExportServiceImpl_createTrackObjectName_1198190973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6177;
     Object term6350;

    public Sqlite2BiliBasFormatExportServiceImpl_createTrackObjectName_1198190973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6393 = Class.forName((String) "java.io.File$PathStatus");
        Field term6392 = ((Class) term6393).getDeclaredField((String) "INVALID");
        ((Field) term6392).setAccessible(true);
        Object enum21 = ((Field) term6392).get((Object) null);
        Object term6253 = newInstance(Class.forName("java.io.File"));
        setField(term6253, term6253.getClass(), "path", "");
        setField(term6253, term6253.getClass(), "status", enum21);
        setIntField(term6253, term6253.getClass(), "prefixLength", 1555897383);
        setField(term6253, term6253.getClass(), "filePath", null);
        Object term6256 = newInstance(Class.forName("java.io.File"));
        setField(term6256, term6256.getClass(), "path", "");
        setField(term6256, term6256.getClass(), "status", enum21);
        setIntField(term6256, term6256.getClass(), "prefixLength", 202001407);
        setField(term6256, term6256.getClass(), "filePath", null);
        Object term6259 = newInstance(Class.forName("java.io.File"));
        setField(term6259, term6259.getClass(), "path", "");
        setField(term6259, term6259.getClass(), "status", enum21);
        setIntField(term6259, term6259.getClass(), "prefixLength", 158873461);
        setField(term6259, term6259.getClass(), "filePath", null);
        Class<? extends Object> term6546 = Class.forName((String) "java.io.File$PathStatus");
        Field term6545 = ((Class) term6546).getDeclaredField((String) "INVALID");
        ((Field) term6545).setAccessible(true);
        Object enum22 = ((Field) term6545).get((Object) null);
        Object term6262 = newInstance(Class.forName("java.io.File"));
        setField(term6262, term6262.getClass(), "path", "");
        setField(term6262, term6262.getClass(), "status", enum22);
        setIntField(term6262, term6262.getClass(), "prefixLength", -430151637);
        setField(term6262, term6262.getClass(), "filePath", null);
        Object term6267 = newInstance(Class.forName("java.io.File"));
        setField(term6267, term6267.getClass(), "path", "");
        setField(term6267, term6267.getClass(), "status", enum22);
        setIntField(term6267, term6267.getClass(), "prefixLength", -1697741339);
        setField(term6267, term6267.getClass(), "filePath", null);
        Object term6270 = newInstance(Class.forName("java.io.File"));
        setField(term6270, term6270.getClass(), "path", "");
        setField(term6270, term6270.getClass(), "status", enum21);
        setIntField(term6270, term6270.getClass(), "prefixLength", 98922530);
        setField(term6270, term6270.getClass(), "filePath", null);
        ArrayList term6251 = new ArrayList();
        ((ArrayList) term6251).add(term6253);
        ((ArrayList) term6251).add(term6256);
        ((ArrayList) term6251).add(term6259);
        ((ArrayList) term6251).add(term6262);
        ((ArrayList) term6251).add(term6267);
        ((ArrayList) term6251).add(term6270);
        HashMap term6319 = new HashMap();
        HashMap term6336 = new HashMap();
        term6177 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl"));
        Object term6214 = newInstance(Class.forName("java.io.File"));
        setField(term6177, term6177.getClass(), "NORMAL_TRACK_STYLE_PREFIX", "JmcmxoGhIK");
        setField(term6177, term6177.getClass(), "NORMAL_COLOR", "jXzmYyrnnT");
        setField(term6177, term6177.getClass(), "liveName", "igCAtimmYB");
        setField(term6214, term6214.getClass(), "path", "DyiXbeYIaN");
        setField(term6214, term6214.getClass(), "status", enum21);
        setIntField(term6214, term6214.getClass(), "prefixLength", -25637976);
        setField(term6214, term6214.getClass(), "filePath", null);
        setField(term6177, term6177.getClass(), "saveFilePath", term6214);
        setField(term6177, term6177.getClass(), "saveFileSuffix", "VGizxZnyHX");
        setField(term6177, term6177.getClass(), "sqliteFileList", term6251);
        setField(term6177, term6177.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term6177, term6177.getClass(), "maxFontSize", -1388471422);
        setIntField(term6177, term6177.getClass(), "mixFontSize", -1498296052);
        setBooleanField(term6177, term6177.getClass(), "showSenderName", true);
        setIntField(term6177, term6177.getClass(), "videoWidth", 2098647989);
        setIntField(term6177, term6177.getClass(), "videoHeight", 1598895173);
        setField(term6177, term6177.getClass(), "NORMAL_STYLE_FONT", "kNqaJKIATy");
        setField(term6177, term6177.getClass(), "NORMAL_STYLE_NAME", "vKQukfbJUd");
        setFloatField(term6177, term6177.getClass(), "NORMAL_FONT_SIZE", 0.6436713F);
        setField(term6177, term6177.getClass(), "fileNameTimeFormat", "lFRJFUMVbx");
        setFloatField(term6177, term6177.getClass(), "screenProp", 0.89057696F);
        setIntField(term6177, term6177.getClass(), "showTime", 1830648570);
        setField(term6177, term6177.getClass(), "danMuFormatIndexMap", term6319);
        setField(term6177, term6177.getClass(), "danMuUserInfoModelHashMap", term6336);
        term6350 = new Integer(1283079251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6350;
        callMethod(klass, "createTrackObjectName", argTypes, term6177, args);
    }

};



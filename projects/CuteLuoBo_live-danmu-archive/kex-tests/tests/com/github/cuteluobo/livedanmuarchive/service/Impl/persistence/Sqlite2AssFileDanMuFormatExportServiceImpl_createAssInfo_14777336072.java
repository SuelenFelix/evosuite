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

public class Sqlite2AssFileDanMuFormatExportServiceImpl_createAssInfo_14777336072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2034;

    public Sqlite2AssFileDanMuFormatExportServiceImpl_createAssInfo_14777336072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2204 = Class.forName((String) "java.io.File$PathStatus");
        Field term2203 = ((Class) term2204).getDeclaredField((String) "CHECKED");
        ((Field) term2203).setAccessible(true);
        Object enum7 = ((Field) term2203).get((Object) null);
        Object term2086 = newInstance(Class.forName("java.io.File"));
        setField(term2086, term2086.getClass(), "path", "");
        setField(term2086, term2086.getClass(), "status", enum7);
        setIntField(term2086, term2086.getClass(), "prefixLength", -1968847291);
        setField(term2086, term2086.getClass(), "filePath", null);
        Class<? extends Object> term2357 = Class.forName((String) "java.io.File$PathStatus");
        Field term2356 = ((Class) term2357).getDeclaredField((String) "INVALID");
        ((Field) term2356).setAccessible(true);
        Object enum8 = ((Field) term2356).get((Object) null);
        Object term2089 = newInstance(Class.forName("java.io.File"));
        setField(term2089, term2089.getClass(), "path", "");
        setField(term2089, term2089.getClass(), "status", enum8);
        setIntField(term2089, term2089.getClass(), "prefixLength", 579005622);
        setField(term2089, term2089.getClass(), "filePath", null);
        Object term2094 = newInstance(Class.forName("java.io.File"));
        setField(term2094, term2094.getClass(), "path", "");
        setField(term2094, term2094.getClass(), "status", enum8);
        setIntField(term2094, term2094.getClass(), "prefixLength", -14890619);
        setField(term2094, term2094.getClass(), "filePath", null);
        Object term2097 = newInstance(Class.forName("java.io.File"));
        setField(term2097, term2097.getClass(), "path", "");
        setField(term2097, term2097.getClass(), "status", enum7);
        setIntField(term2097, term2097.getClass(), "prefixLength", 1632125673);
        setField(term2097, term2097.getClass(), "filePath", null);
        Object term2100 = newInstance(Class.forName("java.io.File"));
        setField(term2100, term2100.getClass(), "path", "");
        setField(term2100, term2100.getClass(), "status", enum7);
        setIntField(term2100, term2100.getClass(), "prefixLength", 454281060);
        setField(term2100, term2100.getClass(), "filePath", null);
        Object term2103 = newInstance(Class.forName("java.io.File"));
        setField(term2103, term2103.getClass(), "path", "");
        setField(term2103, term2103.getClass(), "status", enum7);
        setIntField(term2103, term2103.getClass(), "prefixLength", -1786399638);
        setField(term2103, term2103.getClass(), "filePath", null);
        ArrayList term2084 = new ArrayList();
        ((ArrayList) term2084).add(term2086);
        ((ArrayList) term2084).add(term2089);
        ((ArrayList) term2084).add(term2094);
        ((ArrayList) term2084).add(term2097);
        ((ArrayList) term2084).add(term2100);
        ((ArrayList) term2084).add(term2103);
        HashMap term2152 = new HashMap();
        HashMap term2169 = new HashMap();
        term2034 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl"));
        Object term2047 = newInstance(Class.forName("java.io.File"));
        setField(term2034, term2034.getClass(), "liveName", "JDswTTCZHV");
        setField(term2047, term2047.getClass(), "path", "onpbIeEKoi");
        setField(term2047, term2047.getClass(), "status", enum7);
        setIntField(term2047, term2047.getClass(), "prefixLength", -1016503459);
        setField(term2047, term2047.getClass(), "filePath", null);
        setField(term2034, term2034.getClass(), "saveFilePath", term2047);
        setField(term2034, term2034.getClass(), "saveFileSuffix", "YRHGsAkhxb");
        setField(term2034, term2034.getClass(), "sqliteFileList", term2084);
        setField(term2034, term2034.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term2034, term2034.getClass(), "maxFontSize", 2055867847);
        setIntField(term2034, term2034.getClass(), "mixFontSize", -1048298087);
        setBooleanField(term2034, term2034.getClass(), "showSenderName", false);
        setIntField(term2034, term2034.getClass(), "videoWidth", 292681826);
        setIntField(term2034, term2034.getClass(), "videoHeight", 458147407);
        setField(term2034, term2034.getClass(), "NORMAL_STYLE_FONT", "hoicvmsovO");
        setField(term2034, term2034.getClass(), "NORMAL_STYLE_NAME", "eqJfYWRaEL");
        setFloatField(term2034, term2034.getClass(), "NORMAL_FONT_SIZE", 0.8564069F);
        setField(term2034, term2034.getClass(), "fileNameTimeFormat", "fhkbdRViHi");
        setFloatField(term2034, term2034.getClass(), "screenProp", 0.5446086F);
        setIntField(term2034, term2034.getClass(), "showTime", -184153539);
        setField(term2034, term2034.getClass(), "danMuFormatIndexMap", term2152);
        setField(term2034, term2034.getClass(), "danMuUserInfoModelHashMap", term2169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createAssInfo", argTypes, term2034, args);
    }

};



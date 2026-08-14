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

public class Sqlite2BiliBasFormatExportServiceImpl_createFileAndWriteHead_4031763112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5617;
     Object term5787;

    public Sqlite2BiliBasFormatExportServiceImpl_createFileAndWriteHead_4031763112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5842 = Class.forName((String) "java.io.File$PathStatus");
        Field term5841 = ((Class) term5842).getDeclaredField((String) "INVALID");
        ((Field) term5841).setAccessible(true);
        Object enum19 = ((Field) term5841).get((Object) null);
        Class<? extends Object> term5995 = Class.forName((String) "java.io.File$PathStatus");
        Field term5994 = ((Class) term5995).getDeclaredField((String) "CHECKED");
        ((Field) term5994).setAccessible(true);
        Object enum20 = ((Field) term5994).get((Object) null);
        Object term5693 = newInstance(Class.forName("java.io.File"));
        setField(term5693, term5693.getClass(), "path", "");
        setField(term5693, term5693.getClass(), "status", enum20);
        setIntField(term5693, term5693.getClass(), "prefixLength", 538259104);
        setField(term5693, term5693.getClass(), "filePath", null);
        Object term5698 = newInstance(Class.forName("java.io.File"));
        setField(term5698, term5698.getClass(), "path", "");
        setField(term5698, term5698.getClass(), "status", enum19);
        setIntField(term5698, term5698.getClass(), "prefixLength", 96566506);
        setField(term5698, term5698.getClass(), "filePath", null);
        Object term5701 = newInstance(Class.forName("java.io.File"));
        setField(term5701, term5701.getClass(), "path", "");
        setField(term5701, term5701.getClass(), "status", enum20);
        setIntField(term5701, term5701.getClass(), "prefixLength", -343325701);
        setField(term5701, term5701.getClass(), "filePath", null);
        Object term5704 = newInstance(Class.forName("java.io.File"));
        setField(term5704, term5704.getClass(), "path", "");
        setField(term5704, term5704.getClass(), "status", enum19);
        setIntField(term5704, term5704.getClass(), "prefixLength", 107945604);
        setField(term5704, term5704.getClass(), "filePath", null);
        Object term5707 = newInstance(Class.forName("java.io.File"));
        setField(term5707, term5707.getClass(), "path", "");
        setField(term5707, term5707.getClass(), "status", enum19);
        setIntField(term5707, term5707.getClass(), "prefixLength", -1963464809);
        setField(term5707, term5707.getClass(), "filePath", null);
        ArrayList term5691 = new ArrayList();
        ((ArrayList) term5691).add(term5693);
        ((ArrayList) term5691).add(term5698);
        ((ArrayList) term5691).add(term5701);
        ((ArrayList) term5691).add(term5704);
        ((ArrayList) term5691).add(term5707);
        HashMap term5756 = new HashMap();
        HashMap term5773 = new HashMap();
        term5617 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl"));
        Object term5654 = newInstance(Class.forName("java.io.File"));
        setField(term5617, term5617.getClass(), "NORMAL_TRACK_STYLE_PREFIX", "hMmaoREuCK");
        setField(term5617, term5617.getClass(), "NORMAL_COLOR", "VeDtgDzGAN");
        setField(term5617, term5617.getClass(), "liveName", "aWYOWZFyaX");
        setField(term5654, term5654.getClass(), "path", "BRIVNtfUWU");
        setField(term5654, term5654.getClass(), "status", enum19);
        setIntField(term5654, term5654.getClass(), "prefixLength", -2015854073);
        setField(term5654, term5654.getClass(), "filePath", null);
        setField(term5617, term5617.getClass(), "saveFilePath", term5654);
        setField(term5617, term5617.getClass(), "saveFileSuffix", "DbiCVtPPCT");
        setField(term5617, term5617.getClass(), "sqliteFileList", term5691);
        setField(term5617, term5617.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term5617, term5617.getClass(), "maxFontSize", 71190297);
        setIntField(term5617, term5617.getClass(), "mixFontSize", 1202361360);
        setBooleanField(term5617, term5617.getClass(), "showSenderName", false);
        setIntField(term5617, term5617.getClass(), "videoWidth", -2015048153);
        setIntField(term5617, term5617.getClass(), "videoHeight", -2063457669);
        setField(term5617, term5617.getClass(), "NORMAL_STYLE_FONT", "DSNsTGYXDF");
        setField(term5617, term5617.getClass(), "NORMAL_STYLE_NAME", "sQvGcVjdEx");
        setFloatField(term5617, term5617.getClass(), "NORMAL_FONT_SIZE", 0.27797186F);
        setField(term5617, term5617.getClass(), "fileNameTimeFormat", "rLHAoqXgPh");
        setFloatField(term5617, term5617.getClass(), "screenProp", 0.7467328F);
        setIntField(term5617, term5617.getClass(), "showTime", -1222006000);
        setField(term5617, term5617.getClass(), "danMuFormatIndexMap", term5756);
        setField(term5617, term5617.getClass(), "danMuUserInfoModelHashMap", term5773);
        term5787 = newInstance(Class.forName("java.io.File"));
        setField(term5787, term5787.getClass(), "path", "lihXWlGDxk");
        setField(term5787, term5787.getClass(), "status", enum20);
        setIntField(term5787, term5787.getClass(), "prefixLength", 9726679);
        setField(term5787, term5787.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term5787;
        callMethod(klass, "createFileAndWriteHead", argTypes, term5617, args);
    }

};



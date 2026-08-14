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
import java.lang.Long;
import java.lang.Float;

public class Sqlite2AssFileDanMuFormatExportServiceImpl_createAssDialogue_60668073313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4621;
     Object term4630;
     Object term4632;
     Object term4634;
     Object term4636;

    public Sqlite2AssFileDanMuFormatExportServiceImpl_createAssDialogue_60668073313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4621 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl"));
        setField(term4621, term4621.getClass(), "liveName", null);
        setField(term4621, term4621.getClass(), "saveFilePath", null);
        setField(term4621, term4621.getClass(), "saveFileSuffix", null);
        setField(term4621, term4621.getClass(), "sqliteFileList", null);
        setField(term4621, term4621.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term4621, term4621.getClass(), "maxFontSize", 0);
        setIntField(term4621, term4621.getClass(), "mixFontSize", 0);
        setBooleanField(term4621, term4621.getClass(), "showSenderName", false);
        setIntField(term4621, term4621.getClass(), "videoWidth", 0);
        setIntField(term4621, term4621.getClass(), "videoHeight", 0);
        setField(term4621, term4621.getClass(), "NORMAL_STYLE_FONT", null);
        setField(term4621, term4621.getClass(), "NORMAL_STYLE_NAME", null);
        setFloatField(term4621, term4621.getClass(), "NORMAL_FONT_SIZE", 0.0F);
        setField(term4621, term4621.getClass(), "fileNameTimeFormat", null);
        setFloatField(term4621, term4621.getClass(), "screenProp", 0.0F);
        setIntField(term4621, term4621.getClass(), "showTime", 0);
        setField(term4621, term4621.getClass(), "danMuFormatIndexMap", null);
        setField(term4621, term4621.getClass(), "danMuUserInfoModelHashMap", null);
        term4630 = new Long(0L);
        term4632 = new Long(0L);
        term4634 = new Float(0.0F);
        term4636 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = float.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = float.class;
        Object[] args = new Object[6];
        args[0] = term4630;
        args[1] = term4632;
        args[2] = null;
        args[3] = term4634;
        args[4] = null;
        args[5] = term4636;
        callMethod(klass, "createAssDialogue", argTypes, term4621, args);
    }

};



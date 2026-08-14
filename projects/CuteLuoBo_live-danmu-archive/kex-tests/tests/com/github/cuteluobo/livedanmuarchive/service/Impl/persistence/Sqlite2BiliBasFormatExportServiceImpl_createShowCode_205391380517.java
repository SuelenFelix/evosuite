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
import java.lang.Float;
import java.lang.Long;

public class Sqlite2BiliBasFormatExportServiceImpl_createShowCode_205391380517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9699;
     Object term9708;
     Object term9710;
     Object term9712;

    public Sqlite2BiliBasFormatExportServiceImpl_createShowCode_205391380517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9699 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl"));
        setField(term9699, term9699.getClass(), "NORMAL_TRACK_STYLE_PREFIX", null);
        setField(term9699, term9699.getClass(), "NORMAL_COLOR", null);
        setField(term9699, term9699.getClass(), "liveName", null);
        setField(term9699, term9699.getClass(), "saveFilePath", null);
        setField(term9699, term9699.getClass(), "saveFileSuffix", null);
        setField(term9699, term9699.getClass(), "sqliteFileList", null);
        setField(term9699, term9699.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term9699, term9699.getClass(), "maxFontSize", 0);
        setIntField(term9699, term9699.getClass(), "mixFontSize", 0);
        setBooleanField(term9699, term9699.getClass(), "showSenderName", false);
        setIntField(term9699, term9699.getClass(), "videoWidth", 0);
        setIntField(term9699, term9699.getClass(), "videoHeight", 0);
        setField(term9699, term9699.getClass(), "NORMAL_STYLE_FONT", null);
        setField(term9699, term9699.getClass(), "NORMAL_STYLE_NAME", null);
        setFloatField(term9699, term9699.getClass(), "NORMAL_FONT_SIZE", 0.0F);
        setField(term9699, term9699.getClass(), "fileNameTimeFormat", null);
        setFloatField(term9699, term9699.getClass(), "screenProp", 0.0F);
        setIntField(term9699, term9699.getClass(), "showTime", 0);
        setField(term9699, term9699.getClass(), "danMuFormatIndexMap", null);
        setField(term9699, term9699.getClass(), "danMuUserInfoModelHashMap", null);
        term9708 = new Float(0.0F);
        term9710 = new Long(0L);
        term9712 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = float.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = long.class;
        argTypes[5] = float.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term9708;
        args[3] = null;
        args[4] = term9710;
        args[5] = term9712;
        callMethod(klass, "createShowCode", argTypes, term9699, args);
    }

};



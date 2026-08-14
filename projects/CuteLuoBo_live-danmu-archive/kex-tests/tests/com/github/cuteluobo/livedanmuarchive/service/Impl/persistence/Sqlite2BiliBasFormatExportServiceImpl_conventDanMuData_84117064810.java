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
import java.lang.Integer;
import java.lang.Float;

public class Sqlite2BiliBasFormatExportServiceImpl_conventDanMuData_84117064810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9598;
     Object term9607;
     Object term9609;
     Object term9611;
     Object term9613;

    public Sqlite2BiliBasFormatExportServiceImpl_conventDanMuData_84117064810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9598 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl"));
        setField(term9598, term9598.getClass(), "NORMAL_TRACK_STYLE_PREFIX", null);
        setField(term9598, term9598.getClass(), "NORMAL_COLOR", null);
        setField(term9598, term9598.getClass(), "liveName", null);
        setField(term9598, term9598.getClass(), "saveFilePath", null);
        setField(term9598, term9598.getClass(), "saveFileSuffix", null);
        setField(term9598, term9598.getClass(), "sqliteFileList", null);
        setField(term9598, term9598.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term9598, term9598.getClass(), "maxFontSize", 0);
        setIntField(term9598, term9598.getClass(), "mixFontSize", 0);
        setBooleanField(term9598, term9598.getClass(), "showSenderName", false);
        setIntField(term9598, term9598.getClass(), "videoWidth", 0);
        setIntField(term9598, term9598.getClass(), "videoHeight", 0);
        setField(term9598, term9598.getClass(), "NORMAL_STYLE_FONT", null);
        setField(term9598, term9598.getClass(), "NORMAL_STYLE_NAME", null);
        setFloatField(term9598, term9598.getClass(), "NORMAL_FONT_SIZE", 0.0F);
        setField(term9598, term9598.getClass(), "fileNameTimeFormat", null);
        setFloatField(term9598, term9598.getClass(), "screenProp", 0.0F);
        setIntField(term9598, term9598.getClass(), "showTime", 0);
        setField(term9598, term9598.getClass(), "danMuFormatIndexMap", null);
        setField(term9598, term9598.getClass(), "danMuUserInfoModelHashMap", null);
        term9607 = new Long(0L);
        term9609 = new Integer(0);
        term9611 = new Float(0.0F);
        term9613 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Array.newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"), 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = float.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term9607;
        args[1] = null;
        args[2] = term9609;
        args[3] = null;
        args[4] = term9611;
        args[5] = term9613;
        callMethod(klass, "conventDanMuData", argTypes, term9598, args);
    }

};



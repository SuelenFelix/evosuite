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
import java.lang.Integer;

public class Sqlite2BiliBasFormatExportServiceImpl_createTrackObjectName_11981909712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9624;
     Object term9633;

    public Sqlite2BiliBasFormatExportServiceImpl_createTrackObjectName_11981909712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9624 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl"));
        setField(term9624, term9624.getClass(), "NORMAL_TRACK_STYLE_PREFIX", null);
        setField(term9624, term9624.getClass(), "NORMAL_COLOR", null);
        setField(term9624, term9624.getClass(), "liveName", null);
        setField(term9624, term9624.getClass(), "saveFilePath", null);
        setField(term9624, term9624.getClass(), "saveFileSuffix", null);
        setField(term9624, term9624.getClass(), "sqliteFileList", null);
        setField(term9624, term9624.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term9624, term9624.getClass(), "maxFontSize", 0);
        setIntField(term9624, term9624.getClass(), "mixFontSize", 0);
        setBooleanField(term9624, term9624.getClass(), "showSenderName", false);
        setIntField(term9624, term9624.getClass(), "videoWidth", 0);
        setIntField(term9624, term9624.getClass(), "videoHeight", 0);
        setField(term9624, term9624.getClass(), "NORMAL_STYLE_FONT", null);
        setField(term9624, term9624.getClass(), "NORMAL_STYLE_NAME", null);
        setFloatField(term9624, term9624.getClass(), "NORMAL_FONT_SIZE", 0.0F);
        setField(term9624, term9624.getClass(), "fileNameTimeFormat", null);
        setFloatField(term9624, term9624.getClass(), "screenProp", 0.0F);
        setIntField(term9624, term9624.getClass(), "showTime", 0);
        setField(term9624, term9624.getClass(), "danMuFormatIndexMap", null);
        setField(term9624, term9624.getClass(), "danMuUserInfoModelHashMap", null);
        term9633 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9633;
        callMethod(klass, "createTrackObjectName", argTypes, term9624, args);
    }

};



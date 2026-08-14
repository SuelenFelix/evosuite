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
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Long;

public class Sqlite2BiliBasFormatExportServiceImpl_createSingleBasObject_163349849615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9671;
     Object term9680;
     Object term9682;
     Object term9684;
     Object term9686;

    public Sqlite2BiliBasFormatExportServiceImpl_createSingleBasObject_163349849615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9671 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl"));
        setField(term9671, term9671.getClass(), "NORMAL_TRACK_STYLE_PREFIX", null);
        setField(term9671, term9671.getClass(), "NORMAL_COLOR", null);
        setField(term9671, term9671.getClass(), "liveName", null);
        setField(term9671, term9671.getClass(), "saveFilePath", null);
        setField(term9671, term9671.getClass(), "saveFileSuffix", null);
        setField(term9671, term9671.getClass(), "sqliteFileList", null);
        setField(term9671, term9671.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term9671, term9671.getClass(), "maxFontSize", 0);
        setIntField(term9671, term9671.getClass(), "mixFontSize", 0);
        setBooleanField(term9671, term9671.getClass(), "showSenderName", false);
        setIntField(term9671, term9671.getClass(), "videoWidth", 0);
        setIntField(term9671, term9671.getClass(), "videoHeight", 0);
        setField(term9671, term9671.getClass(), "NORMAL_STYLE_FONT", null);
        setField(term9671, term9671.getClass(), "NORMAL_STYLE_NAME", null);
        setFloatField(term9671, term9671.getClass(), "NORMAL_FONT_SIZE", 0.0F);
        setField(term9671, term9671.getClass(), "fileNameTimeFormat", null);
        setFloatField(term9671, term9671.getClass(), "screenProp", 0.0F);
        setIntField(term9671, term9671.getClass(), "showTime", 0);
        setField(term9671, term9671.getClass(), "danMuFormatIndexMap", null);
        setField(term9671, term9671.getClass(), "danMuUserInfoModelHashMap", null);
        term9680 = new Boolean(false);
        term9682 = new Float(0.0F);
        term9684 = new Long(0L);
        term9686 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat");
        argTypes[5] = float.class;
        argTypes[6] = long.class;
        argTypes[7] = float.class;
        Object[] args = new Object[8];
        args[0] = term9680;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term9682;
        args[6] = term9684;
        args[7] = term9686;
        callMethod(klass, "createSingleBasObject", argTypes, term9671, args);
    }

};



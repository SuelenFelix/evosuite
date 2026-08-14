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
import java.lang.Integer;
import java.lang.Float;
import java.lang.Long;

public class Sqlite2BiliBasFormatExportServiceImpl_createReuseBasObject_169392567513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9635;
     Object term9644;
     Object term9646;
     Object term9648;
     Object term9650;
     Object term9652;
     Object term9654;
     Object term9656;
     Object term9658;

    public Sqlite2BiliBasFormatExportServiceImpl_createReuseBasObject_169392567513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9635 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl"));
        setField(term9635, term9635.getClass(), "NORMAL_TRACK_STYLE_PREFIX", null);
        setField(term9635, term9635.getClass(), "NORMAL_COLOR", null);
        setField(term9635, term9635.getClass(), "liveName", null);
        setField(term9635, term9635.getClass(), "saveFilePath", null);
        setField(term9635, term9635.getClass(), "saveFileSuffix", null);
        setField(term9635, term9635.getClass(), "sqliteFileList", null);
        setField(term9635, term9635.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term9635, term9635.getClass(), "maxFontSize", 0);
        setIntField(term9635, term9635.getClass(), "mixFontSize", 0);
        setBooleanField(term9635, term9635.getClass(), "showSenderName", false);
        setIntField(term9635, term9635.getClass(), "videoWidth", 0);
        setIntField(term9635, term9635.getClass(), "videoHeight", 0);
        setField(term9635, term9635.getClass(), "NORMAL_STYLE_FONT", null);
        setField(term9635, term9635.getClass(), "NORMAL_STYLE_NAME", null);
        setFloatField(term9635, term9635.getClass(), "NORMAL_FONT_SIZE", 0.0F);
        setField(term9635, term9635.getClass(), "fileNameTimeFormat", null);
        setFloatField(term9635, term9635.getClass(), "screenProp", 0.0F);
        setIntField(term9635, term9635.getClass(), "showTime", 0);
        setField(term9635, term9635.getClass(), "danMuFormatIndexMap", null);
        setField(term9635, term9635.getClass(), "danMuUserInfoModelHashMap", null);
        term9644 = new Boolean(false);
        term9646 = new Boolean(false);
        term9648 = new Integer(0);
        term9650 = new Float(0.0F);
        term9652 = new Long(0L);
        term9654 = new Long(0L);
        term9656 = new Long(0L);
        term9658 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = float.class;
        argTypes[4] = long.class;
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat");
        argTypes[8] = long.class;
        argTypes[9] = long.class;
        argTypes[10] = float.class;
        Object[] args = new Object[11];
        args[0] = term9644;
        args[1] = term9646;
        args[2] = term9648;
        args[3] = term9650;
        args[4] = term9652;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        args[8] = term9654;
        args[9] = term9656;
        args[10] = term9658;
        callMethod(klass, "createReuseBasObject", argTypes, term9635, args);
    }

};



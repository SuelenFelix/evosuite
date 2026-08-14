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

public class Sqlite2AssFileDanMuFormatExportServiceImpl_conventDanMuData_183348521612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4604;
     Object term4613;
     Object term4615;
     Object term4617;
     Object term4619;

    public Sqlite2AssFileDanMuFormatExportServiceImpl_conventDanMuData_183348521612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4604 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl"));
        setField(term4604, term4604.getClass(), "liveName", null);
        setField(term4604, term4604.getClass(), "saveFilePath", null);
        setField(term4604, term4604.getClass(), "saveFileSuffix", null);
        setField(term4604, term4604.getClass(), "sqliteFileList", null);
        setField(term4604, term4604.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term4604, term4604.getClass(), "maxFontSize", 0);
        setIntField(term4604, term4604.getClass(), "mixFontSize", 0);
        setBooleanField(term4604, term4604.getClass(), "showSenderName", false);
        setIntField(term4604, term4604.getClass(), "videoWidth", 0);
        setIntField(term4604, term4604.getClass(), "videoHeight", 0);
        setField(term4604, term4604.getClass(), "NORMAL_STYLE_FONT", null);
        setField(term4604, term4604.getClass(), "NORMAL_STYLE_NAME", null);
        setFloatField(term4604, term4604.getClass(), "NORMAL_FONT_SIZE", 0.0F);
        setField(term4604, term4604.getClass(), "fileNameTimeFormat", null);
        setFloatField(term4604, term4604.getClass(), "screenProp", 0.0F);
        setIntField(term4604, term4604.getClass(), "showTime", 0);
        setField(term4604, term4604.getClass(), "danMuFormatIndexMap", null);
        setField(term4604, term4604.getClass(), "danMuUserInfoModelHashMap", null);
        term4613 = new Long(0L);
        term4615 = new Integer(0);
        term4617 = new Float(0.0F);
        term4619 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Array.newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"), 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = float.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term4613;
        args[1] = null;
        args[2] = term4615;
        args[3] = null;
        args[4] = term4617;
        args[5] = term4619;
        callMethod(klass, "conventDanMuData", argTypes, term4604, args);
    }

};



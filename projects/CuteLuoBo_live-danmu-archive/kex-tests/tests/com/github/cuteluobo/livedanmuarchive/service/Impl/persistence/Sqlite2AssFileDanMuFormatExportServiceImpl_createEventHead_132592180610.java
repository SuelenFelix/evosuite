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

public class Sqlite2AssFileDanMuFormatExportServiceImpl_createEventHead_132592180610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4586;

    public Sqlite2AssFileDanMuFormatExportServiceImpl_createEventHead_132592180610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4586 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl"));
        setField(term4586, term4586.getClass(), "liveName", null);
        setField(term4586, term4586.getClass(), "saveFilePath", null);
        setField(term4586, term4586.getClass(), "saveFileSuffix", null);
        setField(term4586, term4586.getClass(), "sqliteFileList", null);
        setField(term4586, term4586.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term4586, term4586.getClass(), "maxFontSize", 0);
        setIntField(term4586, term4586.getClass(), "mixFontSize", 0);
        setBooleanField(term4586, term4586.getClass(), "showSenderName", false);
        setIntField(term4586, term4586.getClass(), "videoWidth", 0);
        setIntField(term4586, term4586.getClass(), "videoHeight", 0);
        setField(term4586, term4586.getClass(), "NORMAL_STYLE_FONT", null);
        setField(term4586, term4586.getClass(), "NORMAL_STYLE_NAME", null);
        setFloatField(term4586, term4586.getClass(), "NORMAL_FONT_SIZE", 0.0F);
        setField(term4586, term4586.getClass(), "fileNameTimeFormat", null);
        setFloatField(term4586, term4586.getClass(), "screenProp", 0.0F);
        setIntField(term4586, term4586.getClass(), "showTime", 0);
        setField(term4586, term4586.getClass(), "danMuFormatIndexMap", null);
        setField(term4586, term4586.getClass(), "danMuUserInfoModelHashMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createEventHead", argTypes, term4586, args);
    }

};



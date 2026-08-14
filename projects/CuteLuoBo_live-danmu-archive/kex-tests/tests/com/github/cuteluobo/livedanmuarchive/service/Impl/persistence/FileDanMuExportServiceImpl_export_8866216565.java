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

public class FileDanMuExportServiceImpl_export_8866216565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1333;

    public FileDanMuExportServiceImpl_export_8866216565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1333 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.FileDanMuExportServiceImpl"));
        setField(term1333, term1333.getClass(), "logger", null);
        setField(term1333, term1333.getClass(), "savePath", null);
        setIntField(term1333, term1333.getClass(), "fileSplitMinutes", 0);
        setLongField(term1333, term1333.getClass(), "startRecordTimeStamp", 0L);
        setField(term1333, term1333.getClass(), "fileNamePrefix", null);
        setField(term1333, term1333.getClass(), "timeExportFormat", null);
        setField(term1333, term1333.getClass(), "fileNameSuffix", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.FileDanMuExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "export", argTypes, term1333, args);
    }

};



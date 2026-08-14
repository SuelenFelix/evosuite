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

public class FileDanMuExportServiceImpl_saveMessageToFile_11220853234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1330;

    public FileDanMuExportServiceImpl_saveMessageToFile_11220853234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1330 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.FileDanMuExportServiceImpl"));
        setField(term1330, term1330.getClass(), "logger", null);
        setField(term1330, term1330.getClass(), "savePath", null);
        setIntField(term1330, term1330.getClass(), "fileSplitMinutes", 0);
        setLongField(term1330, term1330.getClass(), "startRecordTimeStamp", 0L);
        setField(term1330, term1330.getClass(), "fileNamePrefix", null);
        setField(term1330, term1330.getClass(), "timeExportFormat", null);
        setField(term1330, term1330.getClass(), "fileNameSuffix", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.FileDanMuExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "saveMessageToFile", argTypes, term1330, args);
    }

};



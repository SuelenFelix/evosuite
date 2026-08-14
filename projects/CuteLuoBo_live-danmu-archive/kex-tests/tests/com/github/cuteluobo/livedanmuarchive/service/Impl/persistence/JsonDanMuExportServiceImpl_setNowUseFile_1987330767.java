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
import java.lang.String;
import java.lang.Object;

public class JsonDanMuExportServiceImpl_setNowUseFile_1987330767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13124;

    public JsonDanMuExportServiceImpl_setNowUseFile_1987330767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13160 = Class.forName((String) "java.io.File$PathStatus");
        Field term13159 = ((Class) term13160).getDeclaredField((String) "CHECKED");
        ((Field) term13159).setAccessible(true);
        Object enum38 = ((Field) term13159).get((Object) null);
        term13124 = newInstance(Class.forName("java.io.File"));
        setField(term13124, term13124.getClass(), "path", "IHqvyhMtuM");
        setField(term13124, term13124.getClass(), "status", enum38);
        setIntField(term13124, term13124.getClass(), "prefixLength", 1236004505);
        setField(term13124, term13124.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.JsonDanMuExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term13124;
        callMethod(klass, "setNowUseFile", argTypes, null, args);
    }

};



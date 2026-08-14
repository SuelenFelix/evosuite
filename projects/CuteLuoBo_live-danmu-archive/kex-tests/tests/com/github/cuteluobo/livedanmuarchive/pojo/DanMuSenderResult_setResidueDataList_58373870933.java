package com.github.cuteluobo.livedanmuarchive.pojo;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DanMuSenderResult_setResidueDataList_58373870933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30142;

    public DanMuSenderResult_setResidueDataList_58373870933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30142 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        setField(term30142, term30142.getClass(), "logger", null);
        setField(term30142, term30142.getClass(), "total", null);
        setField(term30142, term30142.getClass(), "successNum", null);
        setField(term30142, term30142.getClass(), "failNum", null);
        setLongField(term30142, term30142.getClass(), "startTime", 0L);
        setIntField(term30142, term30142.getClass(), "lastWorkVideoPartIndex", 0);
        setIntField(term30142, term30142.getClass(), "lastWorkDataPageNum", 0);
        setLongField(term30142, term30142.getClass(), "lastSuccessTime", 0L);
        setLongField(term30142, term30142.getClass(), "lastFailTimeSuccessNum", 0L);
        setLongField(term30142, term30142.getClass(), "lastFailTime", 0L);
        setLongField(term30142, term30142.getClass(), "lastFailNum", 0L);
        setField(term30142, term30142.getClass(), "residueDataList", null);
        setField(term30142, term30142.getClass(), "processedVideoData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setResidueDataList", argTypes, term30142, args);
    }

};



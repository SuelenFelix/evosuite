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

public class DanMuSenderResult_setProcessedVideoData_199384323441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30212;

    public DanMuSenderResult_setProcessedVideoData_199384323441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30212 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        setField(term30212, term30212.getClass(), "logger", null);
        setField(term30212, term30212.getClass(), "total", null);
        setField(term30212, term30212.getClass(), "successNum", null);
        setField(term30212, term30212.getClass(), "failNum", null);
        setLongField(term30212, term30212.getClass(), "startTime", 0L);
        setIntField(term30212, term30212.getClass(), "lastWorkVideoPartIndex", 0);
        setIntField(term30212, term30212.getClass(), "lastWorkDataPageNum", 0);
        setLongField(term30212, term30212.getClass(), "lastSuccessTime", 0L);
        setLongField(term30212, term30212.getClass(), "lastFailTimeSuccessNum", 0L);
        setLongField(term30212, term30212.getClass(), "lastFailTime", 0L);
        setLongField(term30212, term30212.getClass(), "lastFailNum", 0L);
        setField(term30212, term30212.getClass(), "residueDataList", null);
        setField(term30212, term30212.getClass(), "processedVideoData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setProcessedVideoData", argTypes, term30212, args);
    }

};



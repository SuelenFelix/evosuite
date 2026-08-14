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

public class DanMuSenderResult_getResidueDataList_37834771532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30134;

    public DanMuSenderResult_getResidueDataList_37834771532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30134 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        setField(term30134, term30134.getClass(), "logger", null);
        setField(term30134, term30134.getClass(), "total", null);
        setField(term30134, term30134.getClass(), "successNum", null);
        setField(term30134, term30134.getClass(), "failNum", null);
        setLongField(term30134, term30134.getClass(), "startTime", 0L);
        setIntField(term30134, term30134.getClass(), "lastWorkVideoPartIndex", 0);
        setIntField(term30134, term30134.getClass(), "lastWorkDataPageNum", 0);
        setLongField(term30134, term30134.getClass(), "lastSuccessTime", 0L);
        setLongField(term30134, term30134.getClass(), "lastFailTimeSuccessNum", 0L);
        setLongField(term30134, term30134.getClass(), "lastFailTime", 0L);
        setLongField(term30134, term30134.getClass(), "lastFailNum", 0L);
        setField(term30134, term30134.getClass(), "residueDataList", null);
        setField(term30134, term30134.getClass(), "processedVideoData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResidueDataList", argTypes, term30134, args);
    }

};



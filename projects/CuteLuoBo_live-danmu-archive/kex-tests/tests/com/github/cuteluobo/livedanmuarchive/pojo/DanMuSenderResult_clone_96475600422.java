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

public class DanMuSenderResult_clone_96475600422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30054;

    public DanMuSenderResult_clone_96475600422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30054 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        setField(term30054, term30054.getClass(), "logger", null);
        setField(term30054, term30054.getClass(), "total", null);
        setField(term30054, term30054.getClass(), "successNum", null);
        setField(term30054, term30054.getClass(), "failNum", null);
        setLongField(term30054, term30054.getClass(), "startTime", 0L);
        setIntField(term30054, term30054.getClass(), "lastWorkVideoPartIndex", 0);
        setIntField(term30054, term30054.getClass(), "lastWorkDataPageNum", 0);
        setLongField(term30054, term30054.getClass(), "lastSuccessTime", 0L);
        setLongField(term30054, term30054.getClass(), "lastFailTimeSuccessNum", 0L);
        setLongField(term30054, term30054.getClass(), "lastFailTime", 0L);
        setLongField(term30054, term30054.getClass(), "lastFailNum", 0L);
        setField(term30054, term30054.getClass(), "residueDataList", null);
        setField(term30054, term30054.getClass(), "processedVideoData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term30054, args);
    }

};



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

public class DanMuSenderResult_setTotal_98955699927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30094;

    public DanMuSenderResult_setTotal_98955699927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30094 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        setField(term30094, term30094.getClass(), "logger", null);
        setField(term30094, term30094.getClass(), "total", null);
        setField(term30094, term30094.getClass(), "successNum", null);
        setField(term30094, term30094.getClass(), "failNum", null);
        setLongField(term30094, term30094.getClass(), "startTime", 0L);
        setIntField(term30094, term30094.getClass(), "lastWorkVideoPartIndex", 0);
        setIntField(term30094, term30094.getClass(), "lastWorkDataPageNum", 0);
        setLongField(term30094, term30094.getClass(), "lastSuccessTime", 0L);
        setLongField(term30094, term30094.getClass(), "lastFailTimeSuccessNum", 0L);
        setLongField(term30094, term30094.getClass(), "lastFailTime", 0L);
        setLongField(term30094, term30094.getClass(), "lastFailNum", 0L);
        setField(term30094, term30094.getClass(), "residueDataList", null);
        setField(term30094, term30094.getClass(), "processedVideoData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.atomic.AtomicLong");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTotal", argTypes, term30094, args);
    }

};



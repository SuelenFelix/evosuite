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
import java.lang.Long;

public class DanMuSenderResult_setStartTime_186938434739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30194;
     Object term30202;

    public DanMuSenderResult_setStartTime_186938434739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30194 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        setField(term30194, term30194.getClass(), "logger", null);
        setField(term30194, term30194.getClass(), "total", null);
        setField(term30194, term30194.getClass(), "successNum", null);
        setField(term30194, term30194.getClass(), "failNum", null);
        setLongField(term30194, term30194.getClass(), "startTime", 0L);
        setIntField(term30194, term30194.getClass(), "lastWorkVideoPartIndex", 0);
        setIntField(term30194, term30194.getClass(), "lastWorkDataPageNum", 0);
        setLongField(term30194, term30194.getClass(), "lastSuccessTime", 0L);
        setLongField(term30194, term30194.getClass(), "lastFailTimeSuccessNum", 0L);
        setLongField(term30194, term30194.getClass(), "lastFailTime", 0L);
        setLongField(term30194, term30194.getClass(), "lastFailNum", 0L);
        setField(term30194, term30194.getClass(), "residueDataList", null);
        setField(term30194, term30194.getClass(), "processedVideoData", null);
        term30202 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term30202;
        callMethod(klass, "setStartTime", argTypes, term30194, args);
    }

};



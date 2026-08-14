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
import java.lang.Integer;

public class DanMuSenderResult_setLastWorkDataPageNum_188123491637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30176;
     Object term30184;

    public DanMuSenderResult_setLastWorkDataPageNum_188123491637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30176 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        setField(term30176, term30176.getClass(), "logger", null);
        setField(term30176, term30176.getClass(), "total", null);
        setField(term30176, term30176.getClass(), "successNum", null);
        setField(term30176, term30176.getClass(), "failNum", null);
        setLongField(term30176, term30176.getClass(), "startTime", 0L);
        setIntField(term30176, term30176.getClass(), "lastWorkVideoPartIndex", 0);
        setIntField(term30176, term30176.getClass(), "lastWorkDataPageNum", 0);
        setLongField(term30176, term30176.getClass(), "lastSuccessTime", 0L);
        setLongField(term30176, term30176.getClass(), "lastFailTimeSuccessNum", 0L);
        setLongField(term30176, term30176.getClass(), "lastFailTime", 0L);
        setLongField(term30176, term30176.getClass(), "lastFailNum", 0L);
        setField(term30176, term30176.getClass(), "residueDataList", null);
        setField(term30176, term30176.getClass(), "processedVideoData", null);
        term30184 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30184;
        callMethod(klass, "setLastWorkDataPageNum", argTypes, term30176, args);
    }

};



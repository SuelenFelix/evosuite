package com.github.cuteluobo.livedanmuarchive.pojo.danmusender;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.danmusender.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class BiliProcessedPartVideoData_setCid_202221301822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term803;
     Object term808;

    public BiliProcessedPartVideoData_setCid_202221301822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term803 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term803, term803.getClass(), "bvId", null);
        setLongField(term803, term803.getClass(), "cid", 0L);
        setLongField(term803, term803.getClass(), "duration", 0L);
        setField(term803, term803.getClass(), "partName", null);
        setLongField(term803, term803.getClass(), "videoStartMillTime", 0L);
        setLongField(term803, term803.getClass(), "videoEndMillTime", 0L);
        term808 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term808;
        callMethod(klass, "setCid", argTypes, term803, args);
    }

};



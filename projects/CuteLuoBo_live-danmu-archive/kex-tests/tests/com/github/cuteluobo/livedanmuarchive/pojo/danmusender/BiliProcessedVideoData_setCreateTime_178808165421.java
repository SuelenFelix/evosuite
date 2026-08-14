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

public class BiliProcessedVideoData_setCreateTime_178808165421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2688;
     Object term2691;

    public BiliProcessedVideoData_setCreateTime_178808165421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2688 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData"));
        setLongField(term2688, term2688.getClass(), "avId", 0L);
        setField(term2688, term2688.getClass(), "bvId", null);
        setField(term2688, term2688.getClass(), "videoName", null);
        setField(term2688, term2688.getClass(), "creatorUid", null);
        setLongField(term2688, term2688.getClass(), "createTime", 0L);
        setField(term2688, term2688.getClass(), "partVideoDataList", null);
        setField(term2688, term2688.getClass(), "pageIndexList", null);
        term2691 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2691;
        callMethod(klass, "setCreateTime", argTypes, term2688, args);
    }

};



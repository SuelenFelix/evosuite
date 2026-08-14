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

public class BiliProcessedVideoData_setAvId_206639001325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2698;
     Object term2701;

    public BiliProcessedVideoData_setAvId_206639001325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2698 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData"));
        setLongField(term2698, term2698.getClass(), "avId", 0L);
        setField(term2698, term2698.getClass(), "bvId", null);
        setField(term2698, term2698.getClass(), "videoName", null);
        setField(term2698, term2698.getClass(), "creatorUid", null);
        setLongField(term2698, term2698.getClass(), "createTime", 0L);
        setField(term2698, term2698.getClass(), "partVideoDataList", null);
        setField(term2698, term2698.getClass(), "pageIndexList", null);
        term2701 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2701;
        callMethod(klass, "setAvId", argTypes, term2698, args);
    }

};



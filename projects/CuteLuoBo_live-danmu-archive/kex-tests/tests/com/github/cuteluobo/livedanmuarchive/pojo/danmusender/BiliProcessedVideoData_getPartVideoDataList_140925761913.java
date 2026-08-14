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
import java.util.ArrayList;
import java.lang.Object;

public class BiliProcessedVideoData_getPartVideoDataList_140925761913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2185;

    public BiliProcessedVideoData_getPartVideoDataList_140925761913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2226 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term2226, term2226.getClass(), "bvId", "");
        setLongField(term2226, term2226.getClass(), "cid", 4576699120365923235L);
        setLongField(term2226, term2226.getClass(), "duration", -1635471392209071620L);
        setField(term2226, term2226.getClass(), "partName", "");
        setLongField(term2226, term2226.getClass(), "videoStartMillTime", -4714000263923324167L);
        setLongField(term2226, term2226.getClass(), "videoEndMillTime", 6906379511067694917L);
        Object term2233 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term2233, term2233.getClass(), "bvId", "");
        setLongField(term2233, term2233.getClass(), "cid", -9204303423581447271L);
        setLongField(term2233, term2233.getClass(), "duration", 6248239231585852341L);
        setField(term2233, term2233.getClass(), "partName", "");
        setLongField(term2233, term2233.getClass(), "videoStartMillTime", -88538481937688851L);
        setLongField(term2233, term2233.getClass(), "videoEndMillTime", 4069264186851023313L);
        ArrayList term2224 = new ArrayList();
        ((ArrayList) term2224).add(term2226);
        ((ArrayList) term2224).add(term2233);
        Object term2244 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term2244, term2244.getClass(), "value", 1962444399);
        ArrayList term2242 = new ArrayList();
        ((ArrayList) term2242).add(term2244);
        term2185 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData"));
        setLongField(term2185, term2185.getClass(), "avId", -67485388932970712L);
        setField(term2185, term2185.getClass(), "bvId", "FPvxVzzSvD");
        setField(term2185, term2185.getClass(), "videoName", "WHcwFgsGFC");
        setField(term2185, term2185.getClass(), "creatorUid", "HzqpegHiRq");
        setLongField(term2185, term2185.getClass(), "createTime", 5806367330808555223L);
        setField(term2185, term2185.getClass(), "partVideoDataList", term2224);
        setField(term2185, term2185.getClass(), "pageIndexList", term2242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPartVideoDataList", argTypes, term2185, args);
    }

};



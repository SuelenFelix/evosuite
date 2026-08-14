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

public class BiliProcessedVideoData_getCreatorUid_840343481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term923;

    public BiliProcessedVideoData_getCreatorUid_840343481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term964 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term964, term964.getClass(), "bvId", "");
        setLongField(term964, term964.getClass(), "cid", 414749984815662075L);
        setLongField(term964, term964.getClass(), "duration", 463622836963501975L);
        setField(term964, term964.getClass(), "partName", "");
        setLongField(term964, term964.getClass(), "videoStartMillTime", 305759998609888272L);
        setLongField(term964, term964.getClass(), "videoEndMillTime", -8654565919063661957L);
        Object term971 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term971, term971.getClass(), "bvId", "");
        setLongField(term971, term971.getClass(), "cid", -5248475803419977214L);
        setLongField(term971, term971.getClass(), "duration", -6723783499250797216L);
        setField(term971, term971.getClass(), "partName", "");
        setLongField(term971, term971.getClass(), "videoStartMillTime", 41775768178052008L);
        setLongField(term971, term971.getClass(), "videoEndMillTime", 6682528376118987775L);
        Object term978 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term978, term978.getClass(), "bvId", "");
        setLongField(term978, term978.getClass(), "cid", 682356318767179819L);
        setLongField(term978, term978.getClass(), "duration", -7291743527973326814L);
        setField(term978, term978.getClass(), "partName", "");
        setLongField(term978, term978.getClass(), "videoStartMillTime", -5963439350418910964L);
        setLongField(term978, term978.getClass(), "videoEndMillTime", 9013624480170062917L);
        Object term985 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term985, term985.getClass(), "bvId", "");
        setLongField(term985, term985.getClass(), "cid", 7862575738391801707L);
        setLongField(term985, term985.getClass(), "duration", 50358265865610362L);
        setField(term985, term985.getClass(), "partName", "");
        setLongField(term985, term985.getClass(), "videoStartMillTime", 5510783420697225605L);
        setLongField(term985, term985.getClass(), "videoEndMillTime", 6005241913654469005L);
        Object term992 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term992, term992.getClass(), "bvId", "");
        setLongField(term992, term992.getClass(), "cid", -1983291584002806658L);
        setLongField(term992, term992.getClass(), "duration", 5946780097489996391L);
        setField(term992, term992.getClass(), "partName", "");
        setLongField(term992, term992.getClass(), "videoStartMillTime", -8652538484981166496L);
        setLongField(term992, term992.getClass(), "videoEndMillTime", 2701184207686293431L);
        ArrayList term962 = new ArrayList();
        ((ArrayList) term962).add(term964);
        ((ArrayList) term962).add(term971);
        ((ArrayList) term962).add(term978);
        ((ArrayList) term962).add(term985);
        ((ArrayList) term962).add(term992);
        Object term1003 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1003, term1003.getClass(), "value", 391863371);
        Object term1005 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1005, term1005.getClass(), "value", -1922583790);
        Object term1007 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1007, term1007.getClass(), "value", -616727354);
        Object term1009 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1009, term1009.getClass(), "value", -1955890973);
        ArrayList term1001 = new ArrayList();
        ((ArrayList) term1001).add(term1003);
        ((ArrayList) term1001).add(term1005);
        ((ArrayList) term1001).add(term1007);
        ((ArrayList) term1001).add(term1009);
        term923 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData"));
        setLongField(term923, term923.getClass(), "avId", 2062173786000223358L);
        setField(term923, term923.getClass(), "bvId", "dWRymuLBtr");
        setField(term923, term923.getClass(), "videoName", "AijpHYOFuy");
        setField(term923, term923.getClass(), "creatorUid", "SbAoxhfrkn");
        setLongField(term923, term923.getClass(), "createTime", -8658027316505137504L);
        setField(term923, term923.getClass(), "partVideoDataList", term962);
        setField(term923, term923.getClass(), "pageIndexList", term1001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatorUid", argTypes, term923, args);
    }

};



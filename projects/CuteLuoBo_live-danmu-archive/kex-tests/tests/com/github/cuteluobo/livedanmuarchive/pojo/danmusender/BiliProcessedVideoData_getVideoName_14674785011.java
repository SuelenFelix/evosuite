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

public class BiliProcessedVideoData_getVideoName_14674785011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1937;

    public BiliProcessedVideoData_getVideoName_14674785011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1976 = new ArrayList();
        Object term1982 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1982, term1982.getClass(), "value", -73683645);
        Object term1984 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1984, term1984.getClass(), "value", -226514366);
        ArrayList term1980 = new ArrayList();
        ((ArrayList) term1980).add(term1982);
        ((ArrayList) term1980).add(term1984);
        term1937 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData"));
        setLongField(term1937, term1937.getClass(), "avId", 185793058502220865L);
        setField(term1937, term1937.getClass(), "bvId", "AdxvLJhNLe");
        setField(term1937, term1937.getClass(), "videoName", "lHfTrWKMPk");
        setField(term1937, term1937.getClass(), "creatorUid", "JDaAnsVTGV");
        setLongField(term1937, term1937.getClass(), "createTime", -7698746988132548371L);
        setField(term1937, term1937.getClass(), "partVideoDataList", term1976);
        setField(term1937, term1937.getClass(), "pageIndexList", term1980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVideoName", argTypes, term1937, args);
    }

};



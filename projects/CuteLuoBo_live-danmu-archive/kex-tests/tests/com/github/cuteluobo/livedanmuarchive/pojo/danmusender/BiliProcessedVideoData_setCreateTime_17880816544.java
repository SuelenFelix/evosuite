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
import java.lang.Long;

public class BiliProcessedVideoData_setCreateTime_17880816544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1267;
     Object term1340;

    public BiliProcessedVideoData_setCreateTime_17880816544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1308 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1308, term1308.getClass(), "bvId", "");
        setLongField(term1308, term1308.getClass(), "cid", -3936701866695933852L);
        setLongField(term1308, term1308.getClass(), "duration", 1215116475929634177L);
        setField(term1308, term1308.getClass(), "partName", "");
        setLongField(term1308, term1308.getClass(), "videoStartMillTime", 1597484336218508869L);
        setLongField(term1308, term1308.getClass(), "videoEndMillTime", -685023850445639859L);
        Object term1315 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1315, term1315.getClass(), "bvId", "");
        setLongField(term1315, term1315.getClass(), "cid", -6950146046121430355L);
        setLongField(term1315, term1315.getClass(), "duration", 1667122142089513324L);
        setField(term1315, term1315.getClass(), "partName", "");
        setLongField(term1315, term1315.getClass(), "videoStartMillTime", -6342139649364011743L);
        setLongField(term1315, term1315.getClass(), "videoEndMillTime", -4924950707540628022L);
        ArrayList term1306 = new ArrayList();
        ((ArrayList) term1306).add(term1308);
        ((ArrayList) term1306).add(term1315);
        Object term1326 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1326, term1326.getClass(), "value", -1456670397);
        Object term1328 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1328, term1328.getClass(), "value", 1622346318);
        Object term1330 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1330, term1330.getClass(), "value", 1048535127);
        Object term1332 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1332, term1332.getClass(), "value", -655067527);
        Object term1334 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1334, term1334.getClass(), "value", -6029667);
        Object term1336 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1336, term1336.getClass(), "value", -2068769794);
        ArrayList term1324 = new ArrayList();
        ((ArrayList) term1324).add(term1326);
        ((ArrayList) term1324).add(term1328);
        ((ArrayList) term1324).add(term1330);
        ((ArrayList) term1324).add(term1332);
        ((ArrayList) term1324).add(term1334);
        ((ArrayList) term1324).add(term1336);
        term1267 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData"));
        setLongField(term1267, term1267.getClass(), "avId", 2354625302846375590L);
        setField(term1267, term1267.getClass(), "bvId", "nHXjMycHlU");
        setField(term1267, term1267.getClass(), "videoName", "ieCtQFdkii");
        setField(term1267, term1267.getClass(), "creatorUid", "dEnhdmILtU");
        setLongField(term1267, term1267.getClass(), "createTime", 7276637106827860087L);
        setField(term1267, term1267.getClass(), "partVideoDataList", term1306);
        setField(term1267, term1267.getClass(), "pageIndexList", term1324);
        term1340 = new Long(-4393710401270724527L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1340;
        callMethod(klass, "setCreateTime", argTypes, term1267, args);
    }

};



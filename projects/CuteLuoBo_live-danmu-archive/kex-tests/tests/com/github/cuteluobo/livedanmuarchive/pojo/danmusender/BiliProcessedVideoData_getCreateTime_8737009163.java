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

public class BiliProcessedVideoData_getCreateTime_8737009163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1171;

    public BiliProcessedVideoData_getCreateTime_8737009163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1212 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1212, term1212.getClass(), "bvId", "");
        setLongField(term1212, term1212.getClass(), "cid", -8033714905181142681L);
        setLongField(term1212, term1212.getClass(), "duration", -9040825890007374809L);
        setField(term1212, term1212.getClass(), "partName", "");
        setLongField(term1212, term1212.getClass(), "videoStartMillTime", 1368340889161782793L);
        setLongField(term1212, term1212.getClass(), "videoEndMillTime", -5786861555969446503L);
        ArrayList term1210 = new ArrayList();
        ((ArrayList) term1210).add(term1212);
        Object term1223 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1223, term1223.getClass(), "value", -522618178);
        Object term1225 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1225, term1225.getClass(), "value", 1134449235);
        Object term1227 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1227, term1227.getClass(), "value", -883034806);
        Object term1229 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1229, term1229.getClass(), "value", 1585847225);
        Object term1231 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1231, term1231.getClass(), "value", 597278769);
        Object term1233 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1233, term1233.getClass(), "value", -1685132342);
        ArrayList term1221 = new ArrayList();
        ((ArrayList) term1221).add(term1223);
        ((ArrayList) term1221).add(term1225);
        ((ArrayList) term1221).add(term1227);
        ((ArrayList) term1221).add(term1229);
        ((ArrayList) term1221).add(term1231);
        ((ArrayList) term1221).add(term1233);
        term1171 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData"));
        setLongField(term1171, term1171.getClass(), "avId", -5216789073301458893L);
        setField(term1171, term1171.getClass(), "bvId", "onpbIeEKoi");
        setField(term1171, term1171.getClass(), "videoName", "YRHGsAkhxb");
        setField(term1171, term1171.getClass(), "creatorUid", "ffYhPOzlUs");
        setLongField(term1171, term1171.getClass(), "createTime", -1832940336320585644L);
        setField(term1171, term1171.getClass(), "partVideoDataList", term1210);
        setField(term1171, term1171.getClass(), "pageIndexList", term1221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTime", argTypes, term1171, args);
    }

};



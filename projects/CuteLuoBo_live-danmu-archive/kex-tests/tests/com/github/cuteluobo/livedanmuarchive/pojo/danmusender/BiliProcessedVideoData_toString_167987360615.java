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

public class BiliProcessedVideoData_toString_167987360615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2485;

    public BiliProcessedVideoData_toString_167987360615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2526 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term2526, term2526.getClass(), "bvId", "");
        setLongField(term2526, term2526.getClass(), "cid", -3130003589475815807L);
        setLongField(term2526, term2526.getClass(), "duration", -5344598381371854750L);
        setField(term2526, term2526.getClass(), "partName", "");
        setLongField(term2526, term2526.getClass(), "videoStartMillTime", -3718250311794019732L);
        setLongField(term2526, term2526.getClass(), "videoEndMillTime", -5935517391653614345L);
        ArrayList term2524 = new ArrayList();
        ((ArrayList) term2524).add(term2526);
        Object term2537 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term2537, term2537.getClass(), "value", 1876565163);
        Object term2539 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term2539, term2539.getClass(), "value", -817164822);
        ArrayList term2535 = new ArrayList();
        ((ArrayList) term2535).add(term2537);
        ((ArrayList) term2535).add(term2539);
        term2485 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData"));
        setLongField(term2485, term2485.getClass(), "avId", 6315101499811179240L);
        setField(term2485, term2485.getClass(), "bvId", "igCAtimmYB");
        setField(term2485, term2485.getClass(), "videoName", "DyiXbeYIaN");
        setField(term2485, term2485.getClass(), "creatorUid", "VGizxZnyHX");
        setLongField(term2485, term2485.getClass(), "createTime", -3033337370154155851L);
        setField(term2485, term2485.getClass(), "partVideoDataList", term2524);
        setField(term2485, term2485.getClass(), "pageIndexList", term2535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2485, args);
    }

};



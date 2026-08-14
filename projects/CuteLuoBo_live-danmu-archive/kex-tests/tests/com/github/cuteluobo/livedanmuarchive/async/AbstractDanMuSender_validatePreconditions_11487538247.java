package com.github.cuteluobo.livedanmuarchive.async;

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
import static com.github.cuteluobo.livedanmuarchive.async.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class AbstractDanMuSender_validatePreconditions_11487538247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1995;

    public AbstractDanMuSender_validatePreconditions_11487538247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2036 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term2036, term2036.getClass(), "bvId", "");
        setLongField(term2036, term2036.getClass(), "cid", 1967728129628047933L);
        setLongField(term2036, term2036.getClass(), "duration", 2120084523938730454L);
        setField(term2036, term2036.getClass(), "partName", "");
        setLongField(term2036, term2036.getClass(), "videoStartMillTime", 6855071767938501807L);
        setLongField(term2036, term2036.getClass(), "videoEndMillTime", -5892135042702373494L);
        Object term2043 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term2043, term2043.getClass(), "bvId", "");
        setLongField(term2043, term2043.getClass(), "cid", 5262507301787091109L);
        setLongField(term2043, term2043.getClass(), "duration", -6823727938421990489L);
        setField(term2043, term2043.getClass(), "partName", "");
        setLongField(term2043, term2043.getClass(), "videoStartMillTime", -484994522244390100L);
        setLongField(term2043, term2043.getClass(), "videoEndMillTime", 1233889271256172047L);
        Object term2050 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term2050, term2050.getClass(), "bvId", "");
        setLongField(term2050, term2050.getClass(), "cid", 6617340557564669657L);
        setLongField(term2050, term2050.getClass(), "duration", 1439298019805881866L);
        setField(term2050, term2050.getClass(), "partName", "");
        setLongField(term2050, term2050.getClass(), "videoStartMillTime", -8708192233349544946L);
        setLongField(term2050, term2050.getClass(), "videoEndMillTime", 5907001541142728739L);
        Object term2057 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term2057, term2057.getClass(), "bvId", "");
        setLongField(term2057, term2057.getClass(), "cid", 4178434741742309755L);
        setLongField(term2057, term2057.getClass(), "duration", -2068172595987555756L);
        setField(term2057, term2057.getClass(), "partName", "");
        setLongField(term2057, term2057.getClass(), "videoStartMillTime", -6292278961887936280L);
        setLongField(term2057, term2057.getClass(), "videoEndMillTime", -6645965768855543712L);
        ArrayList term2034 = new ArrayList();
        ((ArrayList) term2034).add(term2036);
        ((ArrayList) term2034).add(term2043);
        ((ArrayList) term2034).add(term2050);
        ((ArrayList) term2034).add(term2057);
        Object term2068 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term2068, term2068.getClass(), "value", -1922583790);
        ArrayList term2066 = new ArrayList();
        ((ArrayList) term2066).add(term2068);
        term1995 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData"));
        setLongField(term1995, term1995.getClass(), "avId", -7672528020740371001L);
        setField(term1995, term1995.getClass(), "bvId", "xOcJIiQQDu");
        setField(term1995, term1995.getClass(), "videoName", "GVizqqzXpy");
        setField(term1995, term1995.getClass(), "creatorUid", "JqXGgAhZPl");
        setLongField(term1995, term1995.getClass(), "createTime", -4502405999831680926L);
        setField(term1995, term1995.getClass(), "partVideoDataList", term2034);
        setField(term1995, term1995.getClass(), "pageIndexList", term2066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.async.AbstractDanMuSender");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData");
        Object[] args = new Object[1];
        args[0] = term1995;
        callMethod(klass, "validatePreconditions", argTypes, null, args);
    }

};



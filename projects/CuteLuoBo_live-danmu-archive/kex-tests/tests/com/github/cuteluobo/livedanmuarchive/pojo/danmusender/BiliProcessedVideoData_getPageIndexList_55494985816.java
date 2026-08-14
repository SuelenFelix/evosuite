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

public class BiliProcessedVideoData_getPageIndexList_55494985816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2573;

    public BiliProcessedVideoData_getPageIndexList_55494985816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2614 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term2614, term2614.getClass(), "bvId", "");
        setLongField(term2614, term2614.getClass(), "cid", -7296330380944173376L);
        setLongField(term2614, term2614.getClass(), "duration", -8890284990655172580L);
        setField(term2614, term2614.getClass(), "partName", "");
        setLongField(term2614, term2614.getClass(), "videoStartMillTime", -5951743062322506095L);
        setLongField(term2614, term2614.getClass(), "videoEndMillTime", 768144790810175653L);
        Object term2621 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term2621, term2621.getClass(), "bvId", "");
        setLongField(term2621, term2621.getClass(), "cid", -1497280900081695731L);
        setLongField(term2621, term2621.getClass(), "duration", -3602825674339018793L);
        setField(term2621, term2621.getClass(), "partName", "");
        setLongField(term2621, term2621.getClass(), "videoStartMillTime", 3086974592680165932L);
        setLongField(term2621, term2621.getClass(), "videoEndMillTime", -532956263280568707L);
        Object term2628 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term2628, term2628.getClass(), "bvId", "");
        setLongField(term2628, term2628.getClass(), "cid", 6073193746616629086L);
        setLongField(term2628, term2628.getClass(), "duration", -2463629530824341661L);
        setField(term2628, term2628.getClass(), "partName", "");
        setLongField(term2628, term2628.getClass(), "videoStartMillTime", 7800835025296877231L);
        setLongField(term2628, term2628.getClass(), "videoEndMillTime", -187772971269812453L);
        ArrayList term2612 = new ArrayList();
        ((ArrayList) term2612).add(term2614);
        ((ArrayList) term2612).add(term2621);
        ((ArrayList) term2612).add(term2628);
        Object term2639 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term2639, term2639.getClass(), "value", -1016503459);
        Object term2641 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term2641, term2641.getClass(), "value", -1968847291);
        Object term2643 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term2643, term2643.getClass(), "value", 579005622);
        Object term2645 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term2645, term2645.getClass(), "value", -14890619);
        ArrayList term2637 = new ArrayList();
        ((ArrayList) term2637).add(term2639);
        ((ArrayList) term2637).add(term2641);
        ((ArrayList) term2637).add(term2643);
        ((ArrayList) term2637).add(term2645);
        term2573 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData"));
        setLongField(term2573, term2573.getClass(), "avId", -6521561238735301071L);
        setField(term2573, term2573.getClass(), "bvId", "RbVQXSpxXy");
        setField(term2573, term2573.getClass(), "videoName", "YpJbIgJWWv");
        setField(term2573, term2573.getClass(), "creatorUid", "JppkknKVOw");
        setLongField(term2573, term2573.getClass(), "createTime", -6609679920238945303L);
        setField(term2573, term2573.getClass(), "partVideoDataList", term2612);
        setField(term2573, term2573.getClass(), "pageIndexList", term2637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPageIndexList", argTypes, term2573, args);
    }

};



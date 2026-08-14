package com.github.cuteluobo.livedanmuarchive.dto;

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
import static com.github.cuteluobo.livedanmuarchive.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class DanMuAccountTaskSelector_getEndFinishTime_78120801511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2521;

    public DanMuAccountTaskSelector_getEndFinishTime_78120801511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2522 = new Long(6315101499811179240L);
        Long term2524 = new Long(-3033337370154155851L);
        Long term2526 = new Long(-3130003589475815807L);
        Long term2528 = new Long(-5344598381371854750L);
        Long term2530 = new Long(-3718250311794019732L);
        Long term2532 = new Long(-5935517391653614345L);
        Integer term2570 = new Integer(0);
        Integer term2572 = new Integer(0);
        Integer term2538 = new Integer(972867650);
        Integer term2540 = new Integer(1655935355);
        Integer term2566 = new Integer(-481533957);
        Long term2568 = new Long(-6521561238735301071L);
        Integer term2574 = new Integer(1240914516);
        Boolean term2576 = new Boolean(false);
        Long term2578 = new Long(-6609679920238945303L);
        Long term2580 = new Long(-7296330380944173376L);
        Long term2582 = new Long(-8890284990655172580L);
        term2521 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term2521, term2521.getClass(), "startCreateTime", term2522);
        setField(term2521, term2521.getClass(), "endCreateTime", term2524);
        setField(term2521, term2521.getClass(), "startUpdateTime", term2526);
        setField(term2521, term2521.getClass(), "endUpdateTime", term2528);
        setField(term2521, term2521.getClass(), "startFinishTime", term2530);
        setField(term2521, term2521.getClass(), "endFinishTime", term2532);
        setField(term2521, term2521.getClass(), "pageIndex", term2570);
        setField(term2521, term2521.getClass(), "pageSize", term2572);
        setField(term2521, term2521.getClass(), "id", term2538);
        setField(term2521, term2521.getClass(), "danmuSenderTaskId", term2540);
        setField(term2521, term2521.getClass(), "senderUid", "tPlsykYBqO");
        setField(term2521, term2521.getClass(), "videoId", "bLPjGVBhlX");
        setField(term2521, term2521.getClass(), "lastVideoPartIndex", term2566);
        setField(term2521, term2521.getClass(), "lastVideoPartCid", term2568);
        setField(term2521, term2521.getClass(), "lastDanmuIndex", term2574);
        setField(term2521, term2521.getClass(), "stop", term2576);
        setField(term2521, term2521.getClass(), "createTime", term2578);
        setField(term2521, term2521.getClass(), "updateTime", term2580);
        setField(term2521, term2521.getClass(), "finishTime", term2582);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndFinishTime", argTypes, term2521, args);
    }

};



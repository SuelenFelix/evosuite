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

public class DanMuAccountTaskSelector_getStartFinishTime_4029256549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2353;

    public DanMuAccountTaskSelector_getStartFinishTime_4029256549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2354 = new Long(2535970782317488741L);
        Long term2356 = new Long(-5258945362776941718L);
        Long term2358 = new Long(24067105862153728L);
        Long term2360 = new Long(-8477368071089201577L);
        Long term2362 = new Long(-1526729287349763895L);
        Long term2364 = new Long(7017605765544766728L);
        Integer term2402 = new Integer(0);
        Integer term2404 = new Integer(0);
        Integer term2370 = new Integer(-112921587);
        Integer term2372 = new Integer(933028652);
        Integer term2398 = new Integer(287287233);
        Long term2400 = new Long(-6078481855513028760L);
        Integer term2406 = new Integer(962840079);
        Boolean term2408 = new Boolean(false);
        Long term2410 = new Long(-6985556670871089725L);
        Long term2412 = new Long(-8469818909085103606L);
        Long term2414 = new Long(11315815278355083L);
        term2353 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term2353, term2353.getClass(), "startCreateTime", term2354);
        setField(term2353, term2353.getClass(), "endCreateTime", term2356);
        setField(term2353, term2353.getClass(), "startUpdateTime", term2358);
        setField(term2353, term2353.getClass(), "endUpdateTime", term2360);
        setField(term2353, term2353.getClass(), "startFinishTime", term2362);
        setField(term2353, term2353.getClass(), "endFinishTime", term2364);
        setField(term2353, term2353.getClass(), "pageIndex", term2402);
        setField(term2353, term2353.getClass(), "pageSize", term2404);
        setField(term2353, term2353.getClass(), "id", term2370);
        setField(term2353, term2353.getClass(), "danmuSenderTaskId", term2372);
        setField(term2353, term2353.getClass(), "senderUid", "fhkbdRViHi");
        setField(term2353, term2353.getClass(), "videoId", "uWHnvSvaPl");
        setField(term2353, term2353.getClass(), "lastVideoPartIndex", term2398);
        setField(term2353, term2353.getClass(), "lastVideoPartCid", term2400);
        setField(term2353, term2353.getClass(), "lastDanmuIndex", term2406);
        setField(term2353, term2353.getClass(), "stop", term2408);
        setField(term2353, term2353.getClass(), "createTime", term2410);
        setField(term2353, term2353.getClass(), "updateTime", term2412);
        setField(term2353, term2353.getClass(), "finishTime", term2414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartFinishTime", argTypes, term2353, args);
    }

};



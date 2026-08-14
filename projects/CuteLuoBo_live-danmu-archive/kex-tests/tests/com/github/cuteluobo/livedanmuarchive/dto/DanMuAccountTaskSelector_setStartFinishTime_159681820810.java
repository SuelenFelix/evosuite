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

public class DanMuAccountTaskSelector_setStartFinishTime_159681820810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2436;
     Object term2499;

    public DanMuAccountTaskSelector_setStartFinishTime_159681820810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2437 = new Long(7735460540091431012L);
        Long term2439 = new Long(1346299551708610248L);
        Long term2441 = new Long(-7191625829563442696L);
        Long term2443 = new Long(1463379874413441830L);
        Long term2445 = new Long(7998051124369147543L);
        Long term2447 = new Long(-1481367303699139651L);
        Integer term2485 = new Integer(0);
        Integer term2487 = new Integer(0);
        Integer term2453 = new Integer(335112684);
        Integer term2455 = new Integer(1551099402);
        Integer term2481 = new Integer(-2027534003);
        Long term2483 = new Long(-7709317346333670618L);
        Integer term2489 = new Integer(1063420942);
        Boolean term2491 = new Boolean(false);
        Long term2493 = new Long(-1964501434345816975L);
        Long term2495 = new Long(4689907154423223972L);
        Long term2497 = new Long(8512025621149521819L);
        term2436 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term2436, term2436.getClass(), "startCreateTime", term2437);
        setField(term2436, term2436.getClass(), "endCreateTime", term2439);
        setField(term2436, term2436.getClass(), "startUpdateTime", term2441);
        setField(term2436, term2436.getClass(), "endUpdateTime", term2443);
        setField(term2436, term2436.getClass(), "startFinishTime", term2445);
        setField(term2436, term2436.getClass(), "endFinishTime", term2447);
        setField(term2436, term2436.getClass(), "pageIndex", term2485);
        setField(term2436, term2436.getClass(), "pageSize", term2487);
        setField(term2436, term2436.getClass(), "id", term2453);
        setField(term2436, term2436.getClass(), "danmuSenderTaskId", term2455);
        setField(term2436, term2436.getClass(), "senderUid", "kBdSllIBVz");
        setField(term2436, term2436.getClass(), "videoId", "TJmVBGfTML");
        setField(term2436, term2436.getClass(), "lastVideoPartIndex", term2481);
        setField(term2436, term2436.getClass(), "lastVideoPartCid", term2483);
        setField(term2436, term2436.getClass(), "lastDanmuIndex", term2489);
        setField(term2436, term2436.getClass(), "stop", term2491);
        setField(term2436, term2436.getClass(), "createTime", term2493);
        setField(term2436, term2436.getClass(), "updateTime", term2495);
        setField(term2436, term2436.getClass(), "finishTime", term2497);
        term2499 = new Long(2022482096970820459L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2499;
        callMethod(klass, "setStartFinishTime", argTypes, term2436, args);
    }

};



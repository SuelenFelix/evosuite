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

public class DanMuAccountTaskSelector_setEndUpdateTime_2212256498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2268;
     Object term2331;

    public DanMuAccountTaskSelector_setEndUpdateTime_2212256498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2269 = new Long(-6685235643232255177L);
        Long term2271 = new Long(-5656664340499957324L);
        Long term2273 = new Long(-5460517064177800852L);
        Long term2275 = new Long(-5242567610844514867L);
        Long term2277 = new Long(-2951854704066477061L);
        Long term2279 = new Long(174253963298276221L);
        Integer term2317 = new Integer(0);
        Integer term2319 = new Integer(0);
        Integer term2285 = new Integer(-1371869594);
        Integer term2287 = new Integer(-2095575670);
        Integer term2313 = new Integer(1225272962);
        Long term2315 = new Long(3713624957161771816L);
        Integer term2321 = new Integer(1324040357);
        Boolean term2323 = new Boolean(false);
        Long term2325 = new Long(6130232388739280211L);
        Long term2327 = new Long(3423965054378869855L);
        Long term2329 = new Long(-593735869267672817L);
        term2268 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term2268, term2268.getClass(), "startCreateTime", term2269);
        setField(term2268, term2268.getClass(), "endCreateTime", term2271);
        setField(term2268, term2268.getClass(), "startUpdateTime", term2273);
        setField(term2268, term2268.getClass(), "endUpdateTime", term2275);
        setField(term2268, term2268.getClass(), "startFinishTime", term2277);
        setField(term2268, term2268.getClass(), "endFinishTime", term2279);
        setField(term2268, term2268.getClass(), "pageIndex", term2317);
        setField(term2268, term2268.getClass(), "pageSize", term2319);
        setField(term2268, term2268.getClass(), "id", term2285);
        setField(term2268, term2268.getClass(), "danmuSenderTaskId", term2287);
        setField(term2268, term2268.getClass(), "senderUid", "hoicvmsovO");
        setField(term2268, term2268.getClass(), "videoId", "eqJfYWRaEL");
        setField(term2268, term2268.getClass(), "lastVideoPartIndex", term2313);
        setField(term2268, term2268.getClass(), "lastVideoPartCid", term2315);
        setField(term2268, term2268.getClass(), "lastDanmuIndex", term2321);
        setField(term2268, term2268.getClass(), "stop", term2323);
        setField(term2268, term2268.getClass(), "createTime", term2325);
        setField(term2268, term2268.getClass(), "updateTime", term2327);
        setField(term2268, term2268.getClass(), "finishTime", term2329);
        term2331 = new Long(6041374912351843923L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2331;
        callMethod(klass, "setEndUpdateTime", argTypes, term2268, args);
    }

};



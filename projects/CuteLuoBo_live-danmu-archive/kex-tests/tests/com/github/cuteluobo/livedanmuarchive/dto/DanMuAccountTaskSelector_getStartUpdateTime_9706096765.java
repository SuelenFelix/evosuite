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

public class DanMuAccountTaskSelector_getStartUpdateTime_9706096765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2017;

    public DanMuAccountTaskSelector_getStartUpdateTime_9706096765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2018 = new Long(-3277773415369003529L);
        Long term2020 = new Long(1253549421411622358L);
        Long term2022 = new Long(3666226122807672448L);
        Long term2024 = new Long(3108750145697087661L);
        Long term2026 = new Long(3752337209837437327L);
        Long term2028 = new Long(1860789353508856614L);
        Integer term2066 = new Integer(0);
        Integer term2068 = new Integer(0);
        Integer term2034 = new Integer(1876565163);
        Integer term2036 = new Integer(-817164822);
        Integer term2062 = new Integer(-1016503459);
        Long term2064 = new Long(-7456852906235966771L);
        Integer term2070 = new Integer(-1968847291);
        Boolean term2072 = new Boolean(false);
        Long term2074 = new Long(-67485388932970712L);
        Long term2076 = new Long(5806367330808555223L);
        Long term2078 = new Long(4576699120365923235L);
        term2017 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term2017, term2017.getClass(), "startCreateTime", term2018);
        setField(term2017, term2017.getClass(), "endCreateTime", term2020);
        setField(term2017, term2017.getClass(), "startUpdateTime", term2022);
        setField(term2017, term2017.getClass(), "endUpdateTime", term2024);
        setField(term2017, term2017.getClass(), "startFinishTime", term2026);
        setField(term2017, term2017.getClass(), "endFinishTime", term2028);
        setField(term2017, term2017.getClass(), "pageIndex", term2066);
        setField(term2017, term2017.getClass(), "pageSize", term2068);
        setField(term2017, term2017.getClass(), "id", term2034);
        setField(term2017, term2017.getClass(), "danmuSenderTaskId", term2036);
        setField(term2017, term2017.getClass(), "senderUid", "ffYhPOzlUs");
        setField(term2017, term2017.getClass(), "videoId", "MLqYREekMl");
        setField(term2017, term2017.getClass(), "lastVideoPartIndex", term2062);
        setField(term2017, term2017.getClass(), "lastVideoPartCid", term2064);
        setField(term2017, term2017.getClass(), "lastDanmuIndex", term2070);
        setField(term2017, term2017.getClass(), "stop", term2072);
        setField(term2017, term2017.getClass(), "createTime", term2074);
        setField(term2017, term2017.getClass(), "updateTime", term2076);
        setField(term2017, term2017.getClass(), "finishTime", term2078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartUpdateTime", argTypes, term2017, args);
    }

};



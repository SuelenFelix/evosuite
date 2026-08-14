package com.github.cuteluobo.livedanmuarchive.model;

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
import static com.github.cuteluobo.livedanmuarchive.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;

public class DanmuAccountTaskModel_getCreateTime_207615532721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4587;

    public DanmuAccountTaskModel_getCreateTime_207615532721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4588 = new Integer(96566506);
        Integer term4590 = new Integer(-343325701);
        Integer term4616 = new Integer(107945604);
        Long term4618 = new Long(-1145146470850585022L);
        Integer term4620 = new Integer(0);
        Integer term4622 = new Integer(0);
        Integer term4624 = new Integer(-1963464809);
        Boolean term4626 = new Boolean(false);
        Long term4628 = new Long(1993646237353405740L);
        Long term4630 = new Long(-4043093655001688454L);
        Long term4632 = new Long(-419800263764810394L);
        term4587 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term4587, term4587.getClass(), "id", term4588);
        setField(term4587, term4587.getClass(), "danmuSenderTaskId", term4590);
        setField(term4587, term4587.getClass(), "senderUid", "ZfdXfCCFDf");
        setField(term4587, term4587.getClass(), "videoId", "MwwjNtdOFT");
        setField(term4587, term4587.getClass(), "lastVideoPartIndex", term4616);
        setField(term4587, term4587.getClass(), "lastVideoPartCid", term4618);
        setField(term4587, term4587.getClass(), "pageIndex", term4620);
        setField(term4587, term4587.getClass(), "pageSize", term4622);
        setField(term4587, term4587.getClass(), "lastDanmuIndex", term4624);
        setField(term4587, term4587.getClass(), "stop", term4626);
        setField(term4587, term4587.getClass(), "createTime", term4628);
        setField(term4587, term4587.getClass(), "updateTime", term4630);
        setField(term4587, term4587.getClass(), "finishTime", term4632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTime", argTypes, term4587, args);
    }

};



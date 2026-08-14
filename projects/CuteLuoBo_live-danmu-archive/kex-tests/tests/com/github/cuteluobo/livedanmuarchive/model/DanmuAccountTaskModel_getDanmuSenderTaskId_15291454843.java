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

public class DanmuAccountTaskModel_getDanmuSenderTaskId_15291454843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3323;

    public DanmuAccountTaskModel_getDanmuSenderTaskId_15291454843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3324 = new Integer(292681826);
        Integer term3326 = new Integer(458147407);
        Integer term3352 = new Integer(-184153539);
        Long term3354 = new Long(-6587807377747738663L);
        Integer term3356 = new Integer(0);
        Integer term3358 = new Integer(0);
        Integer term3360 = new Integer(493620644);
        Boolean term3362 = new Boolean(false);
        Long term3364 = new Long(-6301101997917060727L);
        Long term3366 = new Long(8166095254618543564L);
        Long term3368 = new Long(-4598158870068953328L);
        term3323 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term3323, term3323.getClass(), "id", term3324);
        setField(term3323, term3323.getClass(), "danmuSenderTaskId", term3326);
        setField(term3323, term3323.getClass(), "senderUid", "RYdKCNNMBR");
        setField(term3323, term3323.getClass(), "videoId", "yGtHPyvYiQ");
        setField(term3323, term3323.getClass(), "lastVideoPartIndex", term3352);
        setField(term3323, term3323.getClass(), "lastVideoPartCid", term3354);
        setField(term3323, term3323.getClass(), "pageIndex", term3356);
        setField(term3323, term3323.getClass(), "pageSize", term3358);
        setField(term3323, term3323.getClass(), "lastDanmuIndex", term3360);
        setField(term3323, term3323.getClass(), "stop", term3362);
        setField(term3323, term3323.getClass(), "createTime", term3364);
        setField(term3323, term3323.getClass(), "updateTime", term3366);
        setField(term3323, term3323.getClass(), "finishTime", term3368);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDanmuSenderTaskId", argTypes, term3323, args);
    }

};



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

public class DanmuAccountTaskModel_setDanmuSenderTaskId_12548209184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3390;
     Object term3437;

    public DanmuAccountTaskModel_setDanmuSenderTaskId_12548209184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3391 = new Integer(1328271830);
        Integer term3393 = new Integer(1596070772);
        Integer term3419 = new Integer(97029295);
        Long term3421 = new Long(138235087558060686L);
        Integer term3423 = new Integer(0);
        Integer term3425 = new Integer(0);
        Integer term3427 = new Integer(-1371869594);
        Boolean term3429 = new Boolean(false);
        Long term3431 = new Long(5381386339318883012L);
        Long term3433 = new Long(-1333707622307134180L);
        Long term3435 = new Long(-4360569253593381888L);
        term3390 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term3390, term3390.getClass(), "id", term3391);
        setField(term3390, term3390.getClass(), "danmuSenderTaskId", term3393);
        setField(term3390, term3390.getClass(), "senderUid", "MvRIxilFMJ");
        setField(term3390, term3390.getClass(), "videoId", "iNwOJRBEjp");
        setField(term3390, term3390.getClass(), "lastVideoPartIndex", term3419);
        setField(term3390, term3390.getClass(), "lastVideoPartCid", term3421);
        setField(term3390, term3390.getClass(), "pageIndex", term3423);
        setField(term3390, term3390.getClass(), "pageSize", term3425);
        setField(term3390, term3390.getClass(), "lastDanmuIndex", term3427);
        setField(term3390, term3390.getClass(), "stop", term3429);
        setField(term3390, term3390.getClass(), "createTime", term3431);
        setField(term3390, term3390.getClass(), "updateTime", term3433);
        setField(term3390, term3390.getClass(), "finishTime", term3435);
        term3437 = new Integer(-2095575670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3437;
        callMethod(klass, "setDanmuSenderTaskId", argTypes, term3390, args);
    }

};



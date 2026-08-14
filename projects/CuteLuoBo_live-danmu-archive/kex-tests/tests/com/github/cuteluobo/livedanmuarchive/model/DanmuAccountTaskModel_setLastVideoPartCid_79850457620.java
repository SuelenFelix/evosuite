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

public class DanmuAccountTaskModel_setLastVideoPartCid_79850457620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4518;
     Object term4565;

    public DanmuAccountTaskModel_setLastVideoPartCid_79850457620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4519 = new Integer(480137250);
        Integer term4521 = new Integer(-341152642);
        Integer term4547 = new Integer(-2015854073);
        Long term4549 = new Long(-7698746988132548371L);
        Integer term4551 = new Integer(0);
        Integer term4553 = new Integer(0);
        Integer term4555 = new Integer(538259104);
        Boolean term4557 = new Boolean(false);
        Long term4559 = new Long(2145420811068634601L);
        Long term4561 = new Long(2191130532479601175L);
        Long term4563 = new Long(860079646007397083L);
        term4518 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term4518, term4518.getClass(), "id", term4519);
        setField(term4518, term4518.getClass(), "danmuSenderTaskId", term4521);
        setField(term4518, term4518.getClass(), "senderUid", "HzqpegHiRq");
        setField(term4518, term4518.getClass(), "videoId", "jwsfVjMoJT");
        setField(term4518, term4518.getClass(), "lastVideoPartIndex", term4547);
        setField(term4518, term4518.getClass(), "lastVideoPartCid", term4549);
        setField(term4518, term4518.getClass(), "pageIndex", term4551);
        setField(term4518, term4518.getClass(), "pageSize", term4553);
        setField(term4518, term4518.getClass(), "lastDanmuIndex", term4555);
        setField(term4518, term4518.getClass(), "stop", term4557);
        setField(term4518, term4518.getClass(), "createTime", term4559);
        setField(term4518, term4518.getClass(), "updateTime", term4561);
        setField(term4518, term4518.getClass(), "finishTime", term4563);
        term4565 = new Long(3230472384687362867L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4565;
        callMethod(klass, "setLastVideoPartCid", argTypes, term4518, args);
    }

};



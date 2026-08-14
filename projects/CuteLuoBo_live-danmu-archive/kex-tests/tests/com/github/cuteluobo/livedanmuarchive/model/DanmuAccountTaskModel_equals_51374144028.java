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

public class DanmuAccountTaskModel_equals_51374144028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5062;
     Object term5109;

    public DanmuAccountTaskModel_equals_51374144028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5063 = new Integer(1283079251);
        Integer term5065 = new Integer(-523949691);
        Integer term5091 = new Integer(1398204340);
        Long term5093 = new Long(5806367330808555223L);
        Integer term5095 = new Integer(0);
        Integer term5097 = new Integer(0);
        Integer term5099 = new Integer(229204365);
        Boolean term5101 = new Boolean(false);
        Long term5103 = new Long(4576699120365923235L);
        Long term5105 = new Long(-1635471392209071620L);
        Long term5107 = new Long(-4714000263923324167L);
        term5062 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term5062, term5062.getClass(), "id", term5063);
        setField(term5062, term5062.getClass(), "danmuSenderTaskId", term5065);
        setField(term5062, term5062.getClass(), "senderUid", "PapWxkhEWe");
        setField(term5062, term5062.getClass(), "videoId", "smnHEqRFRx");
        setField(term5062, term5062.getClass(), "lastVideoPartIndex", term5091);
        setField(term5062, term5062.getClass(), "lastVideoPartCid", term5093);
        setField(term5062, term5062.getClass(), "pageIndex", term5095);
        setField(term5062, term5062.getClass(), "pageSize", term5097);
        setField(term5062, term5062.getClass(), "lastDanmuIndex", term5099);
        setField(term5062, term5062.getClass(), "stop", term5101);
        setField(term5062, term5062.getClass(), "createTime", term5103);
        setField(term5062, term5062.getClass(), "updateTime", term5105);
        setField(term5062, term5062.getClass(), "finishTime", term5107);
        term5109 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5109;
        callMethod(klass, "equals", argTypes, term5062, args);
    }

};



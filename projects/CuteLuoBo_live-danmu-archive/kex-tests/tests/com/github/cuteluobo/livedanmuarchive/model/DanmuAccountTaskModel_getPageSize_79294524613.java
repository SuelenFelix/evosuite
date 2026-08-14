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

public class DanmuAccountTaskModel_getPageSize_79294524613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4043;

    public DanmuAccountTaskModel_getPageSize_79294524613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4044 = new Integer(-894662986);
        Integer term4046 = new Integer(304775596);
        Integer term4072 = new Integer(-1347665717);
        Long term4074 = new Long(-8010214112439224349L);
        Integer term4076 = new Integer(0);
        Integer term4078 = new Integer(0);
        Integer term4080 = new Integer(-1888585309);
        Boolean term4082 = new Boolean(false);
        Long term4084 = new Long(-6673920710396545553L);
        Long term4086 = new Long(3412644969878030772L);
        Long term4088 = new Long(6698455537431331246L);
        term4043 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term4043, term4043.getClass(), "id", term4044);
        setField(term4043, term4043.getClass(), "danmuSenderTaskId", term4046);
        setField(term4043, term4043.getClass(), "senderUid", "fWKJoSoCwE");
        setField(term4043, term4043.getClass(), "videoId", "wfaXBpWAUH");
        setField(term4043, term4043.getClass(), "lastVideoPartIndex", term4072);
        setField(term4043, term4043.getClass(), "lastVideoPartCid", term4074);
        setField(term4043, term4043.getClass(), "pageIndex", term4076);
        setField(term4043, term4043.getClass(), "pageSize", term4078);
        setField(term4043, term4043.getClass(), "lastDanmuIndex", term4080);
        setField(term4043, term4043.getClass(), "stop", term4082);
        setField(term4043, term4043.getClass(), "createTime", term4084);
        setField(term4043, term4043.getClass(), "updateTime", term4086);
        setField(term4043, term4043.getClass(), "finishTime", term4088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPageSize", argTypes, term4043, args);
    }

};



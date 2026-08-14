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

public class DanmuAccountTaskModel_getStop_143315555047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5213;

    public DanmuAccountTaskModel_getStop_143315555047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5213 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term5213, term5213.getClass(), "id", null);
        setField(term5213, term5213.getClass(), "danmuSenderTaskId", null);
        setField(term5213, term5213.getClass(), "senderUid", null);
        setField(term5213, term5213.getClass(), "videoId", null);
        setField(term5213, term5213.getClass(), "lastVideoPartIndex", null);
        setField(term5213, term5213.getClass(), "lastVideoPartCid", null);
        setField(term5213, term5213.getClass(), "pageIndex", null);
        setField(term5213, term5213.getClass(), "pageSize", null);
        setField(term5213, term5213.getClass(), "lastDanmuIndex", null);
        setField(term5213, term5213.getClass(), "stop", null);
        setField(term5213, term5213.getClass(), "createTime", null);
        setField(term5213, term5213.getClass(), "updateTime", null);
        setField(term5213, term5213.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStop", argTypes, term5213, args);
    }

};



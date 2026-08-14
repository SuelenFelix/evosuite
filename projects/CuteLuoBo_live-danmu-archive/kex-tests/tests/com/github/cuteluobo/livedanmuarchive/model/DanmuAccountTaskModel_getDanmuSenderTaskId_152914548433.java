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

public class DanmuAccountTaskModel_getDanmuSenderTaskId_152914548433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5199;

    public DanmuAccountTaskModel_getDanmuSenderTaskId_152914548433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5199 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term5199, term5199.getClass(), "id", null);
        setField(term5199, term5199.getClass(), "danmuSenderTaskId", null);
        setField(term5199, term5199.getClass(), "senderUid", null);
        setField(term5199, term5199.getClass(), "videoId", null);
        setField(term5199, term5199.getClass(), "lastVideoPartIndex", null);
        setField(term5199, term5199.getClass(), "lastVideoPartCid", null);
        setField(term5199, term5199.getClass(), "pageIndex", null);
        setField(term5199, term5199.getClass(), "pageSize", null);
        setField(term5199, term5199.getClass(), "lastDanmuIndex", null);
        setField(term5199, term5199.getClass(), "stop", null);
        setField(term5199, term5199.getClass(), "createTime", null);
        setField(term5199, term5199.getClass(), "updateTime", null);
        setField(term5199, term5199.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDanmuSenderTaskId", argTypes, term5199, args);
    }

};



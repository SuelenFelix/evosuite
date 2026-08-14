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

public class DanmuSenderTaskModel_setPageSize_142763469248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2780;

    public DanmuSenderTaskModel_setPageSize_142763469248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2780 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term2780, term2780.getClass(), "id", null);
        setField(term2780, term2780.getClass(), "platform", null);
        setField(term2780, term2780.getClass(), "videoCreatorUid", null);
        setField(term2780, term2780.getClass(), "videoId", null);
        setField(term2780, term2780.getClass(), "videoCreatedTime", null);
        setField(term2780, term2780.getClass(), "danmuTotalNum", null);
        setField(term2780, term2780.getClass(), "danmuSentNum", null);
        setField(term2780, term2780.getClass(), "pageSize", null);
        setField(term2780, term2780.getClass(), "skip", null);
        setField(term2780, term2780.getClass(), "taskFail", null);
        setField(term2780, term2780.getClass(), "createTime", null);
        setField(term2780, term2780.getClass(), "updateTime", null);
        setField(term2780, term2780.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPageSize", argTypes, term2780, args);
    }

};



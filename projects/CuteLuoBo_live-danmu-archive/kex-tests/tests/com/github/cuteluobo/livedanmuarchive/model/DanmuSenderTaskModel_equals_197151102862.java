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

public class DanmuSenderTaskModel_equals_197151102862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2794;

    public DanmuSenderTaskModel_equals_197151102862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2794 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term2794, term2794.getClass(), "id", null);
        setField(term2794, term2794.getClass(), "platform", null);
        setField(term2794, term2794.getClass(), "videoCreatorUid", null);
        setField(term2794, term2794.getClass(), "videoId", null);
        setField(term2794, term2794.getClass(), "videoCreatedTime", null);
        setField(term2794, term2794.getClass(), "danmuTotalNum", null);
        setField(term2794, term2794.getClass(), "danmuSentNum", null);
        setField(term2794, term2794.getClass(), "pageSize", null);
        setField(term2794, term2794.getClass(), "skip", null);
        setField(term2794, term2794.getClass(), "taskFail", null);
        setField(term2794, term2794.getClass(), "createTime", null);
        setField(term2794, term2794.getClass(), "updateTime", null);
        setField(term2794, term2794.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term2794, args);
    }

};



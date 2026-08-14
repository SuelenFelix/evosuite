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

public class DanmuSenderTaskModel_getDanmuSentNum_79926403145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2777;

    public DanmuSenderTaskModel_getDanmuSentNum_79926403145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2777 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term2777, term2777.getClass(), "id", null);
        setField(term2777, term2777.getClass(), "platform", null);
        setField(term2777, term2777.getClass(), "videoCreatorUid", null);
        setField(term2777, term2777.getClass(), "videoId", null);
        setField(term2777, term2777.getClass(), "videoCreatedTime", null);
        setField(term2777, term2777.getClass(), "danmuTotalNum", null);
        setField(term2777, term2777.getClass(), "danmuSentNum", null);
        setField(term2777, term2777.getClass(), "pageSize", null);
        setField(term2777, term2777.getClass(), "skip", null);
        setField(term2777, term2777.getClass(), "taskFail", null);
        setField(term2777, term2777.getClass(), "createTime", null);
        setField(term2777, term2777.getClass(), "updateTime", null);
        setField(term2777, term2777.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDanmuSentNum", argTypes, term2777, args);
    }

};



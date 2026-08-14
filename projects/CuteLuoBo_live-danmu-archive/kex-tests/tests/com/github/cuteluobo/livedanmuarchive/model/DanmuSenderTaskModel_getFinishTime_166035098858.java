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

public class DanmuSenderTaskModel_getFinishTime_166035098858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2790;

    public DanmuSenderTaskModel_getFinishTime_166035098858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2790 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term2790, term2790.getClass(), "id", null);
        setField(term2790, term2790.getClass(), "platform", null);
        setField(term2790, term2790.getClass(), "videoCreatorUid", null);
        setField(term2790, term2790.getClass(), "videoId", null);
        setField(term2790, term2790.getClass(), "videoCreatedTime", null);
        setField(term2790, term2790.getClass(), "danmuTotalNum", null);
        setField(term2790, term2790.getClass(), "danmuSentNum", null);
        setField(term2790, term2790.getClass(), "pageSize", null);
        setField(term2790, term2790.getClass(), "skip", null);
        setField(term2790, term2790.getClass(), "taskFail", null);
        setField(term2790, term2790.getClass(), "createTime", null);
        setField(term2790, term2790.getClass(), "updateTime", null);
        setField(term2790, term2790.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFinishTime", argTypes, term2790, args);
    }

};



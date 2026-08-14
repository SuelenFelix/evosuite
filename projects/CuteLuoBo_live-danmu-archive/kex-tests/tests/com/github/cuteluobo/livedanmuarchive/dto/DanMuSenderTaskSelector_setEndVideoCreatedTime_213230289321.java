package com.github.cuteluobo.livedanmuarchive.dto;

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
import static com.github.cuteluobo.livedanmuarchive.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DanMuSenderTaskSelector_setEndVideoCreatedTime_213230289321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1668;

    public DanMuSenderTaskSelector_setEndVideoCreatedTime_213230289321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1668 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term1668, term1668.getClass(), "startCreateTime", null);
        setField(term1668, term1668.getClass(), "endCreateTime", null);
        setField(term1668, term1668.getClass(), "startUpdateTime", null);
        setField(term1668, term1668.getClass(), "endUpdateTime", null);
        setField(term1668, term1668.getClass(), "startFinishTime", null);
        setField(term1668, term1668.getClass(), "endFinishTime", null);
        setField(term1668, term1668.getClass(), "startVideoCreatedTime", null);
        setField(term1668, term1668.getClass(), "endVideoCreatedTime", null);
        setField(term1668, term1668.getClass(), "id", null);
        setField(term1668, term1668.getClass(), "platform", null);
        setField(term1668, term1668.getClass(), "videoCreatorUid", null);
        setField(term1668, term1668.getClass(), "videoId", null);
        setField(term1668, term1668.getClass(), "videoCreatedTime", null);
        setField(term1668, term1668.getClass(), "danmuTotalNum", null);
        setField(term1668, term1668.getClass(), "danmuSentNum", null);
        setField(term1668, term1668.getClass(), "pageSize", null);
        setField(term1668, term1668.getClass(), "skip", null);
        setField(term1668, term1668.getClass(), "taskFail", null);
        setField(term1668, term1668.getClass(), "createTime", null);
        setField(term1668, term1668.getClass(), "updateTime", null);
        setField(term1668, term1668.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEndVideoCreatedTime", argTypes, term1668, args);
    }

};



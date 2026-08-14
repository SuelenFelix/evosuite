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

public class DanMuSenderTaskSelector_setEndUpdateTime_95431179125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1672;

    public DanMuSenderTaskSelector_setEndUpdateTime_95431179125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1672 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term1672, term1672.getClass(), "startCreateTime", null);
        setField(term1672, term1672.getClass(), "endCreateTime", null);
        setField(term1672, term1672.getClass(), "startUpdateTime", null);
        setField(term1672, term1672.getClass(), "endUpdateTime", null);
        setField(term1672, term1672.getClass(), "startFinishTime", null);
        setField(term1672, term1672.getClass(), "endFinishTime", null);
        setField(term1672, term1672.getClass(), "startVideoCreatedTime", null);
        setField(term1672, term1672.getClass(), "endVideoCreatedTime", null);
        setField(term1672, term1672.getClass(), "id", null);
        setField(term1672, term1672.getClass(), "platform", null);
        setField(term1672, term1672.getClass(), "videoCreatorUid", null);
        setField(term1672, term1672.getClass(), "videoId", null);
        setField(term1672, term1672.getClass(), "videoCreatedTime", null);
        setField(term1672, term1672.getClass(), "danmuTotalNum", null);
        setField(term1672, term1672.getClass(), "danmuSentNum", null);
        setField(term1672, term1672.getClass(), "pageSize", null);
        setField(term1672, term1672.getClass(), "skip", null);
        setField(term1672, term1672.getClass(), "taskFail", null);
        setField(term1672, term1672.getClass(), "createTime", null);
        setField(term1672, term1672.getClass(), "updateTime", null);
        setField(term1672, term1672.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEndUpdateTime", argTypes, term1672, args);
    }

};



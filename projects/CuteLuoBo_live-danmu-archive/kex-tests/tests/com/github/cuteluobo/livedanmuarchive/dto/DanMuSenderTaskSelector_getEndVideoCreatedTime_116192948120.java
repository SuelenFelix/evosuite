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

public class DanMuSenderTaskSelector_getEndVideoCreatedTime_116192948120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1667;

    public DanMuSenderTaskSelector_getEndVideoCreatedTime_116192948120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1667 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term1667, term1667.getClass(), "startCreateTime", null);
        setField(term1667, term1667.getClass(), "endCreateTime", null);
        setField(term1667, term1667.getClass(), "startUpdateTime", null);
        setField(term1667, term1667.getClass(), "endUpdateTime", null);
        setField(term1667, term1667.getClass(), "startFinishTime", null);
        setField(term1667, term1667.getClass(), "endFinishTime", null);
        setField(term1667, term1667.getClass(), "startVideoCreatedTime", null);
        setField(term1667, term1667.getClass(), "endVideoCreatedTime", null);
        setField(term1667, term1667.getClass(), "id", null);
        setField(term1667, term1667.getClass(), "platform", null);
        setField(term1667, term1667.getClass(), "videoCreatorUid", null);
        setField(term1667, term1667.getClass(), "videoId", null);
        setField(term1667, term1667.getClass(), "videoCreatedTime", null);
        setField(term1667, term1667.getClass(), "danmuTotalNum", null);
        setField(term1667, term1667.getClass(), "danmuSentNum", null);
        setField(term1667, term1667.getClass(), "pageSize", null);
        setField(term1667, term1667.getClass(), "skip", null);
        setField(term1667, term1667.getClass(), "taskFail", null);
        setField(term1667, term1667.getClass(), "createTime", null);
        setField(term1667, term1667.getClass(), "updateTime", null);
        setField(term1667, term1667.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndVideoCreatedTime", argTypes, term1667, args);
    }

};



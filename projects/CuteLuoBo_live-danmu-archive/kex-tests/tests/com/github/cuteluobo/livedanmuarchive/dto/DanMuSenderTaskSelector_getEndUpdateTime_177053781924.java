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

public class DanMuSenderTaskSelector_getEndUpdateTime_177053781924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1671;

    public DanMuSenderTaskSelector_getEndUpdateTime_177053781924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1671 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term1671, term1671.getClass(), "startCreateTime", null);
        setField(term1671, term1671.getClass(), "endCreateTime", null);
        setField(term1671, term1671.getClass(), "startUpdateTime", null);
        setField(term1671, term1671.getClass(), "endUpdateTime", null);
        setField(term1671, term1671.getClass(), "startFinishTime", null);
        setField(term1671, term1671.getClass(), "endFinishTime", null);
        setField(term1671, term1671.getClass(), "startVideoCreatedTime", null);
        setField(term1671, term1671.getClass(), "endVideoCreatedTime", null);
        setField(term1671, term1671.getClass(), "id", null);
        setField(term1671, term1671.getClass(), "platform", null);
        setField(term1671, term1671.getClass(), "videoCreatorUid", null);
        setField(term1671, term1671.getClass(), "videoId", null);
        setField(term1671, term1671.getClass(), "videoCreatedTime", null);
        setField(term1671, term1671.getClass(), "danmuTotalNum", null);
        setField(term1671, term1671.getClass(), "danmuSentNum", null);
        setField(term1671, term1671.getClass(), "pageSize", null);
        setField(term1671, term1671.getClass(), "skip", null);
        setField(term1671, term1671.getClass(), "taskFail", null);
        setField(term1671, term1671.getClass(), "createTime", null);
        setField(term1671, term1671.getClass(), "updateTime", null);
        setField(term1671, term1671.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndUpdateTime", argTypes, term1671, args);
    }

};



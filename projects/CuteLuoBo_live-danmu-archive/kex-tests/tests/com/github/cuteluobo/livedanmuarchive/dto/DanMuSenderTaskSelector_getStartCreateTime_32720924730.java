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

public class DanMuSenderTaskSelector_getStartCreateTime_32720924730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1677;

    public DanMuSenderTaskSelector_getStartCreateTime_32720924730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1677 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term1677, term1677.getClass(), "startCreateTime", null);
        setField(term1677, term1677.getClass(), "endCreateTime", null);
        setField(term1677, term1677.getClass(), "startUpdateTime", null);
        setField(term1677, term1677.getClass(), "endUpdateTime", null);
        setField(term1677, term1677.getClass(), "startFinishTime", null);
        setField(term1677, term1677.getClass(), "endFinishTime", null);
        setField(term1677, term1677.getClass(), "startVideoCreatedTime", null);
        setField(term1677, term1677.getClass(), "endVideoCreatedTime", null);
        setField(term1677, term1677.getClass(), "id", null);
        setField(term1677, term1677.getClass(), "platform", null);
        setField(term1677, term1677.getClass(), "videoCreatorUid", null);
        setField(term1677, term1677.getClass(), "videoId", null);
        setField(term1677, term1677.getClass(), "videoCreatedTime", null);
        setField(term1677, term1677.getClass(), "danmuTotalNum", null);
        setField(term1677, term1677.getClass(), "danmuSentNum", null);
        setField(term1677, term1677.getClass(), "pageSize", null);
        setField(term1677, term1677.getClass(), "skip", null);
        setField(term1677, term1677.getClass(), "taskFail", null);
        setField(term1677, term1677.getClass(), "createTime", null);
        setField(term1677, term1677.getClass(), "updateTime", null);
        setField(term1677, term1677.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartCreateTime", argTypes, term1677, args);
    }

};



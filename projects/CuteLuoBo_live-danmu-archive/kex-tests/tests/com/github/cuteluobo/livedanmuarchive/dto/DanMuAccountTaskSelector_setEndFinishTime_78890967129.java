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

public class DanMuAccountTaskSelector_setEndFinishTime_78890967129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3036;

    public DanMuAccountTaskSelector_setEndFinishTime_78890967129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3036 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term3036, term3036.getClass(), "startCreateTime", null);
        setField(term3036, term3036.getClass(), "endCreateTime", null);
        setField(term3036, term3036.getClass(), "startUpdateTime", null);
        setField(term3036, term3036.getClass(), "endUpdateTime", null);
        setField(term3036, term3036.getClass(), "startFinishTime", null);
        setField(term3036, term3036.getClass(), "endFinishTime", null);
        setField(term3036, term3036.getClass(), "pageIndex", null);
        setField(term3036, term3036.getClass(), "pageSize", null);
        setField(term3036, term3036.getClass(), "id", null);
        setField(term3036, term3036.getClass(), "danmuSenderTaskId", null);
        setField(term3036, term3036.getClass(), "senderUid", null);
        setField(term3036, term3036.getClass(), "videoId", null);
        setField(term3036, term3036.getClass(), "lastVideoPartIndex", null);
        setField(term3036, term3036.getClass(), "lastVideoPartCid", null);
        setField(term3036, term3036.getClass(), "lastDanmuIndex", null);
        setField(term3036, term3036.getClass(), "stop", null);
        setField(term3036, term3036.getClass(), "createTime", null);
        setField(term3036, term3036.getClass(), "updateTime", null);
        setField(term3036, term3036.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEndFinishTime", argTypes, term3036, args);
    }

};



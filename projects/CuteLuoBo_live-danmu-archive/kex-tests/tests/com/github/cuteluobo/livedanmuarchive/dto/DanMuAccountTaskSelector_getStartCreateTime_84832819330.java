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

public class DanMuAccountTaskSelector_getStartCreateTime_84832819330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3037;

    public DanMuAccountTaskSelector_getStartCreateTime_84832819330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3037 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term3037, term3037.getClass(), "startCreateTime", null);
        setField(term3037, term3037.getClass(), "endCreateTime", null);
        setField(term3037, term3037.getClass(), "startUpdateTime", null);
        setField(term3037, term3037.getClass(), "endUpdateTime", null);
        setField(term3037, term3037.getClass(), "startFinishTime", null);
        setField(term3037, term3037.getClass(), "endFinishTime", null);
        setField(term3037, term3037.getClass(), "pageIndex", null);
        setField(term3037, term3037.getClass(), "pageSize", null);
        setField(term3037, term3037.getClass(), "id", null);
        setField(term3037, term3037.getClass(), "danmuSenderTaskId", null);
        setField(term3037, term3037.getClass(), "senderUid", null);
        setField(term3037, term3037.getClass(), "videoId", null);
        setField(term3037, term3037.getClass(), "lastVideoPartIndex", null);
        setField(term3037, term3037.getClass(), "lastVideoPartCid", null);
        setField(term3037, term3037.getClass(), "lastDanmuIndex", null);
        setField(term3037, term3037.getClass(), "stop", null);
        setField(term3037, term3037.getClass(), "createTime", null);
        setField(term3037, term3037.getClass(), "updateTime", null);
        setField(term3037, term3037.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartCreateTime", argTypes, term3037, args);
    }

};



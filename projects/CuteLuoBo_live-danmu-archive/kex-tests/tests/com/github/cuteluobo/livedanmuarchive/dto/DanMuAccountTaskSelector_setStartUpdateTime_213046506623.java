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

public class DanMuAccountTaskSelector_setStartUpdateTime_213046506623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3030;

    public DanMuAccountTaskSelector_setStartUpdateTime_213046506623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3030 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term3030, term3030.getClass(), "startCreateTime", null);
        setField(term3030, term3030.getClass(), "endCreateTime", null);
        setField(term3030, term3030.getClass(), "startUpdateTime", null);
        setField(term3030, term3030.getClass(), "endUpdateTime", null);
        setField(term3030, term3030.getClass(), "startFinishTime", null);
        setField(term3030, term3030.getClass(), "endFinishTime", null);
        setField(term3030, term3030.getClass(), "pageIndex", null);
        setField(term3030, term3030.getClass(), "pageSize", null);
        setField(term3030, term3030.getClass(), "id", null);
        setField(term3030, term3030.getClass(), "danmuSenderTaskId", null);
        setField(term3030, term3030.getClass(), "senderUid", null);
        setField(term3030, term3030.getClass(), "videoId", null);
        setField(term3030, term3030.getClass(), "lastVideoPartIndex", null);
        setField(term3030, term3030.getClass(), "lastVideoPartCid", null);
        setField(term3030, term3030.getClass(), "lastDanmuIndex", null);
        setField(term3030, term3030.getClass(), "stop", null);
        setField(term3030, term3030.getClass(), "createTime", null);
        setField(term3030, term3030.getClass(), "updateTime", null);
        setField(term3030, term3030.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStartUpdateTime", argTypes, term3030, args);
    }

};



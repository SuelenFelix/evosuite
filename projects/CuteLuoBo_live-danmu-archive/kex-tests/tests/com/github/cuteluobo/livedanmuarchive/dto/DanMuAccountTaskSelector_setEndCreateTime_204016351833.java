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

public class DanMuAccountTaskSelector_setEndCreateTime_204016351833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3040;

    public DanMuAccountTaskSelector_setEndCreateTime_204016351833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3040 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term3040, term3040.getClass(), "startCreateTime", null);
        setField(term3040, term3040.getClass(), "endCreateTime", null);
        setField(term3040, term3040.getClass(), "startUpdateTime", null);
        setField(term3040, term3040.getClass(), "endUpdateTime", null);
        setField(term3040, term3040.getClass(), "startFinishTime", null);
        setField(term3040, term3040.getClass(), "endFinishTime", null);
        setField(term3040, term3040.getClass(), "pageIndex", null);
        setField(term3040, term3040.getClass(), "pageSize", null);
        setField(term3040, term3040.getClass(), "id", null);
        setField(term3040, term3040.getClass(), "danmuSenderTaskId", null);
        setField(term3040, term3040.getClass(), "senderUid", null);
        setField(term3040, term3040.getClass(), "videoId", null);
        setField(term3040, term3040.getClass(), "lastVideoPartIndex", null);
        setField(term3040, term3040.getClass(), "lastVideoPartCid", null);
        setField(term3040, term3040.getClass(), "lastDanmuIndex", null);
        setField(term3040, term3040.getClass(), "stop", null);
        setField(term3040, term3040.getClass(), "createTime", null);
        setField(term3040, term3040.getClass(), "updateTime", null);
        setField(term3040, term3040.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEndCreateTime", argTypes, term3040, args);
    }

};



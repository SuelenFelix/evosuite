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

public class DanMuAccountTaskSelector_setPageIndex_49380192719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3026;

    public DanMuAccountTaskSelector_setPageIndex_49380192719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3026 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term3026, term3026.getClass(), "startCreateTime", null);
        setField(term3026, term3026.getClass(), "endCreateTime", null);
        setField(term3026, term3026.getClass(), "startUpdateTime", null);
        setField(term3026, term3026.getClass(), "endUpdateTime", null);
        setField(term3026, term3026.getClass(), "startFinishTime", null);
        setField(term3026, term3026.getClass(), "endFinishTime", null);
        setField(term3026, term3026.getClass(), "pageIndex", null);
        setField(term3026, term3026.getClass(), "pageSize", null);
        setField(term3026, term3026.getClass(), "id", null);
        setField(term3026, term3026.getClass(), "danmuSenderTaskId", null);
        setField(term3026, term3026.getClass(), "senderUid", null);
        setField(term3026, term3026.getClass(), "videoId", null);
        setField(term3026, term3026.getClass(), "lastVideoPartIndex", null);
        setField(term3026, term3026.getClass(), "lastVideoPartCid", null);
        setField(term3026, term3026.getClass(), "lastDanmuIndex", null);
        setField(term3026, term3026.getClass(), "stop", null);
        setField(term3026, term3026.getClass(), "createTime", null);
        setField(term3026, term3026.getClass(), "updateTime", null);
        setField(term3026, term3026.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPageIndex", argTypes, term3026, args);
    }

};



package com.github.cuteluobo.livedanmuarchive.model;

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
import static com.github.cuteluobo.livedanmuarchive.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DanmuSenderTaskModel_setSkip_169085847350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2782;

    public DanmuSenderTaskModel_setSkip_169085847350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2782 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term2782, term2782.getClass(), "id", null);
        setField(term2782, term2782.getClass(), "platform", null);
        setField(term2782, term2782.getClass(), "videoCreatorUid", null);
        setField(term2782, term2782.getClass(), "videoId", null);
        setField(term2782, term2782.getClass(), "videoCreatedTime", null);
        setField(term2782, term2782.getClass(), "danmuTotalNum", null);
        setField(term2782, term2782.getClass(), "danmuSentNum", null);
        setField(term2782, term2782.getClass(), "pageSize", null);
        setField(term2782, term2782.getClass(), "skip", null);
        setField(term2782, term2782.getClass(), "taskFail", null);
        setField(term2782, term2782.getClass(), "createTime", null);
        setField(term2782, term2782.getClass(), "updateTime", null);
        setField(term2782, term2782.getClass(), "finishTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSkip", argTypes, term2782, args);
    }

};



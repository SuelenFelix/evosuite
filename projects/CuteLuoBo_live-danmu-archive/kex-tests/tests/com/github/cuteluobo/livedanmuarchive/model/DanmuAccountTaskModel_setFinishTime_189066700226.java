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
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;

public class DanmuAccountTaskModel_setFinishTime_189066700226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4926;
     Object term4973;

    public DanmuAccountTaskModel_setFinishTime_189066700226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4927 = new Integer(-1388471422);
        Integer term4929 = new Integer(-1498296052);
        Integer term4955 = new Integer(2098647989);
        Long term4957 = new Long(868503089567085985L);
        Integer term4959 = new Integer(0);
        Integer term4961 = new Integer(0);
        Integer term4963 = new Integer(1598895173);
        Boolean term4965 = new Boolean(false);
        Long term4967 = new Long(-3277773415369003529L);
        Long term4969 = new Long(1253549421411622358L);
        Long term4971 = new Long(3666226122807672448L);
        term4926 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel"));
        setField(term4926, term4926.getClass(), "id", term4927);
        setField(term4926, term4926.getClass(), "danmuSenderTaskId", term4929);
        setField(term4926, term4926.getClass(), "senderUid", "aWYOWZFyaX");
        setField(term4926, term4926.getClass(), "videoId", "BRIVNtfUWU");
        setField(term4926, term4926.getClass(), "lastVideoPartIndex", term4955);
        setField(term4926, term4926.getClass(), "lastVideoPartCid", term4957);
        setField(term4926, term4926.getClass(), "pageIndex", term4959);
        setField(term4926, term4926.getClass(), "pageSize", term4961);
        setField(term4926, term4926.getClass(), "lastDanmuIndex", term4963);
        setField(term4926, term4926.getClass(), "stop", term4965);
        setField(term4926, term4926.getClass(), "createTime", term4967);
        setField(term4926, term4926.getClass(), "updateTime", term4969);
        setField(term4926, term4926.getClass(), "finishTime", term4971);
        term4973 = new Long(3108750145697087661L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuAccountTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4973;
        callMethod(klass, "setFinishTime", argTypes, term4926, args);
    }

};



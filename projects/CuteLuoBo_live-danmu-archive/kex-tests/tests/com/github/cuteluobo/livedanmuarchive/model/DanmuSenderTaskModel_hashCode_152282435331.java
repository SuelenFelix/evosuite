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

public class DanmuSenderTaskModel_hashCode_152282435331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2679;

    public DanmuSenderTaskModel_hashCode_152282435331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2680 = new Integer(-1179120542);
        Long term2718 = new Long(1084801489398441516L);
        Long term2720 = new Long(0L);
        Long term2722 = new Long(0L);
        Integer term2724 = new Integer(0);
        Boolean term2726 = new Boolean(false);
        Boolean term2728 = new Boolean(false);
        Long term2730 = new Long(6273754186658578034L);
        Long term2732 = new Long(3620247240684476031L);
        Long term2734 = new Long(8313800941204938919L);
        term2679 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term2679, term2679.getClass(), "id", term2680);
        setField(term2679, term2679.getClass(), "platform", "JqXGgAhZPl");
        setField(term2679, term2679.getClass(), "videoCreatorUid", "jiKYgYHqIS");
        setField(term2679, term2679.getClass(), "videoId", "DfISiziTgG");
        setField(term2679, term2679.getClass(), "videoCreatedTime", term2718);
        setField(term2679, term2679.getClass(), "danmuTotalNum", term2720);
        setField(term2679, term2679.getClass(), "danmuSentNum", term2722);
        setField(term2679, term2679.getClass(), "pageSize", term2724);
        setField(term2679, term2679.getClass(), "skip", term2726);
        setField(term2679, term2679.getClass(), "taskFail", term2728);
        setField(term2679, term2679.getClass(), "createTime", term2730);
        setField(term2679, term2679.getClass(), "updateTime", term2732);
        setField(term2679, term2679.getClass(), "finishTime", term2734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2679, args);
    }

};



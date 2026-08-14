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

public class DanmuSenderTaskModel_setTaskFail_212852257920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1711;
     Object term1768;

    public DanmuSenderTaskModel_setTaskFail_212852257920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1712 = new Integer(-655067527);
        Long term1750 = new Long(-7291743527973326814L);
        Long term1752 = new Long(0L);
        Long term1754 = new Long(0L);
        Integer term1756 = new Integer(0);
        Boolean term1758 = new Boolean(false);
        Boolean term1760 = new Boolean(false);
        Long term1762 = new Long(-5963439350418910964L);
        Long term1764 = new Long(9013624480170062917L);
        Long term1766 = new Long(7862575738391801707L);
        term1711 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term1711, term1711.getClass(), "id", term1712);
        setField(term1711, term1711.getClass(), "platform", "ieCtQFdkii");
        setField(term1711, term1711.getClass(), "videoCreatorUid", "dEnhdmILtU");
        setField(term1711, term1711.getClass(), "videoId", "hoicvmsovO");
        setField(term1711, term1711.getClass(), "videoCreatedTime", term1750);
        setField(term1711, term1711.getClass(), "danmuTotalNum", term1752);
        setField(term1711, term1711.getClass(), "danmuSentNum", term1754);
        setField(term1711, term1711.getClass(), "pageSize", term1756);
        setField(term1711, term1711.getClass(), "skip", term1758);
        setField(term1711, term1711.getClass(), "taskFail", term1760);
        setField(term1711, term1711.getClass(), "createTime", term1762);
        setField(term1711, term1711.getClass(), "updateTime", term1764);
        setField(term1711, term1711.getClass(), "finishTime", term1766);
        term1768 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term1768;
        callMethod(klass, "setTaskFail", argTypes, term1711, args);
    }

};



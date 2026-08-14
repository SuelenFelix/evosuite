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

public class DanmuSenderTaskModel_getVideoCreatorUid_5937083087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term528;

    public DanmuSenderTaskModel_getVideoCreatorUid_5937083087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term529 = new Integer(-1955890973);
        Long term567 = new Long(-2585684163342970173L);
        Long term569 = new Long(0L);
        Long term571 = new Long(0L);
        Integer term573 = new Integer(0);
        Boolean term575 = new Boolean(false);
        Boolean term577 = new Boolean(false);
        Long term579 = new Long(8059786003080744426L);
        Long term581 = new Long(-4365849114644724155L);
        Long term583 = new Long(2486810210675247493L);
        term528 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel"));
        setField(term528, term528.getClass(), "id", term529);
        setField(term528, term528.getClass(), "platform", "pCTimMblYc");
        setField(term528, term528.getClass(), "videoCreatorUid", "hNxWaHcfhY");
        setField(term528, term528.getClass(), "videoId", "RkybSrpybU");
        setField(term528, term528.getClass(), "videoCreatedTime", term567);
        setField(term528, term528.getClass(), "danmuTotalNum", term569);
        setField(term528, term528.getClass(), "danmuSentNum", term571);
        setField(term528, term528.getClass(), "pageSize", term573);
        setField(term528, term528.getClass(), "skip", term575);
        setField(term528, term528.getClass(), "taskFail", term577);
        setField(term528, term528.getClass(), "createTime", term579);
        setField(term528, term528.getClass(), "updateTime", term581);
        setField(term528, term528.getClass(), "finishTime", term583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanmuSenderTaskModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVideoCreatorUid", argTypes, term528, args);
    }

};



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

public class DanMuTaskPlanModel_setSlicedTime_28525459112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7125;
     Object term7180;

    public DanMuTaskPlanModel_setSlicedTime_28525459112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7126 = new Integer(479531250);
        Long term7164 = new Long(-3225860270104198596L);
        Long term7166 = new Long(-1164342036939643746L);
        Integer term7168 = new Integer(1320570890);
        Boolean term7170 = new Boolean(false);
        Boolean term7172 = new Boolean(false);
        Long term7174 = new Long(-7013378340043571457L);
        Long term7176 = new Long(-3279534582096707294L);
        Long term7178 = new Long(-6490254947459640565L);
        term7125 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term7125, term7125.getClass(), "id", term7126);
        setField(term7125, term7125.getClass(), "platform", "ShIELyuULw");
        setField(term7125, term7125.getClass(), "videoCreatorUid", "IpQuOGMgmj");
        setField(term7125, term7125.getClass(), "videoId", "pJbnHTYrxn");
        setField(term7125, term7125.getClass(), "videoCreatedTime", term7164);
        setField(term7125, term7125.getClass(), "slicedTime", term7166);
        setField(term7125, term7125.getClass(), "pageCurrent", term7168);
        setField(term7125, term7125.getClass(), "skip", term7170);
        setField(term7125, term7125.getClass(), "taskFail", term7172);
        setField(term7125, term7125.getClass(), "createTime", term7174);
        setField(term7125, term7125.getClass(), "updateTime", term7176);
        setField(term7125, term7125.getClass(), "finishTime", term7178);
        term7180 = new Long(-7001094993638840490L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term7180;
        callMethod(klass, "setSlicedTime", argTypes, term7125, args);
    }

};



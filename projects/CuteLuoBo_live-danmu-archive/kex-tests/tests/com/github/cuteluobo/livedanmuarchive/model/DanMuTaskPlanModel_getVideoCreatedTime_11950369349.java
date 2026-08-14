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

public class DanMuTaskPlanModel_getVideoCreatedTime_11950369349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6868;

    public DanMuTaskPlanModel_getVideoCreatedTime_11950369349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6869 = new Integer(1045547089);
        Long term6907 = new Long(-136372844051852955L);
        Long term6909 = new Long(-7632759764262745126L);
        Integer term6911 = new Integer(-1122880881);
        Boolean term6913 = new Boolean(false);
        Boolean term6915 = new Boolean(false);
        Long term6917 = new Long(3746481521207337771L);
        Long term6919 = new Long(4341016500855678917L);
        Long term6921 = new Long(-5871746020807491998L);
        term6868 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term6868, term6868.getClass(), "id", term6869);
        setField(term6868, term6868.getClass(), "platform", "gUvcueTURF");
        setField(term6868, term6868.getClass(), "videoCreatorUid", "EwQBhZjCIT");
        setField(term6868, term6868.getClass(), "videoId", "aSkmSwTnEw");
        setField(term6868, term6868.getClass(), "videoCreatedTime", term6907);
        setField(term6868, term6868.getClass(), "slicedTime", term6909);
        setField(term6868, term6868.getClass(), "pageCurrent", term6911);
        setField(term6868, term6868.getClass(), "skip", term6913);
        setField(term6868, term6868.getClass(), "taskFail", term6915);
        setField(term6868, term6868.getClass(), "createTime", term6917);
        setField(term6868, term6868.getClass(), "updateTime", term6919);
        setField(term6868, term6868.getClass(), "finishTime", term6921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVideoCreatedTime", argTypes, term6868, args);
    }

};



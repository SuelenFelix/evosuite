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

public class DanMuTaskPlanModel_setVideoCreatorUid_889208566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6569;

    public DanMuTaskPlanModel_setVideoCreatorUid_889208566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6570 = new Integer(1684998508);
        Long term6608 = new Long(-5951743062322506095L);
        Long term6610 = new Long(768144790810175653L);
        Integer term6612 = new Integer(-1476644457);
        Boolean term6614 = new Boolean(false);
        Boolean term6616 = new Boolean(false);
        Long term6618 = new Long(-1497280900081695731L);
        Long term6620 = new Long(-3602825674339018793L);
        Long term6622 = new Long(3086974592680165932L);
        term6569 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term6569, term6569.getClass(), "id", term6570);
        setField(term6569, term6569.getClass(), "platform", "GrqozDKFOk");
        setField(term6569, term6569.getClass(), "videoCreatorUid", "CFyoseFGLF");
        setField(term6569, term6569.getClass(), "videoId", "SFqCrhEWLm");
        setField(term6569, term6569.getClass(), "videoCreatedTime", term6608);
        setField(term6569, term6569.getClass(), "slicedTime", term6610);
        setField(term6569, term6569.getClass(), "pageCurrent", term6612);
        setField(term6569, term6569.getClass(), "skip", term6614);
        setField(term6569, term6569.getClass(), "taskFail", term6616);
        setField(term6569, term6569.getClass(), "createTime", term6618);
        setField(term6569, term6569.getClass(), "updateTime", term6620);
        setField(term6569, term6569.getClass(), "finishTime", term6622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GZdcJyZntS";
        callMethod(klass, "setVideoCreatorUid", argTypes, term6569, args);
    }

};



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

public class DanMuTaskPlanModel_setVideoCreatedTime_114897731610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6953;
     Object term7008;

    public DanMuTaskPlanModel_setVideoCreatedTime_114897731610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6954 = new Integer(-542712742);
        Long term6992 = new Long(4742108233936970770L);
        Long term6994 = new Long(2722004046017350471L);
        Integer term6996 = new Integer(-1254072822);
        Boolean term6998 = new Boolean(false);
        Boolean term7000 = new Boolean(false);
        Long term7002 = new Long(6636235983121346803L);
        Long term7004 = new Long(146749226579788091L);
        Long term7006 = new Long(-1279670138064751276L);
        term6953 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term6953, term6953.getClass(), "id", term6954);
        setField(term6953, term6953.getClass(), "platform", "xvkbvaEGYd");
        setField(term6953, term6953.getClass(), "videoCreatorUid", "HBGNxdNURv");
        setField(term6953, term6953.getClass(), "videoId", "mfCpTPPQQm");
        setField(term6953, term6953.getClass(), "videoCreatedTime", term6992);
        setField(term6953, term6953.getClass(), "slicedTime", term6994);
        setField(term6953, term6953.getClass(), "pageCurrent", term6996);
        setField(term6953, term6953.getClass(), "skip", term6998);
        setField(term6953, term6953.getClass(), "taskFail", term7000);
        setField(term6953, term6953.getClass(), "createTime", term7002);
        setField(term6953, term6953.getClass(), "updateTime", term7004);
        setField(term6953, term6953.getClass(), "finishTime", term7006);
        term7008 = new Long(-7205236974351118210L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term7008;
        callMethod(klass, "setVideoCreatedTime", argTypes, term6953, args);
    }

};



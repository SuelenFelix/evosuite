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

public class DanMuTaskPlanModel_setPageCurrent_26053413014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7297;
     Object term7352;

    public DanMuTaskPlanModel_setPageCurrent_26053413014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7298 = new Integer(1959097203);
        Long term7336 = new Long(-5207216109884759743L);
        Long term7338 = new Long(8765880103547975810L);
        Integer term7340 = new Integer(-209654048);
        Boolean term7342 = new Boolean(false);
        Boolean term7344 = new Boolean(false);
        Long term7346 = new Long(4552367707739103094L);
        Long term7348 = new Long(-6001151456088965547L);
        Long term7350 = new Long(1740732617708040141L);
        term7297 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term7297, term7297.getClass(), "id", term7298);
        setField(term7297, term7297.getClass(), "platform", "PqtVXXZMqK");
        setField(term7297, term7297.getClass(), "videoCreatorUid", "rYbtIDVdnd");
        setField(term7297, term7297.getClass(), "videoId", "UKAReurpHG");
        setField(term7297, term7297.getClass(), "videoCreatedTime", term7336);
        setField(term7297, term7297.getClass(), "slicedTime", term7338);
        setField(term7297, term7297.getClass(), "pageCurrent", term7340);
        setField(term7297, term7297.getClass(), "skip", term7342);
        setField(term7297, term7297.getClass(), "taskFail", term7344);
        setField(term7297, term7297.getClass(), "createTime", term7346);
        setField(term7297, term7297.getClass(), "updateTime", term7348);
        setField(term7297, term7297.getClass(), "finishTime", term7350);
        term7352 = new Integer(477625804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term7352;
        callMethod(klass, "setPageCurrent", argTypes, term7297, args);
    }

};



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

public class DanMuTaskPlanModel_getId_13688191151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6120;

    public DanMuTaskPlanModel_getId_13688191151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6121 = new Integer(-916584829);
        Long term6159 = new Long(-6078481855513028760L);
        Long term6161 = new Long(-6985556670871089725L);
        Integer term6163 = new Integer(-2131181468);
        Boolean term6165 = new Boolean(false);
        Boolean term6167 = new Boolean(false);
        Long term6169 = new Long(-8469818909085103606L);
        Long term6171 = new Long(11315815278355083L);
        Long term6173 = new Long(7735460540091431012L);
        term6120 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term6120, term6120.getClass(), "id", term6121);
        setField(term6120, term6120.getClass(), "platform", "nhoHrZfnIN");
        setField(term6120, term6120.getClass(), "videoCreatorUid", "ZkMALXpEAZ");
        setField(term6120, term6120.getClass(), "videoId", "tXfQjSqDzN");
        setField(term6120, term6120.getClass(), "videoCreatedTime", term6159);
        setField(term6120, term6120.getClass(), "slicedTime", term6161);
        setField(term6120, term6120.getClass(), "pageCurrent", term6163);
        setField(term6120, term6120.getClass(), "skip", term6165);
        setField(term6120, term6120.getClass(), "taskFail", term6167);
        setField(term6120, term6120.getClass(), "createTime", term6169);
        setField(term6120, term6120.getClass(), "updateTime", term6171);
        setField(term6120, term6120.getClass(), "finishTime", term6173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term6120, args);
    }

};



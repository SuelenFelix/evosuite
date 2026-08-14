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

public class DanMuTaskPlanModel_getFinishTime_34584841623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8072;

    public DanMuTaskPlanModel_getFinishTime_34584841623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8073 = new Integer(34470066);
        Long term8111 = new Long(-769824408235898287L);
        Long term8113 = new Long(-2828343143039517941L);
        Integer term8115 = new Integer(2058711405);
        Boolean term8117 = new Boolean(false);
        Boolean term8119 = new Boolean(false);
        Long term8121 = new Long(2809748481176687920L);
        Long term8123 = new Long(4012955251407483889L);
        Long term8125 = new Long(-4058686252500969842L);
        term8072 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term8072, term8072.getClass(), "id", term8073);
        setField(term8072, term8072.getClass(), "platform", "SPtPatHeOm");
        setField(term8072, term8072.getClass(), "videoCreatorUid", "ywmcuThdfL");
        setField(term8072, term8072.getClass(), "videoId", "GBOEuByOfr");
        setField(term8072, term8072.getClass(), "videoCreatedTime", term8111);
        setField(term8072, term8072.getClass(), "slicedTime", term8113);
        setField(term8072, term8072.getClass(), "pageCurrent", term8115);
        setField(term8072, term8072.getClass(), "skip", term8117);
        setField(term8072, term8072.getClass(), "taskFail", term8119);
        setField(term8072, term8072.getClass(), "createTime", term8121);
        setField(term8072, term8072.getClass(), "updateTime", term8123);
        setField(term8072, term8072.getClass(), "finishTime", term8125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFinishTime", argTypes, term8072, args);
    }

};



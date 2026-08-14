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

public class DanMuTaskPlanModel_setTaskFail_16024531318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7641;
     Object term7696;

    public DanMuTaskPlanModel_setTaskFail_16024531318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7642 = new Integer(1935707624);
        Long term7680 = new Long(-1465819833800717311L);
        Long term7682 = new Long(-8306611953768020559L);
        Integer term7684 = new Integer(1507074215);
        Boolean term7686 = new Boolean(false);
        Boolean term7688 = new Boolean(false);
        Long term7690 = new Long(-8692119547314358088L);
        Long term7692 = new Long(-2083524977884307536L);
        Long term7694 = new Long(-2691996476200751382L);
        term7641 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term7641, term7641.getClass(), "id", term7642);
        setField(term7641, term7641.getClass(), "platform", "doQLHkjpNm");
        setField(term7641, term7641.getClass(), "videoCreatorUid", "lCyLIcSuom");
        setField(term7641, term7641.getClass(), "videoId", "CGOpQSZZwI");
        setField(term7641, term7641.getClass(), "videoCreatedTime", term7680);
        setField(term7641, term7641.getClass(), "slicedTime", term7682);
        setField(term7641, term7641.getClass(), "pageCurrent", term7684);
        setField(term7641, term7641.getClass(), "skip", term7686);
        setField(term7641, term7641.getClass(), "taskFail", term7688);
        setField(term7641, term7641.getClass(), "createTime", term7690);
        setField(term7641, term7641.getClass(), "updateTime", term7692);
        setField(term7641, term7641.getClass(), "finishTime", term7694);
        term7696 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term7696;
        callMethod(klass, "setTaskFail", argTypes, term7641, args);
    }

};



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

public class DanMuTaskPlanModel_getSlicedTime_129414422311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7040;

    public DanMuTaskPlanModel_getSlicedTime_129414422311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7041 = new Integer(-1111249833);
        Long term7079 = new Long(-2136893352275781569L);
        Long term7081 = new Long(-9147545274054597570L);
        Integer term7083 = new Integer(-1692331299);
        Boolean term7085 = new Boolean(false);
        Boolean term7087 = new Boolean(false);
        Long term7089 = new Long(-8398381579707958144L);
        Long term7091 = new Long(-2195061939206930224L);
        Long term7093 = new Long(4525924047960478347L);
        term7040 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term7040, term7040.getClass(), "id", term7041);
        setField(term7040, term7040.getClass(), "platform", "OcJCIDNIXA");
        setField(term7040, term7040.getClass(), "videoCreatorUid", "XfRABIFVEp");
        setField(term7040, term7040.getClass(), "videoId", "MHGKyEnwKc");
        setField(term7040, term7040.getClass(), "videoCreatedTime", term7079);
        setField(term7040, term7040.getClass(), "slicedTime", term7081);
        setField(term7040, term7040.getClass(), "pageCurrent", term7083);
        setField(term7040, term7040.getClass(), "skip", term7085);
        setField(term7040, term7040.getClass(), "taskFail", term7087);
        setField(term7040, term7040.getClass(), "createTime", term7089);
        setField(term7040, term7040.getClass(), "updateTime", term7091);
        setField(term7040, term7040.getClass(), "finishTime", term7093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlicedTime", argTypes, term7040, args);
    }

};



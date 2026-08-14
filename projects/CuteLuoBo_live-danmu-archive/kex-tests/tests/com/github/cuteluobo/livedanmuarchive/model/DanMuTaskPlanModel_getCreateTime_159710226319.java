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

public class DanMuTaskPlanModel_getCreateTime_159710226319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7728;

    public DanMuTaskPlanModel_getCreateTime_159710226319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7729 = new Integer(-282881827);
        Long term7767 = new Long(-3806202176947356197L);
        Long term7769 = new Long(-5534222035915952617L);
        Integer term7771 = new Integer(-1183353915);
        Boolean term7773 = new Boolean(false);
        Boolean term7775 = new Boolean(false);
        Long term7777 = new Long(8073378116544724166L);
        Long term7779 = new Long(-8303973304709662279L);
        Long term7781 = new Long(6853972830905120647L);
        term7728 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term7728, term7728.getClass(), "id", term7729);
        setField(term7728, term7728.getClass(), "platform", "ypEdrstygY");
        setField(term7728, term7728.getClass(), "videoCreatorUid", "sNQFlATEeQ");
        setField(term7728, term7728.getClass(), "videoId", "ZKMLioamsY");
        setField(term7728, term7728.getClass(), "videoCreatedTime", term7767);
        setField(term7728, term7728.getClass(), "slicedTime", term7769);
        setField(term7728, term7728.getClass(), "pageCurrent", term7771);
        setField(term7728, term7728.getClass(), "skip", term7773);
        setField(term7728, term7728.getClass(), "taskFail", term7775);
        setField(term7728, term7728.getClass(), "createTime", term7777);
        setField(term7728, term7728.getClass(), "updateTime", term7779);
        setField(term7728, term7728.getClass(), "finishTime", term7781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTime", argTypes, term7728, args);
    }

};



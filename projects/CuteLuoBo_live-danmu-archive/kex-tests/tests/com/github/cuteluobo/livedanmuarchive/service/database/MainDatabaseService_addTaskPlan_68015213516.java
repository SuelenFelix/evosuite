package com.github.cuteluobo.livedanmuarchive.service.database;

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
import static com.github.cuteluobo.livedanmuarchive.service.database.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;

public class MainDatabaseService_addTaskPlan_68015213516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term837;

    public MainDatabaseService_addTaskPlan_68015213516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term838 = new Integer(-655067527);
        Long term876 = new Long(4044358158040652353L);
        Long term878 = new Long(-4443169559037975007L);
        Integer term880 = new Integer(-6029667);
        Boolean term882 = new Boolean(false);
        Boolean term884 = new Boolean(false);
        Long term886 = new Long(-3842548265506930260L);
        Long term888 = new Long(-5788180182343976541L);
        Long term890 = new Long(2936323121573284007L);
        term837 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term837, term837.getClass(), "id", term838);
        setField(term837, term837.getClass(), "platform", "IoAlmYsBwc");
        setField(term837, term837.getClass(), "videoCreatorUid", "TEParAifyi");
        setField(term837, term837.getClass(), "videoId", "OWDIEULEFu");
        setField(term837, term837.getClass(), "videoCreatedTime", term876);
        setField(term837, term837.getClass(), "slicedTime", term878);
        setField(term837, term837.getClass(), "pageCurrent", term880);
        setField(term837, term837.getClass(), "skip", term882);
        setField(term837, term837.getClass(), "taskFail", term884);
        setField(term837, term837.getClass(), "createTime", term886);
        setField(term837, term837.getClass(), "updateTime", term888);
        setField(term837, term837.getClass(), "finishTime", term890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.database.MainDatabaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Object[] args = new Object[1];
        args[0] = term837;
        callMethod(klass, "addTaskPlan", argTypes, null, args);
    }

};



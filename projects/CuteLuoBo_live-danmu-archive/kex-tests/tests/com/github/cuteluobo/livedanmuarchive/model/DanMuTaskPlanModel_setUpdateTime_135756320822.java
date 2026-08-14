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

public class DanMuTaskPlanModel_setUpdateTime_135756320822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7985;
     Object term8040;

    public DanMuTaskPlanModel_setUpdateTime_135756320822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7986 = new Integer(-525257914);
        Long term8024 = new Long(-421166328269063791L);
        Long term8026 = new Long(4811527754205378980L);
        Integer term8028 = new Integer(147209682);
        Boolean term8030 = new Boolean(false);
        Boolean term8032 = new Boolean(false);
        Long term8034 = new Long(9174730812791817537L);
        Long term8036 = new Long(8024477479047145752L);
        Long term8038 = new Long(7006402814669334483L);
        term7985 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term7985, term7985.getClass(), "id", term7986);
        setField(term7985, term7985.getClass(), "platform", "bnsyeQXFdu");
        setField(term7985, term7985.getClass(), "videoCreatorUid", "BwtdjiefJn");
        setField(term7985, term7985.getClass(), "videoId", "jDmhBrIoDa");
        setField(term7985, term7985.getClass(), "videoCreatedTime", term8024);
        setField(term7985, term7985.getClass(), "slicedTime", term8026);
        setField(term7985, term7985.getClass(), "pageCurrent", term8028);
        setField(term7985, term7985.getClass(), "skip", term8030);
        setField(term7985, term7985.getClass(), "taskFail", term8032);
        setField(term7985, term7985.getClass(), "createTime", term8034);
        setField(term7985, term7985.getClass(), "updateTime", term8036);
        setField(term7985, term7985.getClass(), "finishTime", term8038);
        term8040 = new Long(-4003544865306793676L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term8040;
        callMethod(klass, "setUpdateTime", argTypes, term7985, args);
    }

};



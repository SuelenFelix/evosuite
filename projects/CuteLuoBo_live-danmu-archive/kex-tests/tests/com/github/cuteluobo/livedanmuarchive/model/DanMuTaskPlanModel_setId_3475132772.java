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

public class DanMuTaskPlanModel_setId_3475132772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6205;
     Object term6260;

    public DanMuTaskPlanModel_setId_3475132772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6206 = new Integer(282916351);
        Long term6244 = new Long(1346299551708610248L);
        Long term6246 = new Long(-7191625829563442696L);
        Integer term6248 = new Integer(880977281);
        Boolean term6250 = new Boolean(false);
        Boolean term6252 = new Boolean(false);
        Long term6254 = new Long(1463379874413441830L);
        Long term6256 = new Long(7998051124369147543L);
        Long term6258 = new Long(-1481367303699139651L);
        term6205 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel"));
        setField(term6205, term6205.getClass(), "id", term6206);
        setField(term6205, term6205.getClass(), "platform", "BjugTaMcxJ");
        setField(term6205, term6205.getClass(), "videoCreatorUid", "vGiuZVPJNH");
        setField(term6205, term6205.getClass(), "videoId", "tlzpzIjMib");
        setField(term6205, term6205.getClass(), "videoCreatedTime", term6244);
        setField(term6205, term6205.getClass(), "slicedTime", term6246);
        setField(term6205, term6205.getClass(), "pageCurrent", term6248);
        setField(term6205, term6205.getClass(), "skip", term6250);
        setField(term6205, term6205.getClass(), "taskFail", term6252);
        setField(term6205, term6205.getClass(), "createTime", term6254);
        setField(term6205, term6205.getClass(), "updateTime", term6256);
        setField(term6205, term6205.getClass(), "finishTime", term6258);
        term6260 = new Integer(371943306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuTaskPlanModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term6260;
        callMethod(klass, "setId", argTypes, term6205, args);
    }

};



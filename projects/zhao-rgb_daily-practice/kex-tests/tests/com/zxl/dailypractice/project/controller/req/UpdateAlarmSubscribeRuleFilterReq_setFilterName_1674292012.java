package com.zxl.dailypractice.project.controller.req;

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
import static com.zxl.dailypractice.project.controller.req.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UpdateAlarmSubscribeRuleFilterReq_setFilterName_1674292012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6148;

    public UpdateAlarmSubscribeRuleFilterReq_setFilterName_1674292012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6197 = new Integer(-1410220680);
        Integer term6199 = new Integer(389427431);
        term6148 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term6148, term6148.getClass(), "filterName", "XMHwbfiHRl");
        setField(term6148, term6148.getClass(), "filterType", "bucTnYicnp");
        setField(term6148, term6148.getClass(), "filterExpr", "EkgprvqZlM");
        setField(term6148, term6148.getClass(), "alarmType", "fbnKvthhOz");
        setField(term6148, term6148.getClass(), "isDelay", term6197);
        setField(term6148, term6148.getClass(), "delayTime", term6199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PGfCDJTBek";
        callMethod(klass, "setFilterName", argTypes, term6148, args);
    }

};



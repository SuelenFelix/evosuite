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

public class UpdateAlarmSubscribeRuleFilterReq_getIsDelay_4546634009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6887;

    public UpdateAlarmSubscribeRuleFilterReq_getIsDelay_4546634009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6936 = new Integer(-165587447);
        Integer term6938 = new Integer(-1347358701);
        term6887 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term6887, term6887.getClass(), "filterName", "JdOMfNWgLP");
        setField(term6887, term6887.getClass(), "filterType", "uWqXrwAsDU");
        setField(term6887, term6887.getClass(), "filterExpr", "hgFbWAUtsu");
        setField(term6887, term6887.getClass(), "alarmType", "HqoTWlkbwF");
        setField(term6887, term6887.getClass(), "isDelay", term6936);
        setField(term6887, term6887.getClass(), "delayTime", term6938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsDelay", argTypes, term6887, args);
    }

};



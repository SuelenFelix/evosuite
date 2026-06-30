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

public class UpdateAlarmSubscribeRuleFilterReq_getFilterExpr_138083081918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7267;

    public UpdateAlarmSubscribeRuleFilterReq_getFilterExpr_138083081918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7267 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term7267, term7267.getClass(), "filterName", null);
        setField(term7267, term7267.getClass(), "filterType", null);
        setField(term7267, term7267.getClass(), "filterExpr", null);
        setField(term7267, term7267.getClass(), "alarmType", null);
        setField(term7267, term7267.getClass(), "isDelay", null);
        setField(term7267, term7267.getClass(), "delayTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterExpr", argTypes, term7267, args);
    }

};



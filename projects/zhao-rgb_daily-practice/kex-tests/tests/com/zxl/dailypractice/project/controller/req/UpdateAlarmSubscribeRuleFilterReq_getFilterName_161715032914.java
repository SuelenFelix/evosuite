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

public class UpdateAlarmSubscribeRuleFilterReq_getFilterName_161715032914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7263;

    public UpdateAlarmSubscribeRuleFilterReq_getFilterName_161715032914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7263 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term7263, term7263.getClass(), "filterName", null);
        setField(term7263, term7263.getClass(), "filterType", null);
        setField(term7263, term7263.getClass(), "filterExpr", null);
        setField(term7263, term7263.getClass(), "alarmType", null);
        setField(term7263, term7263.getClass(), "isDelay", null);
        setField(term7263, term7263.getClass(), "delayTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterName", argTypes, term7263, args);
    }

};



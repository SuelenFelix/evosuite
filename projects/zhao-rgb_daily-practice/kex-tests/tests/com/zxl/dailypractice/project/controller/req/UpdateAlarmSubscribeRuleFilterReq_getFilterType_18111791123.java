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

public class UpdateAlarmSubscribeRuleFilterReq_getFilterType_18111791123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6263;

    public UpdateAlarmSubscribeRuleFilterReq_getFilterType_18111791123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6312 = new Integer(-1945706126);
        Integer term6314 = new Integer(1152356969);
        term6263 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term6263, term6263.getClass(), "filterName", "ZwjARhAtHC");
        setField(term6263, term6263.getClass(), "filterType", "XXvscsYBWv");
        setField(term6263, term6263.getClass(), "filterExpr", "uePedtiAfL");
        setField(term6263, term6263.getClass(), "alarmType", "AdSHvysxQB");
        setField(term6263, term6263.getClass(), "isDelay", term6312);
        setField(term6263, term6263.getClass(), "delayTime", term6314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterType", argTypes, term6263, args);
    }

};



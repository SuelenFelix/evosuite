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

public class UpdateAlarmSubscribeRuleFilterReq_getAlarmType_17746173017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6679;

    public UpdateAlarmSubscribeRuleFilterReq_getAlarmType_17746173017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6728 = new Integer(-1310015129);
        Integer term6730 = new Integer(-2104981311);
        term6679 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term6679, term6679.getClass(), "filterName", "HJwNgUzZZR");
        setField(term6679, term6679.getClass(), "filterType", "FvUCZgTXhq");
        setField(term6679, term6679.getClass(), "filterExpr", "wWWidPCHzx");
        setField(term6679, term6679.getClass(), "alarmType", "OwPIiBRuKK");
        setField(term6679, term6679.getClass(), "isDelay", term6728);
        setField(term6679, term6679.getClass(), "delayTime", term6730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAlarmType", argTypes, term6679, args);
    }

};



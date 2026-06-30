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

public class UpdateAlarmSubscribeRuleReq_getRuleDesc_28634724330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4725;

    public UpdateAlarmSubscribeRuleReq_getRuleDesc_28634724330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4725 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term4725, term4725.getClass(), "operType", null);
        setField(term4725, term4725.getClass(), "ruleId", null);
        setField(term4725, term4725.getClass(), "ruleName", null);
        setField(term4725, term4725.getClass(), "ruleDesc", null);
        setField(term4725, term4725.getClass(), "ruleStatus", null);
        setField(term4725, term4725.getClass(), "ruleType", null);
        setField(term4725, term4725.getClass(), "activeTemplId", null);
        setField(term4725, term4725.getClass(), "clearTemplId", null);
        setField(term4725, term4725.getClass(), "modTemplId", null);
        setField(term4725, term4725.getClass(), "filterList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRuleDesc", argTypes, term4725, args);
    }

};



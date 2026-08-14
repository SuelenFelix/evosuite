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

public class UpdateAlarmSubscribeRuleReq_setRuleName_101757459529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4724;

    public UpdateAlarmSubscribeRuleReq_setRuleName_101757459529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4724 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term4724, term4724.getClass(), "operType", null);
        setField(term4724, term4724.getClass(), "ruleId", null);
        setField(term4724, term4724.getClass(), "ruleName", null);
        setField(term4724, term4724.getClass(), "ruleDesc", null);
        setField(term4724, term4724.getClass(), "ruleStatus", null);
        setField(term4724, term4724.getClass(), "ruleType", null);
        setField(term4724, term4724.getClass(), "activeTemplId", null);
        setField(term4724, term4724.getClass(), "clearTemplId", null);
        setField(term4724, term4724.getClass(), "modTemplId", null);
        setField(term4724, term4724.getClass(), "filterList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRuleName", argTypes, term4724, args);
    }

};



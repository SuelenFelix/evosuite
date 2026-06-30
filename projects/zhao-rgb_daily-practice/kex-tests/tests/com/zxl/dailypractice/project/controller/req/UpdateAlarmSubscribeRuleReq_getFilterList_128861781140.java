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

public class UpdateAlarmSubscribeRuleReq_getFilterList_128861781140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4735;

    public UpdateAlarmSubscribeRuleReq_getFilterList_128861781140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4735 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term4735, term4735.getClass(), "operType", null);
        setField(term4735, term4735.getClass(), "ruleId", null);
        setField(term4735, term4735.getClass(), "ruleName", null);
        setField(term4735, term4735.getClass(), "ruleDesc", null);
        setField(term4735, term4735.getClass(), "ruleStatus", null);
        setField(term4735, term4735.getClass(), "ruleType", null);
        setField(term4735, term4735.getClass(), "activeTemplId", null);
        setField(term4735, term4735.getClass(), "clearTemplId", null);
        setField(term4735, term4735.getClass(), "modTemplId", null);
        setField(term4735, term4735.getClass(), "filterList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterList", argTypes, term4735, args);
    }

};



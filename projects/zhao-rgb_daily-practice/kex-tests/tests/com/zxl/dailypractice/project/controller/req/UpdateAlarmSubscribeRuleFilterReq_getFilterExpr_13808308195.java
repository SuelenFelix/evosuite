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

public class UpdateAlarmSubscribeRuleFilterReq_getFilterExpr_13808308195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6471;

    public UpdateAlarmSubscribeRuleFilterReq_getFilterExpr_13808308195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6520 = new Integer(1102721075);
        Integer term6522 = new Integer(-426764678);
        term6471 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term6471, term6471.getClass(), "filterName", "EMiMtYgfvr");
        setField(term6471, term6471.getClass(), "filterType", "OyYyYYnJuF");
        setField(term6471, term6471.getClass(), "filterExpr", "aYLvcxZohT");
        setField(term6471, term6471.getClass(), "alarmType", "mnHyQbMyld");
        setField(term6471, term6471.getClass(), "isDelay", term6520);
        setField(term6471, term6471.getClass(), "delayTime", term6522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterExpr", argTypes, term6471, args);
    }

};



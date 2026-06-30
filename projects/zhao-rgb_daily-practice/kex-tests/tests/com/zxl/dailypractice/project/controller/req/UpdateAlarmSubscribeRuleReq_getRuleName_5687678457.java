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
import java.util.ArrayList;
import java.lang.Object;

public class UpdateAlarmSubscribeRuleReq_getRuleName_5687678457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1372;

    public UpdateAlarmSubscribeRuleReq_getRuleName_5687678457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1421 = new Integer(-1786399638);
        Integer term1478 = new Integer(2055867847);
        Integer term1480 = new Integer(-1048298087);
        Object term1473 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term1473, term1473.getClass(), "filterName", "");
        setField(term1473, term1473.getClass(), "filterType", "");
        setField(term1473, term1473.getClass(), "filterExpr", "");
        setField(term1473, term1473.getClass(), "alarmType", "");
        setField(term1473, term1473.getClass(), "isDelay", term1478);
        setField(term1473, term1473.getClass(), "delayTime", term1480);
        Integer term1487 = new Integer(292681826);
        Integer term1489 = new Integer(458147407);
        Object term1482 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term1482, term1482.getClass(), "filterName", "");
        setField(term1482, term1482.getClass(), "filterType", "");
        setField(term1482, term1482.getClass(), "filterExpr", "");
        setField(term1482, term1482.getClass(), "alarmType", "");
        setField(term1482, term1482.getClass(), "isDelay", term1487);
        setField(term1482, term1482.getClass(), "delayTime", term1489);
        ArrayList term1471 = new ArrayList();
        ((ArrayList) term1471).add(term1473);
        ((ArrayList) term1471).add(term1482);
        term1372 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term1372, term1372.getClass(), "operType", "pXOkjyeIRb");
        setField(term1372, term1372.getClass(), "ruleId", "GgZWSjxjyE");
        setField(term1372, term1372.getClass(), "ruleName", "EeBVbzjcCI");
        setField(term1372, term1372.getClass(), "ruleDesc", "UfQtPRyWRC");
        setField(term1372, term1372.getClass(), "ruleStatus", term1421);
        setField(term1372, term1372.getClass(), "ruleType", "FPvxVzzSvD");
        setField(term1372, term1372.getClass(), "activeTemplId", "WHcwFgsGFC");
        setField(term1372, term1372.getClass(), "clearTemplId", "HzqpegHiRq");
        setField(term1372, term1372.getClass(), "modTemplId", "jwsfVjMoJT");
        setField(term1372, term1372.getClass(), "filterList", term1471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRuleName", argTypes, term1372, args);
    }

};



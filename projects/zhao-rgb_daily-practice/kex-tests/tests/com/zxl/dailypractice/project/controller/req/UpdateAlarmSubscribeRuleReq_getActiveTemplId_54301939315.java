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

public class UpdateAlarmSubscribeRuleReq_getActiveTemplId_54301939315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3210;

    public UpdateAlarmSubscribeRuleReq_getActiveTemplId_54301939315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3259 = new Integer(-341152642);
        Integer term3316 = new Integer(-2015854073);
        Integer term3318 = new Integer(538259104);
        Object term3311 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term3311, term3311.getClass(), "filterName", "");
        setField(term3311, term3311.getClass(), "filterType", "");
        setField(term3311, term3311.getClass(), "filterExpr", "");
        setField(term3311, term3311.getClass(), "alarmType", "");
        setField(term3311, term3311.getClass(), "isDelay", term3316);
        setField(term3311, term3311.getClass(), "delayTime", term3318);
        Integer term3325 = new Integer(96566506);
        Integer term3327 = new Integer(-343325701);
        Object term3320 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term3320, term3320.getClass(), "filterName", "");
        setField(term3320, term3320.getClass(), "filterType", "");
        setField(term3320, term3320.getClass(), "filterExpr", "");
        setField(term3320, term3320.getClass(), "alarmType", "");
        setField(term3320, term3320.getClass(), "isDelay", term3325);
        setField(term3320, term3320.getClass(), "delayTime", term3327);
        Integer term3334 = new Integer(107945604);
        Integer term3336 = new Integer(-1963464809);
        Object term3329 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term3329, term3329.getClass(), "filterName", "");
        setField(term3329, term3329.getClass(), "filterType", "");
        setField(term3329, term3329.getClass(), "filterExpr", "");
        setField(term3329, term3329.getClass(), "alarmType", "");
        setField(term3329, term3329.getClass(), "isDelay", term3334);
        setField(term3329, term3329.getClass(), "delayTime", term3336);
        ArrayList term3309 = new ArrayList();
        ((ArrayList) term3309).add(term3311);
        ((ArrayList) term3309).add(term3320);
        ((ArrayList) term3309).add(term3329);
        term3210 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term3210, term3210.getClass(), "operType", "JkgoRtImdE");
        setField(term3210, term3210.getClass(), "ruleId", "qFGKIJjlmV");
        setField(term3210, term3210.getClass(), "ruleName", "IHqvyhMtuM");
        setField(term3210, term3210.getClass(), "ruleDesc", "dAldIGYAXV");
        setField(term3210, term3210.getClass(), "ruleStatus", term3259);
        setField(term3210, term3210.getClass(), "ruleType", "mLwibAPEsa");
        setField(term3210, term3210.getClass(), "activeTemplId", "zsWKWiTFuo");
        setField(term3210, term3210.getClass(), "clearTemplId", "UPUbwyHQKN");
        setField(term3210, term3210.getClass(), "modTemplId", "lgQkrXANyI");
        setField(term3210, term3210.getClass(), "filterList", term3309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActiveTemplId", argTypes, term3210, args);
    }

};



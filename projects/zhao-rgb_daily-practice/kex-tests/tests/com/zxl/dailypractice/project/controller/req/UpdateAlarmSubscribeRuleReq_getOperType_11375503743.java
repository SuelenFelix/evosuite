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

public class UpdateAlarmSubscribeRuleReq_getOperType_11375503743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470;

    public UpdateAlarmSubscribeRuleReq_getOperType_11375503743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term519 = new Integer(-655067527);
        Integer term576 = new Integer(-6029667);
        Integer term578 = new Integer(-2068769794);
        Object term571 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term571, term571.getClass(), "filterName", "");
        setField(term571, term571.getClass(), "filterType", "");
        setField(term571, term571.getClass(), "filterExpr", "");
        setField(term571, term571.getClass(), "alarmType", "");
        setField(term571, term571.getClass(), "isDelay", term576);
        setField(term571, term571.getClass(), "delayTime", term578);
        Integer term585 = new Integer(-117576464);
        Integer term587 = new Integer(-1007160944);
        Object term580 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term580, term580.getClass(), "filterName", "");
        setField(term580, term580.getClass(), "filterType", "");
        setField(term580, term580.getClass(), "filterExpr", "");
        setField(term580, term580.getClass(), "alarmType", "");
        setField(term580, term580.getClass(), "isDelay", term585);
        setField(term580, term580.getClass(), "delayTime", term587);
        Integer term594 = new Integer(1135664017);
        Integer term596 = new Integer(590364439);
        Object term589 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term589, term589.getClass(), "filterName", "");
        setField(term589, term589.getClass(), "filterType", "");
        setField(term589, term589.getClass(), "filterExpr", "");
        setField(term589, term589.getClass(), "alarmType", "");
        setField(term589, term589.getClass(), "isDelay", term594);
        setField(term589, term589.getClass(), "delayTime", term596);
        ArrayList term569 = new ArrayList();
        ((ArrayList) term569).add(term571);
        ((ArrayList) term569).add(term580);
        ((ArrayList) term569).add(term589);
        term470 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term470, term470.getClass(), "operType", "JDswTTCZHV");
        setField(term470, term470.getClass(), "ruleId", "onpbIeEKoi");
        setField(term470, term470.getClass(), "ruleName", "YRHGsAkhxb");
        setField(term470, term470.getClass(), "ruleDesc", "ffYhPOzlUs");
        setField(term470, term470.getClass(), "ruleStatus", term519);
        setField(term470, term470.getClass(), "ruleType", "MLqYREekMl");
        setField(term470, term470.getClass(), "activeTemplId", "ytSBIKXogI");
        setField(term470, term470.getClass(), "clearTemplId", "nHXjMycHlU");
        setField(term470, term470.getClass(), "modTemplId", "ieCtQFdkii");
        setField(term470, term470.getClass(), "filterList", term569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOperType", argTypes, term470, args);
    }

};



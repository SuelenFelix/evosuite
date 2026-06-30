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

public class UpdateAlarmSubscribeRuleReq_setRuleType_82354581214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2987;

    public UpdateAlarmSubscribeRuleReq_setRuleType_82354581214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3036 = new Integer(568954359);
        Integer term3093 = new Integer(53410913);
        Integer term3095 = new Integer(-375014958);
        Object term3088 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term3088, term3088.getClass(), "filterName", "");
        setField(term3088, term3088.getClass(), "filterType", "");
        setField(term3088, term3088.getClass(), "filterExpr", "");
        setField(term3088, term3088.getClass(), "alarmType", "");
        setField(term3088, term3088.getClass(), "isDelay", term3093);
        setField(term3088, term3088.getClass(), "delayTime", term3095);
        Integer term3102 = new Integer(1107176718);
        Integer term3104 = new Integer(480137250);
        Object term3097 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term3097, term3097.getClass(), "filterName", "");
        setField(term3097, term3097.getClass(), "filterType", "");
        setField(term3097, term3097.getClass(), "filterExpr", "");
        setField(term3097, term3097.getClass(), "alarmType", "");
        setField(term3097, term3097.getClass(), "isDelay", term3102);
        setField(term3097, term3097.getClass(), "delayTime", term3104);
        ArrayList term3086 = new ArrayList();
        ((ArrayList) term3086).add(term3088);
        ((ArrayList) term3086).add(term3097);
        term2987 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term2987, term2987.getClass(), "operType", "PJcSNDruWd");
        setField(term2987, term2987.getClass(), "ruleId", "VVNNlAePXF");
        setField(term2987, term2987.getClass(), "ruleName", "jnwVnmKAFv");
        setField(term2987, term2987.getClass(), "ruleDesc", "TXyHhqeCjR");
        setField(term2987, term2987.getClass(), "ruleStatus", term3036);
        setField(term2987, term2987.getClass(), "ruleType", "lZIgPZPgTu");
        setField(term2987, term2987.getClass(), "activeTemplId", "iuCxnHGMoW");
        setField(term2987, term2987.getClass(), "clearTemplId", "GPSEWEDSTo");
        setField(term2987, term2987.getClass(), "modTemplId", "RCOqfVsRHt");
        setField(term2987, term2987.getClass(), "filterList", term3086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "avhRaGZaBF";
        callMethod(klass, "setRuleType", argTypes, term2987, args);
    }

};



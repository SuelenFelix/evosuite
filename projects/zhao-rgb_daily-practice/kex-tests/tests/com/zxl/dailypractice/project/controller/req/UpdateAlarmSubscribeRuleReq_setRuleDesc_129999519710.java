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

public class UpdateAlarmSubscribeRuleReq_setRuleDesc_129999519710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2078;

    public UpdateAlarmSubscribeRuleReq_setRuleDesc_129999519710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2127 = new Integer(1090617576);
        Integer term2184 = new Integer(-1547384488);
        Integer term2186 = new Integer(1442160736);
        Object term2179 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term2179, term2179.getClass(), "filterName", "");
        setField(term2179, term2179.getClass(), "filterType", "");
        setField(term2179, term2179.getClass(), "filterExpr", "");
        setField(term2179, term2179.getClass(), "alarmType", "");
        setField(term2179, term2179.getClass(), "isDelay", term2184);
        setField(term2179, term2179.getClass(), "delayTime", term2186);
        ArrayList term2177 = new ArrayList();
        ((ArrayList) term2177).add(term2179);
        term2078 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term2078, term2078.getClass(), "operType", "gUvcueTURF");
        setField(term2078, term2078.getClass(), "ruleId", "EwQBhZjCIT");
        setField(term2078, term2078.getClass(), "ruleName", "aSkmSwTnEw");
        setField(term2078, term2078.getClass(), "ruleDesc", "xvkbvaEGYd");
        setField(term2078, term2078.getClass(), "ruleStatus", term2127);
        setField(term2078, term2078.getClass(), "ruleType", "HBGNxdNURv");
        setField(term2078, term2078.getClass(), "activeTemplId", "mfCpTPPQQm");
        setField(term2078, term2078.getClass(), "clearTemplId", "OcJCIDNIXA");
        setField(term2078, term2078.getClass(), "modTemplId", "XfRABIFVEp");
        setField(term2078, term2078.getClass(), "filterList", term2177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iIRsCSYqXH";
        callMethod(klass, "setRuleDesc", argTypes, term2078, args);
    }

};



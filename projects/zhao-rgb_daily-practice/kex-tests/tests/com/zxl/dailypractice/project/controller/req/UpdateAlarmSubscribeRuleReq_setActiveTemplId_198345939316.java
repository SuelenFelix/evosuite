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

public class UpdateAlarmSubscribeRuleReq_setActiveTemplId_198345939316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3420;

    public UpdateAlarmSubscribeRuleReq_setActiveTemplId_198345939316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3469 = new Integer(71190297);
        Integer term3526 = new Integer(1202361360);
        Integer term3528 = new Integer(-2015048153);
        Object term3521 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term3521, term3521.getClass(), "filterName", "");
        setField(term3521, term3521.getClass(), "filterType", "");
        setField(term3521, term3521.getClass(), "filterExpr", "");
        setField(term3521, term3521.getClass(), "alarmType", "");
        setField(term3521, term3521.getClass(), "isDelay", term3526);
        setField(term3521, term3521.getClass(), "delayTime", term3528);
        ArrayList term3519 = new ArrayList();
        ((ArrayList) term3519).add(term3521);
        term3420 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term3420, term3420.getClass(), "operType", "nKZKnxWYCK");
        setField(term3420, term3420.getClass(), "ruleId", "JOqQxuzRuZ");
        setField(term3420, term3420.getClass(), "ruleName", "RSaoipUlsg");
        setField(term3420, term3420.getClass(), "ruleDesc", "cSHGbqKqlN");
        setField(term3420, term3420.getClass(), "ruleStatus", term3469);
        setField(term3420, term3420.getClass(), "ruleType", "pFAfANnxup");
        setField(term3420, term3420.getClass(), "activeTemplId", "FbSIUZyBXZ");
        setField(term3420, term3420.getClass(), "clearTemplId", "mhQDwIyrRi");
        setField(term3420, term3420.getClass(), "modTemplId", "HpZXWDPhlg");
        setField(term3420, term3420.getClass(), "filterList", term3519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IEYhJmgCVd";
        callMethod(klass, "setActiveTemplId", argTypes, term3420, args);
    }

};



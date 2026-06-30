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

public class UpdateAlarmSubscribeRuleReq_getRuleId_3445392535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term921;

    public UpdateAlarmSubscribeRuleReq_getRuleId_3445392535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term970 = new Integer(-1530420153);
        Integer term1027 = new Integer(-469968304);
        Integer term1029 = new Integer(-1145578966);
        Object term1022 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term1022, term1022.getClass(), "filterName", "");
        setField(term1022, term1022.getClass(), "filterType", "");
        setField(term1022, term1022.getClass(), "filterExpr", "");
        setField(term1022, term1022.getClass(), "alarmType", "");
        setField(term1022, term1022.getClass(), "isDelay", term1027);
        setField(term1022, term1022.getClass(), "delayTime", term1029);
        ArrayList term1020 = new ArrayList();
        ((ArrayList) term1020).add(term1022);
        term921 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term921, term921.getClass(), "operType", "XPKmummaqg");
        setField(term921, term921.getClass(), "ruleId", "BKLfkLiZTH");
        setField(term921, term921.getClass(), "ruleName", "SPpkrGcPRr");
        setField(term921, term921.getClass(), "ruleDesc", "sEccwbJKYE");
        setField(term921, term921.getClass(), "ruleStatus", term970);
        setField(term921, term921.getClass(), "ruleType", "AWRooQKkdW");
        setField(term921, term921.getClass(), "activeTemplId", "vjxIhXHxGR");
        setField(term921, term921.getClass(), "clearTemplId", "QXzGXbEXMu");
        setField(term921, term921.getClass(), "modTemplId", "qxSDVejjiY");
        setField(term921, term921.getClass(), "filterList", term1020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRuleId", argTypes, term921, args);
    }

};



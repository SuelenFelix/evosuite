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

public class UpdateAlarmSubscribeRuleReq_getModTemplId_644867371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UpdateAlarmSubscribeRuleReq_getModTemplId_644867371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term50 = new Integer(568599855);
        Integer term107 = new Integer(1162663216);
        Integer term109 = new Integer(1484323161);
        Object term102 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term102, term102.getClass(), "filterName", "");
        setField(term102, term102.getClass(), "filterType", "");
        setField(term102, term102.getClass(), "filterExpr", "");
        setField(term102, term102.getClass(), "alarmType", "");
        setField(term102, term102.getClass(), "isDelay", term107);
        setField(term102, term102.getClass(), "delayTime", term109);
        Integer term116 = new Integer(391863371);
        Integer term118 = new Integer(-1922583790);
        Object term111 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term111, term111.getClass(), "filterName", "");
        setField(term111, term111.getClass(), "filterType", "");
        setField(term111, term111.getClass(), "filterExpr", "");
        setField(term111, term111.getClass(), "alarmType", "");
        setField(term111, term111.getClass(), "isDelay", term116);
        setField(term111, term111.getClass(), "delayTime", term118);
        Integer term125 = new Integer(-616727354);
        Integer term127 = new Integer(-1955890973);
        Object term120 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term120, term120.getClass(), "filterName", "");
        setField(term120, term120.getClass(), "filterType", "");
        setField(term120, term120.getClass(), "filterExpr", "");
        setField(term120, term120.getClass(), "alarmType", "");
        setField(term120, term120.getClass(), "isDelay", term125);
        setField(term120, term120.getClass(), "delayTime", term127);
        Integer term134 = new Integer(-2038273078);
        Integer term136 = new Integer(1227103734);
        Object term129 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term129, term129.getClass(), "filterName", "");
        setField(term129, term129.getClass(), "filterType", "");
        setField(term129, term129.getClass(), "filterExpr", "");
        setField(term129, term129.getClass(), "alarmType", "");
        setField(term129, term129.getClass(), "isDelay", term134);
        setField(term129, term129.getClass(), "delayTime", term136);
        Integer term143 = new Integer(-1339778481);
        Integer term145 = new Integer(1725571209);
        Object term138 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term138, term138.getClass(), "filterName", "");
        setField(term138, term138.getClass(), "filterType", "");
        setField(term138, term138.getClass(), "filterExpr", "");
        setField(term138, term138.getClass(), "alarmType", "");
        setField(term138, term138.getClass(), "isDelay", term143);
        setField(term138, term138.getClass(), "delayTime", term145);
        ArrayList term100 = new ArrayList();
        ((ArrayList) term100).add(term102);
        ((ArrayList) term100).add(term111);
        ((ArrayList) term100).add(term120);
        ((ArrayList) term100).add(term129);
        ((ArrayList) term100).add(term138);
        term1 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term1, term1.getClass(), "operType", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "ruleId", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "ruleName", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "ruleDesc", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "ruleStatus", term50);
        setField(term1, term1.getClass(), "ruleType", "jJCZpVmanW");
        setField(term1, term1.getClass(), "activeTemplId", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "clearTemplId", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "modTemplId", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "filterList", term100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModTemplId", argTypes, term1, args);
    }

};



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

public class UpdateAlarmSubscribeRuleReq_setOperType_4487920664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term680;

    public UpdateAlarmSubscribeRuleReq_setOperType_4487920664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term729 = new Integer(865208305);
        Integer term786 = new Integer(-1275173084);
        Integer term788 = new Integer(-244121226);
        Object term781 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term781, term781.getClass(), "filterName", "");
        setField(term781, term781.getClass(), "filterType", "");
        setField(term781, term781.getClass(), "filterExpr", "");
        setField(term781, term781.getClass(), "alarmType", "");
        setField(term781, term781.getClass(), "isDelay", term786);
        setField(term781, term781.getClass(), "delayTime", term788);
        Integer term795 = new Integer(-203030934);
        Integer term797 = new Integer(-1179120542);
        Object term790 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term790, term790.getClass(), "filterName", "");
        setField(term790, term790.getClass(), "filterType", "");
        setField(term790, term790.getClass(), "filterExpr", "");
        setField(term790, term790.getClass(), "alarmType", "");
        setField(term790, term790.getClass(), "isDelay", term795);
        setField(term790, term790.getClass(), "delayTime", term797);
        Integer term804 = new Integer(-73683645);
        Integer term806 = new Integer(-226514366);
        Object term799 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term799, term799.getClass(), "filterName", "");
        setField(term799, term799.getClass(), "filterType", "");
        setField(term799, term799.getClass(), "filterExpr", "");
        setField(term799, term799.getClass(), "alarmType", "");
        setField(term799, term799.getClass(), "isDelay", term804);
        setField(term799, term799.getClass(), "delayTime", term806);
        Integer term813 = new Integer(1193880199);
        Integer term815 = new Integer(-1087774327);
        Object term808 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term808, term808.getClass(), "filterName", "");
        setField(term808, term808.getClass(), "filterType", "");
        setField(term808, term808.getClass(), "filterExpr", "");
        setField(term808, term808.getClass(), "alarmType", "");
        setField(term808, term808.getClass(), "isDelay", term813);
        setField(term808, term808.getClass(), "delayTime", term815);
        ArrayList term779 = new ArrayList();
        ((ArrayList) term779).add(term781);
        ((ArrayList) term779).add(term790);
        ((ArrayList) term779).add(term799);
        ((ArrayList) term779).add(term808);
        term680 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term680, term680.getClass(), "operType", "KoyGrUJeJW");
        setField(term680, term680.getClass(), "ruleId", "HqBOwkVqjD");
        setField(term680, term680.getClass(), "ruleName", "MAcUBcBckh");
        setField(term680, term680.getClass(), "ruleDesc", "oVgzLbrsFr");
        setField(term680, term680.getClass(), "ruleStatus", term729);
        setField(term680, term680.getClass(), "ruleType", "vQVyKLdtaz");
        setField(term680, term680.getClass(), "activeTemplId", "OWKQODBLzb");
        setField(term680, term680.getClass(), "clearTemplId", "wGmYcqUkgE");
        setField(term680, term680.getClass(), "modTemplId", "idgaQsnJpQ");
        setField(term680, term680.getClass(), "filterList", term779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JiVRgTZvKc";
        callMethod(klass, "setOperType", argTypes, term680, args);
    }

};



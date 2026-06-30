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

public class UpdateAlarmSubscribeRuleReq_setModTemplId_15142078652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229;

    public UpdateAlarmSubscribeRuleReq_setModTemplId_15142078652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term278 = new Integer(-522618178);
        Integer term335 = new Integer(1134449235);
        Integer term337 = new Integer(-883034806);
        Object term330 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term330, term330.getClass(), "filterName", "");
        setField(term330, term330.getClass(), "filterType", "");
        setField(term330, term330.getClass(), "filterExpr", "");
        setField(term330, term330.getClass(), "alarmType", "");
        setField(term330, term330.getClass(), "isDelay", term335);
        setField(term330, term330.getClass(), "delayTime", term337);
        Integer term344 = new Integer(1585847225);
        Integer term346 = new Integer(597278769);
        Object term339 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term339, term339.getClass(), "filterName", "");
        setField(term339, term339.getClass(), "filterType", "");
        setField(term339, term339.getClass(), "filterExpr", "");
        setField(term339, term339.getClass(), "alarmType", "");
        setField(term339, term339.getClass(), "isDelay", term344);
        setField(term339, term339.getClass(), "delayTime", term346);
        Integer term353 = new Integer(-1685132342);
        Integer term355 = new Integer(-1456670397);
        Object term348 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term348, term348.getClass(), "filterName", "");
        setField(term348, term348.getClass(), "filterType", "");
        setField(term348, term348.getClass(), "filterExpr", "");
        setField(term348, term348.getClass(), "alarmType", "");
        setField(term348, term348.getClass(), "isDelay", term353);
        setField(term348, term348.getClass(), "delayTime", term355);
        Integer term362 = new Integer(1622346318);
        Integer term364 = new Integer(1048535127);
        Object term357 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term357, term357.getClass(), "filterName", "");
        setField(term357, term357.getClass(), "filterType", "");
        setField(term357, term357.getClass(), "filterExpr", "");
        setField(term357, term357.getClass(), "alarmType", "");
        setField(term357, term357.getClass(), "isDelay", term362);
        setField(term357, term357.getClass(), "delayTime", term364);
        ArrayList term328 = new ArrayList();
        ((ArrayList) term328).add(term330);
        ((ArrayList) term328).add(term339);
        ((ArrayList) term328).add(term348);
        ((ArrayList) term328).add(term357);
        term229 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term229, term229.getClass(), "operType", "IoAlmYsBwc");
        setField(term229, term229.getClass(), "ruleId", "TEParAifyi");
        setField(term229, term229.getClass(), "ruleName", "OWDIEULEFu");
        setField(term229, term229.getClass(), "ruleDesc", "dWRymuLBtr");
        setField(term229, term229.getClass(), "ruleStatus", term278);
        setField(term229, term229.getClass(), "ruleType", "AijpHYOFuy");
        setField(term229, term229.getClass(), "activeTemplId", "SbAoxhfrkn");
        setField(term229, term229.getClass(), "clearTemplId", "kuTXqwMtDB");
        setField(term229, term229.getClass(), "modTemplId", "Ghbwtircqb");
        setField(term229, term229.getClass(), "filterList", term328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UoYtihxVaS";
        callMethod(klass, "setModTemplId", argTypes, term229, args);
    }

};



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

public class UpdateAlarmSubscribeRuleFilterReq_setAlarmType_19373747418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6772;

    public UpdateAlarmSubscribeRuleFilterReq_setAlarmType_19373747418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6821 = new Integer(-571169753);
        Integer term6823 = new Integer(318591690);
        term6772 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term6772, term6772.getClass(), "filterName", "sgfGySMODT");
        setField(term6772, term6772.getClass(), "filterType", "ndAITnOsny");
        setField(term6772, term6772.getClass(), "filterExpr", "CVZnTiJucs");
        setField(term6772, term6772.getClass(), "alarmType", "ecHEQufXoq");
        setField(term6772, term6772.getClass(), "isDelay", term6821);
        setField(term6772, term6772.getClass(), "delayTime", term6823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "btBLMvHzJg";
        callMethod(klass, "setAlarmType", argTypes, term6772, args);
    }

};



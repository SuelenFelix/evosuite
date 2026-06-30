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

public class UpdateAlarmSubscribeRuleFilterReq_setDelayTime_49960587712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7168;
     Object term7221;

    public UpdateAlarmSubscribeRuleFilterReq_setDelayTime_49960587712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7217 = new Integer(-916584829);
        Integer term7219 = new Integer(-2131181468);
        term7168 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term7168, term7168.getClass(), "filterName", "pdSvedKgPq");
        setField(term7168, term7168.getClass(), "filterType", "epPTwvcoyb");
        setField(term7168, term7168.getClass(), "filterExpr", "UBPHmOICBs");
        setField(term7168, term7168.getClass(), "alarmType", "IDJUVPgUJf");
        setField(term7168, term7168.getClass(), "isDelay", term7217);
        setField(term7168, term7168.getClass(), "delayTime", term7219);
        term7221 = new Integer(282916351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term7221;
        callMethod(klass, "setDelayTime", argTypes, term7168, args);
    }

};



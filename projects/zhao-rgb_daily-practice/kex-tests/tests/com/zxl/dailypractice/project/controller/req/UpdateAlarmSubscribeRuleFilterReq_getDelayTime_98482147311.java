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

public class UpdateAlarmSubscribeRuleFilterReq_getDelayTime_98482147311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7075;

    public UpdateAlarmSubscribeRuleFilterReq_getDelayTime_98482147311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7124 = new Integer(1694224101);
        Integer term7126 = new Integer(937859191);
        term7075 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term7075, term7075.getClass(), "filterName", "YfkhviKZwl");
        setField(term7075, term7075.getClass(), "filterType", "DcOhhAfJTI");
        setField(term7075, term7075.getClass(), "filterExpr", "gYTIkBFOoS");
        setField(term7075, term7075.getClass(), "alarmType", "xmzSoVgiED");
        setField(term7075, term7075.getClass(), "isDelay", term7124);
        setField(term7075, term7075.getClass(), "delayTime", term7126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDelayTime", argTypes, term7075, args);
    }

};



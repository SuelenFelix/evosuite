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

public class UpdateAlarmSubscribeRuleFilterReq_setIsDelay_96485228610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6980;
     Object term7033;

    public UpdateAlarmSubscribeRuleFilterReq_setIsDelay_96485228610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7029 = new Integer(806595993);
        Integer term7031 = new Integer(548228925);
        term6980 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term6980, term6980.getClass(), "filterName", "CwNELDTAPP");
        setField(term6980, term6980.getClass(), "filterType", "GSzQdbHLHw");
        setField(term6980, term6980.getClass(), "filterExpr", "IkfarsYNJO");
        setField(term6980, term6980.getClass(), "alarmType", "aZKOWhHMEh");
        setField(term6980, term6980.getClass(), "isDelay", term7029);
        setField(term6980, term6980.getClass(), "delayTime", term7031);
        term7033 = new Integer(-749861210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term7033;
        callMethod(klass, "setIsDelay", argTypes, term6980, args);
    }

};



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

public class UpdateAlarmSubscribeRuleFilterReq_getFilterName_16171503291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6055;

    public UpdateAlarmSubscribeRuleFilterReq_getFilterName_16171503291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6104 = new Integer(-1899301124);
        Integer term6106 = new Integer(-1882480155);
        term6055 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq"));
        setField(term6055, term6055.getClass(), "filterName", "FftYCNbnks");
        setField(term6055, term6055.getClass(), "filterType", "lJoltmsadS");
        setField(term6055, term6055.getClass(), "filterExpr", "mvfDtZNEHr");
        setField(term6055, term6055.getClass(), "alarmType", "bvSgmFUDOU");
        setField(term6055, term6055.getClass(), "isDelay", term6104);
        setField(term6055, term6055.getClass(), "delayTime", term6106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleFilterReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterName", argTypes, term6055, args);
    }

};



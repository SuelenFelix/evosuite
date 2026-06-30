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

public class UpdateAlarmSubscribeRuleReq_getClearTemplId_207711085217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3634;

    public UpdateAlarmSubscribeRuleReq_getClearTemplId_207711085217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3683 = new Integer(-2063457669);
        ArrayList term3733 = new ArrayList();
        term3634 = newInstance(Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq"));
        setField(term3634, term3634.getClass(), "operType", "KSJeYkkvpk");
        setField(term3634, term3634.getClass(), "ruleId", "qUtkFGMNUV");
        setField(term3634, term3634.getClass(), "ruleName", "mGRiYhnMcR");
        setField(term3634, term3634.getClass(), "ruleDesc", "NFlvfJCVPO");
        setField(term3634, term3634.getClass(), "ruleStatus", term3683);
        setField(term3634, term3634.getClass(), "ruleType", "KarbTXFmUU");
        setField(term3634, term3634.getClass(), "activeTemplId", "jiUSjqwSIQ");
        setField(term3634, term3634.getClass(), "clearTemplId", "MgLCedQfoj");
        setField(term3634, term3634.getClass(), "modTemplId", "zgKiINdgNu");
        setField(term3634, term3634.getClass(), "filterList", term3733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.controller.req.UpdateAlarmSubscribeRuleReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClearTemplId", argTypes, term3634, args);
    }

};



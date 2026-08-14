package com.hack23.sonar.cloudformation.reports.cfnnag;

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
import static com.hack23.sonar.cloudformation.reports.cfnnag.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Object;

public class CfnNagViolation_setLogicalResourceIds_12461659408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term792;
     Object term837;

    public CfnNagViolation_setLogicalResourceIds_12461659408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term829 = new ArrayList();
        ArrayList term833 = new ArrayList();
        term792 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagViolation"));
        setField(term792, term792.getClass(), "id", "aKnKipADSo");
        setField(term792, term792.getClass(), "type", "wSQxaModmm");
        setField(term792, term792.getClass(), "message", "UlajhuVLaP");
        setField(term792, term792.getClass(), "logicalResourceIds", term829);
        setField(term792, term792.getClass(), "lineNumbers", term833);
        term837 = new LinkedList();
        ((LinkedList) term837).add("gGSMzuGICf");
        ((LinkedList) term837).add("hxCBltsObl");
        ((LinkedList) term837).add("");
        ((LinkedList) term837).add((Object)null);
        ((LinkedList) term837).add((Object)null);
        ((LinkedList) term837).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagViolation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term837;
        callMethod(klass, "setLogicalResourceIds", argTypes, term792, args);
    }

};



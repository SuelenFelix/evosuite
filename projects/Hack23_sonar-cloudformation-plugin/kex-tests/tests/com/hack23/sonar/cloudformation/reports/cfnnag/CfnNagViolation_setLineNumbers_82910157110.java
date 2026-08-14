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
import java.lang.Integer;

public class CfnNagViolation_setLineNumbers_82910157110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1020;
     Object term1065;

    public CfnNagViolation_setLineNumbers_82910157110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1057 = new ArrayList();
        ArrayList term1061 = new ArrayList();
        term1020 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagViolation"));
        setField(term1020, term1020.getClass(), "id", "UiUYnPrcCi");
        setField(term1020, term1020.getClass(), "type", "UoYtihxVaS");
        setField(term1020, term1020.getClass(), "message", "JDswTTCZHV");
        setField(term1020, term1020.getClass(), "logicalResourceIds", term1057);
        setField(term1020, term1020.getClass(), "lineNumbers", term1061);
        Integer term1068 = new Integer(568599855);
        term1065 = new LinkedList();
        ((LinkedList) term1065).add(term1068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagViolation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1065;
        callMethod(klass, "setLineNumbers", argTypes, term1020, args);
    }

};



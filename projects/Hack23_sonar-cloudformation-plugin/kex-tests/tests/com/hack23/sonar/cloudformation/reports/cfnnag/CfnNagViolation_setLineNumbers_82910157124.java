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

public class CfnNagViolation_setLineNumbers_82910157124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1336;

    public CfnNagViolation_setLineNumbers_82910157124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1336 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagViolation"));
        setField(term1336, term1336.getClass(), "id", null);
        setField(term1336, term1336.getClass(), "type", null);
        setField(term1336, term1336.getClass(), "message", null);
        setField(term1336, term1336.getClass(), "logicalResourceIds", null);
        setField(term1336, term1336.getClass(), "lineNumbers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagViolation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLineNumbers", argTypes, term1336, args);
    }

};



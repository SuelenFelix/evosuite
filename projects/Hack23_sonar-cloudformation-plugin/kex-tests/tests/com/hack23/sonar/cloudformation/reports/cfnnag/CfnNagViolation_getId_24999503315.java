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

public class CfnNagViolation_getId_24999503315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1327;

    public CfnNagViolation_getId_24999503315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1327 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagViolation"));
        setField(term1327, term1327.getClass(), "id", null);
        setField(term1327, term1327.getClass(), "type", null);
        setField(term1327, term1327.getClass(), "message", null);
        setField(term1327, term1327.getClass(), "logicalResourceIds", null);
        setField(term1327, term1327.getClass(), "lineNumbers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagViolation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1327, args);
    }

};



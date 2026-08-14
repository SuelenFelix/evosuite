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

public class CfnNagViolation_hashCode_211116046013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1252;

    public CfnNagViolation_hashCode_211116046013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1289 = new ArrayList();
        ArrayList term1293 = new ArrayList();
        term1252 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagViolation"));
        setField(term1252, term1252.getClass(), "id", "ieCtQFdkii");
        setField(term1252, term1252.getClass(), "type", "dEnhdmILtU");
        setField(term1252, term1252.getClass(), "message", "hoicvmsovO");
        setField(term1252, term1252.getClass(), "logicalResourceIds", term1289);
        setField(term1252, term1252.getClass(), "lineNumbers", term1293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagViolation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1252, args);
    }

};



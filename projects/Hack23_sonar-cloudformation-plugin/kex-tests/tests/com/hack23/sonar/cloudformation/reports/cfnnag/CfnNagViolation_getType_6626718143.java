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

public class CfnNagViolation_getType_6626718143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373;

    public CfnNagViolation_getType_6626718143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term410 = new ArrayList();
        ArrayList term414 = new ArrayList();
        term373 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagViolation"));
        setField(term373, term373.getClass(), "id", "xOEqzGAmDU");
        setField(term373, term373.getClass(), "type", "eZFUvlxvGV");
        setField(term373, term373.getClass(), "message", "BYqFIqCKAV");
        setField(term373, term373.getClass(), "logicalResourceIds", term410);
        setField(term373, term373.getClass(), "lineNumbers", term414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagViolation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term373, args);
    }

};



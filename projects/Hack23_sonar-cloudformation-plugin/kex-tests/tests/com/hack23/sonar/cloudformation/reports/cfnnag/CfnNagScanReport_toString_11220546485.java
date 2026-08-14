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
import java.lang.Object;
import java.util.ArrayList;

public class CfnNagScanReport_toString_11220546485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1484;

    public CfnNagScanReport_toString_11220546485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1499 = new ArrayList();
        term1484 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagScanReport"));
        Object term1497 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagReport"));
        setField(term1484, term1484.getClass(), "filename", "tPlsykYBqO");
        setIntField(term1497, term1497.getClass(), "failureCount", -883034806);
        setField(term1497, term1497.getClass(), "violations", term1499);
        setField(term1484, term1484.getClass(), "fileResults", term1497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagScanReport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1484, args);
    }

};



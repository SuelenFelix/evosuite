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

public class CfnNagScanReport_setFileResults_2551902984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1449;
     Object term1468;

    public CfnNagScanReport_setFileResults_2551902984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1464 = new ArrayList();
        term1449 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagScanReport"));
        Object term1462 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagReport"));
        setField(term1449, term1449.getClass(), "filename", "TJmVBGfTML");
        setIntField(term1462, term1462.getClass(), "failureCount", -522618178);
        setField(term1462, term1462.getClass(), "violations", term1464);
        setField(term1449, term1449.getClass(), "fileResults", term1462);
        ArrayList term1470 = new ArrayList();
        term1468 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagReport"));
        setIntField(term1468, term1468.getClass(), "failureCount", 1134449235);
        setField(term1468, term1468.getClass(), "violations", term1470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagScanReport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagReport");
        Object[] args = new Object[1];
        args[0] = term1468;
        callMethod(klass, "setFileResults", argTypes, term1449, args);
    }

};



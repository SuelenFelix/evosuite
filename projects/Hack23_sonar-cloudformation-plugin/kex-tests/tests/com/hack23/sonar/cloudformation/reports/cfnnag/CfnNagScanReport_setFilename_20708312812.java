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

public class CfnNagScanReport_setFilename_20708312812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1369;

    public CfnNagScanReport_setFilename_20708312812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1384 = new ArrayList();
        term1369 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagScanReport"));
        Object term1382 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagReport"));
        setField(term1369, term1369.getClass(), "filename", "fhkbdRViHi");
        setIntField(term1382, term1382.getClass(), "failureCount", -1339778481);
        setField(term1382, term1382.getClass(), "violations", term1384);
        setField(term1369, term1369.getClass(), "fileResults", term1382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagScanReport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uWHnvSvaPl";
        callMethod(klass, "setFilename", argTypes, term1369, args);
    }

};



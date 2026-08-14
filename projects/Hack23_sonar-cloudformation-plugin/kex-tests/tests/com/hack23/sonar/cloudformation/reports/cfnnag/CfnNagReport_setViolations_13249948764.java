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

public class CfnNagReport_setViolations_13249948764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term27;

    public CfnNagReport_setViolations_13249948764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23 = new ArrayList();
        term21 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagReport"));
        setIntField(term21, term21.getClass(), "failureCount", -1922583790);
        setField(term21, term21.getClass(), "violations", term23);
        ArrayList term67 = new ArrayList();
        ArrayList term71 = new ArrayList();
        Object term30 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagViolation"));
        setField(term30, term30.getClass(), "id", "PAEBtnZtTD");
        setField(term30, term30.getClass(), "type", "sjlJAEtRrb");
        setField(term30, term30.getClass(), "message", "MuLcgQHgqz");
        setField(term30, term30.getClass(), "logicalResourceIds", term67);
        setField(term30, term30.getClass(), "lineNumbers", term71);
        ArrayList term80 = new ArrayList();
        ArrayList term83 = new ArrayList();
        Object term76 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagViolation"));
        setField(term76, term76.getClass(), "id", "");
        setField(term76, term76.getClass(), "type", "");
        setField(term76, term76.getClass(), "message", "");
        setField(term76, term76.getClass(), "logicalResourceIds", term80);
        setField(term76, term76.getClass(), "lineNumbers", term83);
        Object term87 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagViolation"));
        setField(term87, term87.getClass(), "id", null);
        setField(term87, term87.getClass(), "type", null);
        setField(term87, term87.getClass(), "message", null);
        setField(term87, term87.getClass(), "logicalResourceIds", null);
        setField(term87, term87.getClass(), "lineNumbers", null);
        term27 = new LinkedList();
        ((LinkedList) term27).add(term30);
        ((LinkedList) term27).add(term76);
        ((LinkedList) term27).add(term87);
        ((LinkedList) term27).add((Object)null);
        ((LinkedList) term27).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.cfnnag.CfnNagReport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term27;
        callMethod(klass, "setViolations", argTypes, term21, args);
    }

};



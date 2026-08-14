package com.hack23.sonar.cloudformation.reports.checkov;

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
import static com.hack23.sonar.cloudformation.reports.checkov.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class CheckovPassedCheck_setBcCheckId_7801649774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1481;

    public CheckovPassedCheck_setBcCheckId_7801649774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1521 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term1519 = new ArrayList();
        ((ArrayList) term1519).add(term1521);
        Integer term1550 = new Integer(865208305);
        Integer term1552 = new Integer(-1275173084);
        Integer term1554 = new Integer(-244121226);
        Integer term1556 = new Integer(-203030934);
        Integer term1558 = new Integer(-1179120542);
        Integer term1560 = new Integer(-73683645);
        ArrayList term1548 = new ArrayList();
        ((ArrayList) term1548).add(term1550);
        ((ArrayList) term1548).add(term1552);
        ((ArrayList) term1548).add(term1554);
        ((ArrayList) term1548).add(term1556);
        ((ArrayList) term1548).add(term1558);
        ((ArrayList) term1548).add(term1560);
        Integer term1615 = new Integer(-226514366);
        Integer term1617 = new Integer(1193880199);
        Integer term1619 = new Integer(-1087774327);
        Integer term1621 = new Integer(-1530420153);
        Integer term1623 = new Integer(-469968304);
        ArrayList term1613 = new ArrayList();
        ((ArrayList) term1613).add(term1615);
        ((ArrayList) term1613).add(term1617);
        ((ArrayList) term1613).add(term1619);
        ((ArrayList) term1613).add(term1621);
        ((ArrayList) term1613).add(term1623);
        term1481 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term1506 = newInstance(Class.forName("java.lang.Object"));
        Object term1588 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term1639 = newInstance(Class.forName("java.lang.Object"));
        setField(term1481, term1481.getClass(), "checkId", "JDswTTCZHV");
        setField(term1481, term1481.getClass(), "checkName", "onpbIeEKoi");
        setField(term1481, term1481.getClass(), "checkResult", term1506);
        setField(term1481, term1481.getClass(), "bcCheckId", "YRHGsAkhxb");
        setField(term1481, term1481.getClass(), "codeBlock", term1519);
        setField(term1481, term1481.getClass(), "filePath", "ffYhPOzlUs");
        setField(term1481, term1481.getClass(), "repoFilePath", "MLqYREekMl");
        setField(term1481, term1481.getClass(), "fileLineRange", term1548);
        setField(term1481, term1481.getClass(), "resource", "ytSBIKXogI");
        setField(term1481, term1481.getClass(), "fileAbsPath", "nHXjMycHlU");
        setField(term1588, term1588.getClass(), "name", "ieCtQFdkii");
        setField(term1481, term1481.getClass(), "entityTags", term1588);
        setField(term1481, term1481.getClass(), "callerFilePath", "dEnhdmILtU");
        setField(term1481, term1481.getClass(), "callerFileLineRange", term1613);
        setField(term1481, term1481.getClass(), "fixedDefinition", "hoicvmsovO");
        setField(term1481, term1481.getClass(), "evaluations", term1639);
        setField(term1481, term1481.getClass(), "checkClass", "eqJfYWRaEL");
        setField(term1481, term1481.getClass(), "guideline", "fhkbdRViHi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uWHnvSvaPl";
        callMethod(klass, "setBcCheckId", argTypes, term1481, args);
    }

};



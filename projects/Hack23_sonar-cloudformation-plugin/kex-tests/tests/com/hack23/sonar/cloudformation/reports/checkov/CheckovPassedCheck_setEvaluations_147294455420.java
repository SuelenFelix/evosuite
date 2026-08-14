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

public class CheckovPassedCheck_setEvaluations_147294455420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6373;
     Object term6567;

    public CheckovPassedCheck_setEvaluations_147294455420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6413 = newInstance(Class.forName("java.lang.Object"));
        Object term6414 = newInstance(Class.forName("java.lang.Object"));
        Object term6415 = newInstance(Class.forName("java.lang.Object"));
        Object term6416 = newInstance(Class.forName("java.lang.Object"));
        Object term6417 = newInstance(Class.forName("java.lang.Object"));
        Object term6418 = newInstance(Class.forName("java.lang.Object"));
        Object term6419 = newInstance(Class.forName("java.lang.Object"));
        Object term6420 = newInstance(Class.forName("java.lang.Object"));
        Object term6421 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term6411 = new ArrayList();
        ((ArrayList) term6411).add(term6413);
        ((ArrayList) term6411).add(term6414);
        ((ArrayList) term6411).add(term6415);
        ((ArrayList) term6411).add(term6416);
        ((ArrayList) term6411).add(term6417);
        ((ArrayList) term6411).add(term6418);
        ((ArrayList) term6411).add(term6419);
        ((ArrayList) term6411).add(term6420);
        ((ArrayList) term6411).add(term6421);
        Integer term6450 = new Integer(-25637976);
        Integer term6452 = new Integer(1555897383);
        Integer term6454 = new Integer(202001407);
        Integer term6456 = new Integer(158873461);
        Integer term6458 = new Integer(-430151637);
        Integer term6460 = new Integer(-1697741339);
        Integer term6462 = new Integer(98922530);
        ArrayList term6448 = new ArrayList();
        ((ArrayList) term6448).add(term6450);
        ((ArrayList) term6448).add(term6452);
        ((ArrayList) term6448).add(term6454);
        ((ArrayList) term6448).add(term6456);
        ((ArrayList) term6448).add(term6458);
        ((ArrayList) term6448).add(term6460);
        ((ArrayList) term6448).add(term6462);
        Integer term6517 = new Integer(-1388471422);
        Integer term6519 = new Integer(-1498296052);
        Integer term6521 = new Integer(2098647989);
        Integer term6523 = new Integer(1598895173);
        Integer term6525 = new Integer(1830648570);
        Integer term6527 = new Integer(-227365013);
        ArrayList term6515 = new ArrayList();
        ((ArrayList) term6515).add(term6517);
        ((ArrayList) term6515).add(term6519);
        ((ArrayList) term6515).add(term6521);
        ((ArrayList) term6515).add(term6523);
        ((ArrayList) term6515).add(term6525);
        ((ArrayList) term6515).add(term6527);
        term6373 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term6398 = newInstance(Class.forName("java.lang.Object"));
        Object term6490 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        setField(term6373, term6373.getClass(), "checkId", "qYzsiuXOgS");
        setField(term6373, term6373.getClass(), "checkName", "bxrCBbrrct");
        setField(term6373, term6373.getClass(), "checkResult", term6398);
        setField(term6373, term6373.getClass(), "bcCheckId", "CKWpJaaaxX");
        setField(term6373, term6373.getClass(), "codeBlock", term6411);
        setField(term6373, term6373.getClass(), "filePath", "UBRmXJmfrt");
        setField(term6373, term6373.getClass(), "repoFilePath", "WZzvmIHhzZ");
        setField(term6373, term6373.getClass(), "fileLineRange", term6448);
        setField(term6373, term6373.getClass(), "resource", "doQLHkjpNm");
        setField(term6373, term6373.getClass(), "fileAbsPath", "lCyLIcSuom");
        setField(term6490, term6490.getClass(), "name", "CGOpQSZZwI");
        setField(term6373, term6373.getClass(), "entityTags", term6490);
        setField(term6373, term6373.getClass(), "callerFilePath", "ypEdrstygY");
        setField(term6373, term6373.getClass(), "callerFileLineRange", term6515);
        setField(term6373, term6373.getClass(), "fixedDefinition", "sNQFlATEeQ");
        setField(term6373, term6373.getClass(), "evaluations", term6419);
        setField(term6373, term6373.getClass(), "checkClass", "ZKMLioamsY");
        setField(term6373, term6373.getClass(), "guideline", "WVbxuoDBcn");
        term6567 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6567;
        callMethod(klass, "setEvaluations", argTypes, term6373, args);
    }

};



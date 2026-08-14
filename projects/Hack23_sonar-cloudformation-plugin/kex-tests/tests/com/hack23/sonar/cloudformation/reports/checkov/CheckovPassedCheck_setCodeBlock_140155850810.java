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
import java.util.LinkedList;

public class CheckovPassedCheck_setCodeBlock_140155850810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3325;
     Object term3506;

    public CheckovPassedCheck_setCodeBlock_140155850810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3365 = newInstance(Class.forName("java.lang.Object"));
        Object term3366 = newInstance(Class.forName("java.lang.Object"));
        Object term3367 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term3363 = new ArrayList();
        ((ArrayList) term3363).add(term3365);
        ((ArrayList) term3363).add(term3366);
        ((ArrayList) term3363).add(term3367);
        Integer term3396 = new Integer(-2027534003);
        Integer term3398 = new Integer(1063420942);
        Integer term3400 = new Integer(1375330971);
        Integer term3402 = new Integer(-478195677);
        Integer term3404 = new Integer(972867650);
        Integer term3406 = new Integer(1655935355);
        Integer term3408 = new Integer(-481533957);
        ArrayList term3394 = new ArrayList();
        ((ArrayList) term3394).add(term3396);
        ((ArrayList) term3394).add(term3398);
        ((ArrayList) term3394).add(term3400);
        ((ArrayList) term3394).add(term3402);
        ((ArrayList) term3394).add(term3404);
        ((ArrayList) term3394).add(term3406);
        ((ArrayList) term3394).add(term3408);
        Integer term3463 = new Integer(1240914516);
        Integer term3465 = new Integer(-1465035361);
        ArrayList term3461 = new ArrayList();
        ((ArrayList) term3461).add(term3463);
        ((ArrayList) term3461).add(term3465);
        term3325 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term3350 = newInstance(Class.forName("java.lang.Object"));
        Object term3436 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term3481 = newInstance(Class.forName("java.lang.Object"));
        setField(term3325, term3325.getClass(), "checkId", "mLUZFTfjle");
        setField(term3325, term3325.getClass(), "checkName", "xIeFjkHkOe");
        setField(term3325, term3325.getClass(), "checkResult", term3350);
        setField(term3325, term3325.getClass(), "bcCheckId", "SdCKLMIYnX");
        setField(term3325, term3325.getClass(), "codeBlock", term3363);
        setField(term3325, term3325.getClass(), "filePath", "OJJtVNPyKZ");
        setField(term3325, term3325.getClass(), "repoFilePath", "AKNapTAfmD");
        setField(term3325, term3325.getClass(), "fileLineRange", term3394);
        setField(term3325, term3325.getClass(), "resource", "xJgPlLxpgC");
        setField(term3325, term3325.getClass(), "fileAbsPath", "EYtfuJaxiM");
        setField(term3436, term3436.getClass(), "name", "gCWtLVKVVe");
        setField(term3325, term3325.getClass(), "entityTags", term3436);
        setField(term3325, term3325.getClass(), "callerFilePath", "fWKJoSoCwE");
        setField(term3325, term3325.getClass(), "callerFileLineRange", term3461);
        setField(term3325, term3325.getClass(), "fixedDefinition", "wfaXBpWAUH");
        setField(term3325, term3325.getClass(), "evaluations", term3481);
        setField(term3325, term3325.getClass(), "checkClass", "VMeAzAHwZj");
        setField(term3325, term3325.getClass(), "guideline", "PznxWXsZME");
        Object term3509 = newInstance(Class.forName("java.lang.Object"));
        Object term3511 = newInstance(Class.forName("java.lang.Object"));
        term3506 = new LinkedList();
        ((LinkedList) term3506).add(term3509);
        ((LinkedList) term3506).add(term3511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3506;
        callMethod(klass, "setCodeBlock", argTypes, term3325, args);
    }

};



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

public class CheckovPassedCheck_getCheckResult_4073553287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2408;

    public CheckovPassedCheck_getCheckResult_4073553287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2448 = newInstance(Class.forName("java.lang.Object"));
        Object term2449 = newInstance(Class.forName("java.lang.Object"));
        Object term2450 = newInstance(Class.forName("java.lang.Object"));
        Object term2451 = newInstance(Class.forName("java.lang.Object"));
        Object term2452 = newInstance(Class.forName("java.lang.Object"));
        Object term2453 = newInstance(Class.forName("java.lang.Object"));
        Object term2454 = newInstance(Class.forName("java.lang.Object"));
        Object term2455 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term2446 = new ArrayList();
        ((ArrayList) term2446).add(term2448);
        ((ArrayList) term2446).add(term2449);
        ((ArrayList) term2446).add(term2450);
        ((ArrayList) term2446).add(term2451);
        ((ArrayList) term2446).add(term2452);
        ((ArrayList) term2446).add(term2453);
        ((ArrayList) term2446).add(term2454);
        ((ArrayList) term2446).add(term2455);
        Integer term2484 = new Integer(-817164822);
        Integer term2486 = new Integer(-1016503459);
        Integer term2488 = new Integer(-1968847291);
        Integer term2490 = new Integer(579005622);
        Integer term2492 = new Integer(-14890619);
        Integer term2494 = new Integer(1632125673);
        ArrayList term2482 = new ArrayList();
        ((ArrayList) term2482).add(term2484);
        ((ArrayList) term2482).add(term2486);
        ((ArrayList) term2482).add(term2488);
        ((ArrayList) term2482).add(term2490);
        ((ArrayList) term2482).add(term2492);
        ((ArrayList) term2482).add(term2494);
        Integer term2549 = new Integer(454281060);
        Integer term2551 = new Integer(-1786399638);
        ArrayList term2547 = new ArrayList();
        ((ArrayList) term2547).add(term2549);
        ((ArrayList) term2547).add(term2551);
        term2408 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term2433 = newInstance(Class.forName("java.lang.Object"));
        Object term2522 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term2567 = newInstance(Class.forName("java.lang.Object"));
        setField(term2408, term2408.getClass(), "checkId", "xOcJIiQQDu");
        setField(term2408, term2408.getClass(), "checkName", "GVizqqzXpy");
        setField(term2408, term2408.getClass(), "checkResult", term2433);
        setField(term2408, term2408.getClass(), "bcCheckId", "JqXGgAhZPl");
        setField(term2408, term2408.getClass(), "codeBlock", term2446);
        setField(term2408, term2408.getClass(), "filePath", "jiKYgYHqIS");
        setField(term2408, term2408.getClass(), "repoFilePath", "DfISiziTgG");
        setField(term2408, term2408.getClass(), "fileLineRange", term2482);
        setField(term2408, term2408.getClass(), "resource", "XqgfKFvPSD");
        setField(term2408, term2408.getClass(), "fileAbsPath", "JiVRgTZvKc");
        setField(term2522, term2522.getClass(), "name", "XPKmummaqg");
        setField(term2408, term2408.getClass(), "entityTags", term2522);
        setField(term2408, term2408.getClass(), "callerFilePath", "BKLfkLiZTH");
        setField(term2408, term2408.getClass(), "callerFileLineRange", term2547);
        setField(term2408, term2408.getClass(), "fixedDefinition", "SPpkrGcPRr");
        setField(term2408, term2408.getClass(), "evaluations", term2567);
        setField(term2408, term2408.getClass(), "checkClass", "sEccwbJKYE");
        setField(term2408, term2408.getClass(), "guideline", "AWRooQKkdW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCheckResult", argTypes, term2408, args);
    }

};



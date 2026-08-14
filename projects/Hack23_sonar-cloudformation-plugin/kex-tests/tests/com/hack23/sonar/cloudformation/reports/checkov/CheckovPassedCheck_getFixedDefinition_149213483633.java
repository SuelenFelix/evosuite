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

public class CheckovPassedCheck_getFixedDefinition_149213483633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10447;

    public CheckovPassedCheck_getFixedDefinition_149213483633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10487 = newInstance(Class.forName("java.lang.Object"));
        Object term10488 = newInstance(Class.forName("java.lang.Object"));
        Object term10489 = newInstance(Class.forName("java.lang.Object"));
        Object term10490 = newInstance(Class.forName("java.lang.Object"));
        Object term10491 = newInstance(Class.forName("java.lang.Object"));
        Object term10492 = newInstance(Class.forName("java.lang.Object"));
        Object term10493 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term10485 = new ArrayList();
        ((ArrayList) term10485).add(term10487);
        ((ArrayList) term10485).add(term10488);
        ((ArrayList) term10485).add(term10489);
        ((ArrayList) term10485).add(term10490);
        ((ArrayList) term10485).add(term10491);
        ((ArrayList) term10485).add(term10492);
        ((ArrayList) term10485).add(term10493);
        Integer term10522 = new Integer(1050765721);
        Integer term10524 = new Integer(474518942);
        Integer term10526 = new Integer(-1656687479);
        Integer term10528 = new Integer(-249614216);
        ArrayList term10520 = new ArrayList();
        ((ArrayList) term10520).add(term10522);
        ((ArrayList) term10520).add(term10524);
        ((ArrayList) term10520).add(term10526);
        ((ArrayList) term10520).add(term10528);
        Integer term10583 = new Integer(1870727665);
        Integer term10585 = new Integer(-519881101);
        ArrayList term10581 = new ArrayList();
        ((ArrayList) term10581).add(term10583);
        ((ArrayList) term10581).add(term10585);
        term10447 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term10472 = newInstance(Class.forName("java.lang.Object"));
        Object term10556 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term10601 = newInstance(Class.forName("java.lang.Object"));
        setField(term10447, term10447.getClass(), "checkId", "yeSXGqQExb");
        setField(term10447, term10447.getClass(), "checkName", "uXYcXVYJZM");
        setField(term10447, term10447.getClass(), "checkResult", term10472);
        setField(term10447, term10447.getClass(), "bcCheckId", "BJhjdJUhkz");
        setField(term10447, term10447.getClass(), "codeBlock", term10485);
        setField(term10447, term10447.getClass(), "filePath", "cdHYQDgUZR");
        setField(term10447, term10447.getClass(), "repoFilePath", "KAORSSPSeV");
        setField(term10447, term10447.getClass(), "fileLineRange", term10520);
        setField(term10447, term10447.getClass(), "resource", "UimMMORkzd");
        setField(term10447, term10447.getClass(), "fileAbsPath", "huVIXUWLtI");
        setField(term10556, term10556.getClass(), "name", "vhKzFyKPOT");
        setField(term10447, term10447.getClass(), "entityTags", term10556);
        setField(term10447, term10447.getClass(), "callerFilePath", "nQhIgWXdRc");
        setField(term10447, term10447.getClass(), "callerFileLineRange", term10581);
        setField(term10447, term10447.getClass(), "fixedDefinition", "EusenEbIoF");
        setField(term10447, term10447.getClass(), "evaluations", term10601);
        setField(term10447, term10447.getClass(), "checkClass", "SScVQYSvWH");
        setField(term10447, term10447.getClass(), "guideline", "MnovcqFhCl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFixedDefinition", argTypes, term10447, args);
    }

};



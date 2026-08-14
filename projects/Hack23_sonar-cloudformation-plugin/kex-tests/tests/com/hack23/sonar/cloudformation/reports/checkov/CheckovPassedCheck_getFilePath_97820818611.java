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

public class CheckovPassedCheck_getFilePath_97820818611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3633;

    public CheckovPassedCheck_getFilePath_97820818611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3673 = newInstance(Class.forName("java.lang.Object"));
        Object term3674 = newInstance(Class.forName("java.lang.Object"));
        Object term3675 = newInstance(Class.forName("java.lang.Object"));
        Object term3676 = newInstance(Class.forName("java.lang.Object"));
        Object term3677 = newInstance(Class.forName("java.lang.Object"));
        Object term3678 = newInstance(Class.forName("java.lang.Object"));
        Object term3679 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term3671 = new ArrayList();
        ((ArrayList) term3671).add(term3673);
        ((ArrayList) term3671).add(term3674);
        ((ArrayList) term3671).add(term3675);
        ((ArrayList) term3671).add(term3676);
        ((ArrayList) term3671).add(term3677);
        ((ArrayList) term3671).add(term3678);
        ((ArrayList) term3671).add(term3679);
        Integer term3708 = new Integer(1090617576);
        ArrayList term3706 = new ArrayList();
        ((ArrayList) term3706).add(term3708);
        Integer term3763 = new Integer(-1547384488);
        Integer term3765 = new Integer(1442160736);
        Integer term3767 = new Integer(1114000454);
        Integer term3769 = new Integer(-556405712);
        Integer term3771 = new Integer(-1772434990);
        Integer term3773 = new Integer(-1845499264);
        Integer term3775 = new Integer(-505439934);
        Integer term3777 = new Integer(-344842608);
        ArrayList term3761 = new ArrayList();
        ((ArrayList) term3761).add(term3763);
        ((ArrayList) term3761).add(term3765);
        ((ArrayList) term3761).add(term3767);
        ((ArrayList) term3761).add(term3769);
        ((ArrayList) term3761).add(term3771);
        ((ArrayList) term3761).add(term3773);
        ((ArrayList) term3761).add(term3775);
        ((ArrayList) term3761).add(term3777);
        term3633 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        Object term3658 = newInstance(Class.forName("java.lang.Object"));
        Object term3736 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags"));
        Object term3793 = newInstance(Class.forName("java.lang.Object"));
        setField(term3633, term3633.getClass(), "checkId", "ZzIujlwVsw");
        setField(term3633, term3633.getClass(), "checkName", "LWyEaeIyAo");
        setField(term3633, term3633.getClass(), "checkResult", term3658);
        setField(term3633, term3633.getClass(), "bcCheckId", "yVMkkQhvmN");
        setField(term3633, term3633.getClass(), "codeBlock", term3671);
        setField(term3633, term3633.getClass(), "filePath", "mvrkADEgpp");
        setField(term3633, term3633.getClass(), "repoFilePath", "pXOkjyeIRb");
        setField(term3633, term3633.getClass(), "fileLineRange", term3706);
        setField(term3633, term3633.getClass(), "resource", "GgZWSjxjyE");
        setField(term3633, term3633.getClass(), "fileAbsPath", "EeBVbzjcCI");
        setField(term3736, term3736.getClass(), "name", "UfQtPRyWRC");
        setField(term3633, term3633.getClass(), "entityTags", term3736);
        setField(term3633, term3633.getClass(), "callerFilePath", "FPvxVzzSvD");
        setField(term3633, term3633.getClass(), "callerFileLineRange", term3761);
        setField(term3633, term3633.getClass(), "fixedDefinition", "WHcwFgsGFC");
        setField(term3633, term3633.getClass(), "evaluations", term3793);
        setField(term3633, term3633.getClass(), "checkClass", "HzqpegHiRq");
        setField(term3633, term3633.getClass(), "guideline", "jwsfVjMoJT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilePath", argTypes, term3633, args);
    }

};



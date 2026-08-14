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

public class CheckovPassedCheck_setEvaluations_147294455458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11996;

    public CheckovPassedCheck_setEvaluations_147294455458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11996 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        setField(term11996, term11996.getClass(), "checkId", null);
        setField(term11996, term11996.getClass(), "checkName", null);
        setField(term11996, term11996.getClass(), "checkResult", null);
        setField(term11996, term11996.getClass(), "bcCheckId", null);
        setField(term11996, term11996.getClass(), "codeBlock", null);
        setField(term11996, term11996.getClass(), "filePath", null);
        setField(term11996, term11996.getClass(), "repoFilePath", null);
        setField(term11996, term11996.getClass(), "fileLineRange", null);
        setField(term11996, term11996.getClass(), "resource", null);
        setField(term11996, term11996.getClass(), "fileAbsPath", null);
        setField(term11996, term11996.getClass(), "entityTags", null);
        setField(term11996, term11996.getClass(), "callerFilePath", null);
        setField(term11996, term11996.getClass(), "callerFileLineRange", null);
        setField(term11996, term11996.getClass(), "fixedDefinition", null);
        setField(term11996, term11996.getClass(), "evaluations", null);
        setField(term11996, term11996.getClass(), "checkClass", null);
        setField(term11996, term11996.getClass(), "guideline", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEvaluations", argTypes, term11996, args);
    }

};



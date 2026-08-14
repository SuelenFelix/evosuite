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

public class CheckovPassedCheck_getBcCheckId_94292241741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11979;

    public CheckovPassedCheck_getBcCheckId_94292241741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11979 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        setField(term11979, term11979.getClass(), "checkId", null);
        setField(term11979, term11979.getClass(), "checkName", null);
        setField(term11979, term11979.getClass(), "checkResult", null);
        setField(term11979, term11979.getClass(), "bcCheckId", null);
        setField(term11979, term11979.getClass(), "codeBlock", null);
        setField(term11979, term11979.getClass(), "filePath", null);
        setField(term11979, term11979.getClass(), "repoFilePath", null);
        setField(term11979, term11979.getClass(), "fileLineRange", null);
        setField(term11979, term11979.getClass(), "resource", null);
        setField(term11979, term11979.getClass(), "fileAbsPath", null);
        setField(term11979, term11979.getClass(), "entityTags", null);
        setField(term11979, term11979.getClass(), "callerFilePath", null);
        setField(term11979, term11979.getClass(), "callerFileLineRange", null);
        setField(term11979, term11979.getClass(), "fixedDefinition", null);
        setField(term11979, term11979.getClass(), "evaluations", null);
        setField(term11979, term11979.getClass(), "checkClass", null);
        setField(term11979, term11979.getClass(), "guideline", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBcCheckId", argTypes, term11979, args);
    }

};



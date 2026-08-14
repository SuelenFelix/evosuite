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

public class CheckovPassedCheck_setResource_64289603156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11994;

    public CheckovPassedCheck_setResource_64289603156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11994 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        setField(term11994, term11994.getClass(), "checkId", null);
        setField(term11994, term11994.getClass(), "checkName", null);
        setField(term11994, term11994.getClass(), "checkResult", null);
        setField(term11994, term11994.getClass(), "bcCheckId", null);
        setField(term11994, term11994.getClass(), "codeBlock", null);
        setField(term11994, term11994.getClass(), "filePath", null);
        setField(term11994, term11994.getClass(), "repoFilePath", null);
        setField(term11994, term11994.getClass(), "fileLineRange", null);
        setField(term11994, term11994.getClass(), "resource", null);
        setField(term11994, term11994.getClass(), "fileAbsPath", null);
        setField(term11994, term11994.getClass(), "entityTags", null);
        setField(term11994, term11994.getClass(), "callerFilePath", null);
        setField(term11994, term11994.getClass(), "callerFileLineRange", null);
        setField(term11994, term11994.getClass(), "fixedDefinition", null);
        setField(term11994, term11994.getClass(), "evaluations", null);
        setField(term11994, term11994.getClass(), "checkClass", null);
        setField(term11994, term11994.getClass(), "guideline", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setResource", argTypes, term11994, args);
    }

};



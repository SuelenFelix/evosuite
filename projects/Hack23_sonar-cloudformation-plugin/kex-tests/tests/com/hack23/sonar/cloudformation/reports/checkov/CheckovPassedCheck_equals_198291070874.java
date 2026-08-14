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

public class CheckovPassedCheck_equals_198291070874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12012;

    public CheckovPassedCheck_equals_198291070874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12012 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        setField(term12012, term12012.getClass(), "checkId", null);
        setField(term12012, term12012.getClass(), "checkName", null);
        setField(term12012, term12012.getClass(), "checkResult", null);
        setField(term12012, term12012.getClass(), "bcCheckId", null);
        setField(term12012, term12012.getClass(), "codeBlock", null);
        setField(term12012, term12012.getClass(), "filePath", null);
        setField(term12012, term12012.getClass(), "repoFilePath", null);
        setField(term12012, term12012.getClass(), "fileLineRange", null);
        setField(term12012, term12012.getClass(), "resource", null);
        setField(term12012, term12012.getClass(), "fileAbsPath", null);
        setField(term12012, term12012.getClass(), "entityTags", null);
        setField(term12012, term12012.getClass(), "callerFilePath", null);
        setField(term12012, term12012.getClass(), "callerFileLineRange", null);
        setField(term12012, term12012.getClass(), "fixedDefinition", null);
        setField(term12012, term12012.getClass(), "evaluations", null);
        setField(term12012, term12012.getClass(), "checkClass", null);
        setField(term12012, term12012.getClass(), "guideline", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term12012, args);
    }

};



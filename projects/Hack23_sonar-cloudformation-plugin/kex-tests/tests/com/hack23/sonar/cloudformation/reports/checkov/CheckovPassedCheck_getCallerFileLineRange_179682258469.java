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

public class CheckovPassedCheck_getCallerFileLineRange_179682258469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12007;

    public CheckovPassedCheck_getCallerFileLineRange_179682258469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12007 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        setField(term12007, term12007.getClass(), "checkId", null);
        setField(term12007, term12007.getClass(), "checkName", null);
        setField(term12007, term12007.getClass(), "checkResult", null);
        setField(term12007, term12007.getClass(), "bcCheckId", null);
        setField(term12007, term12007.getClass(), "codeBlock", null);
        setField(term12007, term12007.getClass(), "filePath", null);
        setField(term12007, term12007.getClass(), "repoFilePath", null);
        setField(term12007, term12007.getClass(), "fileLineRange", null);
        setField(term12007, term12007.getClass(), "resource", null);
        setField(term12007, term12007.getClass(), "fileAbsPath", null);
        setField(term12007, term12007.getClass(), "entityTags", null);
        setField(term12007, term12007.getClass(), "callerFilePath", null);
        setField(term12007, term12007.getClass(), "callerFileLineRange", null);
        setField(term12007, term12007.getClass(), "fixedDefinition", null);
        setField(term12007, term12007.getClass(), "evaluations", null);
        setField(term12007, term12007.getClass(), "checkClass", null);
        setField(term12007, term12007.getClass(), "guideline", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCallerFileLineRange", argTypes, term12007, args);
    }

};



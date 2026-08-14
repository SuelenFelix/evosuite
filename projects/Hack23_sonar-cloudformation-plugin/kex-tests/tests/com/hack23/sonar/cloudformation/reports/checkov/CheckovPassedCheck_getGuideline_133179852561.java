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

public class CheckovPassedCheck_getGuideline_133179852561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11999;

    public CheckovPassedCheck_getGuideline_133179852561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11999 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        setField(term11999, term11999.getClass(), "checkId", null);
        setField(term11999, term11999.getClass(), "checkName", null);
        setField(term11999, term11999.getClass(), "checkResult", null);
        setField(term11999, term11999.getClass(), "bcCheckId", null);
        setField(term11999, term11999.getClass(), "codeBlock", null);
        setField(term11999, term11999.getClass(), "filePath", null);
        setField(term11999, term11999.getClass(), "repoFilePath", null);
        setField(term11999, term11999.getClass(), "fileLineRange", null);
        setField(term11999, term11999.getClass(), "resource", null);
        setField(term11999, term11999.getClass(), "fileAbsPath", null);
        setField(term11999, term11999.getClass(), "entityTags", null);
        setField(term11999, term11999.getClass(), "callerFilePath", null);
        setField(term11999, term11999.getClass(), "callerFileLineRange", null);
        setField(term11999, term11999.getClass(), "fixedDefinition", null);
        setField(term11999, term11999.getClass(), "evaluations", null);
        setField(term11999, term11999.getClass(), "checkClass", null);
        setField(term11999, term11999.getClass(), "guideline", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGuideline", argTypes, term11999, args);
    }

};



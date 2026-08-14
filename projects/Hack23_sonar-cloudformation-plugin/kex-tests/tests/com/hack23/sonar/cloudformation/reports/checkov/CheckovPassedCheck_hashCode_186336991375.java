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

public class CheckovPassedCheck_hashCode_186336991375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12013;

    public CheckovPassedCheck_hashCode_186336991375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12013 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        setField(term12013, term12013.getClass(), "checkId", null);
        setField(term12013, term12013.getClass(), "checkName", null);
        setField(term12013, term12013.getClass(), "checkResult", null);
        setField(term12013, term12013.getClass(), "bcCheckId", null);
        setField(term12013, term12013.getClass(), "codeBlock", null);
        setField(term12013, term12013.getClass(), "filePath", null);
        setField(term12013, term12013.getClass(), "repoFilePath", null);
        setField(term12013, term12013.getClass(), "fileLineRange", null);
        setField(term12013, term12013.getClass(), "resource", null);
        setField(term12013, term12013.getClass(), "fileAbsPath", null);
        setField(term12013, term12013.getClass(), "entityTags", null);
        setField(term12013, term12013.getClass(), "callerFilePath", null);
        setField(term12013, term12013.getClass(), "callerFileLineRange", null);
        setField(term12013, term12013.getClass(), "fixedDefinition", null);
        setField(term12013, term12013.getClass(), "evaluations", null);
        setField(term12013, term12013.getClass(), "checkClass", null);
        setField(term12013, term12013.getClass(), "guideline", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12013, args);
    }

};



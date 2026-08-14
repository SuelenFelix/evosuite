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

public class CheckovPassedCheck_getFileAbsPath_106044968863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12001;

    public CheckovPassedCheck_getFileAbsPath_106044968863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12001 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        setField(term12001, term12001.getClass(), "checkId", null);
        setField(term12001, term12001.getClass(), "checkName", null);
        setField(term12001, term12001.getClass(), "checkResult", null);
        setField(term12001, term12001.getClass(), "bcCheckId", null);
        setField(term12001, term12001.getClass(), "codeBlock", null);
        setField(term12001, term12001.getClass(), "filePath", null);
        setField(term12001, term12001.getClass(), "repoFilePath", null);
        setField(term12001, term12001.getClass(), "fileLineRange", null);
        setField(term12001, term12001.getClass(), "resource", null);
        setField(term12001, term12001.getClass(), "fileAbsPath", null);
        setField(term12001, term12001.getClass(), "entityTags", null);
        setField(term12001, term12001.getClass(), "callerFilePath", null);
        setField(term12001, term12001.getClass(), "callerFileLineRange", null);
        setField(term12001, term12001.getClass(), "fixedDefinition", null);
        setField(term12001, term12001.getClass(), "evaluations", null);
        setField(term12001, term12001.getClass(), "checkClass", null);
        setField(term12001, term12001.getClass(), "guideline", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileAbsPath", argTypes, term12001, args);
    }

};



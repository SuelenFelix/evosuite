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

public class CheckovPassedCheck_setCodeBlock_140155850848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11986;

    public CheckovPassedCheck_setCodeBlock_140155850848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11986 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        setField(term11986, term11986.getClass(), "checkId", null);
        setField(term11986, term11986.getClass(), "checkName", null);
        setField(term11986, term11986.getClass(), "checkResult", null);
        setField(term11986, term11986.getClass(), "bcCheckId", null);
        setField(term11986, term11986.getClass(), "codeBlock", null);
        setField(term11986, term11986.getClass(), "filePath", null);
        setField(term11986, term11986.getClass(), "repoFilePath", null);
        setField(term11986, term11986.getClass(), "fileLineRange", null);
        setField(term11986, term11986.getClass(), "resource", null);
        setField(term11986, term11986.getClass(), "fileAbsPath", null);
        setField(term11986, term11986.getClass(), "entityTags", null);
        setField(term11986, term11986.getClass(), "callerFilePath", null);
        setField(term11986, term11986.getClass(), "callerFileLineRange", null);
        setField(term11986, term11986.getClass(), "fixedDefinition", null);
        setField(term11986, term11986.getClass(), "evaluations", null);
        setField(term11986, term11986.getClass(), "checkClass", null);
        setField(term11986, term11986.getClass(), "guideline", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCodeBlock", argTypes, term11986, args);
    }

};



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

public class CheckovPassedCheck_getEntityTags_73649021265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12003;

    public CheckovPassedCheck_getEntityTags_73649021265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12003 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        setField(term12003, term12003.getClass(), "checkId", null);
        setField(term12003, term12003.getClass(), "checkName", null);
        setField(term12003, term12003.getClass(), "checkResult", null);
        setField(term12003, term12003.getClass(), "bcCheckId", null);
        setField(term12003, term12003.getClass(), "codeBlock", null);
        setField(term12003, term12003.getClass(), "filePath", null);
        setField(term12003, term12003.getClass(), "repoFilePath", null);
        setField(term12003, term12003.getClass(), "fileLineRange", null);
        setField(term12003, term12003.getClass(), "resource", null);
        setField(term12003, term12003.getClass(), "fileAbsPath", null);
        setField(term12003, term12003.getClass(), "entityTags", null);
        setField(term12003, term12003.getClass(), "callerFilePath", null);
        setField(term12003, term12003.getClass(), "callerFileLineRange", null);
        setField(term12003, term12003.getClass(), "fixedDefinition", null);
        setField(term12003, term12003.getClass(), "evaluations", null);
        setField(term12003, term12003.getClass(), "checkClass", null);
        setField(term12003, term12003.getClass(), "guideline", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEntityTags", argTypes, term12003, args);
    }

};



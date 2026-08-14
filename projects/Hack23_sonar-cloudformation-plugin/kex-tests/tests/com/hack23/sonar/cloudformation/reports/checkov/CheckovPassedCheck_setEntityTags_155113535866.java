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

public class CheckovPassedCheck_setEntityTags_155113535866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12004;

    public CheckovPassedCheck_setEntityTags_155113535866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12004 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        setField(term12004, term12004.getClass(), "checkId", null);
        setField(term12004, term12004.getClass(), "checkName", null);
        setField(term12004, term12004.getClass(), "checkResult", null);
        setField(term12004, term12004.getClass(), "bcCheckId", null);
        setField(term12004, term12004.getClass(), "codeBlock", null);
        setField(term12004, term12004.getClass(), "filePath", null);
        setField(term12004, term12004.getClass(), "repoFilePath", null);
        setField(term12004, term12004.getClass(), "fileLineRange", null);
        setField(term12004, term12004.getClass(), "resource", null);
        setField(term12004, term12004.getClass(), "fileAbsPath", null);
        setField(term12004, term12004.getClass(), "entityTags", null);
        setField(term12004, term12004.getClass(), "callerFilePath", null);
        setField(term12004, term12004.getClass(), "callerFileLineRange", null);
        setField(term12004, term12004.getClass(), "fixedDefinition", null);
        setField(term12004, term12004.getClass(), "evaluations", null);
        setField(term12004, term12004.getClass(), "checkClass", null);
        setField(term12004, term12004.getClass(), "guideline", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.EntityTags");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEntityTags", argTypes, term12004, args);
    }

};



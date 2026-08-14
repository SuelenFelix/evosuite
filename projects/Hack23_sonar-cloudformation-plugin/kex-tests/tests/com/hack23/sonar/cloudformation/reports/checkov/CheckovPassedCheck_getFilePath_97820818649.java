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

public class CheckovPassedCheck_getFilePath_97820818649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11987;

    public CheckovPassedCheck_getFilePath_97820818649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11987 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck"));
        setField(term11987, term11987.getClass(), "checkId", null);
        setField(term11987, term11987.getClass(), "checkName", null);
        setField(term11987, term11987.getClass(), "checkResult", null);
        setField(term11987, term11987.getClass(), "bcCheckId", null);
        setField(term11987, term11987.getClass(), "codeBlock", null);
        setField(term11987, term11987.getClass(), "filePath", null);
        setField(term11987, term11987.getClass(), "repoFilePath", null);
        setField(term11987, term11987.getClass(), "fileLineRange", null);
        setField(term11987, term11987.getClass(), "resource", null);
        setField(term11987, term11987.getClass(), "fileAbsPath", null);
        setField(term11987, term11987.getClass(), "entityTags", null);
        setField(term11987, term11987.getClass(), "callerFilePath", null);
        setField(term11987, term11987.getClass(), "callerFileLineRange", null);
        setField(term11987, term11987.getClass(), "fixedDefinition", null);
        setField(term11987, term11987.getClass(), "evaluations", null);
        setField(term11987, term11987.getClass(), "checkClass", null);
        setField(term11987, term11987.getClass(), "guideline", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovPassedCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilePath", argTypes, term11987, args);
    }

};



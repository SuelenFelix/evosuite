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

public class CheckovResults_getPassedChecks_147972321713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17830;

    public CheckovResults_getPassedChecks_147972321713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17830 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovResults"));
        setField(term17830, term17830.getClass(), "passedChecks", null);
        setField(term17830, term17830.getClass(), "failedChecks", null);
        setField(term17830, term17830.getClass(), "skippedChecks", null);
        setField(term17830, term17830.getClass(), "parsingErrors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovResults");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassedChecks", argTypes, term17830, args);
    }

};



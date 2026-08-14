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

public class CheckovSummary_getParsingErrors_124729837923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496;

    public CheckovSummary_getParsingErrors_124729837923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term496 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovSummary"));
        setIntField(term496, term496.getClass(), "passed", 0);
        setIntField(term496, term496.getClass(), "failed", 0);
        setIntField(term496, term496.getClass(), "skipped", 0);
        setIntField(term496, term496.getClass(), "resourceCount", 0);
        setIntField(term496, term496.getClass(), "parsingErrors", 0);
        setField(term496, term496.getClass(), "checkovVersion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovSummary");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParsingErrors", argTypes, term496, args);
    }

};



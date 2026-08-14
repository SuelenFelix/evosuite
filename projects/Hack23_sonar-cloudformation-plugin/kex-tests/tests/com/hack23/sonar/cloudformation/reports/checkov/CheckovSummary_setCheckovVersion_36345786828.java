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

public class CheckovSummary_setCheckovVersion_36345786828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530;

    public CheckovSummary_setCheckovVersion_36345786828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovSummary"));
        setIntField(term530, term530.getClass(), "passed", 0);
        setIntField(term530, term530.getClass(), "failed", 0);
        setIntField(term530, term530.getClass(), "skipped", 0);
        setIntField(term530, term530.getClass(), "resourceCount", 0);
        setIntField(term530, term530.getClass(), "parsingErrors", 0);
        setField(term530, term530.getClass(), "checkovVersion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovSummary");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCheckovVersion", argTypes, term530, args);
    }

};



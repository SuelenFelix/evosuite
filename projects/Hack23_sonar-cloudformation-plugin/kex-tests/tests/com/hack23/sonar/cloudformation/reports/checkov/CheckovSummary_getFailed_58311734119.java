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

public class CheckovSummary_getFailed_58311734119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term468;

    public CheckovSummary_getFailed_58311734119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term468 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovSummary"));
        setIntField(term468, term468.getClass(), "passed", 0);
        setIntField(term468, term468.getClass(), "failed", 0);
        setIntField(term468, term468.getClass(), "skipped", 0);
        setIntField(term468, term468.getClass(), "resourceCount", 0);
        setIntField(term468, term468.getClass(), "parsingErrors", 0);
        setField(term468, term468.getClass(), "checkovVersion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovSummary");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFailed", argTypes, term468, args);
    }

};



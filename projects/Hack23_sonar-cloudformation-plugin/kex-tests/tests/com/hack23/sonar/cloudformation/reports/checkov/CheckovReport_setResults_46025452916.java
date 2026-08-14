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

public class CheckovReport_setResults_46025452916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13201;

    public CheckovReport_setResults_46025452916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13201 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovReport"));
        setField(term13201, term13201.getClass(), "checkType", null);
        setField(term13201, term13201.getClass(), "summary", null);
        setField(term13201, term13201.getClass(), "results", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovReport");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovResults");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setResults", argTypes, term13201, args);
    }

};



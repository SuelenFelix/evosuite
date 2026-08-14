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

public class CheckovResults_getParsingErrors_3942534719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17836;

    public CheckovResults_getParsingErrors_3942534719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17836 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovResults"));
        setField(term17836, term17836.getClass(), "passedChecks", null);
        setField(term17836, term17836.getClass(), "failedChecks", null);
        setField(term17836, term17836.getClass(), "skippedChecks", null);
        setField(term17836, term17836.getClass(), "parsingErrors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovResults");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParsingErrors", argTypes, term17836, args);
    }

};



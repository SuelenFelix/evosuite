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
import java.lang.Integer;

public class CheckovSummary_setParsingErrors_3236374738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203;
     Object term221;

    public CheckovSummary_setParsingErrors_3236374738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203 = newInstance(Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovSummary"));
        setIntField(term203, term203.getClass(), "passed", -1145578966);
        setIntField(term203, term203.getClass(), "failed", 679763016);
        setIntField(term203, term203.getClass(), "skipped", 1962444399);
        setIntField(term203, term203.getClass(), "resourceCount", 767834723);
        setIntField(term203, term203.getClass(), "parsingErrors", -602026508);
        setField(term203, term203.getClass(), "checkovVersion", "MjGYSRKTNF");
        term221 = new Integer(-157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hack23.sonar.cloudformation.reports.checkov.CheckovSummary");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term221;
        callMethod(klass, "setParsingErrors", argTypes, term203, args);
    }

};



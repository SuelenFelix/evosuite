package org.schambon.loadsimrunner.report;

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
import static org.schambon.loadsimrunner.report.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Reporter_reportInit_9677472839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257;

    public Reporter_reportInit_9677472839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257 = newInstance(Class.forName("org.schambon.loadsimrunner.report.Reporter"));
        setField(term257, term257.getClass(), "stats", null);
        setLongField(term257, term257.getClass(), "startTime", 0L);
        setField(term257, term257.getClass(), "reports", null);
        setField(term257, term257.getClass(), "percentiles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.report.Reporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "reportInit", argTypes, term257, args);
    }

};



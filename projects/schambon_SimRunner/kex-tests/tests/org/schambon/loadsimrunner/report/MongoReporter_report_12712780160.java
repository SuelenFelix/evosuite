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

public class MongoReporter_report_12712780160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public MongoReporter_report_12712780160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.report.MongoReporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.schambon.loadsimrunner.report.Report");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "report", argTypes, null, args);
    }

};



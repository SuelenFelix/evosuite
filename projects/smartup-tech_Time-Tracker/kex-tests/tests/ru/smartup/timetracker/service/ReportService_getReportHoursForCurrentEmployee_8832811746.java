package ru.smartup.timetracker.service;

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
import static ru.smartup.timetracker.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ReportService_getReportHoursForCurrentEmployee_8832811746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24321;
     Object term24322;

    public ReportService_getReportHoursForCurrentEmployee_8832811746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24321 = newInstance(Class.forName("ru.smartup.timetracker.service.ReportService"));
        setField(term24321, term24321.getClass(), "reportRepository", null);
        term24322 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.ReportService");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.sql.Date");
        argTypes[2] = Class.forName("java.sql.Date");
        Object[] args = new Object[3];
        args[0] = term24322;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "getReportHoursForCurrentEmployee", argTypes, term24321, args);
    }

};



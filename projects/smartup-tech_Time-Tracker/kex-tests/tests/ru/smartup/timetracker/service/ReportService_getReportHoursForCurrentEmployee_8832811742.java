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

public class ReportService_getReportHoursForCurrentEmployee_8832811742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24312;
     Object term24313;
     Object term24315;
     Object term24317;

    public ReportService_getReportHoursForCurrentEmployee_8832811742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24312 = newInstance(Class.forName("ru.smartup.timetracker.service.ReportService"));
        setField(term24312, term24312.getClass(), "reportRepository", null);
        term24313 = new Integer(768407648);
        term24315 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term24315, term24315.getClass(), "fastTime", 1645834034896L);
        setField(term24315, term24315.getClass(), "cdate", null);
        term24317 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term24317, term24317.getClass(), "fastTime", 1500721068023L);
        setField(term24317, term24317.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.ReportService");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.sql.Date");
        argTypes[2] = Class.forName("java.sql.Date");
        Object[] args = new Object[3];
        args[0] = term24313;
        args[1] = term24315;
        args[2] = term24317;
        callMethod(klass, "getReportHoursForCurrentEmployee", argTypes, term24312, args);
    }

};



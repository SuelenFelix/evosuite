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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ReportService_getReportHoursForEmployees_11619303181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24440;
     Object term24441;
     Object term24447;
     Object term24449;

    public ReportService_getReportHoursForEmployees_11619303181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24440 = newInstance(Class.forName("ru.smartup.timetracker.service.ReportService"));
        setField(term24440, term24440.getClass(), "reportRepository", null);
        HashMap term24442 = new HashMap();
        Set<Object> term24451 =  ((Map) term24442).keySet();
        term24441 = new HashSet((Collection<? extends Object>) term24451);
        term24447 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term24447, term24447.getClass(), "fastTime", 1429023851389L);
        setField(term24447, term24447.getClass(), "cdate", null);
        term24449 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term24449, term24449.getClass(), "fastTime", 1495357463288L);
        setField(term24449, term24449.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.ReportService");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.sql.Date");
        argTypes[2] = Class.forName("java.sql.Date");
        Object[] args = new Object[3];
        args[0] = term24441;
        args[1] = term24447;
        args[2] = term24449;
        callMethod(klass, "getReportHoursForEmployees", argTypes, term24440, args);
    }

};



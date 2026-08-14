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

public class ReportService_getReportHoursForProjects_14490803670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24418;
     Object term24419;
     Object term24435;
     Object term24437;

    public ReportService_getReportHoursForProjects_14490803670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24418 = newInstance(Class.forName("ru.smartup.timetracker.service.ReportService"));
        setField(term24418, term24418.getClass(), "reportRepository", null);
        HashMap term24420 = new HashMap();
        Set<Object> term24439 =  ((Map) term24420).keySet();
        term24419 = new HashSet((Collection<? extends Object>) term24439);
        term24435 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term24435, term24435.getClass(), "fastTime", 1442639565302L);
        setField(term24435, term24435.getClass(), "cdate", null);
        term24437 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term24437, term24437.getClass(), "fastTime", 1515890130018L);
        setField(term24437, term24437.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.ReportService");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.sql.Date");
        argTypes[2] = Class.forName("java.sql.Date");
        Object[] args = new Object[3];
        args[0] = term24419;
        args[1] = term24435;
        args[2] = term24437;
        callMethod(klass, "getReportHoursForProjects", argTypes, term24418, args);
    }

};



package ru.smartup.timetracker.controller;

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
import static ru.smartup.timetracker.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ReportRestController_getReportHoursForEmployees_9825614451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1097;
     Object term1125;
     Object term1127;

    public ReportRestController_getReportHoursForEmployees_9825614451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1112 = new HashMap();
        Set<Object> term1139 =  ((Map) term1112).keySet();
        HashSet term1111 = new HashSet((Collection<? extends Object>) term1139);
        HashMap term1120 = new HashMap();
        term1097 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term1097, term1097.getClass(), "id", -522618178);
        setField(term1097, term1097.getClass(), "email", "ZiaGIbnzTs");
        setField(term1097, term1097.getClass(), "employeeRoles", term1111);
        setField(term1097, term1097.getClass(), "projectIdsByProjectRoles", term1120);
        term1125 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term1125, term1125.getClass(), "fastTime", 1606045635837L);
        setField(term1125, term1125.getClass(), "cdate", null);
        term1127 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term1127, term1127.getClass(), "fastTime", 1442639565302L);
        setField(term1127, term1127.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.ReportRestController");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        argTypes[1] = Class.forName("java.sql.Date");
        argTypes[2] = Class.forName("java.sql.Date");
        Object[] args = new Object[3];
        args[0] = term1097;
        args[1] = term1125;
        args[2] = term1127;
        callMethod(klass, "getReportHoursForEmployees", argTypes, null, args);
    }

};



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

public class ReportRestController_getReportHoursForCurrentEmployee_12251942652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1140;
     Object term1170;
     Object term1172;

    public ReportRestController_getReportHoursForCurrentEmployee_12251942652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1155 = new HashMap();
        Set<Object> term1184 =  ((Map) term1155).keySet();
        HashSet term1154 = new HashSet((Collection<? extends Object>) term1184);
        HashMap term1165 = new HashMap();
        term1140 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term1140, term1140.getClass(), "id", 1134449235);
        setField(term1140, term1140.getClass(), "email", "tbcdzjIfER");
        setField(term1140, term1140.getClass(), "employeeRoles", term1154);
        setField(term1140, term1140.getClass(), "projectIdsByProjectRoles", term1165);
        term1170 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term1170, term1170.getClass(), "fastTime", 1515890130018L);
        setField(term1170, term1170.getClass(), "cdate", null);
        term1172 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term1172, term1172.getClass(), "fastTime", 1429023851389L);
        setField(term1172, term1172.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.ReportRestController");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        argTypes[1] = Class.forName("java.sql.Date");
        argTypes[2] = Class.forName("java.sql.Date");
        Object[] args = new Object[3];
        args[0] = term1140;
        args[1] = term1170;
        args[2] = term1172;
        callMethod(klass, "getReportHoursForCurrentEmployee", argTypes, null, args);
    }

};



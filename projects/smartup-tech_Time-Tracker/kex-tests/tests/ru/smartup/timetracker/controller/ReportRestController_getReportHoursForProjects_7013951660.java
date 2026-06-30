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

public class ReportRestController_getReportHoursForProjects_7013951660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1050;
     Object term1082;
     Object term1084;

    public ReportRestController_getReportHoursForProjects_7013951660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1065 = new HashMap();
        Set<Object> term1096 =  ((Map) term1065).keySet();
        HashSet term1064 = new HashSet((Collection<? extends Object>) term1096);
        HashMap term1077 = new HashMap();
        term1050 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term1050, term1050.getClass(), "id", 1725571209);
        setField(term1050, term1050.getClass(), "email", "aJlieCFVtF");
        setField(term1050, term1050.getClass(), "employeeRoles", term1064);
        setField(term1050, term1050.getClass(), "projectIdsByProjectRoles", term1077);
        term1082 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term1082, term1082.getClass(), "fastTime", 1480438351369L);
        setField(term1082, term1082.getClass(), "cdate", null);
        term1084 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term1084, term1084.getClass(), "fastTime", 1610940182830L);
        setField(term1084, term1084.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.ReportRestController");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        argTypes[1] = Class.forName("java.sql.Date");
        argTypes[2] = Class.forName("java.sql.Date");
        Object[] args = new Object[3];
        args[0] = term1050;
        args[1] = term1082;
        args[2] = term1084;
        callMethod(klass, "getReportHoursForProjects", argTypes, null, args);
    }

};



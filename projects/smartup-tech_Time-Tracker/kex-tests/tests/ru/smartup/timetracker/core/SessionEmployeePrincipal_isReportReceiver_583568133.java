package ru.smartup.timetracker.core;

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
import static ru.smartup.timetracker.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class SessionEmployeePrincipal_isReportReceiver_583568133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1776;

    public SessionEmployeePrincipal_isReportReceiver_583568133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1791 = new HashMap();
        Set<Object> term1814 =  ((Map) term1791).keySet();
        HashSet term1790 = new HashSet((Collection<? extends Object>) term1814);
        HashMap term1799 = new HashMap();
        term1776 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term1776, term1776.getClass(), "id", 1134449235);
        setField(term1776, term1776.getClass(), "email", "SzjVpOQTyS");
        setField(term1776, term1776.getClass(), "employeeRoles", term1790);
        setField(term1776, term1776.getClass(), "projectIdsByProjectRoles", term1799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isReportReceiver", argTypes, term1776, args);
    }

};



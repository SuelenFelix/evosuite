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
import java.lang.Long;

public class NoticeRestController_getNotice_11025021272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term776;
     Object term806;

    public NoticeRestController_getNotice_11025021272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term791 = new HashMap();
        Set<Object> term818 =  ((Map) term791).keySet();
        HashSet term790 = new HashSet((Collection<? extends Object>) term818);
        HashMap term801 = new HashMap();
        term776 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term776, term776.getClass(), "id", -616727354);
        setField(term776, term776.getClass(), "email", "NRdvgJlhkX");
        setField(term776, term776.getClass(), "employeeRoles", term790);
        setField(term776, term776.getClass(), "projectIdsByProjectRoles", term801);
        term806 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.NoticeRestController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term776;
        args[1] = term806;
        callMethod(klass, "getNotice", argTypes, null, args);
    }

};



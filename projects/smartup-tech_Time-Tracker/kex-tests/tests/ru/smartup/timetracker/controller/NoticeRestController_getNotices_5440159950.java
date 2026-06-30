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

public class NoticeRestController_getNotices_5440159950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term694;

    public NoticeRestController_getNotices_5440159950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term709 = new HashMap();
        Set<Object> term736 =  ((Map) term709).keySet();
        HashSet term708 = new HashSet((Collection<? extends Object>) term736);
        HashMap term721 = new HashMap();
        term694 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term694, term694.getClass(), "id", 391863371);
        setField(term694, term694.getClass(), "email", "hRNSzYYIrc");
        setField(term694, term694.getClass(), "employeeRoles", term708);
        setField(term694, term694.getClass(), "projectIdsByProjectRoles", term721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.NoticeRestController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Object[] args = new Object[1];
        args[0] = term694;
        callMethod(klass, "getNotices", argTypes, null, args);
    }

};



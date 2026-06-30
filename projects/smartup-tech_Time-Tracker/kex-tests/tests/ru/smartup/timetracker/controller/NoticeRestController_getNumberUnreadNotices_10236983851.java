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

public class NoticeRestController_getNumberUnreadNotices_10236983851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737;

    public NoticeRestController_getNumberUnreadNotices_10236983851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term752 = new HashMap();
        Set<Object> term775 =  ((Map) term752).keySet();
        HashSet term751 = new HashSet((Collection<? extends Object>) term775);
        HashMap term760 = new HashMap();
        term737 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term737, term737.getClass(), "id", -1922583790);
        setField(term737, term737.getClass(), "email", "RMFIsYGgne");
        setField(term737, term737.getClass(), "employeeRoles", term751);
        setField(term737, term737.getClass(), "projectIdsByProjectRoles", term760);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.NoticeRestController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Object[] args = new Object[1];
        args[0] = term737;
        callMethod(klass, "getNumberUnreadNotices", argTypes, null, args);
    }

};



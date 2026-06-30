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

public class NoticeRestController_readAllNotices_6399675144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term887;

    public NoticeRestController_readAllNotices_6399675144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term902 = new HashMap();
        Set<Object> term929 =  ((Map) term902).keySet();
        HashSet term901 = new HashSet((Collection<? extends Object>) term929);
        HashMap term914 = new HashMap();
        term887 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term887, term887.getClass(), "id", -2038273078);
        setField(term887, term887.getClass(), "email", "MxlszYVzRf");
        setField(term887, term887.getClass(), "employeeRoles", term901);
        setField(term887, term887.getClass(), "projectIdsByProjectRoles", term914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.NoticeRestController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Object[] args = new Object[1];
        args[0] = term887;
        callMethod(klass, "readAllNotices", argTypes, null, args);
    }

};



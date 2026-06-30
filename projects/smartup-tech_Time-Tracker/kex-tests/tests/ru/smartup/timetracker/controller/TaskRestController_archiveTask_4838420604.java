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

public class TaskRestController_archiveTask_4838420604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1319;
     Object term1349;

    public TaskRestController_archiveTask_4838420604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1334 = new HashMap();
        Set<Object> term1361 =  ((Map) term1334).keySet();
        HashSet term1333 = new HashSet((Collection<? extends Object>) term1361);
        HashMap term1344 = new HashMap();
        term1319 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term1319, term1319.getClass(), "id", 1622346318);
        setField(term1319, term1319.getClass(), "email", "xOEqzGAmDU");
        setField(term1319, term1319.getClass(), "employeeRoles", term1333);
        setField(term1319, term1319.getClass(), "projectIdsByProjectRoles", term1344);
        term1349 = new Long(5270370404989704783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.TaskRestController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term1319;
        args[1] = term1349;
        callMethod(klass, "archiveTask", argTypes, null, args);
    }

};



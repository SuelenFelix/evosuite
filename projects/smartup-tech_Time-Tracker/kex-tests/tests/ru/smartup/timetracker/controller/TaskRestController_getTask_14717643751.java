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

public class TaskRestController_getTask_14717643751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1190;
     Object term1218;

    public TaskRestController_getTask_14717643751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1205 = new HashMap();
        Set<Object> term1230 =  ((Map) term1205).keySet();
        HashSet term1204 = new HashSet((Collection<? extends Object>) term1230);
        HashMap term1213 = new HashMap();
        term1190 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term1190, term1190.getClass(), "id", 1585847225);
        setField(term1190, term1190.getClass(), "email", "HyxfbSQYBe");
        setField(term1190, term1190.getClass(), "employeeRoles", term1204);
        setField(term1190, term1190.getClass(), "projectIdsByProjectRoles", term1213);
        term1218 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.TaskRestController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term1190;
        args[1] = term1218;
        callMethod(klass, "getTask", argTypes, null, args);
    }

};



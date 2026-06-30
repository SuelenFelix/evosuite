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

public class TaskRestController_updateTask_19175142943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1256;
     Object term1281;
     Object term1296;

    public TaskRestController_updateTask_19175142943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1271 = new HashMap();
        Set<Object> term1308 =  ((Map) term1271).keySet();
        HashSet term1270 = new HashSet((Collection<? extends Object>) term1308);
        HashMap term1276 = new HashMap();
        term1256 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term1256, term1256.getClass(), "id", -1685132342);
        setField(term1256, term1256.getClass(), "email", "hNxWaHcfhY");
        setField(term1256, term1256.getClass(), "employeeRoles", term1270);
        setField(term1256, term1256.getClass(), "projectIdsByProjectRoles", term1276);
        term1281 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.request.TaskCreateDto"));
        setField(term1281, term1281.getClass(), "name", "RkybSrpybU");
        setIntField(term1281, term1281.getClass(), "projectId", -1456670397);
        setBooleanField(term1281, term1281.getClass(), "billable", false);
        term1296 = new Long(-8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.TaskRestController");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        argTypes[1] = Class.forName("ru.smartup.timetracker.dto.task.request.TaskCreateDto");
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = term1256;
        args[1] = term1281;
        args[2] = term1296;
        callMethod(klass, "updateTask", argTypes, null, args);
    }

};



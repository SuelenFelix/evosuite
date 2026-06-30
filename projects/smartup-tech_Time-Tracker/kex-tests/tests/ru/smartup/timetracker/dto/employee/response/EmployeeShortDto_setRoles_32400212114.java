package ru.smartup.timetracker.dto.employee.response;

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
import static ru.smartup.timetracker.dto.employee.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.String;

public class EmployeeShortDto_setRoles_32400212114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1302;
     Object term1355;

    public EmployeeShortDto_setRoles_32400212114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1302 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term1353 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term1354 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term1302, term1302.getClass(), "id", 1585847225);
        setField(term1302, term1302.getClass(), "firstName", "ffYhPOzlUs");
        setField(term1302, term1302.getClass(), "middleName", "MLqYREekMl");
        setField(term1302, term1302.getClass(), "lastName", "ytSBIKXogI");
        setField(term1302, term1302.getClass(), "email", "nHXjMycHlU");
        setBooleanField(term1302, term1302.getClass(), "isArchived", false);
        setField(term1353, term1353.getClass(), "elements", term1354);
        setField(term1302, term1302.getClass(), "roles", term1353);
        Class<? extends Object> term1500 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term1499 = ((Class) term1500).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term1499).setAccessible(true);
        Object enum0 =  ((Field) term1499).get((Object) null);
        Class<? extends Object> term1882 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term1881 = ((Class) term1882).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term1881).setAccessible(true);
        Object enum1 =  ((Field) term1881).get((Object) null);
        term1355 = new LinkedList();
        ((LinkedList) term1355).add(enum0);
        ((LinkedList) term1355).add(enum1);
        ((LinkedList) term1355).add(enum0);
        ((LinkedList) term1355).add(enum1);
        ((LinkedList) term1355).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1355;
        callMethod(klass, "setRoles", argTypes, term1302, args);
    }

};



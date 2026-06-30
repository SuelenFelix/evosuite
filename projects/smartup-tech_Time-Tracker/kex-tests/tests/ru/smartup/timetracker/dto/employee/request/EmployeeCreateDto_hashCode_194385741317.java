package ru.smartup.timetracker.dto.employee.request;

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
import static ru.smartup.timetracker.dto.employee.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class EmployeeCreateDto_hashCode_194385741317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27711;

    public EmployeeCreateDto_hashCode_194385741317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27837 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term27836 = ((Class) term27837).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term27836).setAccessible(true);
        Object enum64 =  ((Field) term27836).get((Object) null);
        Class<? extends Object> term28219 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term28218 = ((Class) term28219).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term28218).setAccessible(true);
        Object enum65 =  ((Field) term28218).get((Object) null);
        Class<? extends Object> term28571 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term28570 = ((Class) term28571).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term28570).setAccessible(true);
        Object enum66 =  ((Field) term28570).get((Object) null);
        ArrayList term27773 = new ArrayList();
        ((ArrayList) term27773).add(enum64);
        ((ArrayList) term27773).add(enum65);
        ((ArrayList) term27773).add(enum66);
        ((ArrayList) term27773).add(enum64);
        ((ArrayList) term27773).add(enum65);
        ((ArrayList) term27773).add(enum66);
        term27711 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term27711, term27711.getClass(), "firstName", "DyiXbeYIaN");
        setField(term27711, term27711.getClass(), "middleName", "VGizxZnyHX");
        setField(term27711, term27711.getClass(), "lastName", "kVEZMHmRtR");
        setField(term27711, term27711.getClass(), "email", "ekxGuOYIwi");
        setField(term27711, term27711.getClass(), "password", "RbVQXSpxXy");
        setIntField(term27711, term27711.getClass(), "positionId", -1530420153);
        setField(term27711, term27711.getClass(), "roles", term27773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term27711, args);
    }

};



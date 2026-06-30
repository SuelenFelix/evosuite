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
import java.util.LinkedList;

public class EmployeeCreateDto_setRoles_181507169314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24053;
     Object term24125;

    public EmployeeCreateDto_setRoles_181507169314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24187 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term24186 = ((Class) term24187).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term24186).setAccessible(true);
        Object enum55 =  ((Field) term24186).get((Object) null);
        Class<? extends Object> term24548 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term24547 = ((Class) term24548).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term24547).setAccessible(true);
        Object enum56 =  ((Field) term24547).get((Object) null);
        ArrayList term24115 = new ArrayList();
        ((ArrayList) term24115).add(enum55);
        ((ArrayList) term24115).add(enum56);
        ((ArrayList) term24115).add(enum55);
        ((ArrayList) term24115).add(enum55);
        ((ArrayList) term24115).add(enum56);
        ((ArrayList) term24115).add(enum56);
        ((ArrayList) term24115).add(enum56);
        term24053 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term24053, term24053.getClass(), "firstName", "PapWxkhEWe");
        setField(term24053, term24053.getClass(), "middleName", "smnHEqRFRx");
        setField(term24053, term24053.getClass(), "lastName", "XYtryyobou");
        setField(term24053, term24053.getClass(), "email", "OYbzXylRWW");
        setField(term24053, term24053.getClass(), "password", "DSNsTGYXDF");
        setIntField(term24053, term24053.getClass(), "positionId", -226514366);
        setField(term24053, term24053.getClass(), "roles", term24115);
        Class<? extends Object> term24909 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term24908 = ((Class) term24909).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term24908).setAccessible(true);
        Object enum57 =  ((Field) term24908).get((Object) null);
        term24125 = new LinkedList();
        ((LinkedList) term24125).add(enum55);
        ((LinkedList) term24125).add(enum55);
        ((LinkedList) term24125).add(enum57);
        ((LinkedList) term24125).add(enum57);
        ((LinkedList) term24125).add((Object)null);
        ((LinkedList) term24125).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term24125;
        callMethod(klass, "setRoles", argTypes, term24053, args);
    }

};



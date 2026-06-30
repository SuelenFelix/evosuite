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

public class EmployeeCreateDto_setFirstName_16060341348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18838;

    public EmployeeCreateDto_setFirstName_16060341348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18976 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term18975 = ((Class) term18976).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term18975).setAccessible(true);
        Object enum43 =  ((Field) term18975).get((Object) null);
        Class<? extends Object> term19358 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term19357 = ((Class) term19358).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term19357).setAccessible(true);
        Object enum44 =  ((Field) term19357).get((Object) null);
        Class<? extends Object> term19719 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term19718 = ((Class) term19719).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term19718).setAccessible(true);
        Object enum45 =  ((Field) term19718).get((Object) null);
        ArrayList term18900 = new ArrayList();
        ((ArrayList) term18900).add(enum43);
        ((ArrayList) term18900).add(enum43);
        ((ArrayList) term18900).add(enum44);
        ((ArrayList) term18900).add(enum43);
        ((ArrayList) term18900).add(enum43);
        ((ArrayList) term18900).add(enum45);
        ((ArrayList) term18900).add(enum44);
        ((ArrayList) term18900).add(enum44);
        term18838 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term18838, term18838.getClass(), "firstName", "OJJtVNPyKZ");
        setField(term18838, term18838.getClass(), "middleName", "AKNapTAfmD");
        setField(term18838, term18838.getClass(), "lastName", "xJgPlLxpgC");
        setField(term18838, term18838.getClass(), "email", "EYtfuJaxiM");
        setField(term18838, term18838.getClass(), "password", "gCWtLVKVVe");
        setIntField(term18838, term18838.getClass(), "positionId", 590364439);
        setField(term18838, term18838.getClass(), "roles", term18900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fWKJoSoCwE";
        callMethod(klass, "setFirstName", argTypes, term18838, args);
    }

};



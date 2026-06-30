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

public class EmployeeCreateDto_setMiddleName_878040139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20080;

    public EmployeeCreateDto_setMiddleName_878040139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20218 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term20217 = ((Class) term20218).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term20217).setAccessible(true);
        Object enum46 =  ((Field) term20217).get((Object) null);
        Class<? extends Object> term20600 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term20599 = ((Class) term20600).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term20599).setAccessible(true);
        Object enum47 =  ((Field) term20599).get((Object) null);
        Class<? extends Object> term20961 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term20960 = ((Class) term20961).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term20960).setAccessible(true);
        Object enum48 =  ((Field) term20960).get((Object) null);
        ArrayList term20142 = new ArrayList();
        ((ArrayList) term20142).add(enum46);
        ((ArrayList) term20142).add(enum46);
        ((ArrayList) term20142).add(enum47);
        ((ArrayList) term20142).add(enum47);
        ((ArrayList) term20142).add(enum46);
        ((ArrayList) term20142).add(enum48);
        term20080 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term20080, term20080.getClass(), "firstName", "wfaXBpWAUH");
        setField(term20080, term20080.getClass(), "middleName", "VMeAzAHwZj");
        setField(term20080, term20080.getClass(), "lastName", "PznxWXsZME");
        setField(term20080, term20080.getClass(), "email", "ZzIujlwVsw");
        setField(term20080, term20080.getClass(), "password", "LWyEaeIyAo");
        setIntField(term20080, term20080.getClass(), "positionId", 865208305);
        setField(term20080, term20080.getClass(), "roles", term20142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yVMkkQhvmN";
        callMethod(klass, "setMiddleName", argTypes, term20080, args);
    }

};



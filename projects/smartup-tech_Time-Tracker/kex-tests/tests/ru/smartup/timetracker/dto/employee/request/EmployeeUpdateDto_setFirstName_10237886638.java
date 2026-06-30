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

public class EmployeeUpdateDto_setFirstName_10237886638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5916;

    public EmployeeUpdateDto_setFirstName_10237886638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6051 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term6050 = ((Class) term6051).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term6050).setAccessible(true);
        Object enum14 =  ((Field) term6050).get((Object) null);
        Class<? extends Object> term6412 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term6411 = ((Class) term6412).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term6411).setAccessible(true);
        Object enum15 =  ((Field) term6411).get((Object) null);
        ArrayList term5978 = new ArrayList();
        ((ArrayList) term5978).add(enum14);
        ((ArrayList) term5978).add(enum15);
        ((ArrayList) term5978).add(enum15);
        term5916 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term5916, term5916.getClass(), "firstName", "Ghbwtircqb");
        setField(term5916, term5916.getClass(), "middleName", "xrwlQZdwCp");
        setField(term5916, term5916.getClass(), "lastName", "IDCWpPLRkE");
        setField(term5916, term5916.getClass(), "email", "nyiiPDVjAc");
        setField(term5916, term5916.getClass(), "password", "aKnKipADSo");
        setIntField(term5916, term5916.getClass(), "positionId", -2038273078);
        setField(term5916, term5916.getClass(), "roles", term5978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wSQxaModmm";
        callMethod(klass, "setFirstName", argTypes, term5916, args);
    }

};



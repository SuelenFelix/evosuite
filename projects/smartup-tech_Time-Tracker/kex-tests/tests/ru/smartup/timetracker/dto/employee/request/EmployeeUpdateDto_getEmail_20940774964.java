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

public class EmployeeUpdateDto_getEmail_20940774964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3677;

    public EmployeeUpdateDto_getEmail_20940774964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3800 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term3799 = ((Class) term3800).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term3799).setAccessible(true);
        Object enum9 =  ((Field) term3799).get((Object) null);
        Class<? extends Object> term4152 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term4151 = ((Class) term4152).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term4151).setAccessible(true);
        Object enum10 =  ((Field) term4151).get((Object) null);
        ArrayList term3739 = new ArrayList();
        ((ArrayList) term3739).add(enum9);
        ((ArrayList) term3739).add(enum9);
        ((ArrayList) term3739).add(enum10);
        ((ArrayList) term3739).add(enum10);
        ((ArrayList) term3739).add(enum9);
        ((ArrayList) term3739).add(enum9);
        ((ArrayList) term3739).add(enum10);
        ((ArrayList) term3739).add(enum10);
        ((ArrayList) term3739).add(enum9);
        term3677 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term3677, term3677.getClass(), "firstName", "aJlieCFVtF");
        setField(term3677, term3677.getClass(), "middleName", "ZiaGIbnzTs");
        setField(term3677, term3677.getClass(), "lastName", "tbcdzjIfER");
        setField(term3677, term3677.getClass(), "email", "HyxfbSQYBe");
        setField(term3677, term3677.getClass(), "password", "pCTimMblYc");
        setIntField(term3677, term3677.getClass(), "positionId", 391863371);
        setField(term3677, term3677.getClass(), "roles", term3739);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term3677, args);
    }

};



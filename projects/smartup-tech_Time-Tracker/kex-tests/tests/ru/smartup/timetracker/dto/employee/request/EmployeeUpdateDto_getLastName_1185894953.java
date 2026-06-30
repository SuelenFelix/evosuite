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

public class EmployeeUpdateDto_getLastName_1185894953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2457;

    public EmployeeUpdateDto_getLastName_1185894953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2583 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term2582 = ((Class) term2583).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term2582).setAccessible(true);
        Object enum6 =  ((Field) term2582).get((Object) null);
        Class<? extends Object> term2965 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term2964 = ((Class) term2965).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term2964).setAccessible(true);
        Object enum7 =  ((Field) term2964).get((Object) null);
        Class<? extends Object> term3317 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term3316 = ((Class) term3317).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term3316).setAccessible(true);
        Object enum8 =  ((Field) term3316).get((Object) null);
        ArrayList term2519 = new ArrayList();
        ((ArrayList) term2519).add(enum6);
        ((ArrayList) term2519).add(enum7);
        ((ArrayList) term2519).add(enum6);
        ((ArrayList) term2519).add(enum7);
        ((ArrayList) term2519).add(enum6);
        ((ArrayList) term2519).add(enum8);
        term2457 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term2457, term2457.getClass(), "firstName", "NRdvgJlhkX");
        setField(term2457, term2457.getClass(), "middleName", "uuaPigETmJ");
        setField(term2457, term2457.getClass(), "lastName", "MxlszYVzRf");
        setField(term2457, term2457.getClass(), "email", "LQFpaHEwXR");
        setField(term2457, term2457.getClass(), "password", "oVcInYnLWB");
        setIntField(term2457, term2457.getClass(), "positionId", 1484323161);
        setField(term2457, term2457.getClass(), "roles", term2519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term2457, args);
    }

};



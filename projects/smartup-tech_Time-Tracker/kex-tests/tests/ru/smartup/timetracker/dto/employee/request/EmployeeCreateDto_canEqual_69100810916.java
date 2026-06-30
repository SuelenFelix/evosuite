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

public class EmployeeCreateDto_canEqual_69100810916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26481;
     Object term26556;

    public EmployeeCreateDto_canEqual_69100810916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26608 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term26607 = ((Class) term26608).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term26607).setAccessible(true);
        Object enum61 =  ((Field) term26607).get((Object) null);
        Class<? extends Object> term26969 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term26968 = ((Class) term26969).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term26968).setAccessible(true);
        Object enum62 =  ((Field) term26968).get((Object) null);
        Class<? extends Object> term27330 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term27329 = ((Class) term27330).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term27329).setAccessible(true);
        Object enum63 =  ((Field) term27329).get((Object) null);
        ArrayList term26543 = new ArrayList();
        ((ArrayList) term26543).add(enum61);
        ((ArrayList) term26543).add(enum62);
        ((ArrayList) term26543).add(enum62);
        ((ArrayList) term26543).add(enum63);
        ((ArrayList) term26543).add(enum63);
        ((ArrayList) term26543).add(enum63);
        ((ArrayList) term26543).add(enum62);
        ((ArrayList) term26543).add(enum62);
        ((ArrayList) term26543).add(enum62);
        term26481 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term26481, term26481.getClass(), "firstName", "cudZvLMQon");
        setField(term26481, term26481.getClass(), "middleName", "lihXWlGDxk");
        setField(term26481, term26481.getClass(), "lastName", "JmcmxoGhIK");
        setField(term26481, term26481.getClass(), "email", "jXzmYyrnnT");
        setField(term26481, term26481.getClass(), "password", "igCAtimmYB");
        setIntField(term26481, term26481.getClass(), "positionId", -1087774327);
        setField(term26481, term26481.getClass(), "roles", term26543);
        term26556 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term26556;
        callMethod(klass, "canEqual", argTypes, term26481, args);
    }

};



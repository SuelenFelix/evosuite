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

public class EmployeeUpdateDto_hashCode_68596538417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12609;

    public EmployeeUpdateDto_hashCode_68596538417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12735 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term12734 = ((Class) term12735).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term12734).setAccessible(true);
        Object enum29 =  ((Field) term12734).get((Object) null);
        Class<? extends Object> term13117 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term13116 = ((Class) term13117).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term13116).setAccessible(true);
        Object enum30 =  ((Field) term13116).get((Object) null);
        Class<? extends Object> term13478 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term13477 = ((Class) term13478).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term13477).setAccessible(true);
        Object enum31 =  ((Field) term13477).get((Object) null);
        ArrayList term12671 = new ArrayList();
        ((ArrayList) term12671).add(enum29);
        ((ArrayList) term12671).add(enum30);
        ((ArrayList) term12671).add(enum29);
        ((ArrayList) term12671).add(enum31);
        ((ArrayList) term12671).add(enum30);
        ((ArrayList) term12671).add(enum30);
        term12609 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term12609, term12609.getClass(), "firstName", "LvJFtLBaxj");
        setField(term12609, term12609.getClass(), "middleName", "PHvxnGHptP");
        setField(term12609, term12609.getClass(), "lastName", "TimdotUuNC");
        setField(term12609, term12609.getClass(), "email", "PkWMRdJcBb");
        setField(term12609, term12609.getClass(), "password", "jSpAteRute");
        setIntField(term12609, term12609.getClass(), "positionId", -1456670397);
        setField(term12609, term12609.getClass(), "roles", term12671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12609, args);
    }

};



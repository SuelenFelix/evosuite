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

public class EmployeeUpdateDto_getMiddleName_3032273842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1276;

    public EmployeeUpdateDto_getMiddleName_3032273842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1402 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term1401 = ((Class) term1402).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term1401).setAccessible(true);
        Object enum3 =  ((Field) term1401).get((Object) null);
        Class<? extends Object> term1754 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term1753 = ((Class) term1754).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term1753).setAccessible(true);
        Object enum4 =  ((Field) term1753).get((Object) null);
        Class<? extends Object> term2106 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term2105 = ((Class) term2106).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term2105).setAccessible(true);
        Object enum5 =  ((Field) term2105).get((Object) null);
        ArrayList term1338 = new ArrayList();
        ((ArrayList) term1338).add(enum3);
        ((ArrayList) term1338).add(enum4);
        ((ArrayList) term1338).add(enum5);
        ((ArrayList) term1338).add(enum5);
        term1276 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term1276, term1276.getClass(), "firstName", "EGtDIRbSSb");
        setField(term1276, term1276.getClass(), "middleName", "SzjVpOQTyS");
        setField(term1276, term1276.getClass(), "lastName", "MjGYSRKTNF");
        setField(term1276, term1276.getClass(), "email", "hRNSzYYIrc");
        setField(term1276, term1276.getClass(), "password", "RMFIsYGgne");
        setIntField(term1276, term1276.getClass(), "positionId", 1162663216);
        setField(term1276, term1276.getClass(), "roles", term1338);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMiddleName", argTypes, term1276, args);
    }

};



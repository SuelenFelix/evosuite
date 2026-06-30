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

public class EmployeeUpdateDto_getFirstName_8610312231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public EmployeeUpdateDto_getFirstName_8610312231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term182 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term181 = ((Class) term182).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term181).setAccessible(true);
        Object enum0 =  ((Field) term181).get((Object) null);
        Class<? extends Object> term564 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term563 = ((Class) term564).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term563).setAccessible(true);
        Object enum1 =  ((Field) term563).get((Object) null);
        Class<? extends Object> term925 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term924 = ((Class) term925).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term924).setAccessible(true);
        Object enum2 =  ((Field) term924).get((Object) null);
        ArrayList term63 = new ArrayList();
        ((ArrayList) term63).add(enum0);
        ((ArrayList) term63).add(enum1);
        ((ArrayList) term63).add(enum0);
        ((ArrayList) term63).add(enum1);
        ((ArrayList) term63).add(enum2);
        term1 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term1, term1.getClass(), "firstName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "middleName", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "lastName", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "email", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "password", "jJCZpVmanW");
        setIntField(term1, term1.getClass(), "positionId", 568599855);
        setField(term1, term1.getClass(), "roles", term63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term1, args);
    }

};



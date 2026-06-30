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

public class EmployeeCreateDto_getPassword_10598697825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16667;

    public EmployeeCreateDto_getPassword_10598697825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16787 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term16786 = ((Class) term16787).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term16786).setAccessible(true);
        Object enum38 =  ((Field) term16786).get((Object) null);
        ArrayList term16729 = new ArrayList();
        ((ArrayList) term16729).add(enum38);
        term16667 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term16667, term16667.getClass(), "firstName", "MvRIxilFMJ");
        setField(term16667, term16667.getClass(), "middleName", "iNwOJRBEjp");
        setField(term16667, term16667.getClass(), "lastName", "XylxrMBraH");
        setField(term16667, term16667.getClass(), "email", "pORebkoRdD");
        setField(term16667, term16667.getClass(), "password", "mXGCWJDOqA");
        setIntField(term16667, term16667.getClass(), "positionId", -117576464);
        setField(term16667, term16667.getClass(), "roles", term16729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term16667, args);
    }

};



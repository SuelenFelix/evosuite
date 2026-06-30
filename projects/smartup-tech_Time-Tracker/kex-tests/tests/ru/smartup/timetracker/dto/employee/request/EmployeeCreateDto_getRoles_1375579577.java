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

public class EmployeeCreateDto_getRoles_1375579577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17639;

    public EmployeeCreateDto_getRoles_1375579577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17765 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term17764 = ((Class) term17765).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term17764).setAccessible(true);
        Object enum40 =  ((Field) term17764).get((Object) null);
        Class<? extends Object> term18117 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term18116 = ((Class) term18117).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term18116).setAccessible(true);
        Object enum41 =  ((Field) term18116).get((Object) null);
        Class<? extends Object> term18478 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term18477 = ((Class) term18478).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term18477).setAccessible(true);
        Object enum42 =  ((Field) term18477).get((Object) null);
        ArrayList term17701 = new ArrayList();
        ((ArrayList) term17701).add(enum40);
        ((ArrayList) term17701).add(enum41);
        ((ArrayList) term17701).add(enum40);
        ((ArrayList) term17701).add(enum42);
        term17639 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term17639, term17639.getClass(), "firstName", "lHfTrWKMPk");
        setField(term17639, term17639.getClass(), "middleName", "JDaAnsVTGV");
        setField(term17639, term17639.getClass(), "lastName", "mLUZFTfjle");
        setField(term17639, term17639.getClass(), "email", "xIeFjkHkOe");
        setField(term17639, term17639.getClass(), "password", "SdCKLMIYnX");
        setIntField(term17639, term17639.getClass(), "positionId", 1135664017);
        setField(term17639, term17639.getClass(), "roles", term17701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term17639, args);
    }

};



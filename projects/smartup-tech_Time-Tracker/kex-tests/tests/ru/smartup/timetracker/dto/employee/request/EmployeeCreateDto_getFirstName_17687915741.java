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

public class EmployeeCreateDto_getFirstName_17687915741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14753;

    public EmployeeCreateDto_getFirstName_17687915741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14876 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term14875 = ((Class) term14876).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term14875).setAccessible(true);
        Object enum34 =  ((Field) term14875).get((Object) null);
        Class<? extends Object> term15228 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term15227 = ((Class) term15228).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term15227).setAccessible(true);
        Object enum35 =  ((Field) term15227).get((Object) null);
        ArrayList term14815 = new ArrayList();
        ((ArrayList) term14815).add(enum34);
        ((ArrayList) term14815).add(enum35);
        term14753 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term14753, term14753.getClass(), "firstName", "DfISiziTgG");
        setField(term14753, term14753.getClass(), "middleName", "XqgfKFvPSD");
        setField(term14753, term14753.getClass(), "lastName", "JiVRgTZvKc");
        setField(term14753, term14753.getClass(), "email", "XPKmummaqg");
        setField(term14753, term14753.getClass(), "password", "BKLfkLiZTH");
        setIntField(term14753, term14753.getClass(), "positionId", 1048535127);
        setField(term14753, term14753.getClass(), "roles", term14815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term14753, args);
    }

};



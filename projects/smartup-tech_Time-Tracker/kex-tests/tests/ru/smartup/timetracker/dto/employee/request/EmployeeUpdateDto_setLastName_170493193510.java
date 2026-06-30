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

public class EmployeeUpdateDto_setLastName_170493193510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6941;

    public EmployeeUpdateDto_setLastName_170493193510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7076 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term7075 = ((Class) term7076).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term7075).setAccessible(true);
        Object enum16 =  ((Field) term7075).get((Object) null);
        Class<? extends Object> term7428 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term7427 = ((Class) term7428).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term7427).setAccessible(true);
        Object enum17 =  ((Field) term7427).get((Object) null);
        ArrayList term7003 = new ArrayList();
        ((ArrayList) term7003).add(enum16);
        ((ArrayList) term7003).add(enum17);
        term6941 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term6941, term6941.getClass(), "firstName", "LvtrsXUliU");
        setField(term6941, term6941.getClass(), "middleName", "xLbjWUgOIL");
        setField(term6941, term6941.getClass(), "lastName", "jDtqGUpnZN");
        setField(term6941, term6941.getClass(), "email", "nGKItKLYNC");
        setField(term6941, term6941.getClass(), "password", "UiUYnPrcCi");
        setIntField(term6941, term6941.getClass(), "positionId", -1339778481);
        setField(term6941, term6941.getClass(), "roles", term7003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UoYtihxVaS";
        callMethod(klass, "setLastName", argTypes, term6941, args);
    }

};



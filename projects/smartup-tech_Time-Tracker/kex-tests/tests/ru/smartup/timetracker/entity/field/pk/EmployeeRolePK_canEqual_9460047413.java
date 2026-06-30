package ru.smartup.timetracker.entity.field.pk;

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
import static ru.smartup.timetracker.entity.field.pk.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class EmployeeRolePK_canEqual_9460047413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term951;
     Object term977;

    public EmployeeRolePK_canEqual_9460047413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term979 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term978 = ((Class) term979).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term978).setAccessible(true);
        Object enum2 = ((Field) term978).get((Object) null);
        term951 = newInstance(Class.forName("ru.smartup.timetracker.entity.field.pk.EmployeeRolePK"));
        setIntField(term951, term951.getClass(), "employeeId", -1955890973);
        setField(term951, term951.getClass(), "roleId", enum2);
        term977 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.field.pk.EmployeeRolePK");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term977;
        callMethod(klass, "canEqual", argTypes, term951, args);
    }

};



package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Role_setRoleId_15534365253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111526;
     Object enum244;

    public Role_setRoleId_15534365253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term111578 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term111577 = ((Class) term111578).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term111577).setAccessible(true);
        Object enum243 = ((Field) term111577).get((Object) null);
        term111526 = newInstance(Class.forName("ru.smartup.timetracker.entity.Role"));
        setField(term111526, term111526.getClass(), "roleId", enum243);
        setField(term111526, term111526.getClass(), "name", "QUymMnsCIj");
        Class<? extends Object> term111970 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term111969 = ((Class) term111970).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term111969).setAccessible(true);
        enum244 = ((Field) term111969).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Role");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Object[] args = new Object[1];
        args[0] = enum244;
        callMethod(klass, "setRoleId", argTypes, term111526, args);
    }

};



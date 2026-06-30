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

public class EmployeeRole_canEqual_18469703015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39112;
     Object term39138;

    public EmployeeRole_canEqual_18469703015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39140 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term39139 = ((Class) term39140).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term39139).setAccessible(true);
        Object enum91 = ((Field) term39139).get((Object) null);
        term39112 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeRole"));
        setIntField(term39112, term39112.getClass(), "employeeId", -2131181468);
        setField(term39112, term39112.getClass(), "roleId", enum91);
        term39138 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.EmployeeRole");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term39138;
        callMethod(klass, "canEqual", argTypes, term39112, args);
    }

};



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

public class Role_canEqual_17991682036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113162;
     Object term113199;

    public Role_canEqual_17991682036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term113201 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term113200 = ((Class) term113201).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term113200).setAccessible(true);
        Object enum247 = ((Field) term113200).get((Object) null);
        term113162 = newInstance(Class.forName("ru.smartup.timetracker.entity.Role"));
        setField(term113162, term113162.getClass(), "roleId", enum247);
        setField(term113162, term113162.getClass(), "name", "YcTbglHiUq");
        term113199 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Role");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term113199;
        callMethod(klass, "canEqual", argTypes, term113162, args);
    }

};



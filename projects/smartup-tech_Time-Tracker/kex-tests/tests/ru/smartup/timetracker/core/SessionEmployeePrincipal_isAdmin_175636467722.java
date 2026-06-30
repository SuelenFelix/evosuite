package ru.smartup.timetracker.core;

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
import static ru.smartup.timetracker.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SessionEmployeePrincipal_isAdmin_175636467722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2835;

    public SessionEmployeePrincipal_isAdmin_175636467722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2835 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term2835, term2835.getClass(), "id", 0);
        setField(term2835, term2835.getClass(), "email", null);
        setField(term2835, term2835.getClass(), "employeeRoles", null);
        setField(term2835, term2835.getClass(), "projectIdsByProjectRoles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAdmin", argTypes, term2835, args);
    }

};



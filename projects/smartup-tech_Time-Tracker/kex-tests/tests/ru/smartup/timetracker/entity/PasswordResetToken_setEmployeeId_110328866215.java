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
import java.lang.Integer;

public class PasswordResetToken_setEmployeeId_110328866215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110678;
     Object term110680;

    public PasswordResetToken_setEmployeeId_110328866215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110678 = newInstance(Class.forName("ru.smartup.timetracker.entity.PasswordResetToken"));
        setIntField(term110678, term110678.getClass(), "employeeId", 0);
        setField(term110678, term110678.getClass(), "token", null);
        setField(term110678, term110678.getClass(), "tokenExpiry", null);
        term110680 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term110680;
        callMethod(klass, "setEmployeeId", argTypes, term110678, args);
    }

};



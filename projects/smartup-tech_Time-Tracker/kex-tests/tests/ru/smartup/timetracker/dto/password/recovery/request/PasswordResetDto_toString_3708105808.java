package ru.smartup.timetracker.dto.password.recovery.request;

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
import static ru.smartup.timetracker.dto.password.recovery.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PasswordResetDto_toString_3708105808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530;

    public PasswordResetDto_toString_3708105808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530 = newInstance(Class.forName("ru.smartup.timetracker.dto.password.recovery.request.PasswordResetDto"));
        setField(term530, term530.getClass(), "token", "eZFUvlxvGV");
        setField(term530, term530.getClass(), "newPassword", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.password.recovery.request.PasswordResetDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term530, args);
    }

};



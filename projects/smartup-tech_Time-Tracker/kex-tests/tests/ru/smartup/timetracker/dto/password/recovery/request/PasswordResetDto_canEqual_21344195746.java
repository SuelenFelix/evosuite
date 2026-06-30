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

public class PasswordResetDto_canEqual_21344195746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439;
     Object term464;

    public PasswordResetDto_canEqual_21344195746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term439 = newInstance(Class.forName("ru.smartup.timetracker.dto.password.recovery.request.PasswordResetDto"));
        setField(term439, term439.getClass(), "token", "pCTimMblYc");
        setField(term439, term439.getClass(), "newPassword", "hNxWaHcfhY");
        term464 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.password.recovery.request.PasswordResetDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term464;
        callMethod(klass, "canEqual", argTypes, term439, args);
    }

};



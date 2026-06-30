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

public class PasswordResetDto_getNewPassword_38220971511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576;

    public PasswordResetDto_getNewPassword_38220971511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term576 = newInstance(Class.forName("ru.smartup.timetracker.dto.password.recovery.request.PasswordResetDto"));
        setField(term576, term576.getClass(), "token", null);
        setField(term576, term576.getClass(), "newPassword", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.password.recovery.request.PasswordResetDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNewPassword", argTypes, term576, args);
    }

};



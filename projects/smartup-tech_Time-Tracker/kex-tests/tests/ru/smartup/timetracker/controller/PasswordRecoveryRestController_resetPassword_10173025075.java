package ru.smartup.timetracker.controller;

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
import static ru.smartup.timetracker.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PasswordRecoveryRestController_resetPassword_10173025075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1466;

    public PasswordRecoveryRestController_resetPassword_10173025075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1466 = newInstance(Class.forName("ru.smartup.timetracker.controller.PasswordRecoveryRestController"));
        setField(term1466, term1466.getClass(), "employeeService", null);
        setField(term1466, term1466.getClass(), "passwordResetTokenService", null);
        setField(term1466, term1466.getClass(), "notifierObservable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.PasswordRecoveryRestController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.dto.password.recovery.request.PasswordResetDto");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "resetPassword", argTypes, term1466, args);
    }

};



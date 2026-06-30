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
import java.lang.Object;
import java.util.HashMap;

public class PasswordRecoveryRestController_resetPassword_10173025072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1410;
     Object term1420;

    public PasswordRecoveryRestController_resetPassword_10173025072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1412 = new HashMap();
        term1410 = newInstance(Class.forName("ru.smartup.timetracker.controller.PasswordRecoveryRestController"));
        Object term1411 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable"));
        setField(term1410, term1410.getClass(), "employeeService", null);
        setField(term1410, term1410.getClass(), "passwordResetTokenService", null);
        setField(term1411, term1411.getClass(), "appNotifiers", term1412);
        setField(term1411, term1411.getClass(), "executorService", null);
        setField(term1410, term1410.getClass(), "notifierObservable", term1411);
        term1420 = newInstance(Class.forName("ru.smartup.timetracker.dto.password.recovery.request.PasswordResetDto"));
        setField(term1420, term1420.getClass(), "token", "OclPbYPkcH");
        setField(term1420, term1420.getClass(), "newPassword", "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.PasswordRecoveryRestController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.dto.password.recovery.request.PasswordResetDto");
        Object[] args = new Object[1];
        args[0] = term1420;
        callMethod(klass, "resetPassword", argTypes, term1410, args);
    }

};



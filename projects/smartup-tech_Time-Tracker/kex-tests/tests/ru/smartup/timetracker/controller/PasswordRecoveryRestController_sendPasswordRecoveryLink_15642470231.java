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

public class PasswordRecoveryRestController_sendPasswordRecoveryLink_15642470231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1377;
     Object term1387;

    public PasswordRecoveryRestController_sendPasswordRecoveryLink_15642470231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1379 = new HashMap();
        term1377 = newInstance(Class.forName("ru.smartup.timetracker.controller.PasswordRecoveryRestController"));
        Object term1378 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable"));
        setField(term1377, term1377.getClass(), "employeeService", null);
        setField(term1377, term1377.getClass(), "passwordResetTokenService", null);
        setField(term1378, term1378.getClass(), "appNotifiers", term1379);
        setField(term1378, term1378.getClass(), "executorService", null);
        setField(term1377, term1377.getClass(), "notifierObservable", term1378);
        term1387 = newInstance(Class.forName("ru.smartup.timetracker.dto.password.recovery.request.PasswordRecoveryDto"));
        setField(term1387, term1387.getClass(), "email", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.PasswordRecoveryRestController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.dto.password.recovery.request.PasswordRecoveryDto");
        Object[] args = new Object[1];
        args[0] = term1387;
        callMethod(klass, "sendPasswordRecoveryLink", argTypes, term1377, args);
    }

};



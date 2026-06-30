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
import java.util.HashMap;

public class PasswordRecoveryRestController_init_2653807570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1367;

    public PasswordRecoveryRestController_init_2653807570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1368 = new HashMap();
        term1367 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable"));
        setField(term1367, term1367.getClass(), "appNotifiers", term1368);
        setField(term1367, term1367.getClass(), "executorService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.PasswordRecoveryRestController");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("ru.smartup.timetracker.service.EmployeeService");
        argTypes[1] = Class.forName("ru.smartup.timetracker.service.PasswordResetTokenService");
        argTypes[2] = Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1367;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



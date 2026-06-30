package ru.smartup.timetracker.service.freeze;

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
import static ru.smartup.timetracker.service.freeze.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FreezeService_init_56987041611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public FreezeService_init_56987041611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeService");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        argTypes[1] = Class.forName("ru.smartup.timetracker.service.freeze.CRUDFreezeService");
        argTypes[2] = Class.forName("ru.smartup.timetracker.service.freeze.FreezeValidator");
        argTypes[3] = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        argTypes[4] = Class.forName("ru.smartup.timetracker.core.lock.LockManager");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



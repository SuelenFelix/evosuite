package ru.smartup.timetracker.exception;

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
import static ru.smartup.timetracker.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class InvalidParameterException_init_10511069040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum2;

    public InvalidParameterException_init_10511069040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4039 = Class.forName((String) "ru.smartup.timetracker.dto.ErrorCode");
        Field term4038 = ((Class) term4039).getDeclaredField((String) "RELATED_ENTITIES_FOUND_FOR_EMPLOYEE");
        ((Field) term4038).setAccessible(true);
        enum2 = ((Field) term4038).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.exception.InvalidParameterException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.dto.ErrorCode");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = enum2;
        args[1] = "aKnKipADSo";
        Object instance = callConstructor(klass, argTypes, args);
    }

};



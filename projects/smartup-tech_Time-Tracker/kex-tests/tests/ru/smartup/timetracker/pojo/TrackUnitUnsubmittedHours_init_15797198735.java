package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;

public class TrackUnitUnsubmittedHours_init_15797198735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17677;

    public TrackUnitUnsubmittedHours_init_15797198735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17677 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitUnsubmittedHours");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.LocalDate");
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17677;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



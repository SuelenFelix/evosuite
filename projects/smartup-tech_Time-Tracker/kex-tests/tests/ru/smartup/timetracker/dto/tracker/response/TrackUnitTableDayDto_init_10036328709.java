package ru.smartup.timetracker.dto.tracker.response;

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
import static ru.smartup.timetracker.dto.tracker.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;
import java.lang.Boolean;

public class TrackUnitTableDayDto_init_10036328709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2966;
     Object term2968;

    public TrackUnitTableDayDto_init_10036328709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2966 = new Float(0.0F);
        term2968 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.time.LocalDate");
        argTypes[1] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        argTypes[2] = float.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term2966;
        args[3] = term2968;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



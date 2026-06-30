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
import java.lang.Object;
import java.lang.Float;

public class TrackUnitUnsubmittedHoursDto_setHours_4208007134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12306;
     Object term12312;

    public TrackUnitUnsubmittedHoursDto_setHours_4208007134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12306 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitUnsubmittedHoursDto"));
        Object term12307 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term12307, term12307.getClass(), "year", 2022);
        setShortField(term12307, term12307.getClass(), "month", (short) 10);
        setShortField(term12307, term12307.getClass(), "day", (short) 18);
        setField(term12306, term12306.getClass(), "week", term12307);
        setFloatField(term12306, term12306.getClass(), "hours", 0.39446723F);
        term12312 = new Float(0.21836233F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitUnsubmittedHoursDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term12312;
        callMethod(klass, "setHours", argTypes, term12306, args);
    }

};



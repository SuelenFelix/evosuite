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
import java.lang.Object;

public class TrackUnitUnsubmittedHours_getWeek_14956219510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17655;

    public TrackUnitUnsubmittedHours_getWeek_14956219510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17655 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitUnsubmittedHours"));
        Object term17656 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term17656, term17656.getClass(), "year", 2012);
        setShortField(term17656, term17656.getClass(), "month", (short) 8);
        setShortField(term17656, term17656.getClass(), "day", (short) 25);
        setField(term17655, term17655.getClass(), "week", term17656);
        setFloatField(term17655, term17655.getClass(), "hours", 0.13238746F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitUnsubmittedHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWeek", argTypes, term17655, args);
    }

};



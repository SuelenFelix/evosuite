package ru.smartup.timetracker.service;

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
import static ru.smartup.timetracker.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;

public class TrackUnitService_insertOrUpdateHoursAndComment_36479522818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3379;
     Object term3382;

    public TrackUnitService_insertOrUpdateHoursAndComment_36479522818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3379 = new LinkedList();
        term3382 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3382, term3382.getClass(), "year", 2021);
        setShortField(term3382, term3382.getClass(), "month", (short) 8);
        setShortField(term3382, term3382.getClass(), "day", (short) 11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.TrackUnitService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[2];
        args[0] = term3379;
        args[1] = term3382;
        callMethod(klass, "insertOrUpdateHoursAndComment", argTypes, null, args);
    }

};



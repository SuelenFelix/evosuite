package ru.smartup.timetracker.dto.approval.response;

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
import static ru.smartup.timetracker.dto.approval.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class SubmittedWorkDayUnitDto_setTrackUnitId_4613253775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29350;
     Object term29355;

    public SubmittedWorkDayUnitDto_setTrackUnitId_4613253775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29350 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term29352 = newInstance(Class.forName("java.util.Date"));
        setLongField(term29350, term29350.getClass(), "trackUnitId", -5455716707538294699L);
        setLongField(term29352, term29352.getClass(), "fastTime", 1856368913597L);
        setField(term29352, term29352.getClass(), "cdate", null);
        setField(term29350, term29350.getClass(), "date", term29352);
        setFloatField(term29350, term29350.getClass(), "hours", 0.20844287F);
        term29355 = new Long(-1889784286465977825L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term29355;
        callMethod(klass, "setTrackUnitId", argTypes, term29350, args);
    }

};



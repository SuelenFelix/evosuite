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

public class SubmittedWorkDayUnitDto_setDate_15774381376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29357;
     Object term29362;

    public SubmittedWorkDayUnitDto_setDate_15774381376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29357 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term29359 = newInstance(Class.forName("java.util.Date"));
        setLongField(term29357, term29357.getClass(), "trackUnitId", 5592522907226111065L);
        setLongField(term29359, term29359.getClass(), "fastTime", 1303146117775L);
        setField(term29359, term29359.getClass(), "cdate", null);
        setField(term29357, term29357.getClass(), "date", term29359);
        setFloatField(term29357, term29357.getClass(), "hours", 0.69335157F);
        term29362 = newInstance(Class.forName("java.util.Date"));
        setLongField(term29362, term29362.getClass(), "fastTime", 1846750848622L);
        setField(term29362, term29362.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term29362;
        callMethod(klass, "setDate", argTypes, term29357, args);
    }

};



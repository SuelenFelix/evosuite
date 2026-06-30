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
import java.lang.Float;

public class SubmittedWorkDayUnitDto_setHours_3220084407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29364;
     Object term29369;

    public SubmittedWorkDayUnitDto_setHours_3220084407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29364 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term29366 = newInstance(Class.forName("java.util.Date"));
        setLongField(term29364, term29364.getClass(), "trackUnitId", -2577420466618938650L);
        setLongField(term29366, term29366.getClass(), "fastTime", 1684482458774L);
        setField(term29366, term29366.getClass(), "cdate", null);
        setField(term29364, term29364.getClass(), "date", term29366);
        setFloatField(term29364, term29364.getClass(), "hours", 0.66750294F);
        term29369 = new Float(0.70398474F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term29369;
        callMethod(klass, "setHours", argTypes, term29364, args);
    }

};



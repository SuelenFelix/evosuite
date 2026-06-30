package ru.smartup.timetracker.dto.production.calendar.response;

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
import static ru.smartup.timetracker.dto.production.calendar.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ProductionCalendarDayDto_setStatus_14120452706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2521;
     Object enum7;

    public ProductionCalendarDayDto_setStatus_14120452706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2556 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term2555 = ((Class) term2556).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term2555).setAccessible(true);
        Object enum6 = ((Field) term2555).get((Object) null);
        term2521 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto"));
        Object term2523 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term2521, term2521.getClass(), "id", 6811161968424632369L);
        setLongField(term2523, term2523.getClass(), "fastTime", 1495357463288L);
        setField(term2523, term2523.getClass(), "cdate", null);
        setField(term2521, term2521.getClass(), "day", term2523);
        setField(term2521, term2521.getClass(), "status", enum6);
        setFloatField(term2521, term2521.getClass(), "hours", 0.5446086F);
        Class<? extends Object> term2962 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term2961 = ((Class) term2962).getDeclaredField((String) "WORK_DAY");
        ((Field) term2961).setAccessible(true);
        enum7 = ((Field) term2961).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Object[] args = new Object[1];
        args[0] = enum7;
        callMethod(klass, "setStatus", argTypes, term2521, args);
    }

};



package ru.smartup.timetracker.dto.production.calendar.request;

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
import static ru.smartup.timetracker.dto.production.calendar.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ProductionCalendarAddDayDto_setStatus_18735355894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1703;
     Object enum5;

    public ProductionCalendarAddDayDto_setStatus_18735355894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1731 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term1730 = ((Class) term1731).getDeclaredField((String) "WORK_DAY");
        ((Field) term1730).setAccessible(true);
        Object enum4 = ((Field) term1730).get((Object) null);
        term1703 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto"));
        Object term1704 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term1704, term1704.getClass(), "fastTime", 1515890130018L);
        setField(term1704, term1704.getClass(), "cdate", null);
        setField(term1703, term1703.getClass(), "day", term1704);
        setField(term1703, term1703.getClass(), "status", enum4);
        setFloatField(term1703, term1703.getClass(), "hours", 0.5523636F);
        Class<? extends Object> term2122 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term2121 = ((Class) term2122).getDeclaredField((String) "WEEKEND");
        ((Field) term2121).setAccessible(true);
        enum5 = ((Field) term2121).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Object[] args = new Object[1];
        args[0] = enum5;
        callMethod(klass, "setStatus", argTypes, term1703, args);
    }

};



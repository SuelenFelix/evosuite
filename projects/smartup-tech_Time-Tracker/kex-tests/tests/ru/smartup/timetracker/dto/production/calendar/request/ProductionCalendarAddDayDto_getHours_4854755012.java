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

public class ProductionCalendarAddDayDto_getHours_4854755012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term871;

    public ProductionCalendarAddDayDto_getHours_4854755012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term887 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term886 = ((Class) term887).getDeclaredField((String) "WEEKEND");
        ((Field) term886).setAccessible(true);
        Object enum2 = ((Field) term886).get((Object) null);
        term871 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto"));
        Object term872 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term872, term872.getClass(), "fastTime", 1610940182830L);
        setField(term872, term872.getClass(), "cdate", null);
        setField(term871, term871.getClass(), "day", term872);
        setField(term871, term871.getClass(), "status", enum2);
        setFloatField(term871, term871.getClass(), "hours", 0.3455959F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHours", argTypes, term871, args);
    }

};



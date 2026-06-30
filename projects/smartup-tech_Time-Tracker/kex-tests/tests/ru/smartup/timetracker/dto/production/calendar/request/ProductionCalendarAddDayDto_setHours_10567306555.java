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
import java.lang.Float;

public class ProductionCalendarAddDayDto_setHours_10567306555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2509;
     Object term2530;

    public ProductionCalendarAddDayDto_setHours_10567306555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2533 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term2532 = ((Class) term2533).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term2532).setAccessible(true);
        Object enum6 = ((Field) term2532).get((Object) null);
        term2509 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto"));
        Object term2510 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term2510, term2510.getClass(), "fastTime", 1429023851389L);
        setField(term2510, term2510.getClass(), "cdate", null);
        setField(term2509, term2509.getClass(), "day", term2510);
        setField(term2509, term2509.getClass(), "status", enum6);
        setFloatField(term2509, term2509.getClass(), "hours", 0.8564069F);
        term2530 = new Float(0.5446086F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term2530;
        callMethod(klass, "setHours", argTypes, term2509, args);
    }

};



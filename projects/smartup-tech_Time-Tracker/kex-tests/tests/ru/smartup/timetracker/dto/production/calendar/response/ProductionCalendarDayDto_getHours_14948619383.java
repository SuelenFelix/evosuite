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

public class ProductionCalendarDayDto_getHours_14948619383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1277;

    public ProductionCalendarDayDto_getHours_14948619383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1300 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term1299 = ((Class) term1300).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term1299).setAccessible(true);
        Object enum3 = ((Field) term1299).get((Object) null);
        term1277 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto"));
        Object term1279 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term1277, term1277.getClass(), "id", -8400487765614892086L);
        setLongField(term1279, term1279.getClass(), "fastTime", 1606045635837L);
        setField(term1279, term1279.getClass(), "cdate", null);
        setField(term1277, term1277.getClass(), "day", term1279);
        setField(term1277, term1277.getClass(), "status", enum3);
        setFloatField(term1277, term1277.getClass(), "hours", 0.09123778F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHours", argTypes, term1277, args);
    }

};



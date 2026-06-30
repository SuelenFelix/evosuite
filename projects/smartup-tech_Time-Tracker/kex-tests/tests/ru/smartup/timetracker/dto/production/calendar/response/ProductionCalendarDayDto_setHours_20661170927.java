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
import java.lang.Float;

public class ProductionCalendarDayDto_setHours_20661170927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3352;
     Object term3369;

    public ProductionCalendarDayDto_setHours_20661170927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3372 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term3371 = ((Class) term3372).getDeclaredField((String) "WORK_DAY");
        ((Field) term3371).setAccessible(true);
        Object enum8 = ((Field) term3371).get((Object) null);
        term3352 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto"));
        Object term3354 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3352, term3352.getClass(), "id", -7237588299778557629L);
        setLongField(term3354, term3354.getClass(), "fastTime", 1645834034896L);
        setField(term3354, term3354.getClass(), "cdate", null);
        setField(term3352, term3352.getClass(), "day", term3354);
        setField(term3352, term3352.getClass(), "status", enum8);
        setFloatField(term3352, term3352.getClass(), "hours", 0.5254275F);
        term3369 = new Float(0.2857073F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term3369;
        callMethod(klass, "setHours", argTypes, term3352, args);
    }

};



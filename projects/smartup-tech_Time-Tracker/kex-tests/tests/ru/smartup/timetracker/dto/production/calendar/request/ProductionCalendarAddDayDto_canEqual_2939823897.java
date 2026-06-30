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

public class ProductionCalendarAddDayDto_canEqual_2939823897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3346;
     Object term3362;

    public ProductionCalendarAddDayDto_canEqual_2939823897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3364 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term3363 = ((Class) term3364).getDeclaredField((String) "WORK_DAY");
        ((Field) term3363).setAccessible(true);
        Object enum8 = ((Field) term3363).get((Object) null);
        term3346 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto"));
        Object term3347 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3347, term3347.getClass(), "fastTime", 1645834034896L);
        setField(term3347, term3347.getClass(), "cdate", null);
        setField(term3346, term3346.getClass(), "day", term3347);
        setField(term3346, term3346.getClass(), "status", enum8);
        setFloatField(term3346, term3346.getClass(), "hours", 0.2857073F);
        term3362 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3362;
        callMethod(klass, "canEqual", argTypes, term3346, args);
    }

};



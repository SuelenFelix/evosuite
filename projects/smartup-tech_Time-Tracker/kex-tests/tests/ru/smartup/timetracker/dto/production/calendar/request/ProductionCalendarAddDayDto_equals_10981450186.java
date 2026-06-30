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

public class ProductionCalendarAddDayDto_equals_10981450186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2938;
     Object term2954;

    public ProductionCalendarAddDayDto_equals_10981450186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2956 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term2955 = ((Class) term2956).getDeclaredField((String) "WORK_DAY");
        ((Field) term2955).setAccessible(true);
        Object enum7 = ((Field) term2955).get((Object) null);
        term2938 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto"));
        Object term2939 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term2939, term2939.getClass(), "fastTime", 1495357463288L);
        setField(term2939, term2939.getClass(), "cdate", null);
        setField(term2938, term2938.getClass(), "day", term2939);
        setField(term2938, term2938.getClass(), "status", enum7);
        setFloatField(term2938, term2938.getClass(), "hours", 0.5254275F);
        term2954 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2954;
        callMethod(klass, "equals", argTypes, term2938, args);
    }

};



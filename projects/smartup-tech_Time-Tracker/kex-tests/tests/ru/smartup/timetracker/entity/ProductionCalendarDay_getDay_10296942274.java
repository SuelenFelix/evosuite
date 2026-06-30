package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ProductionCalendarDay_getDay_10296942274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104410;

    public ProductionCalendarDay_getDay_10296942274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term104436 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term104435 = ((Class) term104436).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term104435).setAccessible(true);
        Object enum228 = ((Field) term104435).get((Object) null);
        term104410 = newInstance(Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay"));
        Object term104413 = newInstance(Class.forName("java.sql.Date"));
        Object term104432 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term104410, term104410.getClass(), "id", -3730936709704460408L);
        setFloatField(term104410, term104410.getClass(), "hours", 0.8886614F);
        setLongField(term104413, term104413.getClass(), "fastTime", 1405279189488L);
        setField(term104413, term104413.getClass(), "cdate", null);
        setField(term104410, term104410.getClass(), "day", term104413);
        setField(term104410, term104410.getClass(), "status", enum228);
        setIntField(term104432, term104432.getClass(), "nanos", 193000000);
        setLongField(term104432, term104432.getClass(), "fastTime", 1496607365000L);
        setField(term104432, term104432.getClass(), "cdate", null);
        setField(term104410, term104410.getClass(), "createdDate", term104432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDay", argTypes, term104410, args);
    }

};



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

public class ProductionCalendarDay_getHours_272213123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104003;

    public ProductionCalendarDay_getHours_272213123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term104023 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term104022 = ((Class) term104023).getDeclaredField((String) "WEEKEND");
        ((Field) term104022).setAccessible(true);
        Object enum227 = ((Field) term104022).get((Object) null);
        term104003 = newInstance(Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay"));
        Object term104006 = newInstance(Class.forName("java.sql.Date"));
        Object term104019 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term104003, term104003.getClass(), "id", 4502292577098212311L);
        setFloatField(term104003, term104003.getClass(), "hours", 0.32021916F);
        setLongField(term104006, term104006.getClass(), "fastTime", 1464421789888L);
        setField(term104006, term104006.getClass(), "cdate", null);
        setField(term104003, term104003.getClass(), "day", term104006);
        setField(term104003, term104003.getClass(), "status", enum227);
        setIntField(term104019, term104019.getClass(), "nanos", 415000000);
        setLongField(term104019, term104019.getClass(), "fastTime", 1575741925000L);
        setField(term104019, term104019.getClass(), "cdate", null);
        setField(term104003, term104003.getClass(), "createdDate", term104019);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHours", argTypes, term104003, args);
    }

};



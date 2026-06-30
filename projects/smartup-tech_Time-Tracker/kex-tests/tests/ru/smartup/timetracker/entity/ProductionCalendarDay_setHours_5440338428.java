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
import java.lang.Float;

public class ProductionCalendarDay_setHours_5440338428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106092;
     Object term106112;

    public ProductionCalendarDay_setHours_5440338428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term106115 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term106114 = ((Class) term106115).getDeclaredField((String) "WORK_DAY");
        ((Field) term106114).setAccessible(true);
        Object enum232 = ((Field) term106114).get((Object) null);
        term106092 = newInstance(Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay"));
        Object term106095 = newInstance(Class.forName("java.sql.Date"));
        Object term106109 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term106092, term106092.getClass(), "id", 5465527210299101732L);
        setFloatField(term106092, term106092.getClass(), "hours", 0.2889229F);
        setLongField(term106095, term106095.getClass(), "fastTime", 1426018874434L);
        setField(term106095, term106095.getClass(), "cdate", null);
        setField(term106092, term106092.getClass(), "day", term106095);
        setField(term106092, term106092.getClass(), "status", enum232);
        setIntField(term106109, term106109.getClass(), "nanos", 723000000);
        setLongField(term106109, term106109.getClass(), "fastTime", 1654501803000L);
        setField(term106109, term106109.getClass(), "cdate", null);
        setField(term106092, term106092.getClass(), "createdDate", term106109);
        term106112 = new Float(0.65889484F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term106112;
        callMethod(klass, "setHours", argTypes, term106092, args);
    }

};



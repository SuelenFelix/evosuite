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

public class ProductionCalendarDay_setDay_16755357139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106505;
     Object term106525;

    public ProductionCalendarDay_setDay_16755357139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term106528 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term106527 = ((Class) term106528).getDeclaredField((String) "WORK_DAY");
        ((Field) term106527).setAccessible(true);
        Object enum233 = ((Field) term106527).get((Object) null);
        term106505 = newInstance(Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay"));
        Object term106508 = newInstance(Class.forName("java.sql.Date"));
        Object term106522 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term106505, term106505.getClass(), "id", 4699157009689333952L);
        setFloatField(term106505, term106505.getClass(), "hours", 0.25392914F);
        setLongField(term106508, term106508.getClass(), "fastTime", 1633004775487L);
        setField(term106508, term106508.getClass(), "cdate", null);
        setField(term106505, term106505.getClass(), "day", term106508);
        setField(term106505, term106505.getClass(), "status", enum233);
        setIntField(term106522, term106522.getClass(), "nanos", 746000000);
        setLongField(term106522, term106522.getClass(), "fastTime", 1800358689000L);
        setField(term106522, term106522.getClass(), "cdate", null);
        setField(term106505, term106505.getClass(), "createdDate", term106522);
        term106525 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term106525, term106525.getClass(), "fastTime", 1819191638549L);
        setField(term106525, term106525.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Date");
        Object[] args = new Object[1];
        args[0] = term106525;
        callMethod(klass, "setDay", argTypes, term106505, args);
    }

};



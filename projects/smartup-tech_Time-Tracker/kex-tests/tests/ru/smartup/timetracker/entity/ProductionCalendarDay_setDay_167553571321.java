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

public class ProductionCalendarDay_setDay_167553571321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108171;

    public ProductionCalendarDay_setDay_167553571321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108171 = newInstance(Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay"));
        setLongField(term108171, term108171.getClass(), "id", 0L);
        setFloatField(term108171, term108171.getClass(), "hours", 0.0F);
        setField(term108171, term108171.getClass(), "day", null);
        setField(term108171, term108171.getClass(), "status", null);
        setField(term108171, term108171.getClass(), "createdDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDay", argTypes, term108171, args);
    }

};



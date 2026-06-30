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
import java.lang.Float;

public class ProductionCalendarDay_setHours_54403384220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108166;
     Object term108169;

    public ProductionCalendarDay_setHours_54403384220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108166 = newInstance(Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay"));
        setLongField(term108166, term108166.getClass(), "id", 0L);
        setFloatField(term108166, term108166.getClass(), "hours", 0.0F);
        setField(term108166, term108166.getClass(), "day", null);
        setField(term108166, term108166.getClass(), "status", null);
        setField(term108166, term108166.getClass(), "createdDate", null);
        term108169 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term108169;
        callMethod(klass, "setHours", argTypes, term108166, args);
    }

};



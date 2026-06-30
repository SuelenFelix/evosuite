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
import java.lang.Long;

public class ProductionCalendarDay_setId_27382473819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108161;
     Object term108164;

    public ProductionCalendarDay_setId_27382473819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108161 = newInstance(Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay"));
        setLongField(term108161, term108161.getClass(), "id", 0L);
        setFloatField(term108161, term108161.getClass(), "hours", 0.0F);
        setField(term108161, term108161.getClass(), "day", null);
        setField(term108161, term108161.getClass(), "status", null);
        setField(term108161, term108161.getClass(), "createdDate", null);
        term108164 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term108164;
        callMethod(klass, "setId", argTypes, term108161, args);
    }

};



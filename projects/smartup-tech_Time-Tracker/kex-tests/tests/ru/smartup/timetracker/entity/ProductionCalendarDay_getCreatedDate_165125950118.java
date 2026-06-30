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

public class ProductionCalendarDay_getCreatedDate_165125950118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108158;

    public ProductionCalendarDay_getCreatedDate_165125950118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108158 = newInstance(Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay"));
        setLongField(term108158, term108158.getClass(), "id", 0L);
        setFloatField(term108158, term108158.getClass(), "hours", 0.0F);
        setField(term108158, term108158.getClass(), "day", null);
        setField(term108158, term108158.getClass(), "status", null);
        setField(term108158, term108158.getClass(), "createdDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term108158, args);
    }

};



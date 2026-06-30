package ru.smartup.timetracker.dto.production.calendar.response;

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
import static ru.smartup.timetracker.dto.production.calendar.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProductionCalendarDayDto_getDay_49238902315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5800;

    public ProductionCalendarDayDto_getDay_49238902315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5800 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto"));
        setLongField(term5800, term5800.getClass(), "id", 0L);
        setField(term5800, term5800.getClass(), "day", null);
        setField(term5800, term5800.getClass(), "status", null);
        setFloatField(term5800, term5800.getClass(), "hours", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDay", argTypes, term5800, args);
    }

};



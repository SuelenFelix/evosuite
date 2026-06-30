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

public class ProductionCalendarAddDayDto_setStatus_187353558916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4979;

    public ProductionCalendarAddDayDto_setStatus_187353558916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4979 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto"));
        setField(term4979, term4979.getClass(), "day", null);
        setField(term4979, term4979.getClass(), "status", null);
        setFloatField(term4979, term4979.getClass(), "hours", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStatus", argTypes, term4979, args);
    }

};



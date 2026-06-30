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
import java.lang.Float;

public class ProductionCalendarDayDto_setHours_206611709221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5820;
     Object term5823;

    public ProductionCalendarDayDto_setHours_206611709221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5820 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto"));
        setLongField(term5820, term5820.getClass(), "id", 0L);
        setField(term5820, term5820.getClass(), "day", null);
        setField(term5820, term5820.getClass(), "status", null);
        setFloatField(term5820, term5820.getClass(), "hours", 0.0F);
        term5823 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term5823;
        callMethod(klass, "setHours", argTypes, term5820, args);
    }

};



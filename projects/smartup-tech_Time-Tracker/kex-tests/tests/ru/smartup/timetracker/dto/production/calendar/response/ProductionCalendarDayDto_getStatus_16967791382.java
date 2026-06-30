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
import java.lang.Object;
import java.lang.String;

public class ProductionCalendarDayDto_getStatus_16967791382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term873;

    public ProductionCalendarDayDto_getStatus_16967791382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term890 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term889 = ((Class) term890).getDeclaredField((String) "WEEKEND");
        ((Field) term889).setAccessible(true);
        Object enum2 = ((Field) term889).get((Object) null);
        term873 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto"));
        Object term875 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term873, term873.getClass(), "id", -8257434502486459194L);
        setLongField(term875, term875.getClass(), "fastTime", 1610940182830L);
        setField(term875, term875.getClass(), "cdate", null);
        setField(term873, term873.getClass(), "day", term875);
        setField(term873, term873.getClass(), "status", enum2);
        setFloatField(term873, term873.getClass(), "hours", 0.3455959F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term873, args);
    }

};



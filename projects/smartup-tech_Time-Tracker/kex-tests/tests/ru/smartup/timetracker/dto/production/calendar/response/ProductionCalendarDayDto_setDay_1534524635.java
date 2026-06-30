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

public class ProductionCalendarDayDto_setDay_1534524635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2115;
     Object term2131;

    public ProductionCalendarDayDto_setDay_1534524635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2134 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term2133 = ((Class) term2134).getDeclaredField((String) "WEEKEND");
        ((Field) term2133).setAccessible(true);
        Object enum5 = ((Field) term2133).get((Object) null);
        term2115 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto"));
        Object term2117 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term2115, term2115.getClass(), "id", 4872422362414183754L);
        setLongField(term2117, term2117.getClass(), "fastTime", 1515890130018L);
        setField(term2117, term2117.getClass(), "cdate", null);
        setField(term2115, term2115.getClass(), "day", term2117);
        setField(term2115, term2115.getClass(), "status", enum5);
        setFloatField(term2115, term2115.getClass(), "hours", 0.8564069F);
        term2131 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term2131, term2131.getClass(), "fastTime", 1429023851389L);
        setField(term2131, term2131.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Date");
        Object[] args = new Object[1];
        args[0] = term2131;
        callMethod(klass, "setDay", argTypes, term2115, args);
    }

};



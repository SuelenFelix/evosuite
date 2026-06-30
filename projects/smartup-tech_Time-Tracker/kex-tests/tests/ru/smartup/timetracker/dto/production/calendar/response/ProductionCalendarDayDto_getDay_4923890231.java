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

public class ProductionCalendarDayDto_getDay_4923890231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445;

    public ProductionCalendarDayDto_getDay_4923890231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term468 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term467 = ((Class) term468).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term467).setAccessible(true);
        Object enum1 = ((Field) term467).get((Object) null);
        term445 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto"));
        Object term447 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term445, term445.getClass(), "id", 6375119433582206027L);
        setLongField(term447, term447.getClass(), "fastTime", 1480438351369L);
        setField(term447, term447.getClass(), "cdate", null);
        setField(term445, term445.getClass(), "day", term447);
        setField(term445, term445.getClass(), "status", enum1);
        setFloatField(term445, term445.getClass(), "hours", 0.2707036F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDay", argTypes, term445, args);
    }

};



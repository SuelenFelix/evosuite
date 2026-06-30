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
import java.lang.Long;

public class ProductionCalendarDayDto_setId_12482585124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1705;
     Object term1722;

    public ProductionCalendarDayDto_setId_12482585124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1725 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term1724 = ((Class) term1725).getDeclaredField((String) "WORK_DAY");
        ((Field) term1724).setAccessible(true);
        Object enum4 = ((Field) term1724).get((Object) null);
        term1705 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto"));
        Object term1707 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term1705, term1705.getClass(), "id", 5270370404989704783L);
        setLongField(term1707, term1707.getClass(), "fastTime", 1442639565302L);
        setField(term1707, term1707.getClass(), "cdate", null);
        setField(term1705, term1705.getClass(), "day", term1707);
        setField(term1705, term1705.getClass(), "status", enum4);
        setFloatField(term1705, term1705.getClass(), "hours", 0.5523636F);
        term1722 = new Long(7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1722;
        callMethod(klass, "setId", argTypes, term1705, args);
    }

};



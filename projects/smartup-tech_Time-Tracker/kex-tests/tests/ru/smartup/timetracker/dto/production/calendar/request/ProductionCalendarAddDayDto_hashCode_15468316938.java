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
import java.lang.Object;
import java.lang.String;

public class ProductionCalendarAddDayDto_hashCode_15468316938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3754;

    public ProductionCalendarAddDayDto_hashCode_15468316938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3771 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term3770 = ((Class) term3771).getDeclaredField((String) "WORK_DAY");
        ((Field) term3770).setAccessible(true);
        Object enum9 = ((Field) term3770).get((Object) null);
        term3754 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto"));
        Object term3755 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3755, term3755.getClass(), "fastTime", 1500721068023L);
        setField(term3755, term3755.getClass(), "cdate", null);
        setField(term3754, term3754.getClass(), "day", term3755);
        setField(term3754, term3754.getClass(), "status", enum9);
        setFloatField(term3754, term3754.getClass(), "hours", 0.6880585F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3754, args);
    }

};



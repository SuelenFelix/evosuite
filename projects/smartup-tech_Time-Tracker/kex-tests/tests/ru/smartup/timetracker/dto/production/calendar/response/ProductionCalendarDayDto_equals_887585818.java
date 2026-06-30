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

public class ProductionCalendarDayDto_equals_887585818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3762;
     Object term3779;

    public ProductionCalendarDayDto_equals_887585818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3781 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term3780 = ((Class) term3781).getDeclaredField((String) "WORK_DAY");
        ((Field) term3780).setAccessible(true);
        Object enum9 = ((Field) term3780).get((Object) null);
        term3762 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto"));
        Object term3764 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3762, term3762.getClass(), "id", 6967924379644551255L);
        setLongField(term3764, term3764.getClass(), "fastTime", 1500721068023L);
        setField(term3764, term3764.getClass(), "cdate", null);
        setField(term3762, term3762.getClass(), "day", term3764);
        setField(term3762, term3762.getClass(), "status", enum9);
        setFloatField(term3762, term3762.getClass(), "hours", 0.6880585F);
        term3779 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3779;
        callMethod(klass, "equals", argTypes, term3762, args);
    }

};



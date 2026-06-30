package ru.smartup.timetracker.dto.approval.response;

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
import static ru.smartup.timetracker.dto.approval.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MetaDayInfoDto_equals_17777451909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25453;
     Object term25470;

    public MetaDayInfoDto_equals_17777451909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25472 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term25471 = ((Class) term25472).getDeclaredField((String) "WEEKEND");
        ((Field) term25471).setAccessible(true);
        Object enum47 = ((Field) term25471).get((Object) null);
        term25453 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term25454 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term25454, term25454.getClass(), "year", 2017);
        setShortField(term25454, term25454.getClass(), "month", (short) 3);
        setShortField(term25454, term25454.getClass(), "day", (short) 31);
        setField(term25453, term25453.getClass(), "date", term25454);
        setField(term25453, term25453.getClass(), "status", enum47);
        setFloatField(term25453, term25453.getClass(), "standardHours", 0.9276995F);
        term25470 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term25470;
        callMethod(klass, "equals", argTypes, term25453, args);
    }

};



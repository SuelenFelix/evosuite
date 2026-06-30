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

public class MetaDayInfoDto_setDate_10222495106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23825;
     Object term23842;

    public MetaDayInfoDto_setDate_10222495106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23847 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term23846 = ((Class) term23847).getDeclaredField((String) "WEEKEND");
        ((Field) term23846).setAccessible(true);
        Object enum43 = ((Field) term23846).get((Object) null);
        term23825 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term23826 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term23826, term23826.getClass(), "year", 2020);
        setShortField(term23826, term23826.getClass(), "month", (short) 8);
        setShortField(term23826, term23826.getClass(), "day", (short) 13);
        setField(term23825, term23825.getClass(), "date", term23826);
        setField(term23825, term23825.getClass(), "status", enum43);
        setFloatField(term23825, term23825.getClass(), "standardHours", 0.0074937344F);
        term23842 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term23842, term23842.getClass(), "year", 2024);
        setShortField(term23842, term23842.getClass(), "month", (short) 4);
        setShortField(term23842, term23842.getClass(), "day", (short) 23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term23842;
        callMethod(klass, "setDate", argTypes, term23825, args);
    }

};



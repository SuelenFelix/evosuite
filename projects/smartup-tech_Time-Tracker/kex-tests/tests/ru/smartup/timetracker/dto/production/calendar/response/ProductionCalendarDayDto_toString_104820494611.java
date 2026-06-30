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

public class ProductionCalendarDayDto_toString_104820494611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4984;

    public ProductionCalendarDayDto_toString_104820494611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5001 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term5000 = ((Class) term5001).getDeclaredField((String) "WEEKEND");
        ((Field) term5000).setAccessible(true);
        Object enum12 = ((Field) term5000).get((Object) null);
        term4984 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto"));
        Object term4986 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4984, term4984.getClass(), "id", -4325723315152823407L);
        setLongField(term4986, term4986.getClass(), "fastTime", 1745462962080L);
        setField(term4986, term4986.getClass(), "cdate", null);
        setField(term4984, term4984.getClass(), "day", term4986);
        setField(term4984, term4984.getClass(), "status", enum12);
        setFloatField(term4984, term4984.getClass(), "hours", 0.26413453F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4984, args);
    }

};



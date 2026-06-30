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

public class ProductionCalendarAddDayDto_toString_20575913839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4161;

    public ProductionCalendarAddDayDto_toString_20575913839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4177 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term4176 = ((Class) term4177).getDeclaredField((String) "WEEKEND");
        ((Field) term4176).setAccessible(true);
        Object enum10 = ((Field) term4176).get((Object) null);
        term4161 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto"));
        Object term4162 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4162, term4162.getClass(), "fastTime", 1797203628025L);
        setField(term4162, term4162.getClass(), "cdate", null);
        setField(term4161, term4161.getClass(), "day", term4162);
        setField(term4161, term4161.getClass(), "status", enum10);
        setFloatField(term4161, term4161.getClass(), "hours", 0.40176582F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4161, args);
    }

};



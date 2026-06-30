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
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.lang.Float;

public class ProductionCalendarDayDto_init_2172173612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5388;
     Object term5390;
     Object enum13;
     Object term5404;

    public ProductionCalendarDayDto_init_2172173612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5388 = new Long(2535595959091595249L);
        term5390 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5390, term5390.getClass(), "fastTime", 1349069753960L);
        setField(term5390, term5390.getClass(), "cdate", null);
        Class<? extends Object> term5407 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term5406 = ((Class) term5407).getDeclaredField((String) "WORK_DAY");
        ((Field) term5406).setAccessible(true);
        enum13 = ((Field) term5406).get((Object) null);
        term5404 = new Float(0.7944024F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.sql.Date");
        argTypes[2] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        argTypes[3] = float.class;
        Object[] args = new Object[4];
        args[0] = term5388;
        args[1] = term5390;
        args[2] = enum13;
        args[3] = term5404;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



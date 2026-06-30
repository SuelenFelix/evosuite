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
import java.lang.String;
import java.lang.Object;
import java.lang.Float;

public class ProductionCalendarAddDayDto_init_107447567510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4564;
     Object enum11;
     Object term4578;

    public ProductionCalendarAddDayDto_init_107447567510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4564 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4564, term4564.getClass(), "fastTime", 1589457921030L);
        setField(term4564, term4564.getClass(), "cdate", null);
        Class<? extends Object> term4581 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term4580 = ((Class) term4581).getDeclaredField((String) "WORK_DAY");
        ((Field) term4580).setAccessible(true);
        enum11 = ((Field) term4580).get((Object) null);
        term4578 = new Float(0.8783184F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.sql.Date");
        argTypes[1] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        argTypes[2] = float.class;
        Object[] args = new Object[3];
        args[0] = term4564;
        args[1] = enum11;
        args[2] = term4578;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



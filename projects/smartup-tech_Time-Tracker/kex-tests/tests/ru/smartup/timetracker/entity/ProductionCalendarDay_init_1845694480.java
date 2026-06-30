package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Float;
import java.lang.String;
import java.lang.Object;

public class ProductionCalendarDay_init_1845694480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103164;
     Object term103166;
     Object term103168;
     Object enum225;
     Object term103181;

    public ProductionCalendarDay_init_1845694480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103164 = new Long(4616440478358528406L);
        term103166 = new Float(0.52792794F);
        term103168 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term103168, term103168.getClass(), "fastTime", 1311560117361L);
        setField(term103168, term103168.getClass(), "cdate", null);
        Class<? extends Object> term103185 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term103184 = ((Class) term103185).getDeclaredField((String) "WEEKEND");
        ((Field) term103184).setAccessible(true);
        enum225 = ((Field) term103184).get((Object) null);
        term103181 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term103181, term103181.getClass(), "nanos", 166000000);
        setLongField(term103181, term103181.getClass(), "fastTime", 1454405571000L);
        setField(term103181, term103181.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = float.class;
        argTypes[2] = Class.forName("java.sql.Date");
        argTypes[3] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        argTypes[4] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[5];
        args[0] = term103164;
        args[1] = term103166;
        args[2] = term103168;
        args[3] = enum225;
        args[4] = term103181;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



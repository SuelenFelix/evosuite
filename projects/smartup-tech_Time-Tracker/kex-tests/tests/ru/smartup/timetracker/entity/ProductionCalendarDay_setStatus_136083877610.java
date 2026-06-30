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
import java.lang.Object;
import java.lang.String;

public class ProductionCalendarDay_setStatus_136083877610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106918;
     Object enum235;

    public ProductionCalendarDay_setStatus_136083877610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term106950 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term106949 = ((Class) term106950).getDeclaredField((String) "WORK_DAY");
        ((Field) term106949).setAccessible(true);
        Object enum234 = ((Field) term106949).get((Object) null);
        term106918 = newInstance(Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay"));
        Object term106921 = newInstance(Class.forName("java.sql.Date"));
        Object term106935 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term106918, term106918.getClass(), "id", -78240609295693193L);
        setFloatField(term106918, term106918.getClass(), "hours", 0.63972145F);
        setLongField(term106921, term106921.getClass(), "fastTime", 1400691778698L);
        setField(term106921, term106921.getClass(), "cdate", null);
        setField(term106918, term106918.getClass(), "day", term106921);
        setField(term106918, term106918.getClass(), "status", enum234);
        setIntField(term106935, term106935.getClass(), "nanos", 427000000);
        setLongField(term106935, term106935.getClass(), "fastTime", 1868694814000L);
        setField(term106935, term106935.getClass(), "cdate", null);
        setField(term106918, term106918.getClass(), "createdDate", term106935);
        Class<? extends Object> term107341 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term107340 = ((Class) term107341).getDeclaredField((String) "WEEKEND");
        ((Field) term107340).setAccessible(true);
        enum235 = ((Field) term107340).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Object[] args = new Object[1];
        args[0] = enum235;
        callMethod(klass, "setStatus", argTypes, term106918, args);
    }

};



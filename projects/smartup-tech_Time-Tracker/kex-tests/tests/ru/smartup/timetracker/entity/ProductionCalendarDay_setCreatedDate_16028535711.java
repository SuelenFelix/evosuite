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

public class ProductionCalendarDay_setCreatedDate_16028535711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107728;
     Object term107748;

    public ProductionCalendarDay_setCreatedDate_16028535711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term107752 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term107751 = ((Class) term107752).getDeclaredField((String) "WORK_DAY");
        ((Field) term107751).setAccessible(true);
        Object enum236 = ((Field) term107751).get((Object) null);
        term107728 = newInstance(Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay"));
        Object term107731 = newInstance(Class.forName("java.sql.Date"));
        Object term107745 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term107728, term107728.getClass(), "id", 3090901538358721367L);
        setFloatField(term107728, term107728.getClass(), "hours", 0.3357792F);
        setLongField(term107731, term107731.getClass(), "fastTime", 1741444563811L);
        setField(term107731, term107731.getClass(), "cdate", null);
        setField(term107728, term107728.getClass(), "day", term107731);
        setField(term107728, term107728.getClass(), "status", enum236);
        setIntField(term107745, term107745.getClass(), "nanos", 544000000);
        setLongField(term107745, term107745.getClass(), "fastTime", 1699420811000L);
        setField(term107745, term107745.getClass(), "cdate", null);
        setField(term107728, term107728.getClass(), "createdDate", term107745);
        term107748 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term107748, term107748.getClass(), "nanos", 150000000);
        setLongField(term107748, term107748.getClass(), "fastTime", 1531770992000L);
        setField(term107748, term107748.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term107748;
        callMethod(klass, "setCreatedDate", argTypes, term107728, args);
    }

};



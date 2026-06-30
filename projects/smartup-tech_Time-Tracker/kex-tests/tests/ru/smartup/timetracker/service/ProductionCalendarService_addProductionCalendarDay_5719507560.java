package ru.smartup.timetracker.service;

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
import static ru.smartup.timetracker.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ProductionCalendarService_addProductionCalendarDay_5719507560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ProductionCalendarService_addProductionCalendarDay_5719507560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term60 = ((Class) term61).getDeclaredField((String) "WEEKEND");
        ((Field) term60).setAccessible(true);
        Object enum0 = ((Field) term60).get((Object) null);
        term1 = newInstance(Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay"));
        Object term4 = newInstance(Class.forName("java.sql.Date"));
        Object term17 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1, term1.getClass(), "id", 2442117782898005296L);
        setFloatField(term1, term1.getClass(), "hours", 0.13238746F);
        setLongField(term4, term4.getClass(), "fastTime", 1345871412244L);
        setField(term4, term4.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "day", term4);
        setField(term1, term1.getClass(), "status", enum0);
        setIntField(term17, term17.getClass(), "nanos", 244000000);
        setLongField(term17, term17.getClass(), "fastTime", 1345860612000L);
        setField(term17, term17.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "createdDate", term17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.ProductionCalendarService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "addProductionCalendarDay", argTypes, null, args);
    }

};



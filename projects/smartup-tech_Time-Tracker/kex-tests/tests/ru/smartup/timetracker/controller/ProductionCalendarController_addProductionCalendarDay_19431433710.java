package ru.smartup.timetracker.controller;

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
import static ru.smartup.timetracker.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ProductionCalendarController_addProductionCalendarDay_19431433710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ProductionCalendarController_addProductionCalendarDay_19431433710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term57 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term56 = ((Class) term57).getDeclaredField((String) "WEEKEND");
        ((Field) term56).setAccessible(true);
        Object enum0 = ((Field) term56).get((Object) null);
        term1 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto"));
        Object term2 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term2, term2.getClass(), "fastTime", 1345871412244L);
        setField(term2, term2.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "day", term2);
        setField(term1, term1.getClass(), "status", enum0);
        setFloatField(term1, term1.getClass(), "hours", 0.13238746F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.ProductionCalendarController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "addProductionCalendarDay", argTypes, null, args);
    }

};



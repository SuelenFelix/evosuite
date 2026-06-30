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

public class MetaDayInfoDto_setStatus_4544585017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24234;
     Object enum45;

    public MetaDayInfoDto_setStatus_4544585017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24264 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term24263 = ((Class) term24264).getDeclaredField((String) "WORK_DAY");
        ((Field) term24263).setAccessible(true);
        Object enum44 = ((Field) term24263).get((Object) null);
        term24234 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term24235 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term24235, term24235.getClass(), "year", 2022);
        setShortField(term24235, term24235.getClass(), "month", (short) 9);
        setShortField(term24235, term24235.getClass(), "day", (short) 17);
        setField(term24234, term24234.getClass(), "date", term24235);
        setField(term24234, term24234.getClass(), "status", enum44);
        setFloatField(term24234, term24234.getClass(), "standardHours", 0.41169226F);
        Class<? extends Object> term24655 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term24654 = ((Class) term24655).getDeclaredField((String) "WEEKEND");
        ((Field) term24654).setAccessible(true);
        enum45 = ((Field) term24654).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Object[] args = new Object[1];
        args[0] = enum45;
        callMethod(klass, "setStatus", argTypes, term24234, args);
    }

};



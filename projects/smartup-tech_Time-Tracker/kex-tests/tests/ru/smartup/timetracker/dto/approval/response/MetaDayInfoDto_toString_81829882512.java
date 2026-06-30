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

public class MetaDayInfoDto_toString_81829882512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26678;

    public MetaDayInfoDto_toString_81829882512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26697 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term26696 = ((Class) term26697).getDeclaredField((String) "WORK_DAY");
        ((Field) term26696).setAccessible(true);
        Object enum50 = ((Field) term26696).get((Object) null);
        term26678 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term26679 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term26679, term26679.getClass(), "year", 2023);
        setShortField(term26679, term26679.getClass(), "month", (short) 7);
        setShortField(term26679, term26679.getClass(), "day", (short) 15);
        setField(term26678, term26678.getClass(), "date", term26679);
        setField(term26678, term26678.getClass(), "status", enum50);
        setFloatField(term26678, term26678.getClass(), "standardHours", 0.98857903F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term26678, args);
    }

};



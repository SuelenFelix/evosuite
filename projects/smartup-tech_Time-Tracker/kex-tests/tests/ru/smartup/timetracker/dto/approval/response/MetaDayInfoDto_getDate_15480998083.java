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

public class MetaDayInfoDto_getDate_15480998083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22562;

    public MetaDayInfoDto_getDate_15480998083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22580 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term22579 = ((Class) term22580).getDeclaredField((String) "WEEKEND");
        ((Field) term22579).setAccessible(true);
        Object enum40 = ((Field) term22579).get((Object) null);
        term22562 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term22563 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term22563, term22563.getClass(), "year", 2010);
        setShortField(term22563, term22563.getClass(), "month", (short) 6);
        setShortField(term22563, term22563.getClass(), "day", (short) 14);
        setField(term22562, term22562.getClass(), "date", term22563);
        setField(term22562, term22562.getClass(), "status", enum40);
        setFloatField(term22562, term22562.getClass(), "standardHours", 0.27164584F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term22562, args);
    }

};



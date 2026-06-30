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

public class MetaDayInfoDto_getStandardHours_19831973605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23396;

    public MetaDayInfoDto_getStandardHours_19831973605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23420 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term23419 = ((Class) term23420).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term23419).setAccessible(true);
        Object enum42 = ((Field) term23419).get((Object) null);
        term23396 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term23397 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term23397, term23397.getClass(), "year", 2010);
        setShortField(term23397, term23397.getClass(), "month", (short) 5);
        setShortField(term23397, term23397.getClass(), "day", (short) 2);
        setField(term23396, term23396.getClass(), "date", term23397);
        setField(term23396, term23396.getClass(), "status", enum42);
        setFloatField(term23396, term23396.getClass(), "standardHours", 0.6590957F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStandardHours", argTypes, term23396, args);
    }

};



package ru.smartup.timetracker.dto.tracker.response;

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
import static ru.smartup.timetracker.dto.tracker.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TrackUnitTableDayDto_hashCode_5085346685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2128;

    public TrackUnitTableDayDto_hashCode_5085346685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2147 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term2146 = ((Class) term2147).getDeclaredField((String) "WEEKEND");
        ((Field) term2146).setAccessible(true);
        Object enum5 = ((Field) term2146).get((Object) null);
        term2128 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term2130 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term2128, term2128.getClass(), "blocked", true);
        setIntField(term2130, term2130.getClass(), "year", 2018);
        setShortField(term2130, term2130.getClass(), "month", (short) 1);
        setShortField(term2130, term2130.getClass(), "day", (short) 13);
        setField(term2128, term2128.getClass(), "date", term2130);
        setField(term2128, term2128.getClass(), "status", enum5);
        setFloatField(term2128, term2128.getClass(), "standardHours", 0.8564069F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2128, args);
    }

};



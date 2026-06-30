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

public class MetaDayInfoDto_hashCode_132905851511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26269;

    public MetaDayInfoDto_hashCode_132905851511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26288 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term26287 = ((Class) term26288).getDeclaredField((String) "WORK_DAY");
        ((Field) term26287).setAccessible(true);
        Object enum49 = ((Field) term26287).get((Object) null);
        term26269 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term26270 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term26270, term26270.getClass(), "year", 2022);
        setShortField(term26270, term26270.getClass(), "month", (short) 2);
        setShortField(term26270, term26270.getClass(), "day", (short) 4);
        setField(term26269, term26269.getClass(), "date", term26270);
        setField(term26269, term26269.getClass(), "status", enum49);
        setFloatField(term26269, term26269.getClass(), "standardHours", 0.76361305F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term26269, args);
    }

};



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

public class MetaDayInfoDto_canEqual_171305947710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25859;
     Object term25877;

    public MetaDayInfoDto_canEqual_171305947710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25879 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term25878 = ((Class) term25879).getDeclaredField((String) "WORK_DAY");
        ((Field) term25878).setAccessible(true);
        Object enum48 = ((Field) term25878).get((Object) null);
        term25859 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term25860 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term25860, term25860.getClass(), "year", 2010);
        setShortField(term25860, term25860.getClass(), "month", (short) 9);
        setShortField(term25860, term25860.getClass(), "day", (short) 28);
        setField(term25859, term25859.getClass(), "date", term25860);
        setField(term25859, term25859.getClass(), "status", enum48);
        setFloatField(term25859, term25859.getClass(), "standardHours", 0.8521579F);
        term25877 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term25877;
        callMethod(klass, "canEqual", argTypes, term25859, args);
    }

};



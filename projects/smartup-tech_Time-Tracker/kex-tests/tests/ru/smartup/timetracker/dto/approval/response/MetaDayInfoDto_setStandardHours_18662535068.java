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
import java.lang.Float;

public class MetaDayInfoDto_setStandardHours_18662535068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25042;
     Object term25060;

    public MetaDayInfoDto_setStandardHours_18662535068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25063 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term25062 = ((Class) term25063).getDeclaredField((String) "WORK_DAY");
        ((Field) term25062).setAccessible(true);
        Object enum46 = ((Field) term25062).get((Object) null);
        term25042 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term25043 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term25043, term25043.getClass(), "year", 2010);
        setShortField(term25043, term25043.getClass(), "month", (short) 1);
        setShortField(term25043, term25043.getClass(), "day", (short) 17);
        setField(term25042, term25042.getClass(), "date", term25043);
        setField(term25042, term25042.getClass(), "status", enum46);
        setFloatField(term25042, term25042.getClass(), "standardHours", 0.29172552F);
        term25060 = new Float(0.13375676F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term25060;
        callMethod(klass, "setStandardHours", argTypes, term25042, args);
    }

};



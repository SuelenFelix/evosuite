package ru.smartup.timetracker.dto.production.calendar.request;

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
import static ru.smartup.timetracker.dto.production.calendar.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ProductionCalendarAddDayDto_setDay_11628389003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1274;
     Object term1295;

    public ProductionCalendarAddDayDto_setDay_11628389003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1298 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term1297 = ((Class) term1298).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term1297).setAccessible(true);
        Object enum3 = ((Field) term1297).get((Object) null);
        term1274 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto"));
        Object term1275 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term1275, term1275.getClass(), "fastTime", 1606045635837L);
        setField(term1275, term1275.getClass(), "cdate", null);
        setField(term1274, term1274.getClass(), "day", term1275);
        setField(term1274, term1274.getClass(), "status", enum3);
        setFloatField(term1274, term1274.getClass(), "hours", 0.09123778F);
        term1295 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term1295, term1295.getClass(), "fastTime", 1442639565302L);
        setField(term1295, term1295.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.request.ProductionCalendarAddDayDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Date");
        Object[] args = new Object[1];
        args[0] = term1295;
        callMethod(klass, "setDay", argTypes, term1274, args);
    }

};



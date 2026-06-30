package ru.smartup.timetracker.dto.production.calendar.response;

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
import static ru.smartup.timetracker.dto.production.calendar.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ProductionCalendarDayDto_canEqual_7154040489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4171;
     Object term4187;

    public ProductionCalendarDayDto_canEqual_7154040489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4189 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term4188 = ((Class) term4189).getDeclaredField((String) "WEEKEND");
        ((Field) term4188).setAccessible(true);
        Object enum10 = ((Field) term4188).get((Object) null);
        term4171 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto"));
        Object term4173 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4171, term4171.getClass(), "id", -2813493605142626659L);
        setLongField(term4173, term4173.getClass(), "fastTime", 1797203628025L);
        setField(term4173, term4173.getClass(), "cdate", null);
        setField(term4171, term4171.getClass(), "day", term4173);
        setField(term4171, term4171.getClass(), "status", enum10);
        setFloatField(term4171, term4171.getClass(), "hours", 0.40176582F);
        term4187 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4187;
        callMethod(klass, "canEqual", argTypes, term4171, args);
    }

};



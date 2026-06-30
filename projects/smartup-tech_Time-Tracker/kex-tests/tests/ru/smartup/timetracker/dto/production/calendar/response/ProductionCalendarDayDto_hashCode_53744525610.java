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

public class ProductionCalendarDayDto_hashCode_53744525610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4576;

    public ProductionCalendarDayDto_hashCode_53744525610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4594 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term4593 = ((Class) term4594).getDeclaredField((String) "WORK_DAY");
        ((Field) term4593).setAccessible(true);
        Object enum11 = ((Field) term4593).get((Object) null);
        term4576 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto"));
        Object term4578 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4576, term4576.getClass(), "id", -8885298608300233488L);
        setLongField(term4578, term4578.getClass(), "fastTime", 1589457921030L);
        setField(term4578, term4578.getClass(), "cdate", null);
        setField(term4576, term4576.getClass(), "day", term4578);
        setField(term4576, term4576.getClass(), "status", enum11);
        setFloatField(term4576, term4576.getClass(), "hours", 0.8783184F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4576, args);
    }

};



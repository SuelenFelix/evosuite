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

public class ProductionCalendarDayDto_getId_8154792820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ProductionCalendarDayDto_getId_8154792820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term58 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term57 = ((Class) term58).getDeclaredField((String) "WEEKEND");
        ((Field) term57).setAccessible(true);
        Object enum0 = ((Field) term57).get((Object) null);
        term1 = newInstance(Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto"));
        Object term3 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term1, term1.getClass(), "id", 2442117782898005296L);
        setLongField(term3, term3.getClass(), "fastTime", 1345871412244L);
        setField(term3, term3.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "day", term3);
        setField(term1, term1.getClass(), "status", enum0);
        setFloatField(term1, term1.getClass(), "hours", 0.13238746F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.production.calendar.response.ProductionCalendarDayDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};



package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ProductionCalendarDay_getId_19574047642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103572;

    public ProductionCalendarDay_getId_19574047642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term103598 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term103597 = ((Class) term103598).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term103597).setAccessible(true);
        Object enum226 = ((Field) term103597).get((Object) null);
        term103572 = newInstance(Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay"));
        Object term103575 = newInstance(Class.forName("java.sql.Date"));
        Object term103594 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term103572, term103572.getClass(), "id", 3427570961451840069L);
        setFloatField(term103572, term103572.getClass(), "hours", 0.24759698F);
        setLongField(term103575, term103575.getClass(), "fastTime", 1595517583842L);
        setField(term103575, term103575.getClass(), "cdate", null);
        setField(term103572, term103572.getClass(), "day", term103575);
        setField(term103572, term103572.getClass(), "status", enum226);
        setIntField(term103594, term103594.getClass(), "nanos", 363000000);
        setLongField(term103594, term103594.getClass(), "fastTime", 1887999831000L);
        setField(term103594, term103594.getClass(), "cdate", null);
        setField(term103572, term103572.getClass(), "createdDate", term103594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term103572, args);
    }

};



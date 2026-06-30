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

public class ProductionCalendarDay_getCreatedDate_16512595016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105252;

    public ProductionCalendarDay_getCreatedDate_16512595016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term105272 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term105271 = ((Class) term105272).getDeclaredField((String) "WEEKEND");
        ((Field) term105271).setAccessible(true);
        Object enum230 = ((Field) term105271).get((Object) null);
        term105252 = newInstance(Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay"));
        Object term105255 = newInstance(Class.forName("java.sql.Date"));
        Object term105268 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term105252, term105252.getClass(), "id", -5447369594017685765L);
        setFloatField(term105252, term105252.getClass(), "hours", 0.38555247F);
        setLongField(term105255, term105255.getClass(), "fastTime", 1678177615298L);
        setField(term105255, term105255.getClass(), "cdate", null);
        setField(term105252, term105252.getClass(), "day", term105255);
        setField(term105252, term105252.getClass(), "status", enum230);
        setIntField(term105268, term105268.getClass(), "nanos", 410000000);
        setLongField(term105268, term105268.getClass(), "fastTime", 1865573567000L);
        setField(term105268, term105268.getClass(), "cdate", null);
        setField(term105252, term105252.getClass(), "createdDate", term105268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term105252, args);
    }

};



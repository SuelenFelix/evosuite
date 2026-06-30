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

public class ProductionCalendarDay_getStatus_1746958885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104841;

    public ProductionCalendarDay_getStatus_1746958885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term104862 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term104861 = ((Class) term104862).getDeclaredField((String) "WORK_DAY");
        ((Field) term104861).setAccessible(true);
        Object enum229 = ((Field) term104861).get((Object) null);
        term104841 = newInstance(Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay"));
        Object term104844 = newInstance(Class.forName("java.sql.Date"));
        Object term104858 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term104841, term104841.getClass(), "id", -8614778293741404325L);
        setFloatField(term104841, term104841.getClass(), "hours", 0.22651339F);
        setLongField(term104844, term104844.getClass(), "fastTime", 1822704644050L);
        setField(term104844, term104844.getClass(), "cdate", null);
        setField(term104841, term104841.getClass(), "day", term104844);
        setField(term104841, term104841.getClass(), "status", enum229);
        setIntField(term104858, term104858.getClass(), "nanos", 14000000);
        setLongField(term104858, term104858.getClass(), "fastTime", 1710803140000L);
        setField(term104858, term104858.getClass(), "cdate", null);
        setField(term104841, term104841.getClass(), "createdDate", term104858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term104841, args);
    }

};



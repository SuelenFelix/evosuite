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
import java.lang.Long;

public class ProductionCalendarDay_setId_2738247387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105659;
     Object term105684;

    public ProductionCalendarDay_setId_2738247387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term105687 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term105686 = ((Class) term105687).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term105686).setAccessible(true);
        Object enum231 = ((Field) term105686).get((Object) null);
        term105659 = newInstance(Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay"));
        Object term105662 = newInstance(Class.forName("java.sql.Date"));
        Object term105681 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term105659, term105659.getClass(), "id", -5724112525188606013L);
        setFloatField(term105659, term105659.getClass(), "hours", 0.8878841F);
        setLongField(term105662, term105662.getClass(), "fastTime", 1666076287186L);
        setField(term105662, term105662.getClass(), "cdate", null);
        setField(term105659, term105659.getClass(), "day", term105662);
        setField(term105659, term105659.getClass(), "status", enum231);
        setIntField(term105681, term105681.getClass(), "nanos", 692000000);
        setLongField(term105681, term105681.getClass(), "fastTime", 1289706439000L);
        setField(term105681, term105681.getClass(), "cdate", null);
        setField(term105659, term105659.getClass(), "createdDate", term105681);
        term105684 = new Long(-6100012593724108983L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.ProductionCalendarDay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term105684;
        callMethod(klass, "setId", argTypes, term105659, args);
    }

};



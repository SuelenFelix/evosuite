package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ScheduledFreeze_getFreezeDate_16489242782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22159;

    public ScheduledFreeze_getFreezeDate_16489242782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22159 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ScheduledFreeze"));
        Object term22160 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term22159, term22159.getClass(), "scheduledFuture", null);
        setIntField(term22160, term22160.getClass(), "year", 2018);
        setShortField(term22160, term22160.getClass(), "month", (short) 1);
        setShortField(term22160, term22160.getClass(), "day", (short) 13);
        setField(term22159, term22159.getClass(), "freezeDate", term22160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ScheduledFreeze");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreezeDate", argTypes, term22159, args);
    }

};



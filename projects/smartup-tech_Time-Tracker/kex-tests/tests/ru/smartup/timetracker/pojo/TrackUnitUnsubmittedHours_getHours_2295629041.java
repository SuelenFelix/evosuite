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

public class TrackUnitUnsubmittedHours_getHours_2295629041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17661;

    public TrackUnitUnsubmittedHours_getHours_2295629041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17661 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitUnsubmittedHours"));
        Object term17662 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term17662, term17662.getClass(), "year", 2016);
        setShortField(term17662, term17662.getClass(), "month", (short) 11);
        setShortField(term17662, term17662.getClass(), "day", (short) 29);
        setField(term17661, term17661.getClass(), "week", term17662);
        setFloatField(term17661, term17661.getClass(), "hours", 0.2707036F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitUnsubmittedHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHours", argTypes, term17661, args);
    }

};



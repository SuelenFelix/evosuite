package ru.smartup.timetracker.pojo.freeze;

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
import static ru.smartup.timetracker.pojo.freeze.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UnfreezeDateInterval_toString_15584219797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74;

    public UnfreezeDateInterval_toString_15584219797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74 = newInstance(Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval"));
        Object term75 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term75, term75.getClass(), "year", 2029);
        setShortField(term75, term75.getClass(), "month", (short) 8);
        setShortField(term75, term75.getClass(), "day", (short) 28);
        setField(term74, term74.getClass(), "startDate", term75);
        setIntField(term79, term79.getClass(), "year", 2015);
        setShortField(term79, term79.getClass(), "month", (short) 7);
        setShortField(term79, term79.getClass(), "day", (short) 24);
        setField(term74, term74.getClass(), "endDate", term79);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term74, args);
    }

};



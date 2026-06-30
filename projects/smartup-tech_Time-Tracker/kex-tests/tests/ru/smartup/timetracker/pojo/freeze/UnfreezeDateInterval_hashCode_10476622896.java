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

public class UnfreezeDateInterval_hashCode_10476622896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;

    public UnfreezeDateInterval_hashCode_10476622896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = newInstance(Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval"));
        Object term66 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term66, term66.getClass(), "year", 2024);
        setShortField(term66, term66.getClass(), "month", (short) 1);
        setShortField(term66, term66.getClass(), "day", (short) 24);
        setField(term65, term65.getClass(), "startDate", term66);
        setIntField(term70, term70.getClass(), "year", 2029);
        setShortField(term70, term70.getClass(), "month", (short) 1);
        setShortField(term70, term70.getClass(), "day", (short) 20);
        setField(term65, term65.getClass(), "endDate", term70);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term65, args);
    }

};



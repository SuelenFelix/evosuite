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

public class SubmittedHours_getWeek_5268525990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22310;

    public SubmittedHours_getWeek_5268525990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22310 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedHours"));
        Object term22311 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term22311, term22311.getClass(), "year", 2021);
        setShortField(term22311, term22311.getClass(), "month", (short) 9);
        setShortField(term22311, term22311.getClass(), "day", (short) 6);
        setField(term22310, term22310.getClass(), "week", term22311);
        setFloatField(term22310, term22310.getClass(), "hours", 0.22227418F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWeek", argTypes, term22310, args);
    }

};



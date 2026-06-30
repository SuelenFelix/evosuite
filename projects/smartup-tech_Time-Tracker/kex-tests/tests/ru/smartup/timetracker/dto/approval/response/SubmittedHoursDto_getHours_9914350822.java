package ru.smartup.timetracker.dto.approval.response;

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
import static ru.smartup.timetracker.dto.approval.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SubmittedHoursDto_getHours_9914350822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22081;

    public SubmittedHoursDto_getHours_9914350822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22081 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursDto"));
        Object term22082 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term22082, term22082.getClass(), "year", 2021);
        setShortField(term22082, term22082.getClass(), "month", (short) 8);
        setShortField(term22082, term22082.getClass(), "day", (short) 11);
        setField(term22081, term22081.getClass(), "week", term22082);
        setFloatField(term22081, term22081.getClass(), "hours", 0.8414608F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHours", argTypes, term22081, args);
    }

};



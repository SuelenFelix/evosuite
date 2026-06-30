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

public class SubmittedHoursDto_getWeek_20374731671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22075;

    public SubmittedHoursDto_getWeek_20374731671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22075 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursDto"));
        Object term22076 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term22076, term22076.getClass(), "year", 2028);
        setShortField(term22076, term22076.getClass(), "month", (short) 5);
        setShortField(term22076, term22076.getClass(), "day", (short) 29);
        setField(term22075, term22075.getClass(), "week", term22076);
        setFloatField(term22075, term22075.getClass(), "hours", 0.8789557F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWeek", argTypes, term22075, args);
    }

};



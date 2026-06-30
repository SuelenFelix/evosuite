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

public class SubmittedHoursDto_setWeek_5328761513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22087;
     Object term22093;

    public SubmittedHoursDto_setWeek_5328761513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22087 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursDto"));
        Object term22088 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term22088, term22088.getClass(), "year", 2014);
        setShortField(term22088, term22088.getClass(), "month", (short) 2);
        setShortField(term22088, term22088.getClass(), "day", (short) 23);
        setField(term22087, term22087.getClass(), "week", term22088);
        setFloatField(term22087, term22087.getClass(), "hours", 0.78664905F);
        term22093 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term22093, term22093.getClass(), "year", 2025);
        setShortField(term22093, term22093.getClass(), "month", (short) 11);
        setShortField(term22093, term22093.getClass(), "day", (short) 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term22093;
        callMethod(klass, "setWeek", argTypes, term22087, args);
    }

};



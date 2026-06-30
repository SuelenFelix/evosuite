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

public class SubmittedHoursDto_toString_7604653308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22125;

    public SubmittedHoursDto_toString_7604653308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22125 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursDto"));
        Object term22126 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term22126, term22126.getClass(), "year", 2028);
        setShortField(term22126, term22126.getClass(), "month", (short) 4);
        setShortField(term22126, term22126.getClass(), "day", (short) 3);
        setField(term22125, term22125.getClass(), "week", term22126);
        setFloatField(term22125, term22125.getClass(), "hours", 0.09628683F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term22125, args);
    }

};



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
import java.lang.Float;

public class SubmittedHoursDto_setHours_4201799284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22097;
     Object term22103;

    public SubmittedHoursDto_setHours_4201799284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22097 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursDto"));
        Object term22098 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term22098, term22098.getClass(), "year", 2014);
        setShortField(term22098, term22098.getClass(), "month", (short) 3);
        setShortField(term22098, term22098.getClass(), "day", (short) 22);
        setField(term22097, term22097.getClass(), "week", term22098);
        setFloatField(term22097, term22097.getClass(), "hours", 0.78593165F);
        term22103 = new Float(0.98989093F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term22103;
        callMethod(klass, "setHours", argTypes, term22097, args);
    }

};



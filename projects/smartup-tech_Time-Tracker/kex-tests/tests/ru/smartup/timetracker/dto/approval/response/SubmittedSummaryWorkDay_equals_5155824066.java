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

public class SubmittedSummaryWorkDay_equals_5155824066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13455;
     Object term13459;

    public SubmittedSummaryWorkDay_equals_5155824066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13455 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term13456 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13456, term13456.getClass(), "fastTime", 1429023851389L);
        setField(term13456, term13456.getClass(), "cdate", null);
        setField(term13455, term13455.getClass(), "date", term13456);
        setFloatField(term13455, term13455.getClass(), "hours", 0.27797186F);
        term13459 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13459;
        callMethod(klass, "equals", argTypes, term13455, args);
    }

};



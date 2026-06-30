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

public class SubmittedSummaryWorkDay_getHours_106803811313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13477;

    public SubmittedSummaryWorkDay_getHours_106803811313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13477 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        setField(term13477, term13477.getClass(), "date", null);
        setFloatField(term13477, term13477.getClass(), "hours", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHours", argTypes, term13477, args);
    }

};



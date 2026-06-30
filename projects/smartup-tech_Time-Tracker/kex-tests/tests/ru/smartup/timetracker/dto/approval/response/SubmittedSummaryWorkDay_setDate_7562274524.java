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

public class SubmittedSummaryWorkDay_setDate_7562274524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13443;
     Object term13447;

    public SubmittedSummaryWorkDay_setDate_7562274524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13443 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term13444 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13444, term13444.getClass(), "fastTime", 1606045635837L);
        setField(term13444, term13444.getClass(), "cdate", null);
        setField(term13443, term13443.getClass(), "date", term13444);
        setFloatField(term13443, term13443.getClass(), "hours", 0.7254646F);
        term13447 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13447, term13447.getClass(), "fastTime", 1442639565302L);
        setField(term13447, term13447.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term13447;
        callMethod(klass, "setDate", argTypes, term13443, args);
    }

};



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

public class SubmittedSummaryWorkDay_getHours_10680381133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13439;

    public SubmittedSummaryWorkDay_getHours_10680381133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13439 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term13440 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13440, term13440.getClass(), "fastTime", 1610940182830L);
        setField(term13440, term13440.getClass(), "cdate", null);
        setField(term13439, term13439.getClass(), "date", term13440);
        setFloatField(term13439, term13439.getClass(), "hours", 0.95272815F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHours", argTypes, term13439, args);
    }

};



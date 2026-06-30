package ru.smartup.timetracker.dto.approval.request;

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
import static ru.smartup.timetracker.dto.approval.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SubmittedHoursRejectDto_getRejectReason_6953160211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439;

    public SubmittedHoursRejectDto_getRejectReason_6953160211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term439 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursRejectDto"));
        setField(term439, term439.getClass(), "trackUnitIds", null);
        setField(term439, term439.getClass(), "rejectReason", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursRejectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRejectReason", argTypes, term439, args);
    }

};



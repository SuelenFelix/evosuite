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

public class SubmittedHoursRejectDto_hashCode_199450334516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444;

    public SubmittedHoursRejectDto_hashCode_199450334516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term444 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursRejectDto"));
        setField(term444, term444.getClass(), "trackUnitIds", null);
        setField(term444, term444.getClass(), "rejectReason", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursRejectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term444, args);
    }

};



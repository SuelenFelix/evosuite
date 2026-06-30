package ru.smartup.timetracker.dto.tracker.request;

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
import static ru.smartup.timetracker.dto.tracker.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TrackUnitSubmitDto_toString_142333874217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564;

    public TrackUnitSubmitDto_toString_142333874217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term564 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitSubmitDto"));
        setIntField(term564, term564.getClass(), "employeeId", 0);
        setField(term564, term564.getClass(), "weeks", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitSubmitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term564, args);
    }

};



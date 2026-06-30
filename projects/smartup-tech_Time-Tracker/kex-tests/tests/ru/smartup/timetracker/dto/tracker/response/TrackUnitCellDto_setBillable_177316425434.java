package ru.smartup.timetracker.dto.tracker.response;

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
import static ru.smartup.timetracker.dto.tracker.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class TrackUnitCellDto_setBillable_177316425434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4168;
     Object term4174;

    public TrackUnitCellDto_setBillable_177316425434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4168 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        setLongField(term4168, term4168.getClass(), "id", 0L);
        setField(term4168, term4168.getClass(), "workDay", null);
        setFloatField(term4168, term4168.getClass(), "hours", 0.0F);
        setBooleanField(term4168, term4168.getClass(), "blocked", false);
        setBooleanField(term4168, term4168.getClass(), "billable", false);
        setField(term4168, term4168.getClass(), "comment", null);
        setField(term4168, term4168.getClass(), "rejectReason", null);
        setBooleanField(term4168, term4168.getClass(), "rejected", false);
        term4174 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4174;
        callMethod(klass, "setBillable", argTypes, term4168, args);
    }

};



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

public class TrackUnitCellDto_isRejected_207444485129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4132;

    public TrackUnitCellDto_isRejected_207444485129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4132 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        setLongField(term4132, term4132.getClass(), "id", 0L);
        setField(term4132, term4132.getClass(), "workDay", null);
        setFloatField(term4132, term4132.getClass(), "hours", 0.0F);
        setBooleanField(term4132, term4132.getClass(), "blocked", false);
        setBooleanField(term4132, term4132.getClass(), "billable", false);
        setField(term4132, term4132.getClass(), "comment", null);
        setField(term4132, term4132.getClass(), "rejectReason", null);
        setBooleanField(term4132, term4132.getClass(), "rejected", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRejected", argTypes, term4132, args);
    }

};



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
import java.lang.Object;

public class TrackUnitCellDto_getComment_14060700036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3252;

    public TrackUnitCellDto_getComment_14060700036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3252 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3254 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3252, term3252.getClass(), "id", 7411271909051562686L);
        setLongField(term3254, term3254.getClass(), "fastTime", 1515890130018L);
        setField(term3254, term3254.getClass(), "cdate", null);
        setField(term3252, term3252.getClass(), "workDay", term3254);
        setFloatField(term3252, term3252.getClass(), "hours", 0.26413453F);
        setBooleanField(term3252, term3252.getClass(), "blocked", true);
        setBooleanField(term3252, term3252.getClass(), "billable", false);
        setField(term3252, term3252.getClass(), "comment", "NRdvgJlhkX");
        setField(term3252, term3252.getClass(), "rejectReason", "uuaPigETmJ");
        setBooleanField(term3252, term3252.getClass(), "rejected", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComment", argTypes, term3252, args);
    }

};



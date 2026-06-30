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

public class TrackUnitCellDto_getHours_13612361023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3096;

    public TrackUnitCellDto_getHours_13612361023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3096 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3098 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3096, term3096.getClass(), "id", -8257434502486459194L);
        setLongField(term3098, term3098.getClass(), "fastTime", 1610940182830L);
        setField(term3098, term3098.getClass(), "cdate", null);
        setField(term3096, term3096.getClass(), "workDay", term3098);
        setFloatField(term3096, term3096.getClass(), "hours", 0.6880585F);
        setBooleanField(term3096, term3096.getClass(), "blocked", false);
        setBooleanField(term3096, term3096.getClass(), "billable", true);
        setField(term3096, term3096.getClass(), "comment", "jJCZpVmanW");
        setField(term3096, term3096.getClass(), "rejectReason", "EGtDIRbSSb");
        setBooleanField(term3096, term3096.getClass(), "rejected", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHours", argTypes, term3096, args);
    }

};



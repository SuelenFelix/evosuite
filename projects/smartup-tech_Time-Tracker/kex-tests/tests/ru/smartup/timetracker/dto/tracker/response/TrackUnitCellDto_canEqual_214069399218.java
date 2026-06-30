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

public class TrackUnitCellDto_canEqual_214069399218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3933;
     Object term3965;

    public TrackUnitCellDto_canEqual_214069399218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3933 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3935 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3933, term3933.getClass(), "id", -6573104506744284592L);
        setLongField(term3935, term3935.getClass(), "fastTime", 1668569229825L);
        setField(term3935, term3935.getClass(), "cdate", null);
        setField(term3933, term3933.getClass(), "workDay", term3935);
        setFloatField(term3933, term3933.getClass(), "hours", 0.26441735F);
        setBooleanField(term3933, term3933.getClass(), "blocked", true);
        setBooleanField(term3933, term3933.getClass(), "billable", false);
        setField(term3933, term3933.getClass(), "comment", "xrwlQZdwCp");
        setField(term3933, term3933.getClass(), "rejectReason", "IDCWpPLRkE");
        setBooleanField(term3933, term3933.getClass(), "rejected", false);
        term3965 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3965;
        callMethod(klass, "canEqual", argTypes, term3933, args);
    }

};



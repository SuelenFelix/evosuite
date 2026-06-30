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

public class TrackUnitCellDto_getWorkDay_10355015902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3044;

    public TrackUnitCellDto_getWorkDay_10355015902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3044 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3046 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3044, term3044.getClass(), "id", 6375119433582206027L);
        setLongField(term3046, term3046.getClass(), "fastTime", 1480438351369L);
        setField(term3046, term3046.getClass(), "cdate", null);
        setField(term3044, term3044.getClass(), "workDay", term3046);
        setFloatField(term3044, term3044.getClass(), "hours", 0.2857073F);
        setBooleanField(term3044, term3044.getClass(), "blocked", false);
        setBooleanField(term3044, term3044.getClass(), "billable", true);
        setField(term3044, term3044.getClass(), "comment", "MuLcgQHgqz");
        setField(term3044, term3044.getClass(), "rejectReason", "xxtlPwDYFs");
        setBooleanField(term3044, term3044.getClass(), "rejected", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkDay", argTypes, term3044, args);
    }

};



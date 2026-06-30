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

public class TrackUnitCellDto_getRejectReason_13295083497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3304;

    public TrackUnitCellDto_getRejectReason_13295083497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3304 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3306 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3304, term3304.getClass(), "id", 4872422362414183754L);
        setLongField(term3306, term3306.getClass(), "fastTime", 1429023851389L);
        setField(term3306, term3306.getClass(), "cdate", null);
        setField(term3304, term3304.getClass(), "workDay", term3306);
        setFloatField(term3304, term3304.getClass(), "hours", 0.7944024F);
        setBooleanField(term3304, term3304.getClass(), "blocked", false);
        setBooleanField(term3304, term3304.getClass(), "billable", true);
        setField(term3304, term3304.getClass(), "comment", "MxlszYVzRf");
        setField(term3304, term3304.getClass(), "rejectReason", "LQFpaHEwXR");
        setBooleanField(term3304, term3304.getClass(), "rejected", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRejectReason", argTypes, term3304, args);
    }

};



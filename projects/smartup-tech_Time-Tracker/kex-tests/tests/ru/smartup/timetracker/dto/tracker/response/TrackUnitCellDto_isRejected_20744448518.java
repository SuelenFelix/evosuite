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

public class TrackUnitCellDto_isRejected_20744448518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3356;

    public TrackUnitCellDto_isRejected_20744448518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3356 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3358 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3356, term3356.getClass(), "id", 6811161968424632369L);
        setLongField(term3358, term3358.getClass(), "fastTime", 1495357463288L);
        setField(term3358, term3358.getClass(), "cdate", null);
        setField(term3356, term3356.getClass(), "workDay", term3358);
        setFloatField(term3356, term3356.getClass(), "hours", 0.3692338F);
        setBooleanField(term3356, term3356.getClass(), "blocked", true);
        setBooleanField(term3356, term3356.getClass(), "billable", true);
        setField(term3356, term3356.getClass(), "comment", "oVcInYnLWB");
        setField(term3356, term3356.getClass(), "rejectReason", "aJlieCFVtF");
        setBooleanField(term3356, term3356.getClass(), "rejected", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRejected", argTypes, term3356, args);
    }

};



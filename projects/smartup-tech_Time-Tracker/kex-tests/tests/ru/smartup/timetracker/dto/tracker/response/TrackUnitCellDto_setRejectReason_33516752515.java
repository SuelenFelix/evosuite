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

public class TrackUnitCellDto_setRejectReason_33516752515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3752;

    public TrackUnitCellDto_setRejectReason_33516752515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3752 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3754 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3752, term3752.getClass(), "id", -872011222785455006L);
        setLongField(term3754, term3754.getClass(), "fastTime", 1863631094992L);
        setField(term3754, term3754.getClass(), "cdate", null);
        setField(term3752, term3752.getClass(), "workDay", term3754);
        setFloatField(term3752, term3752.getClass(), "hours", 0.51832694F);
        setBooleanField(term3752, term3752.getClass(), "blocked", false);
        setBooleanField(term3752, term3752.getClass(), "billable", true);
        setField(term3752, term3752.getClass(), "comment", "TEParAifyi");
        setField(term3752, term3752.getClass(), "rejectReason", "OWDIEULEFu");
        setBooleanField(term3752, term3752.getClass(), "rejected", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dWRymuLBtr";
        callMethod(klass, "setRejectReason", argTypes, term3752, args);
    }

};



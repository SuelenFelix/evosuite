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
import java.util.ArrayList;
import java.lang.Object;

public class TrackUnitRowUpdateDto_toString_15177954512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term935;

    public TrackUnitRowUpdateDto_toString_15177954512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term941 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term942 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term942, term942.getClass(), "fastTime", 1335389252058L);
        setField(term942, term942.getClass(), "cdate", null);
        setField(term941, term941.getClass(), "workDay", term942);
        setFloatField(term941, term941.getClass(), "hours", 0.114929974F);
        setField(term941, term941.getClass(), "comment", "");
        setBooleanField(term941, term941.getClass(), "billable", false);
        Object term947 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term948 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term948, term948.getClass(), "fastTime", 1616833468678L);
        setField(term948, term948.getClass(), "cdate", null);
        setField(term947, term947.getClass(), "workDay", term948);
        setFloatField(term947, term947.getClass(), "hours", 0.30926234F);
        setField(term947, term947.getClass(), "comment", "");
        setBooleanField(term947, term947.getClass(), "billable", false);
        ArrayList term939 = new ArrayList();
        ((ArrayList) term939).add(term941);
        ((ArrayList) term939).add(term947);
        term935 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto"));
        setIntField(term935, term935.getClass(), "employeeId", -6029667);
        setLongField(term935, term935.getClass(), "taskId", -4325723315152823407L);
        setBooleanField(term935, term935.getClass(), "observed", false);
        setField(term935, term935.getClass(), "units", term939);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term935, args);
    }

};



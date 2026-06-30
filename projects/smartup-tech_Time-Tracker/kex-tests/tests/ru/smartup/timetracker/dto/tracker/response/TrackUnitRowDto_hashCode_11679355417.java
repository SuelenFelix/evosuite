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
import java.util.ArrayList;
import java.lang.Object;

public class TrackUnitRowDto_hashCode_11679355417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5785;

    public TrackUnitRowDto_hashCode_11679355417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5816 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5818 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5816, term5816.getClass(), "id", -5786861555969446503L);
        setLongField(term5818, term5818.getClass(), "fastTime", 1359786657069L);
        setField(term5818, term5818.getClass(), "cdate", null);
        setField(term5816, term5816.getClass(), "workDay", term5818);
        setFloatField(term5816, term5816.getClass(), "hours", 0.21924508F);
        setBooleanField(term5816, term5816.getClass(), "blocked", true);
        setBooleanField(term5816, term5816.getClass(), "billable", true);
        setField(term5816, term5816.getClass(), "comment", "");
        setField(term5816, term5816.getClass(), "rejectReason", "");
        setBooleanField(term5816, term5816.getClass(), "rejected", true);
        ArrayList term5814 = new ArrayList();
        ((ArrayList) term5814).add(term5816);
        term5785 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term5785, term5785.getClass(), "employeeId", 1193880199);
        setIntField(term5785, term5785.getClass(), "projectId", -1087774327);
        setField(term5785, term5785.getClass(), "projectName", "RMsXuyzKJV");
        setLongField(term5785, term5785.getClass(), "taskId", 1368340889161782793L);
        setField(term5785, term5785.getClass(), "taskName", "FwPbDZcHmB");
        setBooleanField(term5785, term5785.getClass(), "observed", true);
        setField(term5785, term5785.getClass(), "units", term5814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5785, args);
    }

};



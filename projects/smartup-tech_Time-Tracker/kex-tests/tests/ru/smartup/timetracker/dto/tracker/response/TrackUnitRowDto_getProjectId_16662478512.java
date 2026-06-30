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

public class TrackUnitRowDto_getProjectId_16662478512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4323;

    public TrackUnitRowDto_getProjectId_16662478512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4354 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4356 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4354, term4354.getClass(), "id", 1967728129628047933L);
        setLongField(term4356, term4356.getClass(), "fastTime", 1630952644759L);
        setField(term4356, term4356.getClass(), "cdate", null);
        setField(term4354, term4354.getClass(), "workDay", term4356);
        setFloatField(term4354, term4354.getClass(), "hours", 0.9472605F);
        setBooleanField(term4354, term4354.getClass(), "blocked", true);
        setBooleanField(term4354, term4354.getClass(), "billable", true);
        setField(term4354, term4354.getClass(), "comment", "");
        setField(term4354, term4354.getClass(), "rejectReason", "");
        setBooleanField(term4354, term4354.getClass(), "rejected", true);
        Object term4364 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4366 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4364, term4364.getClass(), "id", 2120084523938730454L);
        setLongField(term4366, term4366.getClass(), "fastTime", 1739417792956L);
        setField(term4366, term4366.getClass(), "cdate", null);
        setField(term4364, term4364.getClass(), "workDay", term4366);
        setFloatField(term4364, term4364.getClass(), "hours", 0.27797186F);
        setBooleanField(term4364, term4364.getClass(), "blocked", true);
        setBooleanField(term4364, term4364.getClass(), "billable", true);
        setField(term4364, term4364.getClass(), "comment", "");
        setField(term4364, term4364.getClass(), "rejectReason", "");
        setBooleanField(term4364, term4364.getClass(), "rejected", false);
        Object term4374 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4376 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4374, term4374.getClass(), "id", 6855071767938501807L);
        setLongField(term4376, term4376.getClass(), "fastTime", 1329640267573L);
        setField(term4376, term4376.getClass(), "cdate", null);
        setField(term4374, term4374.getClass(), "workDay", term4376);
        setFloatField(term4374, term4374.getClass(), "hours", 0.7467328F);
        setBooleanField(term4374, term4374.getClass(), "blocked", false);
        setBooleanField(term4374, term4374.getClass(), "billable", true);
        setField(term4374, term4374.getClass(), "comment", "");
        setField(term4374, term4374.getClass(), "rejectReason", "");
        setBooleanField(term4374, term4374.getClass(), "rejected", true);
        Object term4384 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4386 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4384, term4384.getClass(), "id", -5892135042702373494L);
        setLongField(term4386, term4386.getClass(), "fastTime", 1334853104718L);
        setField(term4386, term4386.getClass(), "cdate", null);
        setField(term4384, term4384.getClass(), "workDay", term4386);
        setFloatField(term4384, term4384.getClass(), "hours", 0.6436713F);
        setBooleanField(term4384, term4384.getClass(), "blocked", true);
        setBooleanField(term4384, term4384.getClass(), "billable", false);
        setField(term4384, term4384.getClass(), "comment", "");
        setField(term4384, term4384.getClass(), "rejectReason", "");
        setBooleanField(term4384, term4384.getClass(), "rejected", true);
        ArrayList term4352 = new ArrayList();
        ((ArrayList) term4352).add(term4354);
        ((ArrayList) term4352).add(term4364);
        ((ArrayList) term4352).add(term4374);
        ((ArrayList) term4352).add(term4384);
        term4323 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term4323, term4323.getClass(), "employeeId", 1484323161);
        setIntField(term4323, term4323.getClass(), "projectId", 391863371);
        setField(term4323, term4323.getClass(), "projectName", "onpbIeEKoi");
        setLongField(term4323, term4323.getClass(), "taskId", -4502405999831680926L);
        setField(term4323, term4323.getClass(), "taskName", "YRHGsAkhxb");
        setBooleanField(term4323, term4323.getClass(), "observed", false);
        setField(term4323, term4323.getClass(), "units", term4352);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term4323, args);
    }

};



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

public class TrackUnitRowDto_getTaskId_15816372614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4499;

    public TrackUnitRowDto_getTaskId_15816372614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4530 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4532 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4530, term4530.getClass(), "id", 1439298019805881866L);
        setLongField(term4532, term4532.getClass(), "fastTime", 1659994192918L);
        setField(term4532, term4532.getClass(), "cdate", null);
        setField(term4530, term4530.getClass(), "workDay", term4532);
        setFloatField(term4530, term4530.getClass(), "hours", 0.45691717F);
        setBooleanField(term4530, term4530.getClass(), "blocked", true);
        setBooleanField(term4530, term4530.getClass(), "billable", false);
        setField(term4530, term4530.getClass(), "comment", "");
        setField(term4530, term4530.getClass(), "rejectReason", "");
        setBooleanField(term4530, term4530.getClass(), "rejected", false);
        Object term4540 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4542 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4540, term4540.getClass(), "id", -8708192233349544946L);
        setLongField(term4542, term4542.getClass(), "fastTime", 1876872800559L);
        setField(term4542, term4542.getClass(), "cdate", null);
        setField(term4540, term4540.getClass(), "workDay", term4542);
        setFloatField(term4540, term4540.getClass(), "hours", 0.17877543F);
        setBooleanField(term4540, term4540.getClass(), "blocked", false);
        setBooleanField(term4540, term4540.getClass(), "billable", true);
        setField(term4540, term4540.getClass(), "comment", "");
        setField(term4540, term4540.getClass(), "rejectReason", "");
        setBooleanField(term4540, term4540.getClass(), "rejected", true);
        Object term4550 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4552 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4550, term4550.getClass(), "id", 5907001541142728739L);
        setLongField(term4552, term4552.getClass(), "fastTime", 1304532099366L);
        setField(term4552, term4552.getClass(), "cdate", null);
        setField(term4550, term4550.getClass(), "workDay", term4552);
        setFloatField(term4550, term4550.getClass(), "hours", 0.8598297F);
        setBooleanField(term4550, term4550.getClass(), "blocked", false);
        setBooleanField(term4550, term4550.getClass(), "billable", false);
        setField(term4550, term4550.getClass(), "comment", "");
        setField(term4550, term4550.getClass(), "rejectReason", "");
        setBooleanField(term4550, term4550.getClass(), "rejected", false);
        Object term4560 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4562 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4560, term4560.getClass(), "id", 4178434741742309755L);
        setLongField(term4562, term4562.getClass(), "fastTime", 1488725902101L);
        setField(term4562, term4562.getClass(), "cdate", null);
        setField(term4560, term4560.getClass(), "workDay", term4562);
        setFloatField(term4560, term4560.getClass(), "hours", 0.96323884F);
        setBooleanField(term4560, term4560.getClass(), "blocked", false);
        setBooleanField(term4560, term4560.getClass(), "billable", false);
        setField(term4560, term4560.getClass(), "comment", "");
        setField(term4560, term4560.getClass(), "rejectReason", "");
        setBooleanField(term4560, term4560.getClass(), "rejected", false);
        ArrayList term4528 = new ArrayList();
        ((ArrayList) term4528).add(term4530);
        ((ArrayList) term4528).add(term4540);
        ((ArrayList) term4528).add(term4550);
        ((ArrayList) term4528).add(term4560);
        term4499 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term4499, term4499.getClass(), "employeeId", -1955890973);
        setIntField(term4499, term4499.getClass(), "projectId", -2038273078);
        setField(term4499, term4499.getClass(), "projectName", "JUmudUmaaV");
        setLongField(term4499, term4499.getClass(), "taskId", 6617340557564669657L);
        setField(term4499, term4499.getClass(), "taskName", "KoyGrUJeJW");
        setBooleanField(term4499, term4499.getClass(), "observed", false);
        setField(term4499, term4499.getClass(), "units", term4528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskId", argTypes, term4499, args);
    }

};



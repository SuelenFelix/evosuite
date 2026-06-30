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

public class TrackUnitRowDto_getTaskName_16574679025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4592;

    public TrackUnitRowDto_getTaskName_16574679025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4623 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4625 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4623, term4623.getClass(), "id", -6292278961887936280L);
        setLongField(term4625, term4625.getClass(), "fastTime", 1311560117361L);
        setField(term4625, term4625.getClass(), "cdate", null);
        setField(term4623, term4623.getClass(), "workDay", term4625);
        setFloatField(term4623, term4623.getClass(), "hours", 0.43692183F);
        setBooleanField(term4623, term4623.getClass(), "blocked", false);
        setBooleanField(term4623, term4623.getClass(), "billable", true);
        setField(term4623, term4623.getClass(), "comment", "");
        setField(term4623, term4623.getClass(), "rejectReason", "");
        setBooleanField(term4623, term4623.getClass(), "rejected", false);
        ArrayList term4621 = new ArrayList();
        ((ArrayList) term4621).add(term4623);
        term4592 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term4592, term4592.getClass(), "employeeId", 1227103734);
        setIntField(term4592, term4592.getClass(), "projectId", -1339778481);
        setField(term4592, term4592.getClass(), "projectName", "jUbSRrkrYZ");
        setLongField(term4592, term4592.getClass(), "taskId", -2068172595987555756L);
        setField(term4592, term4592.getClass(), "taskName", "bWWfajKbEX");
        setBooleanField(term4592, term4592.getClass(), "observed", false);
        setField(term4592, term4592.getClass(), "units", term4621);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskName", argTypes, term4592, args);
    }

};



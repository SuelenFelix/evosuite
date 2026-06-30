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

public class TrackUnitRowDto_getProjectName_4338055903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4416;

    public TrackUnitRowDto_getProjectName_4338055903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4447 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4449 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4447, term4447.getClass(), "id", -6823727938421990489L);
        setLongField(term4449, term4449.getClass(), "fastTime", 1496859828764L);
        setField(term4449, term4449.getClass(), "cdate", null);
        setField(term4447, term4447.getClass(), "workDay", term4449);
        setFloatField(term4447, term4447.getClass(), "hours", 0.89057696F);
        setBooleanField(term4447, term4447.getClass(), "blocked", false);
        setBooleanField(term4447, term4447.getClass(), "billable", false);
        setField(term4447, term4447.getClass(), "comment", "");
        setField(term4447, term4447.getClass(), "rejectReason", "");
        setBooleanField(term4447, term4447.getClass(), "rejected", true);
        Object term4457 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4459 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4457, term4457.getClass(), "id", -484994522244390100L);
        setLongField(term4459, term4459.getClass(), "fastTime", 1691868468367L);
        setField(term4459, term4459.getClass(), "cdate", null);
        setField(term4457, term4457.getClass(), "workDay", term4459);
        setFloatField(term4457, term4457.getClass(), "hours", 0.7332741F);
        setBooleanField(term4457, term4457.getClass(), "blocked", true);
        setBooleanField(term4457, term4457.getClass(), "billable", true);
        setField(term4457, term4457.getClass(), "comment", "");
        setField(term4457, term4457.getClass(), "rejectReason", "");
        setBooleanField(term4457, term4457.getClass(), "rejected", false);
        Object term4467 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4469 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4467, term4467.getClass(), "id", 1233889271256172047L);
        setLongField(term4469, term4469.getClass(), "fastTime", 1442370534632L);
        setField(term4469, term4469.getClass(), "cdate", null);
        setField(term4467, term4467.getClass(), "workDay", term4469);
        setFloatField(term4467, term4467.getClass(), "hours", 0.15826964F);
        setBooleanField(term4467, term4467.getClass(), "blocked", true);
        setBooleanField(term4467, term4467.getClass(), "billable", true);
        setField(term4467, term4467.getClass(), "comment", "");
        setField(term4467, term4467.getClass(), "rejectReason", "");
        setBooleanField(term4467, term4467.getClass(), "rejected", true);
        ArrayList term4445 = new ArrayList();
        ((ArrayList) term4445).add(term4447);
        ((ArrayList) term4445).add(term4457);
        ((ArrayList) term4445).add(term4467);
        term4416 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term4416, term4416.getClass(), "employeeId", -1922583790);
        setIntField(term4416, term4416.getClass(), "projectId", -616727354);
        setField(term4416, term4416.getClass(), "projectName", "fhkbdRViHi");
        setLongField(term4416, term4416.getClass(), "taskId", 5262507301787091109L);
        setField(term4416, term4416.getClass(), "taskName", "uWHnvSvaPl");
        setBooleanField(term4416, term4416.getClass(), "observed", true);
        setField(term4416, term4416.getClass(), "units", term4445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectName", argTypes, term4416, args);
    }

};



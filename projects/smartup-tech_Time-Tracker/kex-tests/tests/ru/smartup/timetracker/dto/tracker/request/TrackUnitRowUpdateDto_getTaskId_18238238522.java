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

public class TrackUnitRowUpdateDto_getTaskId_18238238522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term628;

    public TrackUnitRowUpdateDto_getTaskId_18238238522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term634 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term635 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term635, term635.getClass(), "fastTime", 1466008719289L);
        setField(term635, term635.getClass(), "cdate", null);
        setField(term634, term634.getClass(), "workDay", term635);
        setFloatField(term634, term634.getClass(), "hours", 0.51832694F);
        setField(term634, term634.getClass(), "comment", "");
        setBooleanField(term634, term634.getClass(), "billable", true);
        Object term640 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term641 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term641, term641.getClass(), "fastTime", 1535838449065L);
        setField(term641, term641.getClass(), "cdate", null);
        setField(term640, term640.getClass(), "workDay", term641);
        setFloatField(term640, term640.getClass(), "hours", 0.97262454F);
        setField(term640, term640.getClass(), "comment", "");
        setBooleanField(term640, term640.getClass(), "billable", false);
        Object term646 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term647 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term647, term647.getClass(), "fastTime", 1345923503543L);
        setField(term647, term647.getClass(), "cdate", null);
        setField(term646, term646.getClass(), "workDay", term647);
        setFloatField(term646, term646.getClass(), "hours", 0.76550204F);
        setField(term646, term646.getClass(), "comment", "");
        setBooleanField(term646, term646.getClass(), "billable", false);
        ArrayList term632 = new ArrayList();
        ((ArrayList) term632).add(term634);
        ((ArrayList) term632).add(term640);
        ((ArrayList) term632).add(term646);
        term628 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto"));
        setIntField(term628, term628.getClass(), "employeeId", 1725571209);
        setLongField(term628, term628.getClass(), "taskId", 6375119433582206027L);
        setBooleanField(term628, term628.getClass(), "observed", true);
        setField(term628, term628.getClass(), "units", term632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskId", argTypes, term628, args);
    }

};



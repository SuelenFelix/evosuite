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
import java.util.LinkedList;

public class TrackUnitRowDto_setUnits_141782982814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5511;
     Object term5564;

    public TrackUnitRowDto_setUnits_141782982814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5542 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5544 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5542, term5542.getClass(), "id", 5836128569274066678L);
        setLongField(term5544, term5544.getClass(), "fastTime", 1689428810999L);
        setField(term5544, term5544.getClass(), "cdate", null);
        setField(term5542, term5542.getClass(), "workDay", term5544);
        setFloatField(term5542, term5542.getClass(), "hours", 0.2889229F);
        setBooleanField(term5542, term5542.getClass(), "blocked", false);
        setBooleanField(term5542, term5542.getClass(), "billable", false);
        setField(term5542, term5542.getClass(), "comment", "");
        setField(term5542, term5542.getClass(), "rejectReason", "");
        setBooleanField(term5542, term5542.getClass(), "rejected", true);
        Object term5552 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5554 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5552, term5552.getClass(), "id", -2177368829816872572L);
        setLongField(term5554, term5554.getClass(), "fastTime", 1570714321079L);
        setField(term5554, term5554.getClass(), "cdate", null);
        setField(term5552, term5552.getClass(), "workDay", term5554);
        setFloatField(term5552, term5552.getClass(), "hours", 0.65889484F);
        setBooleanField(term5552, term5552.getClass(), "blocked", true);
        setBooleanField(term5552, term5552.getClass(), "billable", true);
        setField(term5552, term5552.getClass(), "comment", "");
        setField(term5552, term5552.getClass(), "rejectReason", "");
        setBooleanField(term5552, term5552.getClass(), "rejected", false);
        ArrayList term5540 = new ArrayList();
        ((ArrayList) term5540).add(term5542);
        ((ArrayList) term5540).add(term5552);
        term5511 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term5511, term5511.getClass(), "employeeId", -1275173084);
        setIntField(term5511, term5511.getClass(), "projectId", -244121226);
        setField(term5511, term5511.getClass(), "projectName", "DyiXbeYIaN");
        setLongField(term5511, term5511.getClass(), "taskId", 6689117472719450333L);
        setField(term5511, term5511.getClass(), "taskName", "VGizxZnyHX");
        setBooleanField(term5511, term5511.getClass(), "observed", false);
        setField(term5511, term5511.getClass(), "units", term5540);
        term5564 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term5564;
        callMethod(klass, "setUnits", argTypes, term5511, args);
    }

};



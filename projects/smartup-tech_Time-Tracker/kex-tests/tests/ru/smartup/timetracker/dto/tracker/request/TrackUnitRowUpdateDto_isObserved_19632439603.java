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

public class TrackUnitRowUpdateDto_isObserved_19632439603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term654;

    public TrackUnitRowUpdateDto_isObserved_19632439603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term660 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term661 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term661, term661.getClass(), "fastTime", 1838357779277L);
        setField(term661, term661.getClass(), "cdate", null);
        setField(term660, term660.getClass(), "workDay", term661);
        setFloatField(term660, term660.getClass(), "hours", 0.26441735F);
        setField(term660, term660.getClass(), "comment", "");
        setBooleanField(term660, term660.getClass(), "billable", true);
        Object term666 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term667 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term667, term667.getClass(), "fastTime", 1332871705432L);
        setField(term667, term667.getClass(), "cdate", null);
        setField(term666, term666.getClass(), "workDay", term667);
        setFloatField(term666, term666.getClass(), "hours", 0.13745493F);
        setField(term666, term666.getClass(), "comment", "");
        setBooleanField(term666, term666.getClass(), "billable", true);
        Object term672 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term673 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term673, term673.getClass(), "fastTime", 1597233967116L);
        setField(term673, term673.getClass(), "cdate", null);
        setField(term672, term672.getClass(), "workDay", term673);
        setFloatField(term672, term672.getClass(), "hours", 0.20144695F);
        setField(term672, term672.getClass(), "comment", "");
        setBooleanField(term672, term672.getClass(), "billable", true);
        Object term678 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term679 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term679, term679.getClass(), "fastTime", 1276505397937L);
        setField(term679, term679.getClass(), "cdate", null);
        setField(term678, term678.getClass(), "workDay", term679);
        setFloatField(term678, term678.getClass(), "hours", 0.7031006F);
        setField(term678, term678.getClass(), "comment", "");
        setBooleanField(term678, term678.getClass(), "billable", true);
        Object term684 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term685 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term685, term685.getClass(), "fastTime", 1278177575793L);
        setField(term685, term685.getClass(), "cdate", null);
        setField(term684, term684.getClass(), "workDay", term685);
        setFloatField(term684, term684.getClass(), "hours", 0.9431611F);
        setField(term684, term684.getClass(), "comment", "");
        setBooleanField(term684, term684.getClass(), "billable", true);
        Object term690 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term691 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term691, term691.getClass(), "fastTime", 1272776321768L);
        setField(term691, term691.getClass(), "cdate", null);
        setField(term690, term690.getClass(), "workDay", term691);
        setFloatField(term690, term690.getClass(), "hours", 0.95272815F);
        setField(term690, term690.getClass(), "comment", "");
        setBooleanField(term690, term690.getClass(), "billable", true);
        Object term696 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term697 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term697, term697.getClass(), "fastTime", 1597352397295L);
        setField(term697, term697.getClass(), "cdate", null);
        setField(term696, term696.getClass(), "workDay", term697);
        setFloatField(term696, term696.getClass(), "hours", 0.7254646F);
        setField(term696, term696.getClass(), "comment", "");
        setBooleanField(term696, term696.getClass(), "billable", false);
        ArrayList term658 = new ArrayList();
        ((ArrayList) term658).add(term660);
        ((ArrayList) term658).add(term666);
        ((ArrayList) term658).add(term672);
        ((ArrayList) term658).add(term678);
        ((ArrayList) term658).add(term684);
        ((ArrayList) term658).add(term690);
        ((ArrayList) term658).add(term696);
        term654 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto"));
        setIntField(term654, term654.getClass(), "employeeId", -522618178);
        setLongField(term654, term654.getClass(), "taskId", -8257434502486459194L);
        setBooleanField(term654, term654.getClass(), "observed", false);
        setField(term654, term654.getClass(), "units", term658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isObserved", argTypes, term654, args);
    }

};



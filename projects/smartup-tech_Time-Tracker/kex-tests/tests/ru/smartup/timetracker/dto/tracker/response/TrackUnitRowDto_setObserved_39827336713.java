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
import java.lang.Boolean;

public class TrackUnitRowDto_setObserved_39827336713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5406;
     Object term5489;

    public TrackUnitRowDto_setObserved_39827336713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5437 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5439 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5437, term5437.getClass(), "id", 2701184207686293431L);
        setLongField(term5439, term5439.getClass(), "fastTime", 1663413767651L);
        setField(term5439, term5439.getClass(), "cdate", null);
        setField(term5437, term5437.getClass(), "workDay", term5439);
        setFloatField(term5437, term5437.getClass(), "hours", 0.32021916F);
        setBooleanField(term5437, term5437.getClass(), "blocked", true);
        setBooleanField(term5437, term5437.getClass(), "billable", true);
        setField(term5437, term5437.getClass(), "comment", "");
        setField(term5437, term5437.getClass(), "rejectReason", "");
        setBooleanField(term5437, term5437.getClass(), "rejected", true);
        Object term5447 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5449 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5447, term5447.getClass(), "id", 4474998035090263139L);
        setLongField(term5449, term5449.getClass(), "fastTime", 1263744156294L);
        setField(term5449, term5449.getClass(), "cdate", null);
        setField(term5447, term5447.getClass(), "workDay", term5449);
        setFloatField(term5447, term5447.getClass(), "hours", 0.8886614F);
        setBooleanField(term5447, term5447.getClass(), "blocked", true);
        setBooleanField(term5447, term5447.getClass(), "billable", false);
        setField(term5447, term5447.getClass(), "comment", "");
        setField(term5447, term5447.getClass(), "rejectReason", "");
        setBooleanField(term5447, term5447.getClass(), "rejected", false);
        Object term5457 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5459 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5457, term5457.getClass(), "id", 2848819812340321742L);
        setLongField(term5459, term5459.getClass(), "fastTime", 1490956290070L);
        setField(term5459, term5459.getClass(), "cdate", null);
        setField(term5457, term5457.getClass(), "workDay", term5459);
        setFloatField(term5457, term5457.getClass(), "hours", 0.22651339F);
        setBooleanField(term5457, term5457.getClass(), "blocked", true);
        setBooleanField(term5457, term5457.getClass(), "billable", false);
        setField(term5457, term5457.getClass(), "comment", "");
        setField(term5457, term5457.getClass(), "rejectReason", "");
        setBooleanField(term5457, term5457.getClass(), "rejected", false);
        Object term5467 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5469 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5467, term5467.getClass(), "id", -8876856890348836498L);
        setLongField(term5469, term5469.getClass(), "fastTime", 1285661498273L);
        setField(term5469, term5469.getClass(), "cdate", null);
        setField(term5467, term5467.getClass(), "workDay", term5469);
        setFloatField(term5467, term5467.getClass(), "hours", 0.38555247F);
        setBooleanField(term5467, term5467.getClass(), "blocked", true);
        setBooleanField(term5467, term5467.getClass(), "billable", false);
        setField(term5467, term5467.getClass(), "comment", "");
        setField(term5467, term5467.getClass(), "rejectReason", "");
        setBooleanField(term5467, term5467.getClass(), "rejected", false);
        Object term5477 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5479 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5477, term5477.getClass(), "id", 846579494941632714L);
        setLongField(term5479, term5479.getClass(), "fastTime", 1643981113575L);
        setField(term5479, term5479.getClass(), "cdate", null);
        setField(term5477, term5477.getClass(), "workDay", term5479);
        setFloatField(term5477, term5477.getClass(), "hours", 0.8878841F);
        setBooleanField(term5477, term5477.getClass(), "blocked", false);
        setBooleanField(term5477, term5477.getClass(), "billable", false);
        setField(term5477, term5477.getClass(), "comment", "");
        setField(term5477, term5477.getClass(), "rejectReason", "");
        setBooleanField(term5477, term5477.getClass(), "rejected", false);
        ArrayList term5435 = new ArrayList();
        ((ArrayList) term5435).add(term5437);
        ((ArrayList) term5435).add(term5447);
        ((ArrayList) term5435).add(term5457);
        ((ArrayList) term5435).add(term5467);
        ((ArrayList) term5435).add(term5477);
        term5406 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term5406, term5406.getClass(), "employeeId", 590364439);
        setIntField(term5406, term5406.getClass(), "projectId", 865208305);
        setField(term5406, term5406.getClass(), "projectName", "OYbzXylRWW");
        setLongField(term5406, term5406.getClass(), "taskId", -8652538484981166496L);
        setField(term5406, term5406.getClass(), "taskName", "DSNsTGYXDF");
        setBooleanField(term5406, term5406.getClass(), "observed", true);
        setField(term5406, term5406.getClass(), "units", term5435);
        term5489 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5489;
        callMethod(klass, "setObserved", argTypes, term5406, args);
    }

};



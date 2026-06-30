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

public class TrackUnitRowUpdateDto_equals_8076668209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term813;
     Object term833;

    public TrackUnitRowUpdateDto_equals_8076668209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term819 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term820 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term820, term820.getClass(), "fastTime", 1450865259896L);
        setField(term820, term820.getClass(), "cdate", null);
        setField(term819, term819.getClass(), "workDay", term820);
        setFloatField(term819, term819.getClass(), "hours", 0.8598297F);
        setField(term819, term819.getClass(), "comment", "");
        setBooleanField(term819, term819.getClass(), "billable", true);
        Object term825 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term826 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term826, term826.getClass(), "fastTime", 1467783054847L);
        setField(term826, term826.getClass(), "cdate", null);
        setField(term825, term825.getClass(), "workDay", term826);
        setFloatField(term825, term825.getClass(), "hours", 0.96323884F);
        setField(term825, term825.getClass(), "comment", "");
        setBooleanField(term825, term825.getClass(), "billable", false);
        ArrayList term817 = new ArrayList();
        ((ArrayList) term817).add(term819);
        ((ArrayList) term817).add(term825);
        term813 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto"));
        setIntField(term813, term813.getClass(), "employeeId", 1622346318);
        setLongField(term813, term813.getClass(), "taskId", 6967924379644551255L);
        setBooleanField(term813, term813.getClass(), "observed", false);
        setField(term813, term813.getClass(), "units", term817);
        term833 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term833;
        callMethod(klass, "equals", argTypes, term813, args);
    }

};



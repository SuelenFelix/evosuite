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

public class TrackUnitRowDto_equals_56548022915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5587;
     Object term5640;

    public TrackUnitRowDto_equals_56548022915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5618 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5620 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5618, term5618.getClass(), "id", 3133860696238261492L);
        setLongField(term5620, term5620.getClass(), "fastTime", 1531331402053L);
        setField(term5620, term5620.getClass(), "cdate", null);
        setField(term5618, term5618.getClass(), "workDay", term5620);
        setFloatField(term5618, term5618.getClass(), "hours", 0.25392914F);
        setBooleanField(term5618, term5618.getClass(), "blocked", false);
        setBooleanField(term5618, term5618.getClass(), "billable", true);
        setField(term5618, term5618.getClass(), "comment", "");
        setField(term5618, term5618.getClass(), "rejectReason", "");
        setBooleanField(term5618, term5618.getClass(), "rejected", false);
        Object term5628 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5630 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5628, term5628.getClass(), "id", 7247160664318067468L);
        setLongField(term5630, term5630.getClass(), "fastTime", 1264037800343L);
        setField(term5630, term5630.getClass(), "cdate", null);
        setField(term5628, term5628.getClass(), "workDay", term5630);
        setFloatField(term5628, term5628.getClass(), "hours", 0.63972145F);
        setBooleanField(term5628, term5628.getClass(), "blocked", false);
        setBooleanField(term5628, term5628.getClass(), "billable", false);
        setField(term5628, term5628.getClass(), "comment", "");
        setField(term5628, term5628.getClass(), "rejectReason", "");
        setBooleanField(term5628, term5628.getClass(), "rejected", false);
        ArrayList term5616 = new ArrayList();
        ((ArrayList) term5616).add(term5618);
        ((ArrayList) term5616).add(term5628);
        term5587 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term5587, term5587.getClass(), "employeeId", -203030934);
        setIntField(term5587, term5587.getClass(), "projectId", -1179120542);
        setField(term5587, term5587.getClass(), "projectName", "JppkknKVOw");
        setLongField(term5587, term5587.getClass(), "taskId", -8463029266761149071L);
        setField(term5587, term5587.getClass(), "taskName", "iljANwuEjk");
        setBooleanField(term5587, term5587.getClass(), "observed", true);
        setField(term5587, term5587.getClass(), "units", term5616);
        term5640 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5640;
        callMethod(klass, "equals", argTypes, term5587, args);
    }

};



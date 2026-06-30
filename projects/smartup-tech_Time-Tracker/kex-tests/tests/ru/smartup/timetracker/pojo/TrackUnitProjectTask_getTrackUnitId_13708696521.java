package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TrackUnitProjectTask_getTrackUnitId_13708696521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55030;

    public TrackUnitProjectTask_getTrackUnitId_13708696521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55030 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        Object term55033 = newInstance(Class.forName("java.util.Date"));
        setIntField(term55030, term55030.getClass(), "employeeId", 158873461);
        setLongField(term55030, term55030.getClass(), "trackUnitId", 3133860696238261492L);
        setLongField(term55033, term55033.getClass(), "fastTime", 1278177575793L);
        setField(term55033, term55033.getClass(), "cdate", null);
        setField(term55030, term55030.getClass(), "trackUnitWorkDay", term55033);
        setIntField(term55030, term55030.getClass(), "projectId", -430151637);
        setField(term55030, term55030.getClass(), "projectName", "nxSTJflLQy");
        setLongField(term55030, term55030.getClass(), "taskId", 7247160664318067468L);
        setField(term55030, term55030.getClass(), "taskName", "FlHzxEfFzI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrackUnitId", argTypes, term55030, args);
    }

};



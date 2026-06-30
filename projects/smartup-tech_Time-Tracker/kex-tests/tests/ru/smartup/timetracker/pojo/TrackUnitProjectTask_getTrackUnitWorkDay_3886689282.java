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

public class TrackUnitProjectTask_getTrackUnitWorkDay_3886689282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55081;

    public TrackUnitProjectTask_getTrackUnitWorkDay_3886689282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55081 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        Object term55084 = newInstance(Class.forName("java.util.Date"));
        setIntField(term55081, term55081.getClass(), "employeeId", -1697741339);
        setLongField(term55081, term55081.getClass(), "trackUnitId", 2135754395358000892L);
        setLongField(term55084, term55084.getClass(), "fastTime", 1272776321768L);
        setField(term55084, term55084.getClass(), "cdate", null);
        setField(term55081, term55081.getClass(), "trackUnitWorkDay", term55084);
        setIntField(term55081, term55081.getClass(), "projectId", 98922530);
        setField(term55081, term55081.getClass(), "projectName", "aSATgQUpoe");
        setLongField(term55081, term55081.getClass(), "taskId", -8085190702504231560L);
        setField(term55081, term55081.getClass(), "taskName", "VkPSXewZfB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrackUnitWorkDay", argTypes, term55081, args);
    }

};



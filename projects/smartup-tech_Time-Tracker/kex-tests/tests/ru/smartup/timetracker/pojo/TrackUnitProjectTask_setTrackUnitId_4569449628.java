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
import java.lang.Long;

public class TrackUnitProjectTask_setTrackUnitId_4569449628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55389;
     Object term55420;

    public TrackUnitProjectTask_setTrackUnitId_4569449628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55389 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        Object term55392 = newInstance(Class.forName("java.util.Date"));
        setIntField(term55389, term55389.getClass(), "employeeId", 229204365);
        setLongField(term55389, term55389.getClass(), "trackUnitId", -3936701866695933852L);
        setLongField(term55392, term55392.getClass(), "fastTime", 1285661498273L);
        setField(term55392, term55392.getClass(), "cdate", null);
        setField(term55389, term55389.getClass(), "trackUnitWorkDay", term55392);
        setIntField(term55389, term55389.getClass(), "projectId", -461771056);
        setField(term55389, term55389.getClass(), "projectName", "sHMXNUzNeM");
        setLongField(term55389, term55389.getClass(), "taskId", 1215116475929634177L);
        setField(term55389, term55389.getClass(), "taskName", "gPzGDOEPPw");
        term55420 = new Long(1597484336218508869L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term55420;
        callMethod(klass, "setTrackUnitId", argTypes, term55389, args);
    }

};



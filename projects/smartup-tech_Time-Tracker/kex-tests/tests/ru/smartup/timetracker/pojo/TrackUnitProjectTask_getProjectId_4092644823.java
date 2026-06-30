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

public class TrackUnitProjectTask_getProjectId_4092644823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55132;

    public TrackUnitProjectTask_getProjectId_4092644823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55132 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        Object term55135 = newInstance(Class.forName("java.util.Date"));
        setIntField(term55132, term55132.getClass(), "employeeId", -1388471422);
        setLongField(term55132, term55132.getClass(), "trackUnitId", 1672578078364590450L);
        setLongField(term55135, term55135.getClass(), "fastTime", 1597352397295L);
        setField(term55135, term55135.getClass(), "cdate", null);
        setField(term55132, term55132.getClass(), "trackUnitWorkDay", term55135);
        setIntField(term55132, term55132.getClass(), "projectId", -1498296052);
        setField(term55132, term55132.getClass(), "projectName", "ubodzJoMGW");
        setLongField(term55132, term55132.getClass(), "taskId", 4949335493504695457L);
        setField(term55132, term55132.getClass(), "taskName", "weddIktxOA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term55132, args);
    }

};



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

public class TrackUnitProjectTask_getProjectName_8231777794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55183;

    public TrackUnitProjectTask_getProjectName_8231777794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55183 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        Object term55186 = newInstance(Class.forName("java.util.Date"));
        setIntField(term55183, term55183.getClass(), "employeeId", 2098647989);
        setLongField(term55183, term55183.getClass(), "trackUnitId", -5216789073301458893L);
        setLongField(term55186, term55186.getClass(), "fastTime", 1713891155263L);
        setField(term55186, term55186.getClass(), "cdate", null);
        setField(term55183, term55183.getClass(), "trackUnitWorkDay", term55186);
        setIntField(term55183, term55183.getClass(), "projectId", 1598895173);
        setField(term55183, term55183.getClass(), "projectName", "uSlMeISsDD");
        setLongField(term55183, term55183.getClass(), "taskId", -1832940336320585644L);
        setField(term55183, term55183.getClass(), "taskName", "WdCiTDUKqn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectName", argTypes, term55183, args);
    }

};



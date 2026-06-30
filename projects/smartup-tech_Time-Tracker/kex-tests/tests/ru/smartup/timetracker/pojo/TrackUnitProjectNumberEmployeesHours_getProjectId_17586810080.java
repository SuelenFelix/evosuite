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

public class TrackUnitProjectNumberEmployeesHours_getProjectId_17586810080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57099;

    public TrackUnitProjectNumberEmployeesHours_getProjectId_17586810080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57099 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectNumberEmployeesHours"));
        setIntField(term57099, term57099.getClass(), "projectId", -1214628358);
        setLongField(term57099, term57099.getClass(), "numberEmployees", 8166095254618543564L);
        setDoubleField(term57099, term57099.getClass(), "sumHours", 0.0668892744806211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectNumberEmployeesHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term57099, args);
    }

};



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

public class SubmittedHoursByProjects_getProjectId_3440238640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54825;

    public SubmittedHoursByProjects_getProjectId_3440238640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54825 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedHoursByProjects"));
        setIntField(term54825, term54825.getClass(), "projectId", 2095798786);
        setField(term54825, term54825.getClass(), "projectName", "KtuuNAqGCQ");
        setFloatField(term54825, term54825.getClass(), "submittedHours", 0.92767143F);
        setFloatField(term54825, term54825.getClass(), "totalHours", 0.849079F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedHoursByProjects");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term54825, args);
    }

};



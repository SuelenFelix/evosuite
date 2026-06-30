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

public class SubmittedHoursByProjects_getProjectName_8884183971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54851;

    public SubmittedHoursByProjects_getProjectName_8884183971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54851 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedHoursByProjects"));
        setIntField(term54851, term54851.getClass(), "projectId", -1565502840);
        setField(term54851, term54851.getClass(), "projectName", "OGQsfjmReM");
        setFloatField(term54851, term54851.getClass(), "submittedHours", 0.4673223F);
        setFloatField(term54851, term54851.getClass(), "totalHours", 0.23129123F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedHoursByProjects");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectName", argTypes, term54851, args);
    }

};



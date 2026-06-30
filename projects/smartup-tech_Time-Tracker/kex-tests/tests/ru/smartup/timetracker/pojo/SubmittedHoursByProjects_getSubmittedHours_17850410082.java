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

public class SubmittedHoursByProjects_getSubmittedHours_17850410082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54877;

    public SubmittedHoursByProjects_getSubmittedHours_17850410082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54877 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedHoursByProjects"));
        setIntField(term54877, term54877.getClass(), "projectId", 344323424);
        setField(term54877, term54877.getClass(), "projectName", "YsUtbngnRO");
        setFloatField(term54877, term54877.getClass(), "submittedHours", 0.82184F);
        setFloatField(term54877, term54877.getClass(), "totalHours", 0.6047138F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedHoursByProjects");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubmittedHours", argTypes, term54877, args);
    }

};



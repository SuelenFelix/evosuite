package ru.smartup.timetracker.dto.task.response;

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
import static ru.smartup.timetracker.dto.task.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class TaskDto_setId_195365714527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1510;
     Object term1515;

    public TaskDto_setId_195365714527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1510 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        setLongField(term1510, term1510.getClass(), "id", 0L);
        setField(term1510, term1510.getClass(), "name", null);
        setIntField(term1510, term1510.getClass(), "projectId", 0);
        setBooleanField(term1510, term1510.getClass(), "billable", false);
        setBooleanField(term1510, term1510.getClass(), "isArchived", false);
        setField(term1510, term1510.getClass(), "createdDate", null);
        setField(term1510, term1510.getClass(), "lastModifiedDate", null);
        term1515 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1515;
        callMethod(klass, "setId", argTypes, term1510, args);
    }

};



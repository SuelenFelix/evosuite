package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Task_setId_196150774828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100772;
     Object term100777;

    public Task_setId_196150774828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100772 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        setLongField(term100772, term100772.getClass(), "id", 0L);
        setField(term100772, term100772.getClass(), "name", null);
        setIntField(term100772, term100772.getClass(), "projectId", 0);
        setBooleanField(term100772, term100772.getClass(), "billable", false);
        setBooleanField(term100772, term100772.getClass(), "isArchived", false);
        setField(term100772, term100772.getClass(), "createdDate", null);
        setField(term100772, term100772.getClass(), "lastModifiedDate", null);
        term100777 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term100777;
        callMethod(klass, "setId", argTypes, term100772, args);
    }

};



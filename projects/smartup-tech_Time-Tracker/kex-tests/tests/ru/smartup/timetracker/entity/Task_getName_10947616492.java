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
import java.lang.Object;

public class Task_getName_10947616492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100136;

    public Task_getName_10947616492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100136 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100153 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100156 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100136, term100136.getClass(), "id", 8166095254618543564L);
        setField(term100136, term100136.getClass(), "name", "TVxGTjeDcu");
        setIntField(term100136, term100136.getClass(), "projectId", -1551355284);
        setBooleanField(term100136, term100136.getClass(), "billable", true);
        setBooleanField(term100136, term100136.getClass(), "isArchived", false);
        setIntField(term100153, term100153.getClass(), "nanos", 306000000);
        setLongField(term100153, term100153.getClass(), "fastTime", 1480634442000L);
        setField(term100153, term100153.getClass(), "cdate", null);
        setField(term100136, term100136.getClass(), "createdDate", term100153);
        setIntField(term100156, term100156.getClass(), "nanos", 608000000);
        setLongField(term100156, term100156.getClass(), "fastTime", 1524259884000L);
        setField(term100156, term100156.getClass(), "cdate", null);
        setField(term100136, term100136.getClass(), "lastModifiedDate", term100156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term100136, args);
    }

};



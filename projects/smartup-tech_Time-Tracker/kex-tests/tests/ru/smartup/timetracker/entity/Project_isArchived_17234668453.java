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

public class Project_isArchived_17234668453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63115;

    public Project_isArchived_17234668453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63115 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term63130 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term63133 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term63115, term63115.getClass(), "id", 798043553);
        setField(term63115, term63115.getClass(), "name", "hePqROaplw");
        setBooleanField(term63115, term63115.getClass(), "isArchived", true);
        setIntField(term63130, term63130.getClass(), "nanos", 638000000);
        setLongField(term63130, term63130.getClass(), "fastTime", 1458408401000L);
        setField(term63130, term63130.getClass(), "cdate", null);
        setField(term63115, term63115.getClass(), "createdDate", term63130);
        setIntField(term63133, term63133.getClass(), "nanos", 445000000);
        setLongField(term63133, term63133.getClass(), "fastTime", 1377995720000L);
        setField(term63133, term63133.getClass(), "cdate", null);
        setField(term63115, term63115.getClass(), "lastModifiedDate", term63133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isArchived", argTypes, term63115, args);
    }

};



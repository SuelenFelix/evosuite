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

public class Project_getCreatedDate_11156177274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63146;

    public Project_getCreatedDate_11156177274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63146 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term63161 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term63164 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term63146, term63146.getClass(), "id", 533197381);
        setField(term63146, term63146.getClass(), "name", "PJcSNDruWd");
        setBooleanField(term63146, term63146.getClass(), "isArchived", true);
        setIntField(term63161, term63161.getClass(), "nanos", 981000000);
        setLongField(term63161, term63161.getClass(), "fastTime", 1384826737000L);
        setField(term63161, term63161.getClass(), "cdate", null);
        setField(term63146, term63146.getClass(), "createdDate", term63161);
        setIntField(term63164, term63164.getClass(), "nanos", 246000000);
        setLongField(term63164, term63164.getClass(), "fastTime", 1444695056000L);
        setField(term63164, term63164.getClass(), "cdate", null);
        setField(term63146, term63146.getClass(), "lastModifiedDate", term63164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term63146, args);
    }

};



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

public class Project_getLastModifiedDate_19034872945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63177;

    public Project_getLastModifiedDate_19034872945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63177 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term63192 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term63195 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term63177, term63177.getClass(), "id", 1048271679);
        setField(term63177, term63177.getClass(), "name", "VVNNlAePXF");
        setBooleanField(term63177, term63177.getClass(), "isArchived", true);
        setIntField(term63192, term63192.getClass(), "nanos", 110000000);
        setLongField(term63192, term63192.getClass(), "fastTime", 1758143407000L);
        setField(term63192, term63192.getClass(), "cdate", null);
        setField(term63177, term63177.getClass(), "createdDate", term63192);
        setIntField(term63195, term63195.getClass(), "nanos", 140000000);
        setLongField(term63195, term63195.getClass(), "fastTime", 1374829393000L);
        setField(term63195, term63195.getClass(), "cdate", null);
        setField(term63177, term63177.getClass(), "lastModifiedDate", term63195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term63177, args);
    }

};



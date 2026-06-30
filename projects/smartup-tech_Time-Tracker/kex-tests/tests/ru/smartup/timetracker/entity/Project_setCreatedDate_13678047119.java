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

public class Project_setCreatedDate_13678047119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63327;
     Object term63348;

    public Project_setCreatedDate_13678047119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63327 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term63342 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term63345 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term63327, term63327.getClass(), "id", -288604325);
        setField(term63327, term63327.getClass(), "name", "GPSEWEDSTo");
        setBooleanField(term63327, term63327.getClass(), "isArchived", false);
        setIntField(term63342, term63342.getClass(), "nanos", 231000000);
        setLongField(term63342, term63342.getClass(), "fastTime", 1337273131000L);
        setField(term63342, term63342.getClass(), "cdate", null);
        setField(term63327, term63327.getClass(), "createdDate", term63342);
        setIntField(term63345, term63345.getClass(), "nanos", 425000000);
        setLongField(term63345, term63345.getClass(), "fastTime", 1291731469000L);
        setField(term63345, term63345.getClass(), "cdate", null);
        setField(term63327, term63327.getClass(), "lastModifiedDate", term63345);
        term63348 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term63348, term63348.getClass(), "nanos", 512000000);
        setLongField(term63348, term63348.getClass(), "fastTime", 1372834031000L);
        setField(term63348, term63348.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term63348;
        callMethod(klass, "setCreatedDate", argTypes, term63327, args);
    }

};



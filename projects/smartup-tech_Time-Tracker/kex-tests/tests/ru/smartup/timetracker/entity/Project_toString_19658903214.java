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

public class Project_toString_19658903214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63490;

    public Project_toString_19658903214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63490 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term63505 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term63508 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term63490, term63490.getClass(), "id", -1420269858);
        setField(term63490, term63490.getClass(), "name", "fzeqPnzpnt");
        setBooleanField(term63490, term63490.getClass(), "isArchived", true);
        setIntField(term63505, term63505.getClass(), "nanos", 188000000);
        setLongField(term63505, term63505.getClass(), "fastTime", 1619062356000L);
        setField(term63505, term63505.getClass(), "cdate", null);
        setField(term63490, term63490.getClass(), "createdDate", term63505);
        setIntField(term63508, term63508.getClass(), "nanos", 71000000);
        setLongField(term63508, term63508.getClass(), "fastTime", 1275817501000L);
        setField(term63508, term63508.getClass(), "cdate", null);
        setField(term63490, term63490.getClass(), "lastModifiedDate", term63508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term63490, args);
    }

};



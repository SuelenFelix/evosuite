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

public class Task_getLastModifiedDate_20630802367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100301;

    public Task_getLastModifiedDate_20630802367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100301 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100318 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100321 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100301, term100301.getClass(), "id", -4360569253593381888L);
        setField(term100301, term100301.getClass(), "name", "DbfiyFeaTe");
        setIntField(term100301, term100301.getClass(), "projectId", -1538936030);
        setBooleanField(term100301, term100301.getClass(), "billable", false);
        setBooleanField(term100301, term100301.getClass(), "isArchived", false);
        setIntField(term100318, term100318.getClass(), "nanos", 220000000);
        setLongField(term100318, term100318.getClass(), "fastTime", 1329530037000L);
        setField(term100318, term100318.getClass(), "cdate", null);
        setField(term100301, term100301.getClass(), "createdDate", term100318);
        setIntField(term100321, term100321.getClass(), "nanos", 131000000);
        setLongField(term100321, term100321.getClass(), "fastTime", 1860772174000L);
        setField(term100321, term100321.getClass(), "cdate", null);
        setField(term100301, term100301.getClass(), "lastModifiedDate", term100321);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term100301, args);
    }

};



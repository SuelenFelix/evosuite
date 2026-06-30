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

public class Task_setCreatedDate_152739765313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100529;
     Object term100552;

    public Task_setCreatedDate_152739765313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100529 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100546 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100549 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100529, term100529.getClass(), "id", -1539859611880912454L);
        setField(term100529, term100529.getClass(), "name", "ujxmmZZcbT");
        setIntField(term100529, term100529.getClass(), "projectId", -270592367);
        setBooleanField(term100529, term100529.getClass(), "billable", true);
        setBooleanField(term100529, term100529.getClass(), "isArchived", false);
        setIntField(term100546, term100546.getClass(), "nanos", 91000000);
        setLongField(term100546, term100546.getClass(), "fastTime", 1590899757000L);
        setField(term100546, term100546.getClass(), "cdate", null);
        setField(term100529, term100529.getClass(), "createdDate", term100546);
        setIntField(term100549, term100549.getClass(), "nanos", 902000000);
        setLongField(term100549, term100549.getClass(), "fastTime", 1709798531000L);
        setField(term100549, term100549.getClass(), "cdate", null);
        setField(term100529, term100529.getClass(), "lastModifiedDate", term100549);
        term100552 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term100552, term100552.getClass(), "nanos", 181000000);
        setLongField(term100552, term100552.getClass(), "fastTime", 1625525881000L);
        setField(term100552, term100552.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term100552;
        callMethod(klass, "setCreatedDate", argTypes, term100529, args);
    }

};



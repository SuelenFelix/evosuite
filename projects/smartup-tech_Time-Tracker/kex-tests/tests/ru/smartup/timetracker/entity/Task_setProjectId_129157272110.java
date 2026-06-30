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
import java.lang.Integer;

public class Task_setProjectId_129157272110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100424;
     Object term100447;

    public Task_setProjectId_129157272110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100424 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100441 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100444 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100424, term100424.getClass(), "id", -7884871963229073324L);
        setField(term100424, term100424.getClass(), "name", "EHoNUaeyvT");
        setIntField(term100424, term100424.getClass(), "projectId", 401512128);
        setBooleanField(term100424, term100424.getClass(), "billable", false);
        setBooleanField(term100424, term100424.getClass(), "isArchived", true);
        setIntField(term100441, term100441.getClass(), "nanos", 860000000);
        setLongField(term100441, term100441.getClass(), "fastTime", 1587961539000L);
        setField(term100441, term100441.getClass(), "cdate", null);
        setField(term100424, term100424.getClass(), "createdDate", term100441);
        setIntField(term100444, term100444.getClass(), "nanos", 312000000);
        setLongField(term100444, term100444.getClass(), "fastTime", 1420665885000L);
        setField(term100444, term100444.getClass(), "cdate", null);
        setField(term100424, term100424.getClass(), "lastModifiedDate", term100444);
        term100447 = new Integer(-2069930777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100447;
        callMethod(klass, "setProjectId", argTypes, term100424, args);
    }

};



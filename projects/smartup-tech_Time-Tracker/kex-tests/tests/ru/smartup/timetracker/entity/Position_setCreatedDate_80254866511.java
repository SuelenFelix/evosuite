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

public class Position_setCreatedDate_80254866511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108528;
     Object term108550;

    public Position_setCreatedDate_80254866511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108528 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        Object term108544 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term108547 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108528, term108528.getClass(), "id", -246967963);
        setField(term108528, term108528.getClass(), "name", "WkLpmqoQxy");
        setFloatField(term108528, term108528.getClass(), "externalRate", 0.07096106F);
        setBooleanField(term108528, term108528.getClass(), "isArchived", true);
        setIntField(term108544, term108544.getClass(), "nanos", 193000000);
        setLongField(term108544, term108544.getClass(), "fastTime", 1279190974000L);
        setField(term108544, term108544.getClass(), "cdate", null);
        setField(term108528, term108528.getClass(), "createdDate", term108544);
        setIntField(term108547, term108547.getClass(), "nanos", 830000000);
        setLongField(term108547, term108547.getClass(), "fastTime", 1559964099000L);
        setField(term108547, term108547.getClass(), "cdate", null);
        setField(term108528, term108528.getClass(), "lastModifiedDate", term108547);
        term108550 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108550, term108550.getClass(), "nanos", 651000000);
        setLongField(term108550, term108550.getClass(), "fastTime", 1544973818000L);
        setField(term108550, term108550.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term108550;
        callMethod(klass, "setCreatedDate", argTypes, term108528, args);
    }

};



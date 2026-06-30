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

public class Project_equals_115603539711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63395;
     Object term63416;

    public Project_equals_115603539711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63395 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term63410 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term63413 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term63395, term63395.getClass(), "id", 877649659);
        setField(term63395, term63395.getClass(), "name", "TSyCeEZPaT");
        setBooleanField(term63395, term63395.getClass(), "isArchived", false);
        setIntField(term63410, term63410.getClass(), "nanos", 714000000);
        setLongField(term63410, term63410.getClass(), "fastTime", 1879092608000L);
        setField(term63410, term63410.getClass(), "cdate", null);
        setField(term63395, term63395.getClass(), "createdDate", term63410);
        setIntField(term63413, term63413.getClass(), "nanos", 685000000);
        setLongField(term63413, term63413.getClass(), "fastTime", 1464331512000L);
        setField(term63413, term63413.getClass(), "cdate", null);
        setField(term63395, term63395.getClass(), "lastModifiedDate", term63413);
        term63416 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term63416;
        callMethod(klass, "equals", argTypes, term63395, args);
    }

};



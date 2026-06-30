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
import java.lang.Boolean;

public class Project_setArchived_8802370738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63294;
     Object term63315;

    public Project_setArchived_8802370738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63294 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term63309 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term63312 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term63294, term63294.getClass(), "id", -2005784375);
        setField(term63294, term63294.getClass(), "name", "iuCxnHGMoW");
        setBooleanField(term63294, term63294.getClass(), "isArchived", true);
        setIntField(term63309, term63309.getClass(), "nanos", 491000000);
        setLongField(term63309, term63309.getClass(), "fastTime", 1630044767000L);
        setField(term63309, term63309.getClass(), "cdate", null);
        setField(term63294, term63294.getClass(), "createdDate", term63309);
        setIntField(term63312, term63312.getClass(), "nanos", 731000000);
        setLongField(term63312, term63312.getClass(), "fastTime", 1335709182000L);
        setField(term63312, term63312.getClass(), "cdate", null);
        setField(term63294, term63294.getClass(), "lastModifiedDate", term63312);
        term63315 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term63315;
        callMethod(klass, "setArchived", argTypes, term63294, args);
    }

};



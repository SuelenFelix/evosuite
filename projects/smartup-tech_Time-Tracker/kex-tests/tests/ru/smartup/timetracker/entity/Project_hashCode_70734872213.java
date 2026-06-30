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

public class Project_hashCode_70734872213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63459;

    public Project_hashCode_70734872213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63459 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term63474 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term63477 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term63459, term63459.getClass(), "id", 1774507971);
        setField(term63459, term63459.getClass(), "name", "vOVuNSCCLe");
        setBooleanField(term63459, term63459.getClass(), "isArchived", false);
        setIntField(term63474, term63474.getClass(), "nanos", 174000000);
        setLongField(term63474, term63474.getClass(), "fastTime", 1838962163000L);
        setField(term63474, term63474.getClass(), "cdate", null);
        setField(term63459, term63459.getClass(), "createdDate", term63474);
        setIntField(term63477, term63477.getClass(), "nanos", 553000000);
        setLongField(term63477, term63477.getClass(), "fastTime", 1498467173000L);
        setField(term63477, term63477.getClass(), "cdate", null);
        setField(term63459, term63459.getClass(), "lastModifiedDate", term63477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term63459, args);
    }

};



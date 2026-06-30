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

public class Project_getName_9351687072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63084;

    public Project_getName_9351687072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63084 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term63099 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term63102 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term63084, term63084.getClass(), "id", -146054762);
        setField(term63084, term63084.getClass(), "name", "IBpaxltauX");
        setBooleanField(term63084, term63084.getClass(), "isArchived", false);
        setIntField(term63099, term63099.getClass(), "nanos", 389000000);
        setLongField(term63099, term63099.getClass(), "fastTime", 1813458218000L);
        setField(term63099, term63099.getClass(), "cdate", null);
        setField(term63084, term63084.getClass(), "createdDate", term63099);
        setIntField(term63102, term63102.getClass(), "nanos", 352000000);
        setLongField(term63102, term63102.getClass(), "fastTime", 1828937156000L);
        setField(term63102, term63102.getClass(), "cdate", null);
        setField(term63084, term63084.getClass(), "lastModifiedDate", term63102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term63084, args);
    }

};



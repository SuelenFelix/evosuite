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

public class Task_getProjectId_12352856253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100169;

    public Task_getProjectId_12352856253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100169 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100186 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100189 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100169, term100169.getClass(), "id", -4598158870068953328L);
        setField(term100169, term100169.getClass(), "name", "ABPtcyCzkR");
        setIntField(term100169, term100169.getClass(), "projectId", -1381970335);
        setBooleanField(term100169, term100169.getClass(), "billable", true);
        setBooleanField(term100169, term100169.getClass(), "isArchived", true);
        setIntField(term100186, term100186.getClass(), "nanos", 337000000);
        setLongField(term100186, term100186.getClass(), "fastTime", 1863600849000L);
        setField(term100186, term100186.getClass(), "cdate", null);
        setField(term100169, term100169.getClass(), "createdDate", term100186);
        setIntField(term100189, term100189.getClass(), "nanos", 345000000);
        setLongField(term100189, term100189.getClass(), "fastTime", 1436723267000L);
        setField(term100189, term100189.getClass(), "cdate", null);
        setField(term100169, term100169.getClass(), "lastModifiedDate", term100189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term100169, args);
    }

};



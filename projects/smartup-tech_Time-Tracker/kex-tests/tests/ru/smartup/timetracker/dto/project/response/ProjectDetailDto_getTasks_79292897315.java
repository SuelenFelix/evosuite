package ru.smartup.timetracker.dto.project.response;

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
import static ru.smartup.timetracker.dto.project.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProjectDetailDto_getTasks_79292897315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19147;

    public ProjectDetailDto_getTasks_79292897315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19147 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto"));
        setField(term19147, term19147.getClass(), "employees", null);
        setField(term19147, term19147.getClass(), "tasks", null);
        setField(term19147, term19147.getClass(), "createdDate", null);
        setField(term19147, term19147.getClass(), "lastModifiedDate", null);
        setIntField(term19147, term19147.getClass(), "id", 0);
        setField(term19147, term19147.getClass(), "name", null);
        setBooleanField(term19147, term19147.getClass(), "isArchived", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTasks", argTypes, term19147, args);
    }

};



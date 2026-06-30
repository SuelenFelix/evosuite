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

public class ProjectDetailDto_setEmployees_138493213618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19156;

    public ProjectDetailDto_setEmployees_138493213618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19156 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto"));
        setField(term19156, term19156.getClass(), "employees", null);
        setField(term19156, term19156.getClass(), "tasks", null);
        setField(term19156, term19156.getClass(), "createdDate", null);
        setField(term19156, term19156.getClass(), "lastModifiedDate", null);
        setIntField(term19156, term19156.getClass(), "id", 0);
        setField(term19156, term19156.getClass(), "name", null);
        setBooleanField(term19156, term19156.getClass(), "isArchived", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectDetailDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEmployees", argTypes, term19156, args);
    }

};



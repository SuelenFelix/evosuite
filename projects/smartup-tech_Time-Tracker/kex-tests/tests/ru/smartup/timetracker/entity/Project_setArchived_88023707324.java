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
import java.lang.Boolean;

public class Project_setArchived_88023707324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63546;
     Object term63549;

    public Project_setArchived_88023707324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63546 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        setIntField(term63546, term63546.getClass(), "id", 0);
        setField(term63546, term63546.getClass(), "name", null);
        setBooleanField(term63546, term63546.getClass(), "isArchived", false);
        setField(term63546, term63546.getClass(), "createdDate", null);
        setField(term63546, term63546.getClass(), "lastModifiedDate", null);
        term63549 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term63549;
        callMethod(klass, "setArchived", argTypes, term63546, args);
    }

};



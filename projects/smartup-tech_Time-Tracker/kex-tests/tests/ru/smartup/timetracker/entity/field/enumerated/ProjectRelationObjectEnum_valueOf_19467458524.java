package ru.smartup.timetracker.entity.field.enumerated;

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
import static ru.smartup.timetracker.entity.field.enumerated.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ProjectRelationObjectEnum_valueOf_19467458524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum13;

    public ProjectRelationObjectEnum_valueOf_19467458524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5576 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRelationObjectEnum");
        Field term5575 = ((Class) term5576).getDeclaredField((String) "PROJECT");
        ((Field) term5575).setAccessible(true);
        enum13 = ((Field) term5575).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProjectRelationObjectEnum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "valueOf", argTypes, enum13, args);
    }

};



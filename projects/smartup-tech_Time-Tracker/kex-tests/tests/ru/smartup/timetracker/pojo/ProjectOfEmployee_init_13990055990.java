package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.String;
import java.lang.Object;

public class ProjectOfEmployee_init_13990055990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57135;
     Object term57149;
     Object term57151;
     Object enum119;

    public ProjectOfEmployee_init_13990055990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57135 = new Integer(-1870495012);
        term57149 = new Boolean(false);
        term57151 = new Float(0.17877543F);
        Class<? extends Object> term57175 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term57174 = ((Class) term57175).getDeclaredField((String) "MANAGER");
        ((Field) term57174).setAccessible(true);
        enum119 = ((Field) term57174).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ProjectOfEmployee");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.lang.Float");
        argTypes[4] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Object[] args = new Object[5];
        args[0] = term57135;
        args[1] = "LrqwfrKKtS";
        args[2] = term57149;
        args[3] = term57151;
        args[4] = enum119;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



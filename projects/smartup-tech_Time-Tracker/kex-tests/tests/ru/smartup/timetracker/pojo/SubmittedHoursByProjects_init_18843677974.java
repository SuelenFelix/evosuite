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
import java.lang.Float;

public class SubmittedHoursByProjects_init_18843677974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54929;
     Object term54943;
     Object term54945;

    public SubmittedHoursByProjects_init_18843677974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54929 = new Integer(-25637976);
        term54943 = new Float(0.6366371F);
        term54945 = new Float(0.28292418F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedHoursByProjects");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = float.class;
        argTypes[3] = float.class;
        Object[] args = new Object[4];
        args[0] = term54929;
        args[1] = "NxgmYPzWCI";
        args[2] = term54943;
        args[3] = term54945;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



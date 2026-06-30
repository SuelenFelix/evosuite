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
import java.lang.Long;
import java.lang.Boolean;

public class TrackedProjectTaskForEmployee_init_176720138016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23420;
     Object term23422;
     Object term23436;
     Object term23450;

    public TrackedProjectTaskForEmployee_init_176720138016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23420 = new Integer(-268815336);
        term23422 = new Integer(-1210583429);
        term23436 = new Long(-1154553077993834885L);
        term23450 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = long.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term23420;
        args[1] = term23422;
        args[2] = "bnsyeQXFdu";
        args[3] = term23436;
        args[4] = "BwtdjiefJn";
        args[5] = term23450;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



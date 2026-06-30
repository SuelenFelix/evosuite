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
import java.lang.Double;

public class TrackUnitProjectNumberEmployeesHours_init_374469217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57129;
     Object term57131;
     Object term57133;

    public TrackUnitProjectNumberEmployeesHours_init_374469217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57129 = new Integer(0);
        term57131 = new Long(0L);
        term57133 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectNumberEmployeesHours");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = long.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term57129;
        args[1] = term57131;
        args[2] = term57133;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



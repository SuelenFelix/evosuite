package ru.smartup.timetracker.dto;

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
import static ru.smartup.timetracker.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;

public class ResultDto_init_1985486533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum243;
     Object term123722;

    public ResultDto_init_1985486533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term123733 = Class.forName((String) "ru.smartup.timetracker.dto.ErrorCode");
        Field term123732 = ((Class) term123733).getDeclaredField((String) "RELATED_ENTITIES_FOUND_FOR_EMPLOYEE");
        ((Field) term123732).setAccessible(true);
        enum243 = ((Field) term123732).get((Object) null);
        Object term123725 = newInstance(Class.forName("java.lang.Object"));
        Object term123727 = newInstance(Class.forName("java.lang.Object"));
        Object term123729 = newInstance(Class.forName("java.lang.Object"));
        term123722 = new LinkedList();
        ((LinkedList) term123722).add(term123725);
        ((LinkedList) term123722).add(term123727);
        ((LinkedList) term123722).add(term123729);
        ((LinkedList) term123722).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.ResultDto");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("ru.smartup.timetracker.dto.ErrorCode");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = enum243;
        args[1] = "hpTAdtnQku";
        args[2] = term123722;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



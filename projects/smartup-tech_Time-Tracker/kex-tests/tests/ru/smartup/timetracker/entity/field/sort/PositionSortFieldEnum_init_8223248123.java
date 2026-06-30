package ru.smartup.timetracker.entity.field.sort;

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
import static ru.smartup.timetracker.entity.field.sort.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PositionSortFieldEnum_init_8223248123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3344;

    public PositionSortFieldEnum_init_8223248123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3344 = (Object[]) newArray("java.lang.String", 6);
        setElement(term3344, 0, "MxlszYVzRf");
        setElement(term3344, 1, "LQFpaHEwXR");
        setElement(term3344, 2, "oVcInYnLWB");
        setElement(term3344, 3, "aJlieCFVtF");
        setElement(term3344, 4, "ZiaGIbnzTs");
        setElement(term3344, 5, "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.field.sort.PositionSortFieldEnum");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term3344;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



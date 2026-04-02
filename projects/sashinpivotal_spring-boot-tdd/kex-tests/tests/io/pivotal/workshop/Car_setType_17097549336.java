package io.pivotal.workshop;

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
import static io.pivotal.workshop.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Car_setType_17097549336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254;

    public Car_setType_17097549336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term255 = new Long(5270370404989704783L);
        term254 = newInstance(Class.forName("io.pivotal.workshop.Car"));
        setField(term254, term254.getClass(), "id", term255);
        setField(term254, term254.getClass(), "name", "uuaPigETmJ");
        setField(term254, term254.getClass(), "type", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.pivotal.workshop.Car");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "setType", argTypes, term254, args);
    }

};



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

public class Car_hashCode_14383670118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371;

    public Car_hashCode_14383670118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term372 = new Long(4872422362414183754L);
        term371 = newInstance(Class.forName("io.pivotal.workshop.Car"));
        setField(term371, term371.getClass(), "id", term372);
        setField(term371, term371.getClass(), "name", "ZiaGIbnzTs");
        setField(term371, term371.getClass(), "type", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.pivotal.workshop.Car");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term371, args);
    }

};



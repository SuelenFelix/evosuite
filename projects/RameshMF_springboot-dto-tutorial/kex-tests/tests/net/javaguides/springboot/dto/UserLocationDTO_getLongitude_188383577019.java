package net.javaguides.springboot.dto;

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
import static net.javaguides.springboot.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserLocationDTO_getLongitude_188383577019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737;

    public UserLocationDTO_getLongitude_188383577019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term737 = newInstance(Class.forName("net.javaguides.springboot.dto.UserLocationDTO"));
        setLongField(term737, term737.getClass(), "userId", 0L);
        setField(term737, term737.getClass(), "email", null);
        setField(term737, term737.getClass(), "place", null);
        setDoubleField(term737, term737.getClass(), "longitude", 0.0);
        setDoubleField(term737, term737.getClass(), "latitude", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.dto.UserLocationDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLongitude", argTypes, term737, args);
    }

};



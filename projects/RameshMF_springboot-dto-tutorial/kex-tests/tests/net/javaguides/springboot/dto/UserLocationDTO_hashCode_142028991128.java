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

public class UserLocationDTO_hashCode_142028991128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term779;

    public UserLocationDTO_hashCode_142028991128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term779 = newInstance(Class.forName("net.javaguides.springboot.dto.UserLocationDTO"));
        setLongField(term779, term779.getClass(), "userId", 0L);
        setField(term779, term779.getClass(), "email", null);
        setField(term779, term779.getClass(), "place", null);
        setDoubleField(term779, term779.getClass(), "longitude", 0.0);
        setDoubleField(term779, term779.getClass(), "latitude", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.dto.UserLocationDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term779, args);
    }

};



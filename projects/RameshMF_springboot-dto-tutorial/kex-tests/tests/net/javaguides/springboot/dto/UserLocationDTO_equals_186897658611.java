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

public class UserLocationDTO_equals_186897658611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531;
     Object term559;

    public UserLocationDTO_equals_186897658611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531 = newInstance(Class.forName("net.javaguides.springboot.dto.UserLocationDTO"));
        setLongField(term531, term531.getClass(), "userId", -8885298608300233488L);
        setField(term531, term531.getClass(), "email", "xOEqzGAmDU");
        setField(term531, term531.getClass(), "place", "eZFUvlxvGV");
        setDoubleField(term531, term531.getClass(), "longitude", 0.43692187681405226);
        setDoubleField(term531, term531.getClass(), "latitude", 0.7633268466829064);
        term559 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.dto.UserLocationDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term559;
        callMethod(klass, "equals", argTypes, term531, args);
    }

};



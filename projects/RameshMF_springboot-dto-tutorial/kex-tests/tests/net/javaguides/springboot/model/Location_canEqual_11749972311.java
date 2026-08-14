package net.javaguides.springboot.model;

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
import static net.javaguides.springboot.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Location_canEqual_11749972311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4079;
     Object term4107;

    public Location_canEqual_11749972311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4079 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term4079, term4079.getClass(), "id", 414749984815662075L);
        setField(term4079, term4079.getClass(), "place", "sQvGcVjdEx");
        setField(term4079, term4079.getClass(), "description", "rLHAoqXgPh");
        setDoubleField(term4079, term4079.getClass(), "longitude", 0.16988691727397487);
        setDoubleField(term4079, term4079.getClass(), "latitude", 0.39286935532362843);
        term4107 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4107;
        callMethod(klass, "canEqual", argTypes, term4079, args);
    }

};



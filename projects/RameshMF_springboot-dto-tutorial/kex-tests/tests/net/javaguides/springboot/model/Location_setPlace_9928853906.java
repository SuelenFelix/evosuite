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

public class Location_setPlace_9928853906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2813;

    public Location_setPlace_9928853906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2813 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2813, term2813.getClass(), "id", -6645965768855543712L);
        setField(term2813, term2813.getClass(), "place", "dpNsDgfPso");
        setField(term2813, term2813.getClass(), "description", "hCWPJQKpdc");
        setDoubleField(term2813, term2813.getClass(), "longitude", 0.7591353014991907);
        setDoubleField(term2813, term2813.getClass(), "latitude", 0.791695029600875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WzMEhMXkKx";
        callMethod(klass, "setPlace", argTypes, term2813, args);
    }

};



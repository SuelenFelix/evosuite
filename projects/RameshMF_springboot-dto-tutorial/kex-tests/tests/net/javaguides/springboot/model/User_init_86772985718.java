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
import java.lang.Long;

public class User_init_86772985718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2351;
     Object term2401;

    public User_init_86772985718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2351 = new Long(-484994522244390100L);
        term2401 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2401, term2401.getClass(), "id", 1233889271256172047L);
        setField(term2401, term2401.getClass(), "place", "xBsXSDjXYK");
        setField(term2401, term2401.getClass(), "description", "sEnIVFtZuQ");
        setDoubleField(term2401, term2401.getClass(), "longitude", 0.9737083944266686);
        setDoubleField(term2401, term2401.getClass(), "latitude", 0.0668892744806211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("net.javaguides.springboot.model.Location");
        Object[] args = new Object[6];
        args[0] = term2351;
        args[1] = "AWRooQKkdW";
        args[2] = "vjxIhXHxGR";
        args[3] = "QXzGXbEXMu";
        args[4] = "qxSDVejjiY";
        args[5] = term2401;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



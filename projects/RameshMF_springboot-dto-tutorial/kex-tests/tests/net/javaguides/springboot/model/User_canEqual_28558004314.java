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
import java.lang.Object;

public class User_canEqual_28558004314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1936;
     Object term2014;

    public User_canEqual_28558004314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1936 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term1986 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term1936, term1936.getClass(), "id", 1967728129628047933L);
        setField(term1936, term1936.getClass(), "email", "cAPeiZHKGJ");
        setField(term1936, term1936.getClass(), "firstName", "LvJFtLBaxj");
        setField(term1936, term1936.getClass(), "lastName", "PHvxnGHptP");
        setField(term1936, term1936.getClass(), "password", "TimdotUuNC");
        setLongField(term1986, term1986.getClass(), "id", 2120084523938730454L);
        setField(term1986, term1986.getClass(), "place", "PkWMRdJcBb");
        setField(term1986, term1986.getClass(), "description", "jSpAteRute");
        setDoubleField(term1986, term1986.getClass(), "longitude", 0.10667076642995188);
        setDoubleField(term1986, term1986.getClass(), "latitude", 0.11493000848982304);
        setField(term1936, term1936.getClass(), "location", term1986);
        term2014 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2014;
        callMethod(klass, "canEqual", argTypes, term1936, args);
    }

};



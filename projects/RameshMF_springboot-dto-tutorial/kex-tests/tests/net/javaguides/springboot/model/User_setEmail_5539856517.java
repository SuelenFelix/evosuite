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

public class User_setEmail_5539856517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1946;

    public User_setEmail_5539856517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1946 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term1996 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term1946, term1946.getClass(), "id", -6823727938421990489L);
        setField(term1946, term1946.getClass(), "email", "idgaQsnJpQ");
        setField(term1946, term1946.getClass(), "firstName", "VgZnGoIFwQ");
        setField(term1946, term1946.getClass(), "lastName", "jUbSRrkrYZ");
        setField(term1946, term1946.getClass(), "password", "bWWfajKbEX");
        setLongField(term1996, term1996.getClass(), "id", -484994522244390100L);
        setField(term1996, term1996.getClass(), "place", "cAPeiZHKGJ");
        setField(term1996, term1996.getClass(), "description", "LvJFtLBaxj");
        setDoubleField(term1996, term1996.getClass(), "longitude", 0.7591353014991907);
        setDoubleField(term1996, term1996.getClass(), "latitude", 0.791695029600875);
        setField(term1946, term1946.getClass(), "location", term1996);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PHvxnGHptP";
        callMethod(klass, "setEmail", argTypes, term1946, args);
    }

};



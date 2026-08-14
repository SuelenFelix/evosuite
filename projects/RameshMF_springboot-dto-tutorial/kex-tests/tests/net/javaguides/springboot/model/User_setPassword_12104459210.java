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

public class User_setPassword_12104459210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2426;

    public User_setPassword_12104459210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2426 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term2476 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2426, term2426.getClass(), "id", 5907001541142728739L);
        setField(term2426, term2426.getClass(), "email", "sEccwbJKYE");
        setField(term2426, term2426.getClass(), "firstName", "AWRooQKkdW");
        setField(term2426, term2426.getClass(), "lastName", "vjxIhXHxGR");
        setField(term2426, term2426.getClass(), "password", "QXzGXbEXMu");
        setLongField(term2476, term2476.getClass(), "id", 4178434741742309755L);
        setField(term2476, term2476.getClass(), "place", "qxSDVejjiY");
        setField(term2476, term2476.getClass(), "description", "xBsXSDjXYK");
        setDoubleField(term2476, term2476.getClass(), "longitude", 0.8566567697571895);
        setDoubleField(term2476, term2476.getClass(), "latitude", 0.9203805380592256);
        setField(term2426, term2426.getClass(), "location", term2476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sEnIVFtZuQ";
        callMethod(klass, "setPassword", argTypes, term2426, args);
    }

};



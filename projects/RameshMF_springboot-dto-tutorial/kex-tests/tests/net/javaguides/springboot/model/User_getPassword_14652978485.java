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

public class User_getPassword_14652978485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555;

    public User_getPassword_14652978485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term555 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term605 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term555, term555.getClass(), "id", -7237588299778557629L);
        setField(term555, term555.getClass(), "email", "BYqFIqCKAV");
        setField(term555, term555.getClass(), "firstName", "vrQLuWIDJX");
        setField(term555, term555.getClass(), "lastName", "flxyYxBRtu");
        setField(term555, term555.getClass(), "password", "OclPbYPkcH");
        setLongField(term605, term605.getClass(), "id", 6967924379644551255L);
        setField(term605, term605.getClass(), "place", "IoAlmYsBwc");
        setField(term605, term605.getClass(), "description", "TEParAifyi");
        setDoubleField(term605, term605.getClass(), "longitude", 0.6076495596892013);
        setDoubleField(term605, term605.getClass(), "latitude", 0.37773193782763337);
        setField(term555, term555.getClass(), "location", term605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term555, args);
    }

};



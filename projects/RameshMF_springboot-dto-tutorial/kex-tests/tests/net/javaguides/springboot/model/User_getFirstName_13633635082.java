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

public class User_getFirstName_13633635082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;

    public User_getFirstName_13633635082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term327 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term277, term277.getClass(), "id", 5270370404989704783L);
        setField(term277, term277.getClass(), "email", "MxlszYVzRf");
        setField(term277, term277.getClass(), "firstName", "LQFpaHEwXR");
        setField(term277, term277.getClass(), "lastName", "oVcInYnLWB");
        setField(term277, term277.getClass(), "password", "aJlieCFVtF");
        setLongField(term327, term327.getClass(), "id", 7411271909051562686L);
        setField(term327, term327.getClass(), "place", "ZiaGIbnzTs");
        setField(term327, term327.getClass(), "description", "tbcdzjIfER");
        setDoubleField(term327, term327.getClass(), "longitude", 0.28570734989730284);
        setDoubleField(term327, term327.getClass(), "latitude", 0.40176586625454525);
        setField(term277, term277.getClass(), "location", term327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term277, args);
    }

};



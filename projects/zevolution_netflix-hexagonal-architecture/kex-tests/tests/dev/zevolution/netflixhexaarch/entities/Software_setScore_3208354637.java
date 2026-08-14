package dev.zevolution.netflixhexaarch.entities;

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
import static dev.zevolution.netflixhexaarch.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Software_setScore_3208354637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19994;

    public Software_setScore_3208354637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19994 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.entities.Software"));
        setField(term19994, term19994.getClass(), "name", null);
        setField(term19994, term19994.getClass(), "description", null);
        setField(term19994, term19994.getClass(), "score", null);
        setField(term19994, term19994.getClass(), "author", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.entities.Software");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setScore", argTypes, term19994, args);
    }

};



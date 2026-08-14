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

public class User_toString_204918903716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2213;

    public User_toString_204918903716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2213 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term2263 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2213, term2213.getClass(), "id", 5262507301787091109L);
        setField(term2213, term2213.getClass(), "email", "XqgfKFvPSD");
        setField(term2213, term2213.getClass(), "firstName", "JiVRgTZvKc");
        setField(term2213, term2213.getClass(), "lastName", "XPKmummaqg");
        setField(term2213, term2213.getClass(), "password", "BKLfkLiZTH");
        setLongField(term2263, term2263.getClass(), "id", -6823727938421990489L);
        setField(term2263, term2263.getClass(), "place", "SPpkrGcPRr");
        setField(term2263, term2263.getClass(), "description", "sEccwbJKYE");
        setDoubleField(term2263, term2263.getClass(), "longitude", 0.2852810965221698);
        setDoubleField(term2263, term2263.getClass(), "latitude", 0.6300849762307866);
        setField(term2213, term2213.getClass(), "location", term2263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2213, args);
    }

};



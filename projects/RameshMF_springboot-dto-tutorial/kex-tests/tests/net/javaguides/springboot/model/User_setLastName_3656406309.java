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

public class User_setLastName_3656406309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2266;

    public User_setLastName_3656406309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2266 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term2316 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2266, term2266.getClass(), "id", 1439298019805881866L);
        setField(term2266, term2266.getClass(), "email", "jiKYgYHqIS");
        setField(term2266, term2266.getClass(), "firstName", "DfISiziTgG");
        setField(term2266, term2266.getClass(), "lastName", "XqgfKFvPSD");
        setField(term2266, term2266.getClass(), "password", "JiVRgTZvKc");
        setLongField(term2316, term2316.getClass(), "id", -8708192233349544946L);
        setField(term2316, term2316.getClass(), "place", "XPKmummaqg");
        setField(term2316, term2316.getClass(), "description", "BKLfkLiZTH");
        setDoubleField(term2316, term2316.getClass(), "longitude", 0.9374115574082594);
        setDoubleField(term2316, term2316.getClass(), "latitude", 0.8454723071922143);
        setField(term2266, term2266.getClass(), "location", term2316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SPpkrGcPRr";
        callMethod(klass, "setLastName", argTypes, term2266, args);
    }

};



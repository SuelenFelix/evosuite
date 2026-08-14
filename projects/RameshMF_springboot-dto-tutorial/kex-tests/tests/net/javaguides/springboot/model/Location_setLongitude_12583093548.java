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
import java.lang.Double;

public class Location_setLongitude_12583093548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2953;
     Object term2981;

    public Location_setLongitude_12583093548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2953 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2953, term2953.getClass(), "id", -7612550318181586304L);
        setField(term2953, term2953.getClass(), "place", "JDaAnsVTGV");
        setField(term2953, term2953.getClass(), "description", "mLUZFTfjle");
        setDoubleField(term2953, term2953.getClass(), "longitude", 0.9374115574082594);
        setDoubleField(term2953, term2953.getClass(), "latitude", 0.8454723071922143);
        term2981 = new Double(0.8566567697571895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term2981;
        callMethod(klass, "setLongitude", argTypes, term2953, args);
    }

};



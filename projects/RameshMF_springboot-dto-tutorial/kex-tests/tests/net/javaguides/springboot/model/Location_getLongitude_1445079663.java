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

public class Location_getLongitude_1445079663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2667;

    public Location_getLongitude_1445079663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2667 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2667, term2667.getClass(), "id", 5907001541142728739L);
        setField(term2667, term2667.getClass(), "place", "yGtHPyvYiQ");
        setField(term2667, term2667.getClass(), "description", "MvRIxilFMJ");
        setDoubleField(term2667, term2667.getClass(), "longitude", 0.6588948704887806);
        setDoubleField(term2667, term2667.getClass(), "latitude", 0.6397214730945112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLongitude", argTypes, term2667, args);
    }

};



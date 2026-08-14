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

public class User_toString_204918903715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3188;

    public User_toString_204918903715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3188 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term3238 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term3188, term3188.getClass(), "id", -5788180182343976541L);
        setField(term3188, term3188.getClass(), "email", "gCWtLVKVVe");
        setField(term3188, term3188.getClass(), "firstName", "fWKJoSoCwE");
        setField(term3188, term3188.getClass(), "lastName", "wfaXBpWAUH");
        setField(term3188, term3188.getClass(), "password", "VMeAzAHwZj");
        setLongField(term3238, term3238.getClass(), "id", 2936323121573284007L);
        setField(term3238, term3238.getClass(), "place", "PznxWXsZME");
        setField(term3238, term3238.getClass(), "description", "ZzIujlwVsw");
        setDoubleField(term3238, term3238.getClass(), "longitude", 0.022483645678509023);
        setDoubleField(term3238, term3238.getClass(), "latitude", 0.025133051616627267);
        setField(term3188, term3188.getClass(), "location", term3238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3188, args);
    }

};



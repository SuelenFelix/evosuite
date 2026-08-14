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

public class User_hashCode_153842934714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3050;

    public User_hashCode_153842934714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3050 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term3100 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term3050, term3050.getClass(), "id", -4443169559037975007L);
        setField(term3050, term3050.getClass(), "email", "xIeFjkHkOe");
        setField(term3050, term3050.getClass(), "firstName", "SdCKLMIYnX");
        setField(term3050, term3050.getClass(), "lastName", "OJJtVNPyKZ");
        setField(term3050, term3050.getClass(), "password", "AKNapTAfmD");
        setLongField(term3100, term3100.getClass(), "id", -3842548265506930260L);
        setField(term3100, term3100.getClass(), "place", "xJgPlLxpgC");
        setField(term3100, term3100.getClass(), "description", "EYtfuJaxiM");
        setDoubleField(term3100, term3100.getClass(), "longitude", 0.11179067076100713);
        setDoubleField(term3100, term3100.getClass(), "latitude", 0.5306473989087822);
        setField(term3050, term3050.getClass(), "location", term3100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3050, args);
    }

};



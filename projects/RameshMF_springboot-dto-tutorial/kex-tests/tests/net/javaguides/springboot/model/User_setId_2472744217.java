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
import java.lang.Long;

public class User_setId_2472744217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term831;
     Object term909;

    public User_setId_2472744217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term831 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term881 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term831, term831.getClass(), "id", -4325723315152823407L);
        setField(term831, term831.getClass(), "email", "xrwlQZdwCp");
        setField(term831, term831.getClass(), "firstName", "IDCWpPLRkE");
        setField(term831, term831.getClass(), "lastName", "nyiiPDVjAc");
        setField(term831, term831.getClass(), "password", "aKnKipADSo");
        setLongField(term881, term881.getClass(), "id", 2535595959091595249L);
        setField(term881, term881.getClass(), "place", "wSQxaModmm");
        setField(term881, term881.getClass(), "description", "UlajhuVLaP");
        setDoubleField(term881, term881.getClass(), "longitude", 0.7655020693602768);
        setDoubleField(term881, term881.getClass(), "latitude", 0.1374549299694151);
        setField(term831, term831.getClass(), "location", term881);
        term909 = new Long(-5476826692763582090L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term909;
        callMethod(klass, "setId", argTypes, term831, args);
    }

};



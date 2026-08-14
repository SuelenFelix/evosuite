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

public class User_setEmail_5539856518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term971;

    public User_setEmail_5539856518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term971 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term1021 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term971, term971.getClass(), "id", -872011222785455006L);
        setField(term971, term971.getClass(), "email", "gGSMzuGICf");
        setField(term971, term971.getClass(), "firstName", "hxCBltsObl");
        setField(term971, term971.getClass(), "lastName", "BndsHwAFMv");
        setField(term971, term971.getClass(), "password", "GzFkzHGYFt");
        setLongField(term1021, term1021.getClass(), "id", -316468845751588286L);
        setField(term1021, term1021.getClass(), "place", "tShwQLRGNe");
        setField(term1021, term1021.getClass(), "description", "LvtrsXUliU");
        setDoubleField(term1021, term1021.getClass(), "longitude", 0.7031006357544823);
        setDoubleField(term1021, term1021.getClass(), "latitude", 0.9527281779865117);
        setField(term971, term971.getClass(), "location", term1021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xLbjWUgOIL";
        callMethod(klass, "setEmail", argTypes, term971, args);
    }

};



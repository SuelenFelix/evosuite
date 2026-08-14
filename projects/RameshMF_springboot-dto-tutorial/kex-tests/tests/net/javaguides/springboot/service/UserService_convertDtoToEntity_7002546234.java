package net.javaguides.springboot.service;

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
import static net.javaguides.springboot.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserService_convertDtoToEntity_7002546234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term925;

    public UserService_convertDtoToEntity_7002546234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term925 = newInstance(Class.forName("net.javaguides.springboot.dto.UserLocationDTO"));
        setLongField(term925, term925.getClass(), "userId", 5127676408959197577L);
        setField(term925, term925.getClass(), "email", "xrwlQZdwCp");
        setField(term925, term925.getClass(), "place", "IDCWpPLRkE");
        setDoubleField(term925, term925.getClass(), "longitude", 0.2852810965221698);
        setDoubleField(term925, term925.getClass(), "latitude", 0.6300849762307866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.service.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.javaguides.springboot.dto.UserLocationDTO");
        Object[] args = new Object[1];
        args[0] = term925;
        callMethod(klass, "convertDtoToEntity", argTypes, null, args);
    }

};



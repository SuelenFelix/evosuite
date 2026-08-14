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
import java.lang.Object;

public class UserService_convertEntityToDto_9707269273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term787;

    public UserService_convertEntityToDto_9707269273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term787 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term837 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term787, term787.getClass(), "id", -872011222785455006L);
        setField(term787, term787.getClass(), "email", "OWDIEULEFu");
        setField(term787, term787.getClass(), "firstName", "dWRymuLBtr");
        setField(term787, term787.getClass(), "lastName", "AijpHYOFuy");
        setField(term787, term787.getClass(), "password", "SbAoxhfrkn");
        setLongField(term837, term837.getClass(), "id", -316468845751588286L);
        setField(term837, term837.getClass(), "place", "kuTXqwMtDB");
        setField(term837, term837.getClass(), "description", "Ghbwtircqb");
        setDoubleField(term837, term837.getClass(), "longitude", 0.37161417339133307);
        setDoubleField(term837, term837.getClass(), "latitude", 0.6805867182029153);
        setField(term787, term787.getClass(), "location", term837);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.service.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.javaguides.springboot.model.User");
        Object[] args = new Object[1];
        args[0] = term787;
        callMethod(klass, "convertEntityToDto", argTypes, null, args);
    }

};



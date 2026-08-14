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

public class UserService_convertEntityToDto_9707269272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UserService_convertEntityToDto_9707269272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term51 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term1, term1.getClass(), "id", 2442117782898005296L);
        setField(term1, term1.getClass(), "email", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "firstName", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "lastName", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "password", "xxtlPwDYFs");
        setLongField(term51, term51.getClass(), "id", 6375119433582206027L);
        setField(term51, term51.getClass(), "place", "jJCZpVmanW");
        setField(term51, term51.getClass(), "description", "EGtDIRbSSb");
        setDoubleField(term51, term51.getClass(), "longitude", 0.13238746331190498);
        setDoubleField(term51, term51.getClass(), "latitude", 0.3455959125047594);
        setField(term1, term1.getClass(), "location", term51);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.service.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.javaguides.springboot.model.User");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "convertEntityToDto", argTypes, null, args);
    }

};



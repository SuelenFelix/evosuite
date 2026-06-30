package br.com.training.model;

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
import static br.com.training.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class User_setEmail_12410667998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540;

    public User_setEmail_12410667998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term541 = new Long(-7237588299778557629L);
        term540 = newInstance(Class.forName("br.com.training.model.User"));
        Object term579 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term540, term540.getClass(), "id", term541);
        setField(term540, term540.getClass(), "name", "xOEqzGAmDU");
        setField(term540, term540.getClass(), "email", "eZFUvlxvGV");
        setField(term540, term540.getClass(), "cpf", "BYqFIqCKAV");
        setIntField(term579, term579.getClass(), "year", 2022);
        setShortField(term579, term579.getClass(), "month", (short) 2);
        setShortField(term579, term579.getClass(), "day", (short) 25);
        setField(term540, term540.getClass(), "birthDate", term579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.training.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vrQLuWIDJX";
        callMethod(klass, "setEmail", argTypes, term540, args);
    }

};



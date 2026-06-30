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

public class User_getId_19946279433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151;

    public User_getId_19946279433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term152 = new Long(-8257434502486459194L);
        term151 = newInstance(Class.forName("br.com.training.model.User"));
        Object term190 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term151, term151.getClass(), "id", term152);
        setField(term151, term151.getClass(), "name", "SzjVpOQTyS");
        setField(term151, term151.getClass(), "email", "MjGYSRKTNF");
        setField(term151, term151.getClass(), "cpf", "hRNSzYYIrc");
        setIntField(term190, term190.getClass(), "year", 2020);
        setShortField(term190, term190.getClass(), "month", (short) 11);
        setShortField(term190, term190.getClass(), "day", (short) 22);
        setField(term151, term151.getClass(), "birthDate", term190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.training.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term151, args);
    }

};



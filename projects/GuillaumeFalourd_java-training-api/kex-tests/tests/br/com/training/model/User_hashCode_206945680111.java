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

public class User_hashCode_206945680111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term803;

    public User_hashCode_206945680111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term804 = new Long(-8885298608300233488L);
        term803 = newInstance(Class.forName("br.com.training.model.User"));
        Object term842 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term803, term803.getClass(), "id", term804);
        setField(term803, term803.getClass(), "name", "SbAoxhfrkn");
        setField(term803, term803.getClass(), "email", "kuTXqwMtDB");
        setField(term803, term803.getClass(), "cpf", "Ghbwtircqb");
        setIntField(term842, term842.getClass(), "year", 2020);
        setShortField(term842, term842.getClass(), "month", (short) 5);
        setShortField(term842, term842.getClass(), "day", (short) 14);
        setField(term803, term803.getClass(), "birthDate", term842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.training.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term803, args);
    }

};



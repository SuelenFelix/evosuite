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

public class User_getEmail_8173983837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term467;

    public User_getEmail_8173983837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term468 = new Long(6811161968424632369L);
        term467 = newInstance(Class.forName("br.com.training.model.User"));
        Object term506 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term467, term467.getClass(), "id", term468);
        setField(term467, term467.getClass(), "name", "pCTimMblYc");
        setField(term467, term467.getClass(), "email", "hNxWaHcfhY");
        setField(term467, term467.getClass(), "cpf", "RkybSrpybU");
        setIntField(term506, term506.getClass(), "year", 2017);
        setShortField(term506, term506.getClass(), "month", (short) 5);
        setShortField(term506, term506.getClass(), "day", (short) 21);
        setField(term467, term467.getClass(), "birthDate", term506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.training.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term467, args);
    }

};



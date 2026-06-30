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

public class User_setBirthDate_17408154852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74;
     Object term117;

    public User_setBirthDate_17408154852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term75 = new Long(6375119433582206027L);
        term74 = newInstance(Class.forName("br.com.training.model.User"));
        Object term113 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term74, term74.getClass(), "id", term75);
        setField(term74, term74.getClass(), "name", "xxtlPwDYFs");
        setField(term74, term74.getClass(), "email", "jJCZpVmanW");
        setField(term74, term74.getClass(), "cpf", "EGtDIRbSSb");
        setIntField(term113, term113.getClass(), "year", 2016);
        setShortField(term113, term113.getClass(), "month", (short) 11);
        setShortField(term113, term113.getClass(), "day", (short) 29);
        setField(term74, term74.getClass(), "birthDate", term113);
        term117 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term117, term117.getClass(), "year", 2021);
        setShortField(term117, term117.getClass(), "month", (short) 1);
        setShortField(term117, term117.getClass(), "day", (short) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.training.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term117;
        callMethod(klass, "setBirthDate", argTypes, term74, args);
    }

};



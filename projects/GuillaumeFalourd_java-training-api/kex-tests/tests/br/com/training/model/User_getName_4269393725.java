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

public class User_getName_4269393725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299;

    public User_getName_4269393725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term300 = new Long(7411271909051562686L);
        term299 = newInstance(Class.forName("br.com.training.model.User"));
        Object term338 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term299, term299.getClass(), "id", term300);
        setField(term299, term299.getClass(), "name", "MxlszYVzRf");
        setField(term299, term299.getClass(), "email", "LQFpaHEwXR");
        setField(term299, term299.getClass(), "cpf", "oVcInYnLWB");
        setIntField(term338, term338.getClass(), "year", 2018);
        setShortField(term338, term338.getClass(), "month", (short) 1);
        setShortField(term338, term338.getClass(), "day", (short) 13);
        setField(term299, term299.getClass(), "birthDate", term338);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.training.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term299, args);
    }

};



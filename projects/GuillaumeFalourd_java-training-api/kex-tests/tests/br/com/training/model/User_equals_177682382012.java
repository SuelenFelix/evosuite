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

public class User_equals_177682382012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term876;
     Object term919;

    public User_equals_177682382012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term877 = new Long(-4325723315152823407L);
        term876 = newInstance(Class.forName("br.com.training.model.User"));
        Object term915 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term876, term876.getClass(), "id", term877);
        setField(term876, term876.getClass(), "name", "xrwlQZdwCp");
        setField(term876, term876.getClass(), "email", "IDCWpPLRkE");
        setField(term876, term876.getClass(), "cpf", "nyiiPDVjAc");
        setIntField(term915, term915.getClass(), "year", 2025);
        setShortField(term915, term915.getClass(), "month", (short) 4);
        setShortField(term915, term915.getClass(), "day", (short) 23);
        setField(term876, term876.getClass(), "birthDate", term915);
        term919 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.training.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term919;
        callMethod(klass, "equals", argTypes, term876, args);
    }

};



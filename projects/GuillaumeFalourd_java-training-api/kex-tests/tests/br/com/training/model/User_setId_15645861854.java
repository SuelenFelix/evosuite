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

public class User_setId_15645861854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224;
     Object term267;

    public User_setId_15645861854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term225 = new Long(-8400487765614892086L);
        term224 = newInstance(Class.forName("br.com.training.model.User"));
        Object term263 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term224, term224.getClass(), "id", term225);
        setField(term224, term224.getClass(), "name", "RMFIsYGgne");
        setField(term224, term224.getClass(), "email", "NRdvgJlhkX");
        setField(term224, term224.getClass(), "cpf", "uuaPigETmJ");
        setIntField(term263, term263.getClass(), "year", 2015);
        setShortField(term263, term263.getClass(), "month", (short) 9);
        setShortField(term263, term263.getClass(), "day", (short) 19);
        setField(term224, term224.getClass(), "birthDate", term263);
        term267 = new Long(5270370404989704783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.training.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term267;
        callMethod(klass, "setId", argTypes, term224, args);
    }

};



package br.com.rodrigorahman.springbootcommysql.model;

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
import static br.com.rodrigorahman.springbootcommysql.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Pessoa_setSobrenome_131222455113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334;

    public Pessoa_setSobrenome_131222455113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334 = newInstance(Class.forName("br.com.rodrigorahman.springbootcommysql.model.Pessoa"));
        setField(term334, term334.getClass(), "id", null);
        setField(term334, term334.getClass(), "nome", null);
        setField(term334, term334.getClass(), "sobrenome", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.rodrigorahman.springbootcommysql.model.Pessoa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSobrenome", argTypes, term334, args);
    }

};



package br.com.feltex.excel.modelo;

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
import static br.com.feltex.excel.modelo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Cliente_ClienteBuilder_toString_14349142013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488;

    public Cliente_ClienteBuilder_toString_14349142013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488 = newInstance(Class.forName("br.com.feltex.excel.modelo.Cliente$ClienteBuilder"));
        setField(term488, term488.getClass(), "id", null);
        setField(term488, term488.getClass(), "nome", null);
        setField(term488, term488.getClass(), "email", null);
        setField(term488, term488.getClass(), "telefone", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.feltex.excel.modelo.Cliente$ClienteBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term488, args);
    }

};



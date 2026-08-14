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

public class Cliente_ClienteBuilder_telefone_117934585011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486;

    public Cliente_ClienteBuilder_telefone_117934585011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term486 = newInstance(Class.forName("br.com.feltex.excel.modelo.Cliente$ClienteBuilder"));
        setField(term486, term486.getClass(), "id", null);
        setField(term486, term486.getClass(), "nome", null);
        setField(term486, term486.getClass(), "email", null);
        setField(term486, term486.getClass(), "telefone", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.feltex.excel.modelo.Cliente$ClienteBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "telefone", argTypes, term486, args);
    }

};



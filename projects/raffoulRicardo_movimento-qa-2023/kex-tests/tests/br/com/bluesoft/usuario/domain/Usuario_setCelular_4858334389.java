package br.com.bluesoft.usuario.domain;

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
import static br.com.bluesoft.usuario.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Usuario_setCelular_4858334389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term623;

    public Usuario_setCelular_4858334389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term623 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        Object term661 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term623, term623.getClass(), "id", -1339778481);
        setField(term623, term623.getClass(), "nome", "flxyYxBRtu");
        setField(term623, term623.getClass(), "cpf", "OclPbYPkcH");
        setField(term623, term623.getClass(), "celular", "IoAlmYsBwc");
        setIntField(term661, term661.getClass(), "year", 2022);
        setShortField(term661, term661.getClass(), "month", (short) 2);
        setShortField(term661, term661.getClass(), "day", (short) 25);
        setField(term623, term623.getClass(), "dataNascimento", term661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.domain.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TEParAifyi";
        callMethod(klass, "setCelular", argTypes, term623, args);
    }

};



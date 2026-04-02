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

public class Usuario_getCelular_12973144624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217;

    public Usuario_getCelular_12973144624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        Object term255 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term217, term217.getClass(), "id", 391863371);
        setField(term217, term217.getClass(), "nome", "RMFIsYGgne");
        setField(term217, term217.getClass(), "cpf", "NRdvgJlhkX");
        setField(term217, term217.getClass(), "celular", "uuaPigETmJ");
        setIntField(term255, term255.getClass(), "year", 2020);
        setShortField(term255, term255.getClass(), "month", (short) 11);
        setShortField(term255, term255.getClass(), "day", (short) 22);
        setField(term217, term217.getClass(), "dataNascimento", term255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.domain.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCelular", argTypes, term217, args);
    }

};



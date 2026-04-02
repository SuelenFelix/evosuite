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

public class Usuario_toString_118253796614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1011;

    public Usuario_toString_118253796614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1011 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        Object term1049 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1011, term1011.getClass(), "id", 1585847225);
        setField(term1011, term1011.getClass(), "nome", "gGSMzuGICf");
        setField(term1011, term1011.getClass(), "cpf", "hxCBltsObl");
        setField(term1011, term1011.getClass(), "celular", "BndsHwAFMv");
        setIntField(term1049, term1049.getClass(), "year", 2024);
        setShortField(term1049, term1049.getClass(), "month", (short) 1);
        setShortField(term1049, term1049.getClass(), "day", (short) 24);
        setField(term1011, term1011.getClass(), "dataNascimento", term1049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.domain.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1011, args);
    }

};



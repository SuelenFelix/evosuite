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

public class Usuario_getDataNascimento_187828290020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1091;

    public Usuario_getDataNascimento_187828290020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1091 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        setIntField(term1091, term1091.getClass(), "id", 0);
        setField(term1091, term1091.getClass(), "nome", null);
        setField(term1091, term1091.getClass(), "cpf", null);
        setField(term1091, term1091.getClass(), "celular", null);
        setField(term1091, term1091.getClass(), "dataNascimento", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.domain.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataNascimento", argTypes, term1091, args);
    }

};



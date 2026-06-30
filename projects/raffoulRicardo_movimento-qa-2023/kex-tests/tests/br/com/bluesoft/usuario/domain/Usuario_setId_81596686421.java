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
import java.lang.Integer;

public class Usuario_setId_81596686421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1093;
     Object term1095;

    public Usuario_setId_81596686421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1093 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        setIntField(term1093, term1093.getClass(), "id", 0);
        setField(term1093, term1093.getClass(), "nome", null);
        setField(term1093, term1093.getClass(), "cpf", null);
        setField(term1093, term1093.getClass(), "celular", null);
        setField(term1093, term1093.getClass(), "dataNascimento", null);
        term1095 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.domain.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1095;
        callMethod(klass, "setId", argTypes, term1093, args);
    }

};



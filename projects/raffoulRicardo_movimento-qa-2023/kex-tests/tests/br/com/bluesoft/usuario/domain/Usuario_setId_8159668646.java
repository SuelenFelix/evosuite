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
import java.lang.Integer;

public class Usuario_setId_8159668646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361;
     Object term403;

    public Usuario_setId_8159668646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        Object term399 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term361, term361.getClass(), "id", -616727354);
        setField(term361, term361.getClass(), "nome", "aJlieCFVtF");
        setField(term361, term361.getClass(), "cpf", "ZiaGIbnzTs");
        setField(term361, term361.getClass(), "celular", "tbcdzjIfER");
        setIntField(term399, term399.getClass(), "year", 2018);
        setShortField(term399, term399.getClass(), "month", (short) 1);
        setShortField(term399, term399.getClass(), "day", (short) 13);
        setField(term361, term361.getClass(), "dataNascimento", term399);
        term403 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.domain.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term403;
        callMethod(klass, "setId", argTypes, term361, args);
    }

};



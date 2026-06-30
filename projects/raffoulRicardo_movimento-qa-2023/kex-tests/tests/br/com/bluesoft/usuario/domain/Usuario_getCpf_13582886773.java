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

public class Usuario_getCpf_13582886773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145;

    public Usuario_getCpf_13582886773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        Object term183 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term145, term145.getClass(), "id", 1484323161);
        setField(term145, term145.getClass(), "nome", "SzjVpOQTyS");
        setField(term145, term145.getClass(), "cpf", "MjGYSRKTNF");
        setField(term145, term145.getClass(), "celular", "hRNSzYYIrc");
        setIntField(term183, term183.getClass(), "year", 2021);
        setShortField(term183, term183.getClass(), "month", (short) 1);
        setShortField(term183, term183.getClass(), "day", (short) 18);
        setField(term145, term145.getClass(), "dataNascimento", term183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.domain.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCpf", argTypes, term145, args);
    }

};



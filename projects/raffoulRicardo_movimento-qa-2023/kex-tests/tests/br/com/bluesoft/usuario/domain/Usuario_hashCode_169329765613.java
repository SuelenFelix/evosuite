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

public class Usuario_hashCode_169329765613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term939;

    public Usuario_hashCode_169329765613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term939 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        Object term977 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term939, term939.getClass(), "id", -883034806);
        setField(term939, term939.getClass(), "nome", "aKnKipADSo");
        setField(term939, term939.getClass(), "cpf", "wSQxaModmm");
        setField(term939, term939.getClass(), "celular", "UlajhuVLaP");
        setIntField(term977, term977.getClass(), "year", 2012);
        setShortField(term977, term977.getClass(), "month", (short) 10);
        setShortField(term977, term977.getClass(), "day", (short) 1);
        setField(term939, term939.getClass(), "dataNascimento", term977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.domain.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term939, args);
    }

};



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

public class Usuario_getDataNascimento_18782829005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289;

    public Usuario_getDataNascimento_18782829005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        Object term327 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term289, term289.getClass(), "id", -1922583790);
        setField(term289, term289.getClass(), "nome", "MxlszYVzRf");
        setField(term289, term289.getClass(), "cpf", "LQFpaHEwXR");
        setField(term289, term289.getClass(), "celular", "oVcInYnLWB");
        setIntField(term327, term327.getClass(), "year", 2015);
        setShortField(term327, term327.getClass(), "month", (short) 9);
        setShortField(term327, term327.getClass(), "day", (short) 19);
        setField(term289, term289.getClass(), "dataNascimento", term327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.domain.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataNascimento", argTypes, term289, args);
    }

};



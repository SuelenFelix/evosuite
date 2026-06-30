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

public class Usuario_getNome_637095212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;

    public Usuario_getNome_637095212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        Object term111 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term73, term73.getClass(), "id", 1162663216);
        setField(term73, term73.getClass(), "nome", "xxtlPwDYFs");
        setField(term73, term73.getClass(), "cpf", "jJCZpVmanW");
        setField(term73, term73.getClass(), "celular", "EGtDIRbSSb");
        setIntField(term111, term111.getClass(), "year", 2016);
        setShortField(term111, term111.getClass(), "month", (short) 11);
        setShortField(term111, term111.getClass(), "day", (short) 29);
        setField(term73, term73.getClass(), "dataNascimento", term111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.domain.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNome", argTypes, term73, args);
    }

};



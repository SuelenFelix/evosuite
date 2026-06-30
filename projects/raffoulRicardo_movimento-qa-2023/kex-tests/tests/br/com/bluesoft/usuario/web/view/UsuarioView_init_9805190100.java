package br.com.bluesoft.usuario.web.view;

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
import static br.com.bluesoft.usuario.web.view.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UsuarioView_init_9805190100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UsuarioView_init_9805190100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        Object term39 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1, term1.getClass(), "id", 568599855);
        setField(term1, term1.getClass(), "nome", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "cpf", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "celular", "MuLcgQHgqz");
        setIntField(term39, term39.getClass(), "year", 2012);
        setShortField(term39, term39.getClass(), "month", (short) 8);
        setShortField(term39, term39.getClass(), "day", (short) 25);
        setField(term1, term1.getClass(), "dataNascimento", term39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.view.UsuarioView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.com.bluesoft.usuario.domain.Usuario");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



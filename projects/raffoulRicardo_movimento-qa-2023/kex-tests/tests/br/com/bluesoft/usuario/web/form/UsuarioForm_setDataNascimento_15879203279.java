package br.com.bluesoft.usuario.web.form;

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
import static br.com.bluesoft.usuario.web.form.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UsuarioForm_setDataNascimento_15879203279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term635;
     Object term676;

    public UsuarioForm_setDataNascimento_15879203279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term635 = newInstance(Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm"));
        Object term672 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term635, term635.getClass(), "nome", "OclPbYPkcH");
        setField(term635, term635.getClass(), "cpf", "IoAlmYsBwc");
        setField(term635, term635.getClass(), "celular", "TEParAifyi");
        setIntField(term672, term672.getClass(), "year", 2022);
        setShortField(term672, term672.getClass(), "month", (short) 2);
        setShortField(term672, term672.getClass(), "day", (short) 25);
        setField(term635, term635.getClass(), "dataNascimento", term672);
        term676 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term676, term676.getClass(), "year", 2017);
        setShortField(term676, term676.getClass(), "month", (short) 7);
        setShortField(term676, term676.getClass(), "day", (short) 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term676;
        callMethod(klass, "setDataNascimento", argTypes, term635, args);
    }

};



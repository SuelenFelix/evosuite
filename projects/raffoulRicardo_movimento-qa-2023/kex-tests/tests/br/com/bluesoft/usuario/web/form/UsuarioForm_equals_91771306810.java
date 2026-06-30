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

public class UsuarioForm_equals_91771306810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710;
     Object term751;

    public UsuarioForm_equals_91771306810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term710 = newInstance(Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm"));
        Object term747 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term710, term710.getClass(), "nome", "OWDIEULEFu");
        setField(term710, term710.getClass(), "cpf", "dWRymuLBtr");
        setField(term710, term710.getClass(), "celular", "AijpHYOFuy");
        setIntField(term747, term747.getClass(), "year", 2026);
        setShortField(term747, term747.getClass(), "month", (short) 12);
        setShortField(term747, term747.getClass(), "day", (short) 13);
        setField(term710, term710.getClass(), "dataNascimento", term747);
        term751 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term751;
        callMethod(klass, "equals", argTypes, term710, args);
    }

};



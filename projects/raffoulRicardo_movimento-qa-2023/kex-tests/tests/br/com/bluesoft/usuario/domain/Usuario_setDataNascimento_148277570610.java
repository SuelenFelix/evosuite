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

public class Usuario_setDataNascimento_148277570610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717;
     Object term759;

    public Usuario_setDataNascimento_148277570610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term717 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        Object term755 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term717, term717.getClass(), "id", 1725571209);
        setField(term717, term717.getClass(), "nome", "OWDIEULEFu");
        setField(term717, term717.getClass(), "cpf", "dWRymuLBtr");
        setField(term717, term717.getClass(), "celular", "AijpHYOFuy");
        setIntField(term755, term755.getClass(), "year", 2017);
        setShortField(term755, term755.getClass(), "month", (short) 7);
        setShortField(term755, term755.getClass(), "day", (short) 22);
        setField(term717, term717.getClass(), "dataNascimento", term755);
        term759 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term759, term759.getClass(), "year", 2026);
        setShortField(term759, term759.getClass(), "month", (short) 12);
        setShortField(term759, term759.getClass(), "day", (short) 13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.domain.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term759;
        callMethod(klass, "setDataNascimento", argTypes, term717, args);
    }

};


